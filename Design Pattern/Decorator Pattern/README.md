# Decorator Pattern  

## Decorator Pattern  
- 객체에 새로운 책임을 동적으로 부여함. 데코레이터는 상속을 남용하지 않아도 유연한 기능 확장이 가능함.  
- **서브클래스를 만드는 것을 통해 기능을 유연하게 확장**할 수 있는 방법을 제공

## 문제 
- 조금씩 다른 다양한 종류. 늘어날수록 확장이 어렵다.

## 해결방안  
- 상속을 사용하지 않고 연관으로 필요한 기능을 추가한다.  

## Diagram  
![image](https://user-images.githubusercontent.com/32921115/102042394-173c5f80-3e15-11eb-838a-a1e411769b69.png)

## 정의  
- Component : 구성요소, 직접 쓰일 수도 있고 **데코레이터로 감싸져서 쓰일 수도 있다.**  
- ConcreteCompoenet : 새로운 행동을 동적으로 추가.  
- Decorator : 자신이 장식할 구성요소와 같은 인터페이스 또는 추상 클래스를 구현한다.  
- ConcreateDecorator : 객체가 장식하고 있는 것을 위한 인스턴스 변수가 있음.  
- **Decorator는 Component의 기능 및 상태를 확장할 수 있다.**

## 호출  
![image](https://user-images.githubusercontent.com/32921115/102043287-61bedb80-3e17-11eb-828c-f725b269f014.png)

## Example  
### Diagram  
- ![image](https://user-images.githubusercontent.com/32921115/102042443-33400100-3e15-11eb-9a7f-43c7e61d24b1.png)

### 손님이 다크 커피에, 모카와 휘핑 크림을 추가  
![image](https://user-images.githubusercontent.com/32921115/102042487-5074cf80-3e15-11eb-980a-e5736f882558.png)
