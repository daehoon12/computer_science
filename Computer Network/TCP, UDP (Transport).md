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

## TCP 신뢰성 있는 데이터 전송  
- TCP는 비신뢰적인 Network Layer 상위 계층에서 신뢰성있는 데이터 전송하는 서비스를 제공한다.  
pipeline, cumulative ACK, Time  
- **타임 아웃이 되거나 중복 ACK**를 받을 시 재전송  

### 재전송 시나리오  

![image](https://user-images.githubusercontent.com/32921115/105446475-88ddb800-5cb5-11eb-93a2-939d69172319.png)

![image](https://user-images.githubusercontent.com/32921115/105446504-97c46a80-5cb5-11eb-89ee-44211be22c50.png)

### 빠른 재전송  
- 중복 ACK를 사용해 손실된 패킷들을 감지한다.  
- Sender는 같은 Data에 대해 3개의 중복 ACK를 수신하게 되면, Segment가 누락된 것을 알고 재전송함  

![image](https://user-images.githubusercontent.com/32921115/105446679-f7227a80-5cb5-11eb-85f5-6b23225a8053.png)

## TCP Window Control for Flow Control & Congestion Control  

### Flow Control  
- Receiver : 수신 버퍼를 가짐  
- TCP Sender가 대용량의 데이터를 빨리 보내 Receiver의 버퍼를 넘치게 하는 것을 방지함  
- 데이터 송신의 속도에 따라 rwnd의 값이 늘거나 줄음.  
- **즉 속도를 매칭시키는 서비스**  

### Congestion  
- 네트워크가 감당할 수 없을 정도로 **많은 출발지에서 너무 많은 데이터를 너무 빨리 보내는 것**이 원인  
- **Sender를 억제하는 메커니즘**  
- Congestion은 패킷 손실 (라우터 버퍼 오버플로우), 큐잉 지연을 초래함  

### Congestion Scenario  
- 시나리오 1  

![image](https://user-images.githubusercontent.com/32921115/105447188-0d7d0600-5cb7-11eb-9206-602af9093f09.png)  

![image](https://user-images.githubusercontent.com/32921115/105447225-2685b700-5cb7-11eb-8902-d9fe062e15df.png)  

- 시나리오 2  

![image](https://user-images.githubusercontent.com/32921115/105447290-4917d000-5cb7-11eb-8973-c4da230e3fb8.png)  


![image](https://user-images.githubusercontent.com/32921115/105447320-5634bf00-5cb7-11eb-8063-e1b25e48dbda.png)  

![image](https://user-images.githubusercontent.com/32921115/105447339-5b920980-5cb7-11eb-9243-92afecbbb1a0.png)  

![image](https://user-images.githubusercontent.com/32921115/105447355-62b91780-5cb7-11eb-9679-413c8960c8f8.png)  

- Congestion의 원인 : 라우터 버퍼가 차있는 경우 패킷 손실, Sender가 너무 일찍 타임아웃 되면 2개의 복사본을 전송.  
- 손실된 패킷 + Timeout 때문에 패킷을 재전송(복사본을 포워딩하는데 필요한 링크 대역폭), Congestion 비용이 증가함.  

- 시나리오 3

![image](https://user-images.githubusercontent.com/32921115/105447510-b297de80-5cb7-11eb-8305-88d39a2c5da5.png)  

![image](https://user-images.githubusercontent.com/32921115/105447527-bc214680-5cb7-11eb-992a-8d7f52542adb.png)  

### TCP Congestion Control  
- TCP는 end-end간의 혼잡제어 방식을 사용  

### TCP Congestion Control : AIMD  

![image](https://user-images.githubusercontent.com/32921115/105447855-69945a00-5cb8-11eb-9328-66baca2342d8.png)  

- 손실이 발생할 때 까지 사용가능한 대역폭을 탐지하면서 전송률 (congestion window size, cwnd)을 증가  
- additive increase : loss 감지될 때까지 RTT 마다 cwnd를 1MSS만큼 증가  
- multiplicative decrease : loss 발생 후 cwnd는 반으로 줄임.  

### TCP Congestion Control : Slow Start  

![image](https://user-images.githubusercontent.com/32921115/105447994-bd06a800-5cb8-11eb-897b-ef599c92a0a3.png)  

- 위 그림은 TCP Tahoe 방식  
- 연결이 시작되면 첫 loss 발생하기 전까지 **전송률을 지수적으로 증가**  
- 초기 cwnd는 1MSS, 매 RTT마다 2배로 증가한다.  
- 초기 전송률은 느리지만, 지수적으로 빠르게 증가한다.  

### TCP Congestion Control : TCP Tahoe vs. TCP Reno  
Q. TimeOut에 의한 Loss  
- Tahoe든 Reno든 Cwnd는 1MSS로 설정하고, 특정 threshold까지 **지수적으로 증가**, 임계치를 지나면 선형적으로 증가  

Q. 만약 Sender가 3개의 duplicate ACK를 수신했다면?  
- Tahoe는 손실이 일어나면 항상 cwnd를 1MSS로 설정  
- Reno는 cwnd를 반으로 줄이고 **cwnd를 선형적으로 증가시키는 Fast Recovery 상태**로 들어감  

### TCP Congestion Control : Example  

![image](https://user-images.githubusercontent.com/32921115/105448494-c6dcdb00-5cb9-11eb-9822-a57100bec023.png)  

- Timeout이 일어나면 둘다 똑같이 cwnd의 크기는 1로 줄음.  


