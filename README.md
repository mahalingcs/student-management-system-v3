# Student Management System V3

A Student Management System REST API built using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL.

This project allows users to perform CRUD (Create, Read, Update, Delete) operations on student records through REST APIs.

It also includes input validation, custom exception handling, and a layered architecture to maintain clean and organized code.

## Technologies Used

- Java 25 – Programming language
- Spring Boot – Backend application framework
- Spring Data JPA – Database access and persistence
- Hibernate – Object-relational mapping (ORM)
- MySQL – Relational database
- Maven – Dependency management and build tool
- REST API – Communication through HTTP methods
- Postman – API testing
- Git & GitHub – Version control and project 

## Features

- Add new student records
- View all students
- Search student by roll number
- Update existing student details
- Delete student records
- Input validation for student details
- Custom exception handling
- Duplicate roll number detection
- RESTful API architecture
- MySQL database integration

## REST API Endpoints

| HTTP Method | Endpoint                  | Description              |
|-------------|---------------------------|--------------------------|
| GET         | `/api/students`           | Get all students         |
| GET         | `/api/students/{rollNo}`  | Get student by roll number |
| POST        | `/api/students`           | Add a new student        |
| PUT         | `/api/students/{rollNo}`  | Update student details   |
| DELETE      | `/api/students/{rollNo}`  | Delete a student         |

### Sample JSON Request

{
  "rollNo": 101,
  "name": "Rahul",
  "age": 22
}

## Database Configuration

This project uses MySQL as its relational database.

Database name: `studentdb`

Table name: `students`

The application connects to MySQL using Spring Data JPA and Hibernate.

Database credentials are configured using environment variables to keep sensitive information out of the source code.

Required environment variables:

- `DB_USERNAME`
- `DB_PASSWORD`