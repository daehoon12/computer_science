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

<img src="/Design Pattern/Capture/1.png" width="50%" height="50%">
<img src="/Design Pattern/Capture/2.png" width="50%" height="50%">
<img src="/Design Pattern/Capture/3.png" width="50%" height="50%">

<br/>  

## OCP (Open-Closed Principle)
- 기존 코드를 변경하지 않고 확장할 수 있도록 만들어야 함

### Example  
- BookManager.load() 함수  
- BookDataLoader 클래스는 파일에서 데이터를 입력 받음  
- BookDataLoaderFromDB  
<img src="/Design Pattern/Capture/4.png" width="50%" height="50%">
<img src="/Design Pattern/Capture/5.png" width="50%" height="50%">

<br/>

## LSP (Liskov Substitution Principle)
- 자식 클래스는 부모 클래스를 대체할 수 있어야 함  
- 부모 클래스 객체 대신 자식 클래스 혹은 후손 클래스 객체를 사용했을 때 문제없이 프로그램이 동작해야 함  

### Example
- 정사각형은 사각형의 특별한 종류  
- 상속으로 처리  

<img src="/Design Pattern/Capture/6.png" width="50%" height="50%">


## ISP (Interface Segregation Principle)  
- 하나의 클라이언트만을 위한 인터페이스 보다는 여러개의 클라이언트를 위한 인터페이스가 낫다.  

## DIP (Dependency Inversion Principle)  
- 기능을 직접 구현한 클래스나 함수 보다는, **추상 클래스나 인터페이스를 사용하는 코드**를 작성해야 한다.  
- 기능을 직접 구현한 클래스나 하무는 변경될 가능성이 높음.

# 2. 디자인 패턴 종류  

## 2-1. 생성 패턴(Creational Pattern)  
- 인스턴스를 만드는 절차를 추상화하는 패턴.  
- Factory, Singleton 등 존재  

## 2-2. 구조 패턴 (Structural Pattern)  
- 더 큰 구조를 형성하기 위해 어떻게 클래스와 객체를 합성하는가와 관련된 패턴.  
- Adapter, Decorator, Facade 등  

## 2-3. 행동 패턴(behavioral pattern)  
- 어떤 처리의 책임을 어느 객체에 할당하는 것이 좋은지, 알고리즘을 어느 객체에 정의하는 것이 좋은지 등을 다루는 패턴  
- State, Strategym Template Method, Command, Iterator 등  
