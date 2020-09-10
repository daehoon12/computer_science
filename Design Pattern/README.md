# 1. SOLID 원칙   
## S.O.L.I.D : 이해하기 쉽고, 유연하며, 유지 보수가 쉬운 솦트웨어 개발을 위한 다섯가지 소프트웨어 설계 원칙  

## SRC (Single Responsibility Principle)  
- Gather together those things that change for the same reason, and separate those things that change for different reasons.  
- 클래스가 변경되어야 하는 이유는 한 가지로만 구성  
- 클래스의 역할을 한 가지로 구성  
- 사용자와의 관계에 대해서 고민해야 함  
- 클래스에 기능이 많으면 유지보수가 어려워짐.  

### Example
- load() : 파일에서 Book 정보를 읽어서 멤버 변수에 저장  
- show() : 콘솔 화면에 해당 객체의 정보를 보임  

<br/>  

## OCP (Open-Closed Principle)
- 기존 코드를 변경하지 않고 확장할 수 있도록 만들어야 함

### Example  
- BookManager.load() 함수  
- BookDataLoader 클래스는 파일에서 데이터를 입력 받음  
- BookDataLoaderFromDB  

<br/>

## LSP (Liskov Substitution Principle)
- 자식 클래스는 부모 클래스를 대체할 수 있어야 함  
- 부모 클래스 객체 대신 자식 클래스 혹은 후손 클래스 객체를 사용했을 때 문제없이 프로그램이 동작해야 함  

### Example
- 정사각형은 사각형의 특별한 종류  
- 상속으로 처리
