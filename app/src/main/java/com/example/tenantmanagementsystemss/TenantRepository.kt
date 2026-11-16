package com.example.tenantmanagementsystemss

object TenantRepository {
    private val tenants = mutableListOf<Tenant>()

    fun addTenant(tenant: Tenant) {
        tenants.add(tenant)
    }

    fun getTenants(): List<Tenant> = tenants
}
