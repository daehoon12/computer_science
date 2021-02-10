# Divide & Conquer

- 문제를 해결할 수 있을 정도로 간단해질 때 까지 문제를 2개 이상의 sub-Problem으로 쪼갠 뒤, sub-Problem의 답을 결합해 기존 문제에 대한 해결책을 제시하는 알고리즘. 보통 재귀 함수를 이용해 구현함.  

## Binary Search (Divide & Conquer)  

![image](https://user-images.githubusercontent.com/32921115/107459425-85916a00-6b99-11eb-9bf5-aee8ae6dc120.png)

- 배열 A는 정렬되어 있어야 함.  
- A[m]이 target x보다 작으면 low= m+1, 크면 high = m-1로 구간을 좁힘.  
- 값을 찾으면 index 값인 m을 반환하고, s==e면 구간을 다 탐색한 경우가 된다.  
- 한 번 호출될 때마다 구간이 절반씩 쪼개지므로, 시간 복잡도는 O(logN)  

## Merge Sort  

- Stable Sort  
- 배열을 반으로 쪼개고 (Divide), 각각의 sub-array에 대해 정렬한 뒤 (Conquer), 정렬된 2개의 sub-array를 합친다. (Combine)  
- O(nlogn)의 시간 복잡도.  
