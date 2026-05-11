# Todo List with API

A simple, lightweight Spring Boot REST API for managing todos with in-memory data storage. Perfect for learning REST API concepts and Spring Boot fundamentals.

## Overview

This project is a Todo List management system built with **Java** and **Spring Boot**, featuring a RESTful API for creating, reading, updating, and deleting todo items. The application uses **in-memory storage** (no database), making it ideal for learning and development.

## Features

- ✅ Create new todo items
- ✅ Read/retrieve all todos
- ✅ Update existing todo items
- ✅ Delete todo items
- ✅ RESTful API endpoints
- ✅ Spring Boot framework for simplified development
- ✅ In-memory data storage (no database required)
- ✅ Clean and maintainable Java code
- ✅ Simple POJO model with getters and setters

## Technology Stack

- **Language**: Java
- **Framework**: Spring Boot 3.5.13
- **Architecture**: MVC (Model-View-Controller) with RESTful API
- **Build Tool**: Maven
- **Java Version**: 25
- **Data Storage**: In-Memory (ArrayList)

## Project Structure

```
Todolistwithapi/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/vik/todolistwithapi/
│   │   │       ├── TodolistwithapiApplication.java
│   │   │       ├── controller/
│   │   │       │   └── TodoController.java
│   │   │       ├── service/
│   │   │       │   └── TodoService.java
│   │   │       └── model/
│   │   │           └── Todo.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites

- Java 25 or higher
- Maven 3.6+
- Git

### Installation

1. **Clone the repository:**
```bash
git clone https://github.com/mvikram34/Todolistwithapi.git
cd Todolistwithapi
```

2. **Build the project:**
```bash
mvn clean install
```

3. **Run the application:**
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

### Base URL
```
http://localhost:8080/todos
```

### Available Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/todos` | Get all todos |
| POST | `/todos` | Create a new todo |
| PUT | `/todos/{id}` | Update an existing todo |
| DELETE | `/todos/{id}` | Delete a todo |

## API Examples

### 1. Create a Todo
```bash
curl -X POST http://localhost:8080/todos \
  -H "Content-Type: application/json" \
  -d '{"title": "Buy groceries"}'
```

**Response:**
```json
{
  "id": 1,
  "title": "Buy groceries",
  "completed": false
}
```

### 2. Get All Todos
```bash
curl http://localhost:8080/todos
```

**Response:**
```json
[
  {
    "id": 1,
    "title": "Buy groceries",
    "completed": false
  },
  {
    "id": 2,
    "title": "Complete project",
    "completed": false
  }
]
```

### 3. Update a Todo
```bash
curl -X PUT http://localhost:8080/todos/1 \
  -H "Content-Type: application/json" \
  -d '{"title": "Buy groceries", "completed": true}'
```

**Response:**
```json
{
  "id": 1,
  "title": "Buy groceries",
  "completed": true
}
```

### 4. Delete a Todo
```bash
curl -X DELETE http://localhost:8080/todos/1
```

**Response:**
```
Todo deleted successfully
```

## Code Architecture

### Model - Todo.java
The `Todo` model represents a todo item with the following properties:
- **id**: Unique identifier for each task (auto-generated)
- **title**: Description of the task
- **completed**: Boolean status indicating if the task is completed

### Service - TodoService.java
The `TodoService` class handles all business logic:
- **In-Memory Storage**: Uses `ArrayList<Todo>` to store todos
- **ID Counter**: Auto-increments for each new todo
- **CRUD Operations**: Create, Read, Update, and Delete methods
- **Error Handling**: Throws `RuntimeException` when todo is not found

### Controller - TodoController.java
The `TodoController` class exposes REST API endpoints:
- Uses `@RestController` annotation for REST endpoints
- `@RequestMapping("/todos")` maps all endpoints to `/todos` path
- Autowires `TodoService` for dependency injection
- Implements all CRUD operations

## Data Storage

This application uses **in-memory storage** with an `ArrayList`:
- ✅ Data persists during runtime
- ✅ Data resets when the application restarts
- ✅ No database setup required
- ✅ Perfect for learning and testing

> **Note**: Data is not persisted to disk. Each time you restart the application, all todos will be cleared.

## Configuration

The application is configured in `src/main/resources/application.properties`:

```properties
# Server Configuration
server.port=8080
server.servlet.context-path=/

# Application Name
spring.application.name=todolistwithapi
```

## Maven Dependencies

The project includes the following key dependencies:

- `spring-boot-starter-web`: For REST API support
- `spring-boot-starter-test`: For testing

**No database dependencies** - This is a clean, dependency-light project focused on REST API concepts.

## Key Features Explained

### 1. Auto-Generated IDs
Each new todo receives a unique ID automatically:
```java
todo.setId(idCounter++);
```

### 2. Default Completed Status
New todos are created with `completed = false`:
```java
todo.setCompleted(false);
```

### 3. Update Functionality
Only updates the fields provided, keeping other fields intact:
```java
todo.setTitle(updatedTodo.getTitle());
todo.setCompleted(updatedTodo.getCompleted());
```

### 4. Delete by ID
Removes a todo from the in-memory list:
```java
todos.removeIf(todo -> todo.getId().equals(id));
```

## Testing the API

You can test the API using:
- **cURL** (command line)
- **Postman** (GUI application)
- **Insomnia** (REST client)
- **Thunder Client** (VS Code extension)

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Future Enhancements

- [ ] Add database support (MySQL, PostgreSQL)
- [ ] Implement authentication and authorization
- [ ] Add user-specific todos
- [ ] Implement filtering and sorting
- [ ] Add input validation and error handling
- [ ] Create comprehensive test coverage
- [ ] Add logging functionality
- [ ] Implement pagination
- [ ] Create front-end UI (React/Angular/Vue)
- [ ] Deploy to cloud (AWS, Heroku, Railway)

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Author

**mvikram34** - [GitHub Profile](https://github.com/mvikram34)

## Support

For issues, questions, or suggestions, please open an issue on the [GitHub Issues](https://github.com/mvikram34/Todolistwithapi/issues) page.

---

**Last Updated**: May 11, 2026  
**Project Status**: Learning Project - Under Development  
**Data Storage**: In-Memory (No Database)
