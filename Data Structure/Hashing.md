# Hashing  

## Hashing  
- Hash : **키 값에 대한 산술적 연산에 의해 테이블의 주소를 계산**하여 항목에 접근  
- Hash table : Key 값의 연산에 의해 직접 접근이 가능한 구조  

## Dictionary  
- **map or table**로 불러옴  
- **key와 value** 2가지 필드가 있다.

## Hash Function  

![image](https://user-images.githubusercontent.com/32921115/104125397-c8450400-5399-11eb-8f01-9a4cbc0adaeb.png)

- Key를 입력 받아 Hash Address 생성  
- 이 Hash Address가 배열로 구현된 Hash Table의 Index  

## Hash Table의 구조  

![image](https://user-images.githubusercontent.com/32921115/104125456-2a056e00-539a-11eb-8967-63734f48411e.png)

- M개의 Bucket으로 구성된 테이블 
- collision : 서로 다른 Key k1, k2에 대해 **h(k1) == h(k2)**인 경우  
- overflow : collision이 bucket에 할당된 슬롯 수보다 많이 발생하는 것  
- Hashing은 **필연적으로 collision과 overflow가 발생한다!!**  

## Collsion 해결방법  

### linear probing (선형조사법)  
- 충돌이 ht[k]에서 발생하면, **비어있는 공간이 나올 때 까지 조사한다.**  
- 만약 시작했던 위치로 다시 되돌아오면 Table이 가득 찬 것  
- **clistering(군집화)과 Coalescing(결합) 문제 발생**  

### Example  

![image](https://user-images.githubusercontent.com/32921115/104125577-11498800-539b-11eb-8690-828bd7825f86.png)

### Chaining (체이닝)  
- overflow 문제를 **linked list**로 해결  
- collision이 발생하면 **새로운 Node를 생성해 연결**함

### Example  

![image](https://user-images.githubusercontent.com/32921115/104125508-908a8c00-539a-11eb-9e1b-daa5573a5c24.png)

h(k) = k mod 7 해시 함수 적용  
input = (8,1,9,6,13)  

### 시간 복잡도  
- 해싱은 탐색, 삽입, 삭제가 **O(1)**의 시간 복잡도를 가지나, 최악의 경우 **O(N) 까지 늘어난다.** (빈 테이블이 맨 끝에 있어 계속 Collision이 발생하는 경우)  
