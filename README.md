# Todo List with API

A Spring Boot-based Todo List application with REST API endpoints for managing tasks and todos.

## Overview

This project is a comprehensive Todo List management system built with **Java** and **Spring Boot**, featuring a RESTful API for creating, reading, updating, and deleting todo items. The application uses Spring Data JPA for database operations and an in-memory H2 database for quick setup and testing.

## Features

- ✅ Create new todo items
- ✅ Read/retrieve all todos or specific todo by ID
- ✅ Update existing todo items
- ✅ Delete todo items
- ✅ RESTful API endpoints
- ✅ Spring Boot framework for simplified development
- ✅ Spring Data JPA for database abstraction
- ✅ H2 in-memory database for testing
- ✅ Clean and maintainable Java code

## Technology Stack

- **Language**: Java
- **Framework**: Spring Boot 3.5.13
- **Architecture**: MVC (Model-View-Controller) with RESTful API
- **ORM**: Spring Data JPA
- **Database**: H2 (In-Memory Database)
- **Build Tool**: Maven
- **Java Version**: 25

## Project Structure

```
Todolistwithapi/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/vik/todolistwithapi/
│   │   │       ├── TodolistwithapiApplication.java
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── model/
│   │   │       └── repository/
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

1. Clone the repository:
```bash
git clone https://github.com/mvikram34/Todolistwithapi.git
cd Todolistwithapi
```

2. Build the project:
```bash
mvn clean install
```

3. Run the application:
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

### Base URL
```
http://localhost:8080/api/todos
```

### Available Endpoints

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

**Get Specific Todo:**
```bash
curl http://localhost:8080/api/todos/1
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

## Configuration

The application can be configured by editing `src/main/resources/application.properties`:

```properties
# Server Configuration
server.port=8080
server.servlet.context-path=/

# Application Name
spring.application.name=todolistwithapi

# H2 Database Configuration (Default)
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# JPA Configuration
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Database

This application uses **H2 Database** (in-memory) by default, which is ideal for development and testing. To switch to MySQL or another database:

1. Add the appropriate database driver dependency to `pom.xml`
2. Update `application.properties` with your database credentials

## Maven Dependencies

The project includes the following key dependencies:

- `spring-boot-starter-data-jpa`: For data access layer
- `spring-boot-starter-web`: For REST API support
- `h2`: In-memory database
- `spring-boot-starter-test`: For testing

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

- [ ] Implement controller endpoints for CRUD operations
- [ ] Create model/entity classes for Todo items
- [ ] Implement service layer for business logic
- [ ] Add repository interfaces for data access
- [ ] Add authentication and authorization
- [ ] Implement user-specific todos
- [ ] Add filtering and sorting capabilities
- [ ] Add input validation and error handling
- [ ] Create comprehensive test coverage
- [ ] Deploy to production (AWS, Heroku, etc.)
- [ ] Create front-end UI (React/Angular)

---

**Last Updated**: May 11, 2026
**Project Status**: Under Development
