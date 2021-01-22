# Domain Name System (DNS)  

## DNS  
- 호스트의 도메인 이름을 호스트의 네트워크 주소로 바꾸거나 그 반대의 변환을 수행하는 시스템.  

## DNS: 배경  
- IP 주소로 다른 서버에 접속하는 것은 불편함.  
- 이를 해결하기 위해 DNS 탄생  
- DNS Server는 수 많은 IP 주소의 이름이 저장되어 있는 서버를 말함.  

## DNS: 동작원리  
- 컴퓨터에서 브라우저를 켜고 www.google.com 을 입력한다.  
- 컴퓨터는 컴퓨터 내부에 등록 되어 있는 DNS 서버로 www.google.com에 해당되는 IP 주소를 물어보고  
- DNS 서버는 해당 도메인의 IP 주소를 알려준다.  
- 컴퓨터는 이를 받아서 IP 주소에 해당하는 컴퓨터에 접속하게 되는 것이다.  

## DNS: 구조  

![image](https://user-images.githubusercontent.com/32921115/105452444-b03a8200-5cc1-11eb-8636-71d27b517965.png)

- Root DNS 서버(최상위 서버) / Top-level DNS 서버 / Second-level DNS 서버 / sub DNS 서버 (최하위 서버)  
- 각 서버는 바로 아래 서버의 주소를 알고 있어, 하위로 내려가면서 도메인에 맞는 IP 주소를 찾는 과정을 거침.  

### Local DNS Name Server  
- 계층에 속해있지 않음.  
- 호스트가 DNS 쿼리를 만들 때, local DNS Server에 보냄. 만약에 local에 cache가 있으면 즉시 host에게 보내고, 모르면 root DNS server로 보냄.    
- 마치 proxy처럼 행동.  

## DNS name Resolution  

- 반복적인 쿼리  

![image](https://user-images.githubusercontent.com/32921115/105453158-fba16000-5cc2-11eb-8a19-7bdc2037c4e2.png)

- 재귀적 쿼리  

![image](https://user-images.githubusercontent.com/32921115/105453217-14aa1100-5cc3-11eb-8206-86ff0a95ba07.png)

- Overhead : 반복 < 재귀  
