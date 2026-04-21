# Ecommerce_Backend

🛒 Ecommerce Backend (Spring Boot)

This is a backend project for an E-commerce application built using Spring Boot.

🚀 Features
Product CRUD (Create, Read, Update, Delete)
REST APIs
MySQL database integration
JPA / Hibernate
Layered architecture (Controller, Service, Repository)
Postman used for API testing
🛠️ Tech Stack
Java
Spring Boot
Spring Data JPA
Hibernate
MySQL
Maven
Postman (for testing APIs)
📦 Project Structure
Controller → Handles API requests
Service → Business logic
Repository → Database operations
Model → Entity classes
🔗 API Endpoints
Product APIs
POST /product/create → Create a product
GET /product/getAll → Get all products
GET /product/{id} → Get product by ID
PUT /product/update/{id} → Update product
DELETE /product/delete/{id} → Delete product
🧪 Testing

All APIs are tested using Postman.
You can import endpoints and test CRUD operations easily.

⚙️ Setup Instructions

Clone the repository

git clone https://github.com/rahulk7762/Ecommerce_Backend
Open in IDE (Eclipse / IntelliJ)
Configure MySQL in application.properties

Run the project
mvn spring-boot:run
