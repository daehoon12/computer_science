# Priority Queue (Heap)  

## Priority Queue  
- 우선순위를 가진 항목들을 저장하는 Queue  
- 우선순위가 높은 데이터가 먼저 나가게 됨.  

## 구현 방법  
- Linked List, **Heap**  

## Heap  

![image](https://user-images.githubusercontent.com/32921115/104272508-95f1ee80-54e0-11eb-8775-853af9d2cd94.png)

- Node의 key들이 **Key(부모노드) >= Key(자식노드)** 를 만족하는 완전이진트리 (Max Heap)  
- Heap의 높이는 **Olog(n)**  
- 완전이진트리이므로 마지막 level을 제외하고는 각 level i에 반드시 2^(i-1)개의 node 존재!  
- 배열을 이용해서 구현  

### Insert (Upheap)  

![image](https://user-images.githubusercontent.com/32921115/104272782-3811d680-54e1-11eb-9d4b-b4b5160bc5a4.png)

![image](https://user-images.githubusercontent.com/32921115/104272814-4bbd3d00-54e1-11eb-8173-e30c1bdd70fa.png)

- 새로운 Node를 Heap의 마지막 Node에 잇는다.  
- Heap의 성질을 이용해 자신보다 우선순위가 높은 Parent Node가 나올 때 까지 자리를 바꾼다.

### Delete (downheap) 

![image](https://user-images.githubusercontent.com/32921115/104272890-74453700-54e1-11eb-8b06-73af0af7148c.png)

![image](https://user-images.githubusercontent.com/32921115/104272923-84f5ad00-54e1-11eb-9842-7f995069fa38.png)

- Root Node를 삭제  
- 제일 마지막 Node를 Root Node로 옮기고, 자신의 우선순위에 맞을 때 까지 Child Node와 자리를 바꾼다.  
