# EDA 기반 Microservice 구현 (with Hexagonal, DDD)
# EDA-based Microservice Implementation (with Hexagonal, DDD)

이 프로젝트는 [EDA 기반 마이크로서비스 구현](https://www.inflearn.com/course/eda%EA%B8%B0%EB%B0%98-%EB%A7%88%EC%9D%B4%ED%81%AC%EB%A1%9C%EC%84%9C%EB%B9%84%EC%8A%A4%EA%B5%AC%ED%98%84/dashboard) 강의를 기반으로 한 마이크로서비스 아키텍처 구현 예제입니다. 이 프로젝트는 Java 대신 Kotlin을 사용하여 구현되었습니다.

This project is a microservice architecture implementation example based on the [EDA-based Microservice Implementation](https://www.inflearn.com/course/eda%EA%B8%B0%EB%B0%98-%EB%A7%88%EC%9D%B4%ED%81%AC%EB%A1%9C%EC%84%9C%EB%B9%84%EC%8A%A4%EA%B5%AC%ED%98%84/dashboard) course. This project is implemented using Kotlin instead of Java.

## 기술 스택 (Tech Stack)

- Kotlin
- Spring Boot
- Kafka
- JPA
- H2 Database
- Swagger

## 프로젝트 구조 (Project Structure)

이 프로젝트는 다음과 같은 마이크로서비스로 구성되어 있습니다:
This project consists of the following microservices:

1. RentalMS: 대여 서비스 (Rental Service)
2. BookMS: 도서 관리 서비스 (Book Management Service)
3. MemberMS: 회원 관리 서비스 (Member Management Service)
4. BestBookMS: 인기 도서 관리 서비스 (Popular Book Management Service)

각 마이크로서비스는 헥사고날 아키텍처와 도메인 주도 설계(DDD) 원칙을 따라 구현되었습니다.
Each microservice is implemented following the principles of Hexagonal Architecture and Domain-Driven Design (DDD).

## 주요 기능 (Key Features)

- 도서 대여 및 반납 (Book rental and return)
- 회원 관리 (Member management)
- 도서 관리 (Book management)
- 인기 도서 추적 (Popular book tracking)
- 이벤트 기반 통신 (Kafka 사용) (Event-driven communication using Kafka)

## 실행 방법 (How to Run)

각 마이크로서비스의 실행 방법은 다음과 같습니다:
To run each microservice:

1. Kafka와 Zookeeper 실행 (Start Kafka and Zookeeper)
2. 각 마이크로서비스 프로젝트 디렉토리로 이동 (Navigate to each microservice project directory)
3. `./gradlew bootRun` 명령어로 서비스 실행 (Run the service using the `./gradlew bootRun` command)

## API 문서 (API Documentation)

각 마이크로서비스의 API 문서는 Swagger UI를 통해 확인할 수 있습니다. 서비스 실행 후 아래 URL에서 확인 가능합니다:
The API documentation for each microservice can be accessed via Swagger UI. After running the services, you can view the documentation at the following URLs:

- RentalMS: http://localhost:8080/swagger-ui/
- BookMS: http://localhost:8081/swagger-ui/
- MemberMS: http://localhost:8082/swagger-ui/
- BestBookMS: http://localhost:8084/swagger-ui/

## 참고 사항 (Note)

이 프로젝트는 학습 목적으로 생성되었으며, 실제 프로덕션 환경에서의 사용을 위해서는 추가적인 보안 및 성능 최적화가 필요할 수 있습니다.
This project was created for learning purposes and may require additional security and performance optimizations for use in a production environment.

## 라이센스 (License)

이 프로젝트는 MIT 라이센스 하에 배포됩니다. 자세한 내용은 [LICENSE](LICENSE) 파일을 참조하세요.
This project is distributed under the MIT License. See the [LICENSE](LICENSE) file for details.
