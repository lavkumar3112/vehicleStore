# Multi-Brand Vehicle Store – Backend

## Overview

This project implements the backend service for a **Multi-Brand Vehicle Store**.
It exposes REST APIs that allow users to browse vehicles, bookmark vehicles, book vehicles, and view inventory analytics.

The backend is built using **Spring Boot**, **Spring Data JPA**, and **PostgreSQL** following a layered architecture.

---

## Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL / MySQL
* Maven
* Lombok
* REST API

---

## Features

### Vehicle Catalog

* Retrieve list of vehicles
* Filter by:

    * Brand
    * Fuel Type
    * Price range

### Vehicle Details

* Retrieve detailed information about a specific vehicle

### Wishlist (Bookmarks)

* Bookmark a vehicle
* Retrieve bookmarked vehicles
* Remove bookmark

### Booking System

* Book a vehicle
* Retrieve all bookings

### Inventory Dashboard

* View count of vehicles grouped by brand

### Admin Vehicle Management

* Add new vehicles through API

---

## API Endpoints

### Vehicles

| Method | Endpoint                | Description               |
| ------ | ----------------------- | ------------------------- |
| GET    | `/api/vehicles`         | Get vehicles with filters |
| GET    | `/api/vehicles/{id}`    | Get vehicle details       |
| POST   | `/api/vehicles`         | Add new vehicle           |
| GET    | `/api/vehicles/summary` | Inventory summary         |

Example filter query:

/api/vehicles?brand=Tesla
/api/vehicles?fuelType=Electric
/api/vehicles?minPrice=1000000&maxPrice=5000000

---

### Bookmarks

| Method | Endpoint              | Description     |
| ------ | --------------------- | --------------- |
| POST   | `/api/bookmarks`      | Add bookmark    |
| GET    | `/api/bookmarks`      | Get bookmarks   |
| DELETE | `/api/bookmarks/{id}` | Remove bookmark |

---

### Bookings

| Method | Endpoint        | Description      |
| ------ | --------------- | ---------------- |
| POST   | `/api/bookings` | Create booking   |
| GET    | `/api/bookings` | Get all bookings |

---

## Database Schema

### vehicles

* id
* brand
* name
* price
* fuel_type
* image_url
* description

### bookmarks

* id
* vehicle_id

### bookings

* id
* vehicle_id
* customer_name
* customer_email
* booking_date

---

## Project Structure

src/main/java

controller
service
repository
entity
dto
exception

---

## Setup Instructions

### 1. Clone Repository

git clone https://github.com/lavkumar3112/vehicleStore.git

cd vehicleStoreBackend

---

### 2. Configure Database

Update `application.properties`

spring.datasource.url=jdbc:postgresql://localhost:5432/vehiclestore
spring.datasource.username=postgres
spring.datasource.password=postgres

---

### 3. Run Application

mvn spring-boot:run

Server will start at

http://localhost:8080

---

## Sample API Request

POST /api/vehicles

{
"brand": "Tesla",
"name": "Model 3",
"price": 4500000,
"fuelType": "Electric",
"imageUrl": "https://example.com/model3.jpg",
"description": "Electric sedan"
}

---

## Sample Data Seed (Optional)

INSERT INTO vehicles(brand,name,price,fuel_type,image_url,description)
VALUES
('Tesla','Model 3',4500000,'Electric','img','Electric sedan'),
('Toyota','Fortuner',4200000,'Diesel','img','SUV'),
('BMW','X5',7500000,'Petrol','img','Luxury SUV');

---

## Testing APIs

Use:

* Postman
* cURL
* Swagger (optional)

---

## Future Improvements

* JWT Authentication
* Pagination & Sorting
* Search API
* Redis caching
* Docker deployment
* CI/CD pipeline

---

## Author

Lav Kumar
