# RideWizard

RideWizard is a Spring Boot application that serves as a backend for a ride-sharing service. It includes basic functionalities to manage drivers and rides.

## Features

- Manage drivers (add, retrieve, delete)
- Manage rides (add, retrieve, delete)

## Project Structure
```css
ridewizard
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── ridewizard
│   │   │               ├── Application.java
│   │   │               ├── controller
│   │   │               │   ├── DriverController.java
│   │   │               │   └── RideController.java
│   │   │               ├── model
│   │   │               │   ├── Driver.java
│   │   │               │   └── Ride.java
│   │   │               ├── repository
│   │   │               │   ├── DriverRepository.java
│   │   │               │   └── RideRepository.java
│   │   │               └── service
│   │   │                   ├── DriverService.java
│   │   │                   └── RideService.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── ridewizard
└── pom.xml
└── README.md
```

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Running the Application

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/ridewizard.git
    cd ridewizard
    ```

2. Build and run the application:

    ```bash
    mvn spring-boot:run
    ```

3. Access the application:

    - H2 Database Console: `http://localhost:8080/h2-console`
    - Driver API:
        - GET `/drivers`
        - GET `/drivers/{id}`
        - POST `/drivers`
        - DELETE `/drivers/{id}`
    - Ride API:
        - GET `/rides`
        - GET `/rides/{id}`
        - POST `/rides`
        - DELETE `/rides/{id}`

### Application Properties

The application uses an in-memory H2 database. Configuration can be found in `src/main/resources/application.properties`.

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

### Contributing
Feel free to fork this repository and contribute by submitting a pull request.

### License
This project is licensed under the MIT License - see the LICENSE file for details.