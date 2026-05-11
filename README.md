# Todo List with API

A Java-based Todo List application with REST API endpoints for managing tasks and todos.

## Overview

This project provides a comprehensive Todo List management system built with Java, featuring a RESTful API for creating, reading, updating, and deleting todo items.

## Features

- ✅ Create new todo items
- ✅ Read/retrieve all todos or specific todo
- ✅ Update existing todo items
- ✅ Delete todo items
- ✅ RESTful API endpoints
- ✅ Clean and maintainable Java code

## Technology Stack

- **Language**: Java
- **Architecture**: REST API
- **Database**: (To be configured)
- **Build Tool**: (Maven/Gradle - to be configured)

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven or Gradle (depending on build configuration)
- Git

### Installation

1. Clone the repository:
```bash
git clone https://github.com/mvikram34/Todolistwithapi.git
cd Todolistwithapi
```

2. Build the project:
```bash
# Using Maven
mvn clean install

# Using Gradle
gradle build
```

3. Run the application:
```bash
# Using Maven
mvn spring-boot:run

# Using Gradle
gradle bootRun
```

## API Endpoints

### Base URL
```
http://localhost:8080/api/todos
```

### Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/todos` | Get all todos |
| GET | `/api/todos/{id}` | Get a specific todo by ID |
| POST | `/api/todos` | Create a new todo |
| PUT | `/api/todos/{id}` | Update an existing todo |
| DELETE | `/api/todos/{id}` | Delete a todo |

### Example Requests

**Create a Todo:**
```bash
curl -X POST http://localhost:8080/api/todos \
  -H "Content-Type: application/json" \
  -d '{"title": "Buy groceries", "description": "Milk, eggs, bread", "completed": false}'
```

**Get All Todos:**
```bash
curl http://localhost:8080/api/todos
```

**Update a Todo:**
```bash
curl -X PUT http://localhost:8080/api/todos/1 \
  -H "Content-Type: application/json" \
  -d '{"title": "Buy groceries", "description": "Milk, eggs, bread", "completed": true}'
```

**Delete a Todo:**
```bash
curl -X DELETE http://localhost:8080/api/todos/1
```

## Project Structure

```
Todolistwithapi/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/todolist/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       └── Application.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml (or build.gradle)
└── README.md
```

## Configuration

Configure the application by editing `src/main/resources/application.properties`:

```properties
# Server Configuration
server.port=8080

# Database Configuration (if applicable)
spring.datasource.url=jdbc:mysql://localhost:3306/todolist
spring.datasource.username=root
spring.datasource.password=password
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Author

**mvikram34** - [GitHub Profile](https://github.com/mvikram34)

## Support

For issues and questions, please open an issue on the [GitHub Issues](https://github.com/mvikram34/Todolistwithapi/issues) page.

## Roadmap

- [ ] Add authentication and authorization
- [ ] Implement user-specific todos
- [ ] Add filtering and sorting capabilities
- [ ] Create front-end UI
- [ ] Add comprehensive test coverage
- [ ] Deploy to production

---

**Last Updated**: May 11, 2026
