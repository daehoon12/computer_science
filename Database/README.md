# Introduction  

## Database : 데이터의 조직화된 모음 (An organized collection of data)  

## Database Management Systems (DBMSs) : 유저와 데이터베이스를 소통할 수 있게 하는 소프트웨어
 - DBMS는 사용이 편리하고 효율적이여야 한다.  
 
 ## File System을 이용해 저장된 데이터를 불러오는 방식의 단점
 - Data redundancy, Data inconsistency 현상 발생.
 - 데이터베이스에서 직접 데이터를 불러올 경우 매번 코드를 짜야된다. (데이터 접근이 어려움)
 - 무결성 문제    
 - Atomicity 문제  
 - 보안 문제  
 
 <br/>
 
 # Relation Model
 
 ## Relatinal Database : 테이블(table)의 모임으로 구성  
 - Table = Relation  
 - Column = Attribute  
 - Row = Tuple  
 
 
## Attribute Types
- Domain : 하나의 속성이 가질 수 있는 값의 범위  
- 속성 값은 Atomic (원자적)이다. -> 속성 값은 쪼갤 수 없다.  
- NULL 값을 가질 수 있다.  
- 중복된 튜플이 존재하지 않는다. 

## Relation Schema  : 릴레이션의 이름과 각 속성의 이름들의 집합
<img src="/Database/캡처/1.png" width="50%" height="50%">  

## Relation Instance : 어느 시점의 릴레이션에 들어있는 튜플들의 집합, , 저장된 데이터 전체를 의미

## Keys : 하나의 tuple을 다른 tuple들로 부터 구별하는 방법  
 - Superkey : : 어떤 Relation의 어떠한 Tuple들도 같은 값을 가지지 않는 Attribute, 또는 Attribute 조합  
 - Candidate Key : Super Key를 구성하는 Attribute 중 하나라도 빠지면 Super key가 될수 없는 Spuer key  
 - Primary Key : 테이블에서 유일하게 식별하기 위해 사용하는 키  
 - Foreign Key : 다른 Relation에 있는 Primary Key를 참조하는 Key  
  
ex) instructor  (ID, name, dept_name, salary ,SSD)
     classroom (building, room_number)

building -> X (동일한 빌딩 이름이 존재할 수 있음)
room number -> X (동일한 번호가 존재할 수 있음)
building, room_number -> super key -> candidate key

## Relational Algebra (관계 대수)  
- Selection (선택 연산) : 선택 조건을 만족하는 Ralation의 tuples을 출력
<img src="/Database/캡처/2.png" width="50%" height="50%">  

- Projection (추출 연산) : Relation에서 선택된 attributes를 출력
<img src="/Database/캡처/3.png" width="50%" height="50%">  

- Natural Join (자연 조인) : 같은 이름을 가지고 있는 attributes에서 두 ralations이 같은 값을 가지고 있는 tuples의 쌍을 출력  
<img src="/Database/캡처/4.png" width="50%" height="50%">  

- Cartesian Product (카티션 곱) : 두 relations부터 가능한 모든 tuple의 쌍을 출력한다.  
<img src="/Database/캡처/5.png" width="50%" height="50%">   

- 합집합, 교집합, 차집합 : 두 ralation의 속성이 같아야 사용이가능하다.

- Example  
<img src="/Database/캡처/6.png" width="50%" height="50%">  

# SQL  

## SQL Data Definition  
- Data -definition Language (DDL) : Relation Schema를 정의, 수정하거나 Relation을 삭제할 수 있다.  
- Type : char(n), varchar(n) {String} (varchar는 데이터 낭비를 줄일 수 있다.) |  int, samllint {Integer} | real, double precision {Floating Point}   

- create table : relation을 정의
(사진)  
- insert : relation의 속성마다 값을 넣어줌  
(사진)
- alter table : 속성을 추가하거나 삭제할 때 사용  
- drop table r : 모든 튜플과 스키마를 삭제  
- delete from r : 모든 튜플 값만 삭제, relation은 남는다.  


## SQL Queries  
- select : Attribute 
- from : Relation  
- where : 조건

### The from Clause  
- from은 카티션 곱 연산의 결과를 가져온다.  
- from instructor, teaches를 실행한 결과
(사진)
- 카티션 곱은 유용하지 않으므로 whwre 절을 이용해 Join 연산을 해야한다.
(사진)

### Additional Basic Operations  
- as 절로 이름을 새로 바꿀 수 있다.  
- percent (%) : %로 둘러쌓인 string의 속성 값을 찾아줌. 사용 할 때는 like 절을 이용  
  ex) where name like '%in%'  
- order by 문 : 한가지 attribute를 기준으로 오름차순 or 내림차순으로 정렬 (ascending이 default)  
- between 절 : 비교 절
  
### Set Operation
- Union  
- Intersect  
- Except  

### Aggregate Functions  
- select 문에 표기  
- avg,min,max 등 다양한 함수가 있다.  
- group by 문 : 그룹별로 그룹핑을 한다. 보통 그룹핑을 한뒤 함수를 사용해 특정한 값을 구함
 (단 함수를 제외한 select 문에 있는 attribute들은 group by 문에도 동일하게 있어야 한다.)    
- Having 절 : 그룹화가 된 후에 조건절 (avg, min, max같은 함수들에 조건을 넣을 때 사용 한다.)  
