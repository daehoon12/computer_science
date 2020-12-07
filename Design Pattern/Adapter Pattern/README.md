# Adapter Pattern, Iterator Pattern  

## Adapter Pattern  
- 객체를 감싸는 역할을 함.  
- 돼지코(어댑터)같은 것을 예로 생각해보자.  

### 문제  
- 사용 객체의 API가 서로 다름.  

### 해결방안  
- 함수를 변환하는 객체를 중간에 넣음  

### Goals  
- 클래스의 인터페이스를 클라이언트가 원하는 형태의 또 다른 인터페이스로 변환   
- 호환되지 않은 인터페이스 때문에 동작하지 않는 클래스들을 동작할 수 있게 만들어줌   

### Diagram  
![image](https://user-images.githubusercontent.com/32921115/101305825-d6799f00-3886-11eb-9e53-74b5e4e50542.png)

## Facade Pattern  
- 어떤 서브시스템의 일련의 인터페이스에 대한 통합된 인터페이스를 제공.  
- 퍼사드에서 고수준 인터페이스를 제공함.  

### 문제  
- 서브시스템이 너무 많고 사용하기가 복잡함  

### 해결방안  
- 단순한 인터페이스를 제공하는 객체를 중간에 넣음  

### Goals  
- 서브 시스템에 있는 여러개의 인터페이스를 통합하는 한 개의 인터페이스를 제공함.  

### Diagram  
![image](https://user-images.githubusercontent.com/32921115/101305798-c6fa5600-3886-11eb-896b-9418beaee2f5.png)

## Iterator Pattern  

### 문제  
- 자료 구조 클래스의 요소를 한 개씩 접근하는 API가 서로 다름  

### 해결방안  
- Iterator 객체를 중간에 넣음  

### Diagram  
![image](https://user-images.githubusercontent.com/32921115/101309183-1a70a200-388f-11eb-9b68-1e8e1b8e5e45.png)
- iterator() : Iterator에 대한 자료형을 반환  
- hasNext() : 요소가 더 존재하는지 확인. true or false 반환  
- next() : 다음 요소 가져오기  

### Generic  
- ArrayList를 만들었을 때 List에 자료형을 지정해 사용하도록 함  
- 굳이 여러 가지를 지원해야 하면 자료형을 Object로 지정하면 된다.  

* 과제에 Iterator Pattern 예제가 구현되어 있으니 한번 볼 것
###

### Homework  
![image](https://user-images.githubusercontent.com/32921115/101305928-0628a700-3887-11eb-98ef-ab02ed6a8cc8.png)
