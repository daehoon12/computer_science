# Sorting Algorithm  

## 개요  
- 단순하지만 비효율적인 방법 : Insert Sort, Select Sort, Bubble Sort O(N^2)  
- 복잡하지만 효율적인 방법 : Quick Sort, Heap Sort, Merge Sort O(NlogN)  

## Stability  
- 동일한 키 값을 갖는 레코드들의 **상대적인 위치가 정렬후에도 바뀌지 않음**  

## Divide & Conquer  
- 주어진 문제를 작은 사례로 나누고(Divide) 각각의 작은 문제들을 해결하여 정복 (Conquer)하는 방법  
- Merge Sort, Quick Sort가 이 방법으로 Sorting이 됨.  

## Merge Sort  

![image](https://user-images.githubusercontent.com/32921115/104397580-72867c80-5590-11eb-903d-79330d5d55e6.png)

- 리스트를 두 개의 균등한 크기로 분할하고 분할된 부분 리스트를 정렬  
- 정렬한 두 개의 부분 리스트를 합해 전체 리스트를 정렬  

### Time Complex  
- 크기 n인 리스트를 정확히 균등 분배 -> logN개의 패스  
- 각 패스에서 리스트의 모든 레코드 n개를 비교하므로 n번의 비교 연산  
- **O(NlogN)**의 시간복잡도  
- **Stability**하며 데이터의 초기 분산 순서에 영향을 덜 받음  

## Quick Sort  

![image](https://user-images.githubusercontent.com/32921115/104397870-fccee080-5590-11eb-931b-69b4a8f406b9.png)

- 위의 그림은 한 번의 Pass  
- **가장 빠른 정렬 방법**  
- 마찬가지로 **분할 정복** 사용  
- 리스트를 2개의 부분리스트로 비균등 분할하고, 각각의 부분리스트를 다시 Quick Sort함  
- **Unstability한 정렬**  
### Partition  

![image](https://user-images.githubusercontent.com/32921115/104398853-e45fc580-5592-11eb-801f-7476685f9a8c.png)

- partion 함수로 피벗을 나눈 뒤, **포인터 2개를 왼쪽, 오른쪽에 둔다.**  
- 오른쪽에 있는 포인터가 왼쪽에 있는 포인터보다 작아지면 반복문 탈출, 그 동안 위의 조건으로 포인터를 증가 시키고, 가리키는 곳의 값들을 Swap해준다. 

### Best Case  
- 패스 수 : logN  
- 각 패스 안에서의 비교 회수 : N  
- **Nlog(N)**  

### Worst Case  
- 이미 정렬된 리스트를 정렬하거나, 역순으로 정렬된 경우 맨 오른쪽을 가리키는 포인터가 왼쪽 끝까지 간 다음에 분할하므로 **O(N^2)**의 시간 복잡도를 보인다.  
