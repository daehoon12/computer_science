# 1. Machine Learning (기계 학습)  
- 명시적인 규칙 없이 기계가 데이터로부터 학습하도록 하는 기술  

  <img src="/Artificial Intelligence/Capture/1.PNG" width="50%" height="50%">  
  <br/>
# 2. Linear Algebra (선형대수학)  
- 우리는 집의 크기와 가격간의 관계를 찾기를 원함.  
- a : house size, b : price  (data)  
- a에 인자가 두개가 있는 이유 : 집 값에 영향을 주는 요인 (집 평수, 방의 수, 지하철과의 거리 등)
- x1 (x 절편) = slop, x2 (y 절편) = intercept  

## 2.0 Introduction  
- Linear Regression (선형 회귀)   
  - 이 예제에서는 집 값과 집의 크기의 상관 관계를 유추하는 기법  
  - 사진에서 붉은 선 : 모델, X : 데이터
  - 새로운 Data에 대해 예측 (Inference 가능)  
<img src="/Artificial Intelligence/Capture/2.PNG" width="50%" height="50%">  
<br/>

### 2.0.1 Motivating Example  
- Parameter : 모델을 결정짓는 중요한 키 값. Ax =b에서 x에 속함.  
<img src="/Artificial Intelligence/Capture/3.PNG" width="50%" height="50%">  
<br/>

### 2.0.2 Linear Algebra  
 - Algebra (대수학) : 수학적인 기호와 수학적인 기호를 제어하는 학문.  
 ex) bx +c =0
 
 - Linear Algebra (선형대수학) : 선형식(Ax = b, A는 Matrix, b는 Vector)와 관련, 벡터와 벡터들을 제어하는 규칙  

 ### 2.0.3 Two important equations in linear algebra  
 - Ax = b (linear equation)  
 - Ax = Tx (eigenvalue equation)  
 
### 2.0.4 Why Linear Algebra for ML?
 - 데이터는 벡터와 행렬로 표현된다.  
 - 모델은 linear equation (Ax = b)으로 표현이 된다. 
 
### 2.0.5 Mathematical Objects in Linear Algebra  
 - Scalar (R): x  
 - Vector (R^n): x (x i)
 - Matrix (R^(m x n)): X (X i,j)  
 - Tensor (R^(m x n x k)): X (X i,j,k) 
 
### 2.1.1 Vectors   
- In Computer Science, Vectors is list of numbers.  
- 주로 Column Vector 사용.  

### 2.1.2 Vector Space  
- vector들의 Set.  
- 실수에서 덧셈과 스칼라 곱에 닫혀있다. (ex 실수 + 실수 = 실수 -> 덧셈에 대해 닫혀있다.)  

#### Polynomials are vectors? (다항식도 벡터니?)  
(사진)
