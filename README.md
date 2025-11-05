# 📚 Student Management API (Spring Boot + MySQL)

A simple RESTful Student Management System built with Spring Boot and MySQL, supporting complete CRUD operations.

---

## ✅ Features
- Create a student  
- Get all students  
- Get student by ID  
- Update student  
- Delete student  

---

## 🛠 Tech Stack

| Tool        | Description        |
|------------|------------------|
| Java       | Backend Language |
| Spring Boot | Framework        |
| Spring Data JPA | ORM         |
| MySQL      | Database         |
| Maven      | Build Tool       |
| Postman    | API Testing      |

---

## 📂 Project Structure

src/ └── main/ ├── java/com/example/studentapi/ │     ├── controller/ │     ├── service/ │     ├── repository/ │     └── entity/ └── resources/ └── application.properties   (ignored in Git)

## 🚀 How to Run

### 1️⃣ Clone repo
```bash
git clone https://github.com/Sumeet-Y1/student-api-springboot.git

2️⃣ Create application.properties
Location: src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
server.port=8080

3️⃣ Run the project
mvn spring-boot:run

📮 API Endpoints

Method   Endpoint        Description
POST     /students       create student
GET      /students       get all students
GET      /students/{id}  get student by id
PUT      /students/{id}  update student
DELETE   /students/{id}  delete student

🧾 Example JSON

{
  "name": "Sumeet",
  "email": "sumeet@example.com",
  "age": 17
}

🗄 Database Schema

Field   Type
id      Long
name    String
email   String
age     integer

⚠️ Notes
application.properties is ignored to protect credentials
Ensure MySQL is running before starting the app

👤 Author
Sumeet — Java Backend Developer in progress 🚀
Grinding Spring, DSA, and building real-world projects.













