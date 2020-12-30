# Minimum Spanning Tree  

## Spanning Tree  
- Graph 내의 모든 Node를 포함한 Tree  
- Minimum Spanning Tree : Spanning Tree 중에서 **Edge들의 Weight의 합이 최소**인 Tree  

## 1. Kruskal Algorithm  
- **Greedy Method**를 이용해 Network의 모든 Node를 최소 비용으로 연결하는 최적 해답을 구함.  
- Edge 선택을 기반으로 하는 알고리즘  

### 구현  
1. Graph의 Edge들을 Weight의 오름차순으로 정렬  
2. 정렬된 Edge리스트에서 순서대로 선택  
3. Cycle을 형성하는 Edge는 제외한다.  

### Union-Find Algorithm  
- Disjoint Set (서로 중복되지 않는 부분집합들) 을 표현할 때 사용하는 알고리즘  
- Kruskal에서 Edge를 선택할 때 Label을 체크한다.  
- 만약 다른 Label일 경우 번호가 낮은 값으로 바꾸고, 같은 Label일 경우에는 Cycle이 생기므로 선택하지 않는다.  
- 시간 복잡도는 Union이 O(1), Find이 O(N)이다, 단 Red-black Tree일 경우에는 Find가 O(logN)이다.  

### 시간 복잡도  
- Edge를 오름차순으로 정렬하는 시간 O(ElogE)  
- Union-Find 시간 복잡도 O(N)  
- 따라서 **O(ElogE)** 의 시간 복잡도를 가진다.  

## 2. Prim Algorithm  
- 마찬가지로 **Greedy Method** 방식 이용  
- Node 선택을 기반으로 하는 알고리즘  

### 구현  
1. Priority Queue에 시작 Node를 넣음.  
2. Queue에서 하나 꺼내서 그 Node와 연결된 모든 Edge들 중에서 **방문하지 않고, 값이 가장 작은 Weight를 선택**한다.  
3. 그 Edge와 연결되어 있는 Node를 다시 Queue에 넣는다.  
4. Queue가 빌 때 까지 반복한다.  

### 시간 복잡도  
- Min Heap을 사용할 경우 모든 Edge 탐색 O(E), 삽입, 삭제 O(logN)  
- **O(ElogN)** 의 시간 복잡도를 가진다.  
