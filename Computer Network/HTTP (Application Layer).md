# Application Layer  

## Application Layer  
- OSI 7 Layers에서 Application Layer는 일종의 User Interface 역할을 한다.  
- 바로 아래의 Presentation Layer와 상호 작용을 할 수 있는 데이터와 그림을 User에게 보여주는 역할  

## Network Application  
- 서로 다른 End System에서 동작하고 Network 상에서 통신  
- P2P 구조, Client-Server 구조 등

## 프로세스 간 통신  
- Process : Host에서 실행 중인 프로그램  
- 호스트 내에서 두 프로세스는 IPC(Inter Process Communication)으로 통신함  
- 다른 호스트 간의 프로세스 통신은 Message를 교환하여 통신  
- 클라이언트-서버의 통신에서 클라이언트 프로세스는 통신을 개시하고, 서버는 세션을 시작하기 위해 접속을 기다리는 프로세스.  
- P2P 구조의 Application은 클라이언트와 서버 프로세스를 모두 가진다.  

## Socket  
- 프로세스는 Socket을 통해 Network로 메세지를 송수신한다. (즉 다른 Host)  
- 소켓은 출입구와 유사. (Sender는 Socket을 통해 Messasge를 Network로 보내고, Receiver의 Socket으로 전달한다.)  

## 프로세스의 주소  
- 메세지 수신을 위해서는 프로세스를 구분하는 식별자가 필요  
- Host는 32비트 IP 주소로 식별  
- 식별자는 Host의 프로세스와 관련된 **IP주소와 Port Number**를 포함  
Ex) HTTP 메시지를 gaia.cs.umass.edu 웹 서버에 전송  
IP 주소: 128.119.245.12  
포트 번호: 80  

## Web과 HTTP  
- Web Page는 Object들로 구성 (Object는 HTML, JPEG 이미지, 자바 애플릿 등)  
- 웹 페이지는 **기본 HTML 파일 + 여러 참조 객체**들로 구성  
- 각 객체는 URL(Uniform Resource Locator)로 지정 (URL은 Server의 Host name과 Object의 경로 이름으로 구성)  

![image](https://user-images.githubusercontent.com/32921115/104991695-b121a880-5a62-11eb-9641-283056424c3b.png)

## HTTP  

![image](https://user-images.githubusercontent.com/32921115/104991743-cd254a00-5a62-11eb-837d-0b4c3f7e6139.png)
- **World Wide Web에서 정보를 주고 받을 수 있는 프로토콜. 주로 HTML 문서를 주고 받고 80번 Port를 사용**  
- 웹 어플리케이션 계층 프로토콜  
- 클라이언트 : Web Object들을 요청하고 받아서 보여주는 웹 브라우저  
- 서버 : 요청에 응답하여 Object들을 보내는 Web Server  
- HTTP는 **TCP**를 사용  
- HTTP는 **Stateless Protocol** (**서버는 클라이언트의 과거 요청들에 대한 정보를 유지하지 않는다.**)  

### 동작  
1. Client는 Port Number 80으로 Server에게 TCP 연결 (Socket 생성)  
2. Server는 Client의 TCP 연결 요청을 수락  
- Web Browser (HTTP 클라이언트)와 Web Server (HTTP Server) 사이에 HTTP Message(어플리케이션 계층 프로토콜 메세지) 를 교환  

## HTTP 연결  
- 비지속 연결과 지속 연결이 있음  

### 비지속 연결  
- Request, Response의 쌍이 **분리된 TCP 연결**을 통해 송수신  
- 하나의 TCP 연결로 **하나의 객체**만 전송  

### Example  

![image](https://user-images.githubusercontent.com/32921115/104992091-9b60b300-5a63-11eb-874b-0c0b7014cb7f.png)

![image](https://user-images.githubusercontent.com/32921115/104992129-b29fa080-5a63-11eb-9c61-f72db723f453.png)

![image](https://user-images.githubusercontent.com/32921115/104992138-b7fceb00-5a63-11eb-8ad4-214877815b78.png)

- 위의 그림은 1개의 HTML 파일을 가져오는 예를 보여줌  
- 10개의 JPEG 파일도 위와 똑같은 방법으로 가져온다.  

### 비지속 연결 : Response Time  

![image](https://user-images.githubusercontent.com/32921115/104992349-32c60600-5a64-11eb-9a60-0d4647eda783.png)

- RTT : Client에서 송신된 패킷이 서버까지 간 후 응답이 다시 되돌아오는데 걸리는 시간  
- TCP 연결을 초기화하는데 걸리는 시간 1RTT + HTTP 요청을 하고 HTTP Response의 대답으로 Object를 받는데 필요한 1RTT = **2RTT (파일 전송 시간)**  

### 비지속 연결 : 단점  
- 각 Object당 2 RTT가 필요  
- 각 TCP 연결에 대한 OS 오버헤드  
- Reference Obejct를 가져오기 위해 종종 병렬 TCP 연결을 시도 (오버헤드 증가)  

### 지속 연결  
- 한번의 TCP 연결을 통해 모든 Request, Response가 송수신  
- 서버는 응답을 보낸 후에 TCP 연결을 유지  
- 모든 Reference Object에 대해 1RTT만 필요함  
- 즉 위의 예에서 비지속 연결은 최소 22RTT가 걸리는데, 지속 연결은 12RTT만 필요  

## HTTP Request/Response 메세지  

- Request, Response 두 유형의 HTTP Message  

### HTTP Request 메세지 일반 폼  

![image](https://user-images.githubusercontent.com/32921115/104992780-1a0a2000-5a65-11eb-99fc-d5a213df9053.png)

![image](https://user-images.githubusercontent.com/32921115/104992883-458d0a80-5a65-11eb-8b0f-c990204bbb49.png)

### 폼 입력  
- 사용자가 브라우저의 폼 필드에 입력하여 서버에 전달  
- Post 방식 : 입력은 entity body로 서버에 업로드  
- URL 방식 : GET 방식 사용, 입력은 Request 라인의 URL 필드로 서버에 업로드

### GET Example  

![image](https://user-images.githubusercontent.com/32921115/104993202-d82da980-5a65-11eb-9992-fc0e5f6bc513.png)

출처 : https://mommoo.tistory.com/60  

- ?로 URL의 끝을 알리면서 데이터의 시작점을 알림  
- data는 Key, value 쌍으로 넣음 id = mommoo

### POST Example  

![image](https://user-images.githubusercontent.com/32921115/104993344-0b703880-5a66-11eb-8a72-4bc50e082da9.png)

- BODYY에다가 데이터를 넣어서 보냄  
- 컨텐츠 타입을 명시해야함. (1번은 GET 방식과 마찬가지로 BODY에 key와 value 쌍으로 데이터를 넣음)  
- 2번은 BODY에 단순 txt를 넣음  
- 3번은 파일 전송할때 BODY의 데이터를 바이너리로 넣는다는 것을 알려줌  


### 유형  

![image](https://user-images.githubusercontent.com/32921115/104993566-630ea400-5a66-11eb-9dd7-ac1c8b3b86f1.png)

### HTTP Response Message  

![image](https://user-images.githubusercontent.com/32921115/104993621-77eb3780-5a66-11eb-8529-ca9c357d9077.png)

### HTTP Response State Code  

![image](https://user-images.githubusercontent.com/32921115/104993648-86395380-5a66-11eb-8d07-2369ecdaa1bb.png)
