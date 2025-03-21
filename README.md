# Food Basket - Online Food Delivery App

**Food Basket** is an online food delivery application that allows users to browse, order, and manage food items from various categories. The app is built with a modern tech stack, featuring **React Vite** for the frontend and **Java Spring Boot** for the backend. This repository contains the frontend code for the application. The backend uses **MongoDB** as the database for storing data.

---

## Features

- **Home Page: Displays featured food items, categories, and a search bar for easy navigation.
- **User Authentication**: Users can sign up, log in, and manage their accounts.
- **Food Categories**: Browse food items by categories such as Pizza, Burgers, Icecream,Briyani etc.
- **Search Functionality**: Search for specific food items by name.
- **Cart Management**: Add, remove, and update quantities of food items in the cart.
- **Order Summary**: View subtotal, shipping, tax, and total cost before placing an order

---

## Tech Stack

### Frontend
- **React**: A JavaScript library for building user interfaces.
- **Vite**: A fast build tool for modern web development.
- **React Router**: For handling client-side routing.
- **Context API**: For state management across components.
- **Bootstrap**: For styling and responsive design.
- **Axios**: For making HTTP requests to the backend.

### Backend
- **Java Spring Boot**: A robust framework for building RESTful APIs.
- **Spring Security**: For handling authentication and authorization.
- **JWT (JSON Web Tokens)**: For secure user authentication.
- **MongoDB**: A NoSQL database for storing application data.
- **Razorpay API**: For payment integration.

---

## Installation

### Prerequisites
- **Node.js**: Ensure you have Node.js installed (v14.18).
- **Java**: Ensure you have Java installed (JDK 21).
- **MongoDB**: Set up a MongoDB database for the backend.

### Frontend Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/Dxrahul/food-basket.git
   cd food-basket/frontend
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Start the development server:
   ```bash
   npm run dev
   ```

4. Open your browser and navigate to `http://localhost:5173`.

### Backend Setup
1. Navigate to the backend directory:
   ```bash
   cd food-basket/backend
   ```

2. Configure the `application.properties` file with your MongoDB connection details:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/foodbasket
   ```

3. Build and run the Spring Boot application:
   ```bash
   ./mvnw spring-boot:run
   ```

4. The backend will start on `http://localhost:8080`.

---

## Project Structure

### Frontend
```
src/
├── assets/              # Static assets (images, icons, etc.)
├── components/          # Reusable components (Header, Footer, etc.)
├── context/             # Context API for global state management
├── pages/               # Main pages (Home, Login, Register, etc.)
├── service/             # API service calls
├── App.jsx              # Main application component
├── main.jsx             # Entry point for the app
```

### Backend
```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── foodbasket/
│   │           ├── controller/    # REST controllers
│   │           ├── model/         # Entity classes
│   │           ├── repository/    # Data access layer (MongoDB repositories)
│   │           ├── service/       # Business logic
│   │           └── config/        # Configuration classes
│   └── resources/
│       └── application.properties # Configuration file
```


## API Endpoints

### Authentication
- **POST /api/auth/login**: User login.
- **POST /api/auth/register**: User registration.

### Food Items
- **GET /api/foods**: Get all food items.
- **GET /api/foods/{id}**: Get a specific food item by ID.

### Cart
- **GET /api/cart**: Get the user's cart.
- **POST /api/cart/add**: Add an item to the cart.
- **PUT /api/cart/update**: Update the quantity of an item in the cart.
- **DELETE /api/cart/remove/{id}**: Remove an item from the cart.

### Orders
- **POST /api/orders/place**: Place an order.
---

## Acknowledgments

- **Vite**: For providing a fast and modern build tool.
- **Spring Boot**: For simplifying backend development.
- **MongoDB**: For providing a flexible NoSQL database.
- **Bootstrap**: For making responsive design easy.

Enjoy using **Food Basket**! 🍕🍔🍣
