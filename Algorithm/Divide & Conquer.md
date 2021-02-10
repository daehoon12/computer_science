# Divide & Conquer

- 문제를 해결할 수 있을 정도로 간단해질 때 까지 문제를 2개 이상의 sub-Problem으로 쪼갠 뒤, sub-Problem의 답을 결합해 기존 문제에 대한 해결책을 제시하는 알고리즘. 보통 재귀 함수를 이용해 구현함.  

## Binary Search (Divide & Conquer)  

![image](https://user-images.githubusercontent.com/32921115/107459425-85916a00-6b99-11eb-9bf5-aee8ae6dc120.png)

- 배열 A는 정렬되어 있어야 함.  
- A[m]이 target x보다 작으면 low= m+1, 크면 high = m-1로 구간을 좁힘.  
- 값을 찾으면 index 값인 m을 반환하고, s==e면 구간을 다 탐색한 경우가 된다.  
- 한 번 호출될 때마다 구간이 절반씩 쪼개지므로, 시간 복잡도는 O(logN)  

## Merge Sort  

![image](https://user-images.githubusercontent.com/32921115/104397580-72867c80-5590-11eb-903d-79330d5d55e6.png)

- 리스트를 두 개의 균등한 크기로 분할하고 분할된 부분 리스트를 정렬 (Divide, Conquer 과정)   
- 정렬한 두 개의 부분 리스트를 합해 전체 리스트를 정렬 (Combine)  

### Time Complex  
- 크기 n인 리스트를 정확히 균등 분배 -> logN개의 패스  
- 각 패스에서 리스트의 모든 레코드 n개를 비교하므로 n번의 비교 연산  
- **O(NlogN)** 의 시간복잡도  
- **Stability**하며 데이터의 초기 분산 순서에 영향을 덜 받음  

## Quick Sort  

![image](https://user-images.githubusercontent.com/32921115/104397870-fccee080-5590-11eb-931b-69b4a8f406b9.png)

- 위의 그림은 한 번의 Pass  

### 과정  
1. List 안에 있는 한 요소를 선택. Pivot이라고 함.  
2. 피벗을 기준으로 작은 요소들은 피벗의 왼쪽, 큰 요소들은 오른쪽으로 옮겨짐 (Partition 함수
3. 피벗을 제외한 왼쪽 리스트와 오른쪽 리스트를 다시 정렬  
4. 더 이상 쪼개지지 않을 때 까지 반복  

### Code  
- Qucik Sort  

![image](https://user-images.githubusercontent.com/32921115/107461395-39e0bf80-6b9d-11eb-8577-e6dc48fd810d.png)

- Partition  

![image](https://user-images.githubusercontent.com/32921115/107461458-5ed53280-6b9d-11eb-8a5a-06ab3cfef7b1.png)


### Time Complexity  
- Best : 거의 균등한 리스트로 분할되는 경우. O(nlogn)의 시간 복잡도를 가진다.  
- Worst : 이미 정렬되어 있는 리스트를 정렬하거나, 역순으로 정렬되어 있는 리스트를 정렬하는 경우. O(n^2)의 시간 복잡도를 가진다.  
- Example) [1,2,3,4,5,6,7] 같은 정렬된 배열이 있으면, 맨 처음에 퀵소트를 호출할 때 피벗은 1이되고, 모든 데이터가 1보다 크기 때문에 L은 움직이지 않고 R이 L의 위치로 가 1은 자기자리로 돌아가게 된다. 이 과정을 배열 안에 데이터 수(N)만큼 진행하고 매번 n-1개의 데이터들과 값을 비교하게 되어 O(n^2)의 시간 복잡도를 가지게 된다.


