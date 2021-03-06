# Singleton Pattern

## Singleton Pattern

### Problems  
- 여러 객체가 생성되면 상태 관리가 어려움.  

### Soultions
- 객체 생성를 중앙 관리  

### Goals  
- 클래스가 한 개의 인스턴스만을 가질 수 있게 하고, 어디서나 생성된 인스턴스에 접근할 수 있도록 함.  
- 객체가 1개라서 일관된 상태.  

### 고전적 구현 방법  
- Private 디폴트 생성자 구현  
- 싱글턴 인스턴스를 저장하는 정적 변수 생성  
- 싱글턴 인스턴스를 반환하는 정적 팩토리 메소드 구현  

### Thread-safe 버전의 Singleton  
- 여러 개의 스레드에서 앞에서 **고전적 구현 방법**을 사용하면 문제가 발생.  
- **getInstance()** 함수에 동기화 시키는 코드를 넣어야 함. (동시에 Critical Section에 들어가는 것을 방지)  - 느려지는 단점이 있음.  

### DCL 버전의 Singleton  
- 인스턴스가 생성되어 있는지 확인 후, 생성되어 있지 않았을 때만 동기화를 시킴.  

## Homework  
![image](https://user-images.githubusercontent.com/32921115/101908045-ce12c280-3bfe-11eb-933a-03b369a1e811.png)
