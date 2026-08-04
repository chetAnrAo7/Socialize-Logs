# Socialize-Logs

A Spring Boot 3.5.6 microservice (Java 17) that handles activity logging for the Socialize platform.

## Stack

- **Java 17** / Spring Boot 3.5.6
- **MongoDB** (Atlas) — stores log entries
- **Spring Security + JWT** — secures endpoints
- **OpenFeign** — calls sibling microservices
- **Resilience4j** — circuit-breaker / retry
- **Google GenAI** — AI integration
- **Cloudinary** — media handling
- **Maven** — build tool

## Running the app

```bash
./mvnw spring-boot:run
```

The service starts on **port 7863**.

## External dependencies

This service is part of a larger microservices architecture. It expects three sibling services at:

| Service | URL |
|---------|-----|
| Auth    | `http://localhost:7860` |
| User    | `http://localhost:7861` |
| Bot     | `http://localhost:7862` |

Feign calls to these services will fail if they are not running.

## Configuration

See `src/main/resources/application.properties` for MongoDB URI, server port, and service URLs.

## Key source files

- `src/main/java/com/boot/SocializeLogsApplication.java` — entry point
- `src/main/java/com/boot/controller/LogsController.java` — REST endpoints
- `src/main/java/com/boot/controller/AdminController.java` — admin endpoints
- `src/main/java/com/boot/service/PostLogs.java` — logging business logic
- `src/main/java/com/boot/security/` — JWT filter and security config
- `src/main/java/com/boot/api/` — Feign clients for sibling services

## User preferences
