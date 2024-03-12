# Quiz App Backend

This repository contains the backend codebase for a quiz application built using Spring Boot and PostgreSQL.

## Features

- **Quiz Management**: Create, read, update, and delete quizzes.
- **Question Management**: Add, edit, and remove questions within quizzes.
- **RESTful API**: Expose endpoints to interact with the backend services.

## Technologies Used

- **Spring Boot**: Framework for building Java applications.
- **PostgreSQL**: Relational database management system.
- **Spring Data JPA**: Simplifies data access layer implementation.
- **Hibernate**: ORM tool for database interaction.
- **Maven**: Dependency management and build automation tool.
- **RESTful API**: Interface for communication between frontend and backend.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- PostgreSQL

### Installation

1. Clone the repository:

    ```
    git clone git@github.com:TrekHub/quiz-app-backend-springboot.git
    ```

2. Navigate to the project directory:

    ```
    cd quiz-app-backend-springboot
    ```

3. Build the project using Maven:

    ```
    mvn clean install
    ```

4. Configure the PostgreSQL database settings in `application.properties`.

5. Run the application:

    ```
    mvn spring-boot:run
    ```

The backend server should now be running on `http://localhost:8080`.

For detailed documentation on API endpoints, refer to the [API Documentation](#) (replace with link when available).

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature-name`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature/your-feature-name`).
6. Create a new pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For any inquiries or feedback, please contact [Teddy Omondi](mailto:teddyomondi001@email.com).
