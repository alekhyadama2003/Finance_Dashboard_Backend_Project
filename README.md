# 💰 Finance Dashboard Backend

## 📌 Project Description
This is a Finance Management Backend application built using Spring Boot.  
It allows users to manage income and expense records through REST APIs.

The system supports adding, updating, deleting, and retrieving financial data along with useful insights like balance calculation and category-wise summaries.

---

## 🚀 Features
- Add Income & Expense Records
- Update Existing Records
- Delete Records
- View All Financial Data
- Calculate Total Income
- Calculate Total Expense
- View Remaining Balance
- Category-wise Summary
- Filter Records by Date
- Basic Role-based Access Control (ADMIN)

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring Web (REST APIs)
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- Lombok
- Postman (API Testing)
- Git & GitHub

---

## 📂 API Endpoints

### 🔹 Create Record
POST /api/finance

### 🔹 Get All Records
GET /api/finance

### 🔹 Update Record
PUT /api/finance/{id}

### 🔹 Delete Record
DELETE /api/finance/{id}

### 🔹 Get Total Income
GET /api/finance/income

### 🔹 Get Total Expense
GET /api/finance/expense

### 🔹 Get Balance
GET /api/finance/balance

### 🔹 Category Summary
GET /api/finance/category-summary

### 🔹 Filter by Date
GET /api/finance/by-date?date=YYYY-MM-DD

---

## ▶️ How to Run the Project

1. Clone the repository:
