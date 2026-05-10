# To-Do List Application

A production-grade **Task Management REST API** built with **Java**, **Spring Boot**, **Spring Data JPA**, and **MySQL** — featuring complete CRUD operations across 10+ endpoints, tested with Postman.

---

## Features

- Create, Read, Update, and Delete tasks via RESTful API
- 10+ REST endpoints for full task management
- MVC architecture with clean separation of layers
- MySQL database integration using Spring Data JPA
- Input validation and structured error handling
- Tested with Postman

---

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Language | Java 17 |
| Framework | Spring Boot 3.x, Spring MVC |
| ORM | Spring Data JPA |
| Database | MySQL |
| Build Tool | Maven |
| Testing | Postman |
| Version Control | Git & GitHub |

---

## Project Structure

```
To-do-List/
├── src/
│   └── main/
│       ├── java/com/todolist/
│       │   ├── controller/       # REST API controllers
│       │   ├── service/          # Business logic
│       │   ├── repository/       # JPA repositories
│       │   ├── model/            # Entity classes
│       │   └── dto/              # Data Transfer Objects
│       └── resources/
│           └── application.properties
└── pom.xml
```

---

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.8+
- MySQL 8.0+
- Postman (for testing)

### Installation

**1. Clone the repository**
```bash
git clone https://github.com/AbuObaidaZafar/Spring-Boot-Todo-List.git
cd Spring-Boot-Todo-List/To-do-List
```

**2. Create the MySQL database**
```sql
CREATE DATABASE todolist_db;
```

**3. Configure database connection**

Open `src/main/resources/application.properties` and update:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todolist_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

**4. Build the project**
```bash
mvn clean install
```

**5. Run the application**
```bash
mvn spring-boot:run
```

The server starts at: `http://localhost:8080`

---

## API Endpoints

### Task Management

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api/tasks` | Get all tasks |
| `GET` | `/api/tasks/{id}` | Get task by ID |
| `POST` | `/api/tasks` | Create a new task |
| `PUT` | `/api/tasks/{id}` | Update an existing task |
| `DELETE` | `/api/tasks/{id}` | Delete a task |
| `GET` | `/api/tasks/status/{status}` | Get tasks by status |
| `PUT` | `/api/tasks/{id}/complete` | Mark task as complete |

---

## Example Requests

### Create a Task

```http
POST /api/tasks
Content-Type: application/json

{
  "title": "Complete Spring Boot project",
  "description": "Finish building the REST API",
  "status": "PENDING"
}
```

### Response

```json
{
  "id": 1,
  "title": "Complete Spring Boot project",
  "description": "Finish building the REST API",
  "status": "PENDING",
  "createdAt": "2026-03-15T10:30:00"
}
```

### Get All Tasks

```http
GET /api/tasks
```

### Update a Task

```http
PUT /api/tasks/1
Content-Type: application/json

{
  "title": "Complete Spring Boot project",
  "description": "REST API completed successfully",
  "status": "COMPLETED"
}
```

### Delete a Task

```http
DELETE /api/tasks/1
```

---

## Testing with Postman

1. Open **Postman**
2. Import the base URL: `http://localhost:8080`
3. Test each endpoint using the table above
4. For `POST` and `PUT` requests, set `Content-Type: application/json` in Headers

---

## Key Concepts Used

- **Spring Boot** — rapid application development with auto-configuration
- **Spring MVC** — clean MVC pattern with controllers, services, and repositories
- **Spring Data JPA** — ORM for seamless MySQL integration
- **REST API design** — proper HTTP methods, status codes, and endpoint naming
- **DTO Pattern** — separating API layer from database entities
- **Maven** — dependency management and build lifecycle

---

## Author

**Abu Obaida Zafar**
- GitHub: [@AbuObaidaZafar](https://github.com/AbuObaidaZafar)
- LinkedIn: [linkedin.com/in/abuobaidazafar](https://linkedin.com/in/abuobaidazafar)
- Email: obaidajmi07@gmail.com

---

## License

This project is open source and available under the [MIT License](LICENSE).
