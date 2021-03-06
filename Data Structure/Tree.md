# Tree

## 개념  
- 회로가 없고, 서로 다른 두 노드를 잇는 길이 하나뿐인 그래프  

## 용어  
- Root Node : 가장 꼭대기에 있는 Node  
- Level : Tree의 각층의 번호  
- Height : Tree의 최대 Level  
- Degree : 노드가 가지고 있는 Child Node의 갯수  

## Binary Tree  
- 모든 Node가 2개의 Sub Tree를 가지고 있는 Tree  

### 성질  
- Binary Tree의 높이는 최소 log2(n+1), 최대는 Node가 다 왼쪽으로 몰렸을 경우인 N이다.  
- 높이가 H인 Binary Tree인 경우, 최소 Node가 다 왼쪽으로 몰린 경우인 H개, 최대 full binary tree인 경우 2^h -1개다.  

### Traversal  
1. Preorder Traversal (전위 순회): Child Node보다 Root Node를 먼저 방문  
2. Inorder Traversal (중위 순회) : 왼쪽, Root, 오른쪽 Child Node 순으로 방문  
3. Postorder Traversal (후위 순회) : Root보다 Child를 먼저 방문  

**Example**  

![image](https://user-images.githubusercontent.com/32921115/103327272-3256d280-4a97-11eb-8587-076395778bac.png)  

![image](https://user-images.githubusercontent.com/32921115/103327281-38e54a00-4a97-11eb-80a3-fe8cca9e726f.png)  

![image](https://user-images.githubusercontent.com/32921115/103327292-47cbfc80-4a97-11eb-9589-4d10b15b1d94.png)  
 

## Binary Search Tree  
- Search를 효율적으로 하기 위한 자료구조  
- 왼쪽 서브 트리 <= Root <= 오른쪽 서브트리  
- Inorder Traversal을 하면 오름차순으로 정렬된 값을 얻을 수 있음.  

### Insert  
- Search를 먼저 수행한다.  
- **Search 실패한 위치가 새로운 노드를 삽입하는 위치**  

### Delete  

![image](https://user-images.githubusercontent.com/32921115/104396659-72857d00-558e-11eb-9379-f6c155d9dd12.png)

- 삭제하려는 노드가 단말 노드  

![image](https://user-images.githubusercontent.com/32921115/104396674-7d401200-558e-11eb-8645-6a8030b89253.png)  

- 삭제하려는 노드가 하나의 서브트리만 갖고 있는 경우  

![image](https://user-images.githubusercontent.com/32921115/104396699-892bd400-558e-11eb-8125-d2c15b09f72e.png)  

- 삭제하려는 노드가 두개의 서브트리를 갖고 있는 경우 (가장 비슷한 값을 가져옴)  

### 가장 비슷한 값?  

![image](https://user-images.githubusercontent.com/32921115/104396764-a5c80c00-558e-11eb-9695-03dac0fac638.png)  

### Time Complex  

- Best : O(logN) (Balanced Tree)  
- Worst : O(N) (Unbalanced Tree)  

## AVL Tree 
- 모든 node의 왼쪽과 오른쪽 sub-Tree의 **높이 차가 1이하**인 Binary Search Tree  
- Tree가 비균형 상태로 되면 스스로 노드들을 재배치해 Balanced 상태 유지  
- Insert, Delete 과정에서 Balanced 상태가 깨질 수 있음.  
- BF : 왼쪽과 오른쪽의 서브트리 높이의 차, **왼쪽 서브트리 높이 - 오른쪽 서브트리 높이**  

### AVL Tree : Insert  

![image](https://user-images.githubusercontent.com/32921115/105002390-8fc9b800-5a74-11eb-9b0a-0fb976f2bfcf.png)

## 2-3 Tree  
- 차수가 2 or 3인 노드를 가지는 트리  

![image](https://user-images.githubusercontent.com/32921115/105004516-6fe7c380-5a77-11eb-8590-ad7a336ec2b8.png)  



