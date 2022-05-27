# SpadeWorker Page

---

> Spring MVC/JPA 등을 공부하며 배운 내용들, 그리고 앞으로 배울 내용들을 활용해 볼 목적으로 제작하는 간단한 사이트입니다.
<br/><br/>
> 페이지의 목적은 아직 정해지지 않았지만, 핀터레스트와 유사한 시스템의 블로그 페이지를 제작해 보려 합니다.
프로젝트의 전체적인 아이디어와 디자인은 아래 강의를 참고했습니다.
> <br/><br/>
인프런 - **Hyong Sok Park님** “****작정하고 장고! Django로 Pinterest 따라만들기 : 바닥부터 배포까지”****
> <br/>
[https://www.inflearn.com/course/장고-핀터레스트/dashboard](https://www.inflearn.com/course/%EC%9E%A5%EA%B3%A0-%ED%95%80%ED%84%B0%EB%A0%88%EC%8A%A4%ED%8A%B8/dashboard)
> 

## T**echnology Stack**

---

- Java17 & Spring MVC
- JPA (Hibernate)
- H2 DB (향후 Mysql로 변경 예정)
- Lombok
- Thymeleaf & Bootstrap

## Commit Convention

---

- build: 
  - 시스템 또는 외부 종속성에 영향을 미치는 변경사항
  - build.gradle 변경
- chore:
  - 패키지 매니저 설정할 경우, 코드 수정 없이 설정을 변경
  - application.yml 설정 변경
- docs:
  - documentation 변경
  - README.md 변경
- feat:
  - 새로운 기능 추가
- fix:
  - 버그 수정
- perf:
  - 성능 개선
- refactor:
  - 버그를 수정하거나 기능을 추가하지 않는 코드 변경, 리팩토링
- style:
  - 코드 의미에 영향을 주지 않는 변경사항 ( white space, formatting, colons )
- test:
  - 누락된 테스트 추가 또는 기존 테스트 수정

## History

---

### 2022.05.24
- 프로젝트 최초 생성
- Thymeleaf 레이아웃 테스트

### 2022.05.25
- header/footer/head fragment 파일 제작 및 테스트

### 2022.05.26
- 회원가입/로그인 기능 구현
  - HttpServletRequest Session 적용

### 2022.05.27
- Commit Message 컨벤션 정의
- Http 요청 로깅 기능 구현
- 로그인한 회원만 특정 서비스에 접근할 수 있는 기능 구현
  - Servlet Filter 활용
  - Spring Interceptor로 리팩토링
- 특정 세션을 파싱해주는 @Login 어노테이션 구현
  - Argument Resolver 활용