GROUP NINE MEMBERS 
153112 ETHIEU RIN
190170 RUMAN DIMBIL
152563 REECH ELIJAH
147613 YUSUF MAHAMUD

The Tenant Management System is an Android application designed to help landlords manage tenant information, rental records and tenant contacts.
Main Features

User registration and login.

Add new tenants.

View tenant information.

Display total number of tenants.

Calculate total rent.

Call tenants.

Save tenant records using Room Database.

Technologies Used

Kotlin

Android Studio

XML

Room Database

LiveData

ViewModel

Git and GitHub

Application Architecture

The application uses MVVM architecture and the Repository pattern.

Data flow:

User Interface → ViewModel → Repository → DAO → Room Database

Project Structure

ui – Activities and Fragments.

data/model – Tenant data model.

data/local – Room Database and DAO.

data/repository – TenantRepository.

