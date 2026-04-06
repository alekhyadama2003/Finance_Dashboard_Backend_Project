# 💰 Finance Dashboard Backend (Spring Boot)

## 📌 Project Overview
This is a backend REST API for managing financial records like income and expenses.  
It supports CRUD operations, filtering, and dashboard summary features.

---

## 🚀 Tech Stack
- Java
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL (migrated from H2)
- Maven
- Lombok

---

## ⚙️ Features
- ✅ Create, Read, Update, Delete Financial Records
- ✅ Category-wise Summary
- ✅ Total Income & Expense APIs
- ✅ Balance Calculation
- ✅ Filter by Date
- ✅ Role-Based Access Control (ADMIN)
- ✅ Global Exception Handling

---

## 📂 API Endpoints

### Create Record
POST `/api/finance`

### Get All Records
GET `/api/finance`

### Delete Record
DELETE `/api/finance/{id}`

### Update Record
PUT `/api/finance/{id}`

### Get Income
GET `/api/finance/income`

### Get Expense
GET `/api/finance/expense`

### Get Balance
GET `/api/finance/balance`

### Category Summary
GET `/api/finance/category-summary`

---

## 🗄️ Database
- Initially used H2 (in-memory DB)
- Migrated to MySQL for persistent storage

---

## ▶️ How to Run
```bash
mvn clean install
mvn spring-boot:run
