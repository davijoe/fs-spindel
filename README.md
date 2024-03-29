# Full Stack Spindel-App
## Table of Contents
* [About](#about)
* [Getting Started](#getting-started)
* [Prerequisites](#prerequisites)
* [Installation](#installation)
* [Built With](#built-with)
* [Dependencies](#dependencies)

## About
This is a demo project to play around with stack taught at the academy programme in Computer Science at [KEA](https://kea.dk/en/programmes/academy-profession-degree/computer-science).<br>

**Languages**: Java - MySQL - JavaScript - HTML - CSS<br>
**Frameworks**: Spring Boot - MVC - Maven

This is a full stack application that allows users to create, read, update and delete (CRUD) data from a database. There is **pagination** of the books endpoint. 
The application is deployed on Azure and can be accessed [here](https://www.fullstackspindel.dk).

## Getting Started

### Prerequisites
To run the application locally:
* [Java 17](https://www.oracle.com/java/technologies/downloads)
* [MySQL](https://dev.mysql.com/downloads/mysql)
* [Maven](https://maven.apache.org/download.cgi)
(to run from CLI)
### Installation
1. Clone the repo from [GitHub](https://github.com/davijoe/fs-spindel.git)
2. Create a database in MySQL<br> And name it "**spindeldb**"
3. Create environment variables<br>`JDBC_DATABASE_URL` (starts with: **"jdbc:mysql://"**)<br>`JDBC_USERNAME`<br>`JDBC_PASSWORD`<br>`TOKEN_SECRET` (Any 256bit string will do. You can use [this SHA-256 generator](https://sha512.online/sha-256) and check [here](https://jwt.io/) whether the signature is valid
4. Run the application from CLI with Maven<br>```mvn spring-boot:run```<br>or<br>```./mvnw spring-boot:run```

## Built With
### Technologies
Java 17<br>
MySQL Community Server 8.0.35<br>
Maven 3.8.3<br>
Spring Boot 3.2.0<br>
HTML5<br>
CSS3<br>
JavaScript<br>

### Dependencies
Spring Boot Starter Actuator<br>
Spring Boot Starter Data JPA<br>
Spring Boot Starter Security<br>
Spring Boot Starter Web<br>
Spring Boot DevTools<br>
h2<br>
Lombok<br>
Spring Boot Starter Test<br>
Spring Security Test<br>







