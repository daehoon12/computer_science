# OS Structure, Process

## Operating System Service  
- Resource Allocation  
- Accounting  
- Protection and Security  

## User Interface  
- CLI (Command Interpreter) : 텍스트 터미널을 통해 사용자와 컴퓨터가 상호 작용하는 방식. (도스, cmd, bash shell)  
(※ Shell : 유닉스에서 사용자로부터 명령어를 받아 해석하고 프로그램을 실행하는 역할)  
- GUI (Graphical User Interface) : 용자가 편리하게 사용할 수 있도록 입출력 등의 기능을 알기 쉬운 아이콘 따위의 그래픽으로 나타낸 것. (MAC OS, Windows)  

## System Calls  
- OS가 제공하는 Programming Interface.  
- High-level Language (C or C++)  
- 바로 System call을 사용하기 보다 Application Programming Interface (API)를 통해서 프로그램에 접근하게 해줌. API는 보통 Library 형태로 제공한다.  

<img src="/Operating System/캡처/1.png" width="50%" height="50%">
<img src="/Operating System/캡처/2.png" width="50%" height="50%">

## OS Design and Implementation  

### OS's Goals  
- Users goals : 사용하기 편리, 쉽게 배움, 신뢰성, 안전, 빠름  
- System goals : 디자인, 유지보수, 구현이 쉽고, flexible, 에러 적고, 효율적  


### Mechanism and Policy
- Policy : 무엇을 할거냐  (What)  
- Mechanism : 결과물을 얻기위해 수행하는 일련의 기술, 프로세스 (How)   
ex) 타이머를 통한 인터럽트 발생 구조 -> Mechanism,  타이머를 얼마나 오랫동안 설정할 지를 결정하는 것 -> Policy  


