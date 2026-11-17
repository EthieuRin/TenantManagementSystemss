# Tenant Management System

## Project Description
The Tenant Management System is an Android application developed using Kotlin and Android Studio. It helps users manage tenant information, including tenant names, phone numbers and monthly rent.

## Download
The APK will be available under the **Releases** section of this GitHub repository.

## Features
- User registration and login.
- Dashboard displaying the total number of tenants.
- Display of total rent collected.
- Add and save tenant details.
- View the list of registered tenants.
- Call tenants directly using the phone dialer.
- Store tenant information locally using Room Database.
- Tenant records remain saved after closing and reopening the application.

## Application Architecture

The application follows the MVVM architecture.

**Architecture flow:**

Screens (Fragments) → TenantViewModel (LiveData) → TenantRepository → Room Database

### Main Packages
- `ui/auth` – Authentication screens.
- `ui/dashboard` – Dashboard screen.
- `ui/tenants` – Add and view tenant screens.
- `ui/viewmodel` – Manages application data and UI state.
- `data/model` – Tenant data model.
- `data/local` – Room database and DAO.
- `data/repository` – Handles data operations.

## Technologies Used
- Kotlin
- Android Studio
- XML
- Room Database
- LiveData
- ViewModel
- Kotlin Coroutines
- Git and GitHub

## Group Nine Members

| Admission Number | Name |
|---|---|
| 153112 | Ethieu Rin |
| 190170 | Ruman Dimbil |
| 152563 | Reech Elijah |
| 147613 | Yusuf Mahamud |

## Version
**Version:** 1.0  
**Version Code:** 1

## Repository
The source code is available in this GitHub repository.
