# Transport Layer  

## Transport Layer  
- 하나의 프로세스에서 다른 프로세스로 **Message**를 보내는 Layer  
- Newwork Layer에 의존해 **Process 간의 Communication을 담당**하는 Layer  
- Messege를 Segment로 나누어 Network Layer로 전송함  
- Internet : TCP, UDP 프로토콜  

## Multiplexing / Demultiplexing  
- Multiplexing : 소켓들로부터 Data를 모으고, 헤더 정보를 포함한 Segment들을 Network Layer에 전달  
- Demultiplexing : 헤더 정보를 사용해 수신된 Segment들을 올바른 Socket에 전달  

### 비연결형 Multiplexing/Demultiplexing  

![image](https://user-images.githubusercontent.com/32921115/104997035-483f2e00-5a6c-11eb-8969-628e360c0135.png)

- UDP Socket : Port Number, IP 주소  
- Host가 UDP 세그먼트를 보낼 때 **Port number만 확인하고 해당 번호를 갖는 Socket에 Segment를 보냄**.  

### 연결형 Multiplexing/Demultiplexing  

![image](https://user-images.githubusercontent.com/32921115/104997176-7d4b8080-5a6c-11eb-8139-4955142eabb6.png)

- 4개의 요소를 가짐, source IP, Port Number, Dest IP, Port Number  
- 4개의 값을 사용해 해당 소켓으로 segment 전달  
- Web Server는 **연결되는 각 클라이언트마다 다른 소켓을 가짐 (비지속 HTTP의 특징)**  

## UDP (User Datagram Protocol)  
- IP에 최소 기능만 추가  
- Best Effort Service (노력은 하지만 결과는 보장하지 않는다) : 최대한 순서대로 보낼려고 노력은 하는데 보장은 안함.  
- Connectionless : 송수신간 Handshake 사용 안함  
- 보통 스트리밍 서비스에서 사용한다.  

## TCP  
- 비신뢰적인 IP 서비스 위에서 신뢰성있는 데이터 전송을 서비스함  
- point-to-point, reliable, in-order byte stream, flow controlled, congestion controlled, connection-oriented  
 
 ### TCP Connection  
 - TCP Sender, Receiver는 Segment 교환 전에 Handwhake를 함  
 - 클라이언트는 연결 요청, 서버는 클라이언트의 요청을 승인  
 
 ### Example  

![image](https://user-images.githubusercontent.com/32921115/104998632-e8965200-5a6e-11eb-9436-2a49efb035be.png)

- Client는 Server에게 접속을 요청하는 SYN 패킷을 보내고 SYN/ACK를 기다리는 SYN_SENT 상태가 됨  
- 서버는 SYN 요청을 받고 Client에게 ACK와 SYN flag를 보냄.  
- Client는 ACK를 보내고 이후 연결이 이루어지고 데이터가 오가게 된다.  

## TCP Error Control  

### Stop and Wait ARQ  
- Sender는 Frame을 보내고 ACK가 올때까지 기다림  
- Receiver는 Frame을 받고 ACK를 보냄  
- Sender는 Timer 내에 ACK가 안 올시 다시 Frame을 전송  
- Pipelining을 이용해 Stop-ans-Wait의 속도를 올릴 수 있음  

### Example  

![image](https://user-images.githubusercontent.com/32921115/104999204-d10b9900-5a6f-11eb-9996-df23bef2b169.png)

- Sender는 Frame0을 보내고, Receiver는 다음 Frame 순서인 1을 달라고 ACK1에 보냄  
- Frame1이 중간에 손실 되었는데, Timer가 만기되니 Sender는 다시 Frame을 보냄  

### GO-back-N ARQ  

![image](https://user-images.githubusercontent.com/32921115/105000195-63606c80-5a71-11eb-981a-abf2d6eaf98f.png)

- 파이프라이닝을 이용해 개선된 성능을 보여줌  
- Window Size : 2^m -1, 2^m은 sequence number 수  
- Sf : ACK를 받아야 하는 Frame Number, Sn : 다음에 보낼 Frame Number

### Window_size < 2^m인 이유  

![image](https://user-images.githubusercontent.com/32921115/105000919-555f1b80-5a72-11eb-8146-5cc4be4ec627.png)

- Receiver: ACK를 보냈는데 중간에 lost가 난 상황  
- Sender : 자신의 Window Size만큼 Frame을 보냄  
- Sender는 한 개의 ACK도 받지 못해 **TimeOut 이후 다시 맨 처음 0을 Receiver에게 보내는데, Receiver는 3 다음에 오는 0인 줄 알고 Accepted하는 상황이 발생**한다.  
