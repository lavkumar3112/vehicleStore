# Multi-Brand Vehicle Store – Frontend

## Overview

This project implements the **frontend UI for the Multi-Brand Vehicle Store**.

Users can:

* Browse vehicles
* Filter vehicles
* View vehicle details
* Bookmark vehicles
* Book vehicles
* View inventory analytics
* Add new vehicles (admin)

The frontend communicates with the **Spring Boot REST API backend**.

---

## Tech Stack

* React
* React Router
* Axios
* Context API
* CSS / UI components

---

## Features

### Vehicle Catalog

* Grid layout of vehicles
* Display:

  * Brand
  * Name
  * Price
  * Fuel Type
  * Image

### Filters

Users can filter vehicles by:

* Brand
* Fuel type
* Price range

---

### Vehicle Details

Clicking a vehicle opens:

* Image
* Brand
* Price
* Description
* Bookmark button
* Book vehicle option

---

### Wishlist

Users can:

* View bookmarked vehicles
* Remove bookmarks

---

### Booking System

Users can:

* Fill booking form
* Submit booking
* Receive confirmation

---

### Inventory Dashboard

Displays:

* Number of vehicles per brand

Example:

Tesla : 5
Toyota : 3
BMW : 2

---

### Admin Panel

Admin can:

* Add new vehicles
* Provide vehicle details

Fields:

Brand
Name
Price
Fuel type
Image URL
Description

---

## Project Structure

src

components
VehicleCard.js
FilterBar.js

pages
CatalogPage.js
VehicleDetails.js
WishlistPage.js
BookingPage.js
DashboardPage.js
AdminPage.js

services
api.js

context
BookmarkContext.js

App.js

---

## Installation

### 1. Clone Repository

git clone https://github.com/lavkumar3112/vehicleStore.git

cd vehicle-store-frontend

---

### 2. Install Dependencies

npm install

---

### 3. Start Application

npm start

Application runs at

http://localhost:3000

---

## Backend Configuration

Make sure backend is running at:

http://localhost:8080

API base URL configured in:

src/services/api.js

---

## Example Workflow

1. Browse vehicle catalog
2. Apply filters
3. View vehicle details
4. Bookmark vehicle
5. Book vehicle
6. View dashboard
7. Admin adds new vehicle

---

## Future Improvements

* JWT authentication
* Responsive UI improvements
* Search functionality
* Pagination
* Charts for dashboard analytics
* Admin role protection

---

## Author

Lav Kumar
