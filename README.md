# Spring

### Ch01 
스프링 개발환경 구축

### Ch02
IoC(Inversion of Control) : 제어의 역전. 사용자가 객체를 생성하는 대신 객의 제어를 사용자가 아닌 객체의 생성과 관리를 수행하는 컨테이너에 위임하는 형태
DI(Dependency Injection) : 의존성 주입. Bean Factory, Annotation

### Ch03
![Untitled](https://github.com/wjdals1217/Spring/assets/136421876/7ffc2d9f-6100-4416-9860-bf77b02e6c37)
AOP(Aspect Oriented Programming) : 여러 객체에서 공통으로 사용하는 기능(로직)을 분리해서 재사용성을 높이는 프로그래밍 기법으로 관점 지향 프로그래밍 
핵심적인 기능에서 부가적인 기능을 분리해서 Aspect라는 독특한 모듈 형태로 만들어 설계하고 개발하는 방법
AOP와 OOP의 관계 : 관점 지향 프로그래밍과 객체 지향 프로그래밍. OOP 안에 AOP가 포함됨. 객체지향을 좀 더 완벽하게 해주는 프로그래밍 기법

Spring은 Proxy(대리자) 기반 AOP를 지원. Proxy는 Target 객체에 대한 호출을 가로챈 다음 Advice의 부가 기능 로직을 수행하고 난 후 Target의 핵심 기능 로직을 호출

- AOP 주요 용어
![Untitled](https://github.com/wjdals1217/Spring/assets/136421876/9d71a15b-2542-43ab-b129-305e337fe508)

### Ch04
- MVC(Model-View-Controller)
  : Business와 Presentation을 분리해 효율적인 애플리케이션 개발을 위한 소프트웨어 아키텍쳐
![MVC](https://github.com/wjdals1217/Spring/assets/136421876/a91a89fc-aaab-4599-a19e-cf1d75b6e6c4)
- SpringMVC 주요 Annotation
  ![주요 Annotation](https://github.com/wjdals1217/Spring/assets/136421876/0cfcd91c-88f3-40f4-8d11-0e3c8d6f475a)

### Ch05
- Spring Data JDBC
   : 스프링 프레임워크에서 제공하는 JDBC 기반의 데이터 액세스 기술
  기존 JDBC의 단점을 보완한 간결한 형태의 API 지원
  ![JDBC](https://github.com/wjdals1217/Spring/assets/136421876/03859dc0-fd60-40bb-93b8-7d35735fbbc6)

### Ch06
- 데이터 영속성(Persistence)
  : 데이터를 생성한 프로그램이 종료되더라도 사라지지 ㅇ낳는 데이터의 특성(File, DB)
  메모리 상의 데이터를 파일 시스템, 데이터베이스 등을 활용하여 영구적으로 저장하여 영속성 부여
![CRUD](https://github.com/wjdals1217/Spring/assets/136421876/6af3cd08-df7a-440f-9f0f-e5539d3a114c)

- ORM(Object Relational Mapping)
  : 객체와 데이터베이스의 테이블을 자동으로 매핑해주는 기술
  비즈니스 로직에 더 집중하고 특정 DBMS에 대한 종속성을 줄이는 효과
  ORM 기술을 지원하는 프레임워크(Persistence API)로 MyBatis, JPS(Hibernate) 등

- MyBatis
  : 객체와 SQL을 자동 mapping을 지원하는 ORM 프레임워크
  SQL을 별도의 파일로 분리해서 관리하고, 객체-SQL 사이의 파라미터 Mapping 작업을 자동으로 해주기 때문에 가장 많이 사용하는 ORM 기술
익숙한 SQL을 그대로 이용하면서 JDBC 코드 작성의 불편함도 제거해주고 도메인 객체나 VO 객체를 중심으로 개발이 가능

### Ch07
- Spring Boot
  : 기존 Spring Framework MVC 프로젝트를 보다 가볍고 편리하게 개발할 수 있는 웹 애플리케이션 개발에 최적화 된 프레임워크

- Thymeleaf
  ![Thymeleaf](https://github.com/wjdals1217/Spring/assets/136421876/463eb536-0631-4ee4-8c7b-e3145400019d)

- Lombok
  : getter, setter, toString등의 메서드 작성 코드를 줄여주는 코드 다이어트 라이브러리
![lombok](https://github.com/wjdals1217/Spring/assets/136421876/913539df-b2d0-47b6-95c8-ad1fd4c59df1)
