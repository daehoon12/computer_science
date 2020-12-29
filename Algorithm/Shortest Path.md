# Shortest Path  

## 1. Dijkstra Algorithm  
- 하나의 Vertex에서 다른 모든 Vertex까지의 최단 경로를 구하는 알고리즘  

#### 구현  
![image](https://user-images.githubusercontent.com/32921115/103284942-077d6780-4a20-11eb-9c3b-8db7067a4079.png)  

1. 시작 node의 Distance와 number를 Min Heap에 넣음. Distance를 기준으로 자동 정렬  
2. 현재 자신의 node와 연결된 모든 Edge를 탐색  
3. 탐색 중 기존의 Dist[]보다 작은 값이 있으면 값을 변경하고 힙에 넣음.  
4. 1~3을 반복해 Heap이 빌 때 까지 반복  

#### 시간 복잡도  
- 최악의 시나이로 : 각 Edge가 검사될 때 마다 Dist[]가 갱신되고 Priority Queue에 node가 추가되는 것.
1. 각 Node마다 인접한 Edge들을 탐색하는 과정 O(E)  
2. Priority Queue에 Node/Distance 정보를 넣고 pop하는 과정 O(ElogE)  
**O(E + ElogE)** or **O(E + ElogV)** (보통 E < V^2)  

## 2. Floyd Warshall Algorithm  
- 모든 Vertex간 최단 경로를 구하는 알고리즘  

#### 구현  
![image](https://user-images.githubusercontent.com/32921115/103284909-e9b00280-4a1f-11eb-84ca-0d0267661f5e.png)  

1. Adjacency Matrix (인접 행렬)을 생성  
2. 3중 for문을 사용, 각각 j,i,j  
3. k를 거쳐서 가는 값(v[i][k] + v[k][j])이 기존의 값 (v[i][j])보다 작으면 바꾼다.    

#### 시간 복잡도  
- 3중 for문 사용 **O(N^3)  
