
# 🎓 Edapt - Modern Student Management System

A full-stack Student Management System with a beautiful, responsive UI built using **Spring Boot**, **MySQL**, and **Vanilla JavaScript** with **Three.js** particle effects.

---

## ✨ Features

### Backend (Spring Boot REST API)
- ✅ Create a student  
- ✅ Get all students  
- ✅ Get student by ID  
- ✅ Update student  
- ✅ Delete student
- ✅ Email uniqueness validation

### Frontend (HTML/CSS/JavaScript)
- 🎨 Modern, minimalist black/white theme
- 🌓 Day/Night mode toggle with persistence
- 🔍 Real-time student search (by name, email, or ID)
- 📊 Live statistics dashboard
- ✨ Three.js particle background animation
- 📱 Fully responsive design (mobile-friendly)
- 🚀 Premium Space Grotesk font
- ⚡ Smooth transitions and hover effects

---

## 🛠 Tech Stack

| Layer      | Technology               |
|-----------|-------------------------|
| **Backend**   | Java, Spring Boot       |
| **Database**  | MySQL                   |
| **ORM**       | Spring Data JPA         |
| **Frontend**  | HTML5, CSS3, JavaScript |
| **Animation** | Three.js (Particles)    |
| **Build**     | Maven                   |
| **Testing**   | Postman                 |

---

## 📂 Project Structure
```
Stumange/
├── src/
│   ├── main/
│   │   ├── java/SPringStudent/Stumange/
│   │   │   ├── En21.java              (Entity)
│   │   │   ├── En21Controller.java    (REST Controller)
│   │   │   ├── En21Service.java       (Business Logic)
│   │   │   ├── En21Repository.java    (JPA Repository)
│   │   │   └── StumangeApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── index.html         (Frontend)
│   │       └── application.properties (ignored)
│   └── test/
├── pom.xml
└── README.md
```

---

## 🚀 How to Run

### 1️⃣ Clone the repository
```bash
git clone https://github.com/Sumeet-Y1/student-api-springboot.git
cd student-api-springboot/Stumange
```

### 2️⃣ Configure MySQL Database
Create `application.properties` in `src/main/resources/`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
server.port=8080
```

### 3️⃣ Run the Backend
```bash
mvn spring-boot:run
```

Backend will start on: `http://localhost:8080`

### 4️⃣ Access the Frontend
Open your browser and navigate to:
```
http://localhost:8080/index.html
```

---

## 📮 API Endpoints

| Method   | Endpoint          | Description           |
|---------|------------------|-----------------------|
| `POST`   | `/students`       | Create a new student  |
| `GET`    | `/students`       | Get all students      |
| `GET`    | `/students/{id}`  | Get student by ID     |
| `PUT`    | `/students/{id}`  | Update student        |
| `DELETE` | `/students/{id}`  | Delete student        |

### Example Request Body
```json
{
  "name": "Sumeet",
  "email": "sumeet@example.com",
  "age": 17
}
```

---

## 🗄 Database Schema

| Field  | Type     | Constraints       |
|--------|---------|-------------------|
| `id`   | Long    | Primary Key, Auto |
| `name` | String  | Not Null          |
| `email`| String  | Not Null, Unique  |
| `age`  | Integer | Not Null          |

---

## 🎨 Frontend Features

### Dashboard
- **Total Students Count** - Live count of all students
- **Average Age** - Automatically calculated
- **Monthly Growth** - Track new additions

### Search Functionality
- Real-time filtering as you type
- Search by name, email, or ID
- Works instantly with 100+ students

### Theme Toggle
- Dark mode (default)
- Light mode
- Preference saved in browser

### Responsive Design
- Mobile-first approach
- Works perfectly on phones, tablets, and desktops
- Adaptive layouts and touch-friendly buttons

---

## ⚠️ Important Notes

- **Email Validation**: Frontend prevents duplicate emails before submission
- **CORS**: If running frontend separately, enable CORS in your controller:
```java
  @CrossOrigin(origins = "*")
  @RestController
  public class En21Controller {}
```
- **MySQL**: Ensure MySQL server is running before starting the application
- **Credentials**: `application.properties` is gitignored for security

---

## 🔮 Future Enhancements

- [ ] User authentication & authorization
- [ ] Export students to CSV/Excel
- [ ] Batch upload via file
- [ ] Advanced filtering and sorting
- [ ] Student performance tracking
- [ ] Email notifications

---

## 👨‍💻 Author

**Sumeet Yadav**  
Java Backend Developer | Building real-world projects 🚀  
Currently mastering: Spring Boot, DSA, Full-Stack Development

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

## 🙏 Acknowledgments

- Spring Boot Documentation
- Three.js Community
- Space Grotesk Font by Florian Karsten

---

⭐ **If you find this project helpful, give it a star!** ⭐
