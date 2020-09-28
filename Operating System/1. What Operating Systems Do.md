# What Operating Systems Do  

## What is Operating System?
- 유저와 하드웨어 사이의 중재자 역할을 하는 프로그램  
- 운영 체제의 목표  
  1) User program을 실행 및 User problems 해결 용이
  2) Computer system을 사용하기 편하게 함
  3) Computer hardware를 효율적인 방법으로 사용
  
<br/>

## Computer System Structure  
- Hardware : CPU, memory, I/O devices  
- Operating System : Users와 Application Programs 가운데 하드웨어 사용을 제어  
- Application Program : User의 Computing Problems를 해결하기 위해 시스템 자원이 사용되는 것을 정의  

<br/>

## Four Components of a Computer System

<br/>

## Operating System Definition  
- OS는 자원을 할당한다.  
  1) 모든 자원 관리  
  2) 요청간의 충돌이 일어날 때 효율적이고 공평한 자원의 사용을 결정  
- OS는 프로그램을 제어한다.  
  1) 오류 및 부적절한 컴퓨터 사용을 방지하기 위한 프로그램 실행 제어   
- Kernel : 컴퓨터가 켜져있는 동안 계속 실행되는 프로그램  

<br/>

## Computer Startup
Bootstrap Program : 컴퓨터를 켤 때 파워가 들어오면 가장 먼저 돌아가는 프로그램  
- ROM에 저장이 되어 있다.  
- 모든 시스템 (CPU register, Device Controller, Memory content 등) 초기화  
- Kernel을 불러오고 실행을 시작한다.  


Interruupt : 부팅이 끝나고부터 발생하는 것이며, 크게 3가지 종류가 있다.
- User의 명령 = User command  
- Hardware Event (CPU, Memory, I/O device)
- Software Event (traps, exception)  

<br/>

## Interrupt Handling  
- OS는 Interrupt 발생 시 CPU의 상태를 레지스터와 Program Counter에 저장한다.  
- polling : 계속 검사하는 방식, vectored interrupt system.  

<br/>

## Storage Structure  
- Main Memory (Random Access Memory) : CPU가 언제든지 접근할 수 있는 Memory, 휘발성이 있다.  
- Secondary Storage : 메인 메모리의 확장, 비휘발성 (Hard disk, Solid-State-Disks)  

<br/>

## Storage Hierarchy  

<br/>

## Caching  
- 느린 저장 공간으로부터 빠른 저장 공간에 임시적으로 만들어놓음.  
- RAM보다 작고, 값이 비쌈.  

<br/>

##
