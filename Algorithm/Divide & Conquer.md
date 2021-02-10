# Divide & Conquer

- 문제를 해결할 수 있을 정도로 간단해질 때 까지 문제를 2개 이상의 sub-Problem으로 쪼갠 뒤, sub-Problem의 답을 결합해 기존 문제에 대한 해결책을 제시하는 알고리즘.  

## Binary Search (Divide & Conquer)  

![image](https://user-images.githubusercontent.com/32921115/107459425-85916a00-6b99-11eb-9bf5-aee8ae6dc120.png)

- 배열 A는 정렬되어 있어야 함.  
- A[m]이 target x보다 작으면 low= m+1, 크면 high = m-1로 구간을 좁힘.  
- 값을 찾으면 index 값인 m을 반환하고, s==e면 구간을 다 탐색한 경우가 된다.  
- 한 번 호출될 때마다 구간이 절반씩 쪼개지므로, 시간 복잡도는 O(logN)  

## Merge Sort  

![image](https://user-images.githubusercontent.com/32921115/107459969-99899b80-6b9a-11eb-9c26-f10fb54fe83a.png)

- n개의 원소를 2개로 set로 나눈다.  
