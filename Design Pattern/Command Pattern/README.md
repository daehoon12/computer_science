# Command Pattern

## Command Pattern
- 요구사항 (요청, 명령)을 객체로 캡슐화 시킨다.  
- 클래스가 많아지지만, 객체 사용에 필요한 복잡성을 제거하고 감춤.  

### Example  
- 홈오토메이션용 리모컨을 개발하는데, 차고문, 전등 TV, Strero, 에어컨 등 사용해야 하는 객체가 너무 많고, 서로 다른 명령들로 구성되어 있음.  

### 설계  
![image](https://user-images.githubusercontent.com/32921115/101300039-8cd58800-3877-11eb-891f-e0efd4384591.png)
- Command : Receiver를 알고 있고, Receiver의 메소드를 호출, Receiver의 메소드에서 사용되는 Parameter 값들은 Command에 저장됨.  
- Receiver : 실제 명령(Command) 수행  
- Invoker : 요청을 받아, 요청을 실행하기 위해 Command 인터페이스를 연결, Command의 인터페이스만 알고 있음.  - Client : 무엇을 요청할지 결정하고, 요청 Command를 Invoker에 넘김.  

### Diagram
![image](https://user-images.githubusercontent.com/32921115/101299971-53048180-3877-11eb-89e1-b71017598c83.png)

