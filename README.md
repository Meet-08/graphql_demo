# GraphQL Spring Boot Demo

This project showcases how to use GraphQL in a Spring Boot application with MongoDB as the database.

## Features

- GraphQL API implementation with Spring Boot
- Example schema and resolvers
- DTOs for input and output
- MongoDB repositories for data persistence
- Modular code structure (controllers, models, repositories, DTOs)
- Easy to extend with new queries and mutations

## Project Structure

- `src/main/java/com/meet/gpltest/` - Main Java source code
  - `models/` - Entity classes (e.g., Student, AcademicDetails)
  - `dto/` - Data Transfer Objects for GraphQL inputs
  - `repository/` - MongoDB repositories
  - `StudentController.java` - GraphQL resolver/controller
  - `GplTestApplication.java` - Main Spring Boot application
- `src/main/resources/graphql/schema.graphqls` - GraphQL schema definition
- `src/main/resources/application.properties` - Spring Boot configuration (including MongoDB settings)

## How to Run

1. Make sure you have Java, Maven, and MongoDB installed and running.
2. In the project root, run:
   ```powershell
   ./mvnw spring-boot:run
   ```
   or (on Windows):
   ```powershell
   .\mvnw.cmd spring-boot:run
   ```
3. The application will start on port 8080 by default.

## How to Test

You can test the schema by navigating to [http://localhost:8080/api](http://localhost:8080/api) after running the application. Use a GraphQL client (such as [Altair](https://altair.sirmuel.design/), [GraphiQL](https://github.com/graphql/graphiql), or [Postman](https://www.postman.com/)) to interact with the API.

### Example Query

```
query {
  students {
    id
    name
    academicDetails {
      degree
      year
    }
  }
}
```

---

Feel free to explore the code and modify the schema as needed!
