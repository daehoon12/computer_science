# Dynamic Programming  

## Dynamic Programming  
- 복잡한 문제를 간단한 여러 개의 문제로 나누어 푸는 방법  
- 시간이 오래 걸리는 문제들의 시간을 줄일 수 있음.  

## Dynamic Programming : 방법  
1. 주어진 문제를 여러개의 Sub-Problem으로 쪼갠다.  
2. 각 Sub-Problem을 해결하고 값을 저장한다.  
3. 그 값들을 이용해 전체 문제를 값을 구한다.  

## Dynamic Programming : 조건  
1) Optimal Substructure Property : 주어진 문제에 대한 최적해를 구하고자 할 때, 좀 더 작은 s**ub-problem들에 대한 optimal solution들을 찾은 후 그것들을 결합하면 결국 전체 문제의 optimal solution 이 되는 경우.** (이는 그리디 알고리즘에서도 유사하게 적용된다.)

2) Overlapping Subproblems Property : sub-sub problem 간에 중복되는 경우가 여러 번 발생하는 경우이다. 그렇다면 이것을 **매번 계산하지 않고 먼저 계산한 값을 배열이나 해시 테이블에 저장**해두었다가 다음번 수행 시 즉시 반환할 수 있다. (Memoization)

## Vs. Greedy Algorithm  
- DP는 가능한 모든 방법을 고려해 항상 최적의 해 (Optimal Solution)을 얻을 수 있다.  
- Greedy Algorithm은 그 때의 가장 최적의 해를 구하는 방식이라, 항상 Optimal한 해를 얻을 수 없다.  
- 즉, DP는 그리디 알고리즘에 비해 시간적으로는 효율적이지 못할 수는 있어도, 그 결과에 대해서는 효율적인 값을 구할 수가 있다.  

## Dynamic Programming : Fibonacci  

- 피보나치 점화식 : F[n] = F[n-1] + F[n-2]  

![image](https://user-images.githubusercontent.com/32921115/105471963-b1c67300-5cde-11eb-8682-336be7448e86.png)

- 시간 복잡도 O(2^n)  

![image](https://user-images.githubusercontent.com/32921115/105472036-c99df700-5cde-11eb-907e-56aee314aafb.png)

- DP를 이용해 시간 복잡도를 O(n)으로 줄였다.  
