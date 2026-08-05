# ---------- Build Stage ----------
FROM maven:3.9.9-eclipse-temurin-21 AS builder

WORKDIR /app

# Copy only the pom first to cache dependencies
COPY pom.xml .

RUN mvn dependency:go-offline

# Copy the source after dependencies are cached
COPY src ./src

RUN mvn clean package -DskipTests

# ---------- Runtime Stage ----------
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 7863

ENTRYPOINT ["java","-XX:+UseSerialGC","-jar","app.jar"]
