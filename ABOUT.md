# 📋 Todo List with API

A robust, scalable **Todo List application** built with Java using the **MVC (Model-View-Controller)** architectural pattern. This project provides a complete REST API for managing tasks and to-do items efficiently.

---

## 🏗️ Architecture: MVC (Model-View-Controller)

The application follows the **MVC architectural pattern** to ensure clean code separation, maintainability, and scalability.

### **MVC Components:**

#### **1. Model (M)**
- Represents the data layer and business logic
- Contains domain entities and database models
- Manages data validation and state
- **Components:**
  - Entity classes (Todo, Task, User models)
  - Data Access Objects (DAOs)
  - Database repositories
  - Business logic services

#### **2. View (V)**
- Represents the presentation layer
- Handles API responses and data formatting
- In this REST API context, serves JSON responses
- **Components:**
  - REST API endpoints (JSON responses)
  - Response DTOs (Data Transfer Objects)
  - Exception handlers and error responses
  - API documentation

#### **3. Controller (C)**
- Acts as the intermediary between Model and View
- Handles HTTP requests and responses
- Routes requests to appropriate services
- **Components:**
  - REST Controllers (RequestMapping endpoints)
  - Request handling and validation
  - Response formatting
  - HTTP status management

---

## 🛠️ Technology Stack

| Technology | Purpose |
|-----------|---------|
| **Java** | Primary Programming Language (100%) |
| **Spring Framework** | Web framework and dependency injection |
| **Spring Boot** | Rapid application development |
| **Spring MVC** | Web layer and REST API handling |
| **REST API** | API communication protocol |
| **Database** | Persistent data storage |

---

## ✨ Key Features

- ✅ **Create Tasks** - Add new to-do items to your list
- ✅ **Read Tasks** - Retrieve and view all tasks
- ✅ **Update Tasks** - Modify existing task details
- ✅ **Delete Tasks** - Remove completed or unnecessary tasks
- ✅ **Task Management** - Organize and prioritize tasks
- ✅ **RESTful API** - Clean and intuitive API endpoints
- ✅ **Error Handling** - Comprehensive exception handling
- ✅ **Data Validation** - Input validation and sanitization

---

## 📁 Project Structure (MVC Pattern)

```
Todolistwithapi/
│
├── src/main/java/com/example/todolist/
│   ├── controller/          # Controller Layer (C)
│   │   └── TodoController.java
│   │   └── TaskController.java
│   │
│   ├── model/               # Model Layer (M)
│   │   ├── entity/
│   │   │   ├── Todo.java
│   │   │   └── Task.java
│   │   ├── dto/
│   │   │   ├── TodoDTO.java
│   │   │   └── TaskDTO.java
│   │   └── repository/
│   │       ├── TodoRepository.java
│   │       └── TaskRepository.java
│   │
│   ├── service/             # Business Logic
│   │   ├── TodoService.java
│   │   └── TaskService.java
│   │
│   └── Application.java     # Main entry point
│
├── pom.xml                  # Maven dependencies
└── README.md                # Project documentation
```

---

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- Maven 3.6+
- Git

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/mvikram34/Todolistwithapi.git
   cd Todolistwithapi
   ```

2. **Build the project**
   ```bash
   mvn clean install
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the API**
   ```
   Base URL: http://localhost:8080/api
   ```

---

## 📡 API Endpoints

### Todo Management

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api/todos` | Retrieve all tasks |
| `POST` | `/api/todos` | Create a new task |
| `GET` | `/api/todos/{id}` | Get task by ID |
| `PUT` | `/api/todos/{id}` | Update task |
| `DELETE` | `/api/todos/{id}` | Delete task |

---

## 📊 Repository Information

- **Repository ID:** 1235260286
- **Owner:** mvikram34
- **Language:** Java (100%)
- **Visibility:** Public
- **License:** MIT (Recommended)

---

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request or open an Issue for bugs and feature requests.

---

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

---

## 📧 Support

For questions or issues, please open an issue on the [GitHub Issues](https://github.com/mvikram34/Todolistwithapi/issues) page.

---

**Happy Coding! 🎉**
