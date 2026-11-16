package com.example.tenantmanagementsystemss.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tenantmanagementsystemss.Tenant
import com.example.tenantmanagementsystemss.TenantRepository

class TenantViewModel : ViewModel() {

    private val _allTenantsText = MutableLiveData<String>()
    val allTenantsText: LiveData<String> get() = _allTenantsText

    private val _tenantCountText = MutableLiveData<String>()
    val tenantCountText: LiveData<String> get() = _tenantCountText

    private val _totalRentText = MutableLiveData<String>()
    val totalRentText: LiveData<String> get() = _totalRentText

    init {
        updateData()
    }

    private fun updateData() {
        val tenants = TenantRepository.getTenants()
        val count = tenants.size
        val totalRent = tenants.sumOf { it.rent.toDoubleOrNull() ?: 0.0 }

        _tenantCountText.value = "Tenants\n$count"
        _totalRentText.value = "Total rent\nKSh %,.0f".format(totalRent)

        if (tenants.isEmpty()) {
            _allTenantsText.value = "No tenants yet. Add one from the Dashboard."
        } else {
            _allTenantsText.value = tenants.joinToString("\n\n") { it.summary() }
        }
    }

    fun addTenant(name: String, phone: String, rent: String): Tenant? {
        val trimmedName = name.trim()
        val trimmedPhone = phone.trim()
        val trimmedRent = rent.trim()

        if (trimmedName.isEmpty() || trimmedPhone.isEmpty() || trimmedRent.isEmpty()) {
            return null
        }

        val tenant = Tenant(trimmedName, trimmedPhone, trimmedRent)
        TenantRepository.addTenant(tenant)
        updateData()
        return tenant
    }
}
