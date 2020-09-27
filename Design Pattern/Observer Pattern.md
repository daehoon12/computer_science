# Observer Pattern

## Observer Pattern

- 객체간 One to many 의존 관계를 정의함. 한개 객쳋 상태가 변화할 때, 그 객체와 의존 관계에 있는 모든 객체들이 자동으로 알림을 받고 상태를 갱신함.  
- 사용자가 등록하고, 정보가 변경되는 경우 사용자에게 알려주고 값을 자동으로 갱신  
- Loose Coupling 발생, 확장성 지원  

### 설계  
- 인터페이스 분리  
- 구체적인 클래스 상속  
- 클라이언트는 추상 클래스 상속 후 사용  
- 정보 제공자 (Subject, Observable)  
- 정보 수신자 (Observer, Subscriber)  

### 옵저버 패턴은 일종의 push 서비스를 구현  
- 뉴스  
- 호텔의 모닝콜 서비스  

### Class Diagram
(사진)

### Sequence Diagram  
(사진)


## Loose Coupling  
- 느슨한 결합, 상호작용을 하긴 하지만 서로에 대해 잘 모른는 것  
- Subject와 Observer간 Loose Coupling이 만들어짐  
