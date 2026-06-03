<!-- ============================================================ -->
<!--        Finance Dashboard Backend — Professional README        -->
<!--           Built by Alekhya Dama | Spring Boot + MySQL         -->
<!-- ============================================================ -->

<div align="center">

<h1>💰 Finance Dashboard Backend</h1>

<p><strong>A production-ready REST API for managing personal financial records — income, expenses, balance & category summaries.</strong></p>

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org)
[![Lombok](https://img.shields.io/badge/Lombok-BC4521?style=for-the-badge&logoColor=white)](https://projectlombok.org)

<br/>

![GitHub repo size](https://img.shields.io/github/repo-size/alekhyadama2003/Finance_Dashboard_Backend_Project?color=F97316&style=flat-square)
![GitHub last commit](https://img.shields.io/github/last-commit/alekhyadama2003/Finance_Dashboard_Backend_Project?color=6DB33F&style=flat-square)
![GitHub stars](https://img.shields.io/github/stars/alekhyadama2003/Finance_Dashboard_Backend_Project?color=FFD700&style=flat-square)

</div>

---

## 📌 Table of Contents

- [📖 Project Overview](#-project-overview)
- [✨ Features](#-features)
- [🛠️ Tech Stack](#️-tech-stack)
- [📁 Project Structure](#-project-structure)
- [📡 API Endpoints](#-api-endpoints)
- [🗄️ Database](#️-database)
- [⚙️ How to Run](#️-how-to-run)
- [👩‍💻 Author](#-author)

---

## 📖 Project Overview

**Finance Dashboard Backend** is a fully functional **Spring Boot REST API** designed to help users manage their financial records efficiently.

It supports complete **CRUD operations** on financial entries, provides **category-wise summaries**, calculates **income vs expense balance**, and includes **role-based access control** for admin users.

This project was built to strengthen real-world backend development skills including:
- REST API design & development
- Spring Data JPA & database integration
- SQL query optimization
- Global exception handling & clean code structure
- SDLC practices with Git version control

---

## ✨ Features

| Feature | Status |
|---|---|
| ➕ Create Financial Records | ✅ Done |
| 📋 Read / Get All Records | ✅ Done |
| ✏️ Update Financial Records | ✅ Done |
| 🗑️ Delete Financial Records | ✅ Done |
| 📊 Category-wise Summary | ✅ Done |
| 💰 Total Income API | ✅ Done |
| 💸 Total Expense API | ✅ Done |
| ⚖️ Balance Calculation | ✅ Done |
| 📅 Filter Records by Date | ✅ Done |
| 🔐 Role-Based Access (ADMIN) | ✅ Done |
| ⚠️ Global Exception Handling | ✅ Done |

---

## 🛠️ Tech Stack

### 🔤 Language
![Java](https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

### 🚀 Framework & Libraries
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-BC4521?style=for-the-badge&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

### 🗄️ Database
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![H2](https://img.shields.io/badge/H2_DB_(Dev)-003545?style=for-the-badge&logoColor=white)

### 🧰 Tools
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)
![VS Code](https://img.shields.io/badge/VS_Code-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white)

### 🌐 API Type
![REST API](https://img.shields.io/badge/REST_API-02569B?style=for-the-badge&logo=fastapi&logoColor=white)

---

## 📁 Project Structure

```
Finance_Dashboard_Backend_Project/
│
├── 📁 .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties       # Maven wrapper config
│
├── 📁 src/
│   └── main/
│       └── java/
│           └── com/
│               └── alekhya/
│                   └── finance_backend/
│                       │
│                       ├── 📁 controller/
│                       │   └── FinancialController.java    # REST API endpoints
│                       │
│                       ├── 📁 model/
│                       │   └── FinancialRecord.java        # Entity / DB model
│                       │
│                       ├── 📁 service/                     # Business logic layer
│                       │
│                       ├── 📁 repository/                  # Spring Data JPA repos
│                       │
│                       └── FinanceBackendApplication.java  # Main entry point
│
├── 📄 pom.xml                             # Maven dependencies
├── 📄 mvnw / mvnw.cmd                     # Maven wrapper scripts
├── 📄 .gitignore                          # Git ignore rules
└── 📄 README.md                           # Project documentation
```

---

## 📡 API Endpoints

Base URL: `http://localhost:8080/api/finance`

### 📋 Financial Records — CRUD

| Method | Endpoint | Description |
|---|---|---|
| `POST` | `/api/finance` | ➕ Create a new financial record |
| `GET` | `/api/finance` | 📋 Get all financial records |
| `PUT` | `/api/finance/{id}` | ✏️ Update a record by ID |
| `DELETE` | `/api/finance/{id}` | 🗑️ Delete a record by ID |

### 📊 Dashboard & Summary APIs

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/api/finance/income` | 💰 Get total income |
| `GET` | `/api/finance/expense` | 💸 Get total expenses |
| `GET` | `/api/finance/balance` | ⚖️ Get current balance |
| `GET` | `/api/finance/category-summary` | 📊 Get category-wise breakdown |

### 📅 Filter API

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/api/finance?date={date}` | 📅 Filter records by date |

---

### 📝 Sample Request & Response

**Create a Record — `POST /api/finance`**

```json
// Request Body
{
  "title": "Freelance Payment",
  "amount": 5000.00,
  "type": "INCOME",
  "category": "Freelance",
  "date": "2025-06-01"
}

// Response
{
  "id": 1,
  "title": "Freelance Payment",
  "amount": 5000.00,
  "type": "INCOME",
  "category": "Freelance",
  "date": "2025-06-01"
}
```

**Get Balance — `GET /api/finance/balance`**

```json
// Response
{
  "totalIncome": 15000.00,
  "totalExpense": 6000.00,
  "balance": 9000.00
}
```

---

## 🗄️ Database

This project uses **MySQL** as the primary database for persistent storage.

> 💡 **Note:** Initially developed using **H2 in-memory database** for rapid prototyping, then migrated to **MySQL** for production-ready persistent storage.

### Database Configuration (`application.properties`)

```properties
# MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/finance_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

### 📊 FinancialRecord Table Schema

```sql
CREATE TABLE financial_record (
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    title       VARCHAR(255)   NOT NULL,
    amount      DECIMAL(10,2)  NOT NULL,
    type        VARCHAR(50)    NOT NULL,   -- INCOME or EXPENSE
    category    VARCHAR(100),
    date        DATE           NOT NULL
);
```

---

## ⚙️ How to Run

### ✅ Prerequisites

Make sure you have the following installed:

- ☕ **Java 17+** → [Download](https://www.oracle.com/java/technologies/downloads/)
- 🐬 **MySQL** → [Download](https://dev.mysql.com/downloads/)
- 📦 **Maven** → [Download](https://maven.apache.org/download.cgi)
- 🧰 **Git** → [Download](https://git-scm.com/)

---

### 🚀 Step-by-Step Setup

**Step 1 — Clone the Repository**
```bash
git clone https://github.com/alekhyadama2003/Finance_Dashboard_Backend_Project.git
cd Finance_Dashboard_Backend_Project
```

**Step 2 — Create MySQL Database**
```sql
CREATE DATABASE finance_db;
```

**Step 3 — Update Database Credentials**

Open `src/main/resources/application.properties` and update:
```properties
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
```

**Step 4 — Build the Project**
```bash
mvn clean install
```

**Step 5 — Run the Application**
```bash
mvn spring-boot:run
```

**Step 6 — Test the API**

Open your browser or Postman and hit:
```
http://localhost:8080/api/finance
```

---

## 📦 Maven Dependencies (`pom.xml`)

| Dependency | Purpose |
|---|---|
| `spring-boot-starter-web` | Build REST APIs |
| `spring-boot-starter-data-jpa` | Database ORM with Spring Data JPA |
| `mysql-connector-j` | MySQL JDBC Driver |
| `lombok` | Reduce boilerplate code |
| `spring-boot-devtools` | Hot reload during development |
| `h2` (dev scope) | In-memory DB for testing |

---

## 🧠 Concepts Applied

- ✅ **MVC Architecture** — Controller → Service → Repository layers
- ✅ **Spring Data JPA** — ORM-based database interactions
- ✅ **REST API Design** — Clean endpoint structure
- ✅ **Global Exception Handling** — Centralized error responses
- ✅ **Role-Based Access Control** — Admin-protected routes
- ✅ **SDLC Practices** — Structured development lifecycle
- ✅ **Git Version Control** — Clean commit history

---

## 👩‍💻 Author

<div align="center">

**Alekhya Dama**
*Aspiring SDE | Java Backend Developer | B.Tech CSE*

[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/alekhyadama2003)
[![Email](https://img.shields.io/badge/Email-EA4335?style=for-the-badge&logo=gmail&logoColor=white)](mailto:damaalekhya@gmail.com)

⭐ *If you found this project useful, please give it a star — it motivates me!*

</div>

---

<div align="center">
<sub>Built with ☕ Java & 💚 Spring Boot by Alekhya Dama</sub>
</div>
