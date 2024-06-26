# Travel-Shooting
![상단 이미지 후보2](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/b063a562-d6c2-41dd-b778-11f89db73d9a)

<h2>목차</h2>
<h3>  

[1. 프로젝트 소개](#1-프로젝트-소개)  

[2. 아키텍처](#2-아키텍처)

[3. ERD](#3-erd) 

[4. 주요기능](#4-주요기능)  

[5. 기술적 의사결정](#5-기술적-의사결정)  

[6. 트러블 슈팅](#6-트러블-슈팅)  

[7. 사용자 피드백 및 추후 개발 계획](#7-사용자-피드백-및-추후-개발-계획)  

[8. 팀원 소개](#8-팀원-소개)</h3>


## 1. 프로젝트 소개

**프로젝트명 : 트래블 슈팅(Travel Shooting)**
- 여행을 뜻하는 단어인 'Travel'과 문제 해결을 뜻하는 'Trouble Shooting'을 합쳐서 만든 이름으로, 여행에 대한 고민 해결을 뜻함
  
- 여행을 계획하면서 생기는 여러가지 고민이나 문제들을 여러 사람이 모여서 함께 고민하고 해결해보면 좋을 것 같다는 생각으로 프로젝트를 기획을 시작함

- 지도 기능 있는 여행 계획 게시판, 여행 후기와 사진을 올릴 수 있는 후기 게시판, 여행지 별 채팅방 등의 기능을 구현하여 여행을 주제로 한 커뮤니티 활성화를 목표로 함



## 2. 아키텍처 

![서비스 아키텍처 (2)](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/2b01d2cb-0261-4d90-8da5-2f77e569845e)


## 3. ERD 

![8조 ERD (1)](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/f0ed6756-fcd0-4953-9c3f-f51d28cd5e33)



## 4. 주요기능  

- 로그인 및 회원가입
  
 ![회원가입](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/b96b284f-ea93-4aaf-8742-c5956dd5c748)

- 마이페이지(회원정보 수정, 비밀번호 변경)
  
![마이페이지](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/2d4c397b-0d19-4fcb-b24b-f4907fa7941b)  

- 여행 지역별 채팅방
  
![채팅방](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/0c61d7e7-6241-441a-b7f6-5577fc6bc9e2)

- 여행 계획 게시판(지도 API, 날짜별 여행 일정 계획, 여행 경비 계산)
  
![여행 계획 게시판](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/44db36d1-8909-4cbd-8006-1f13cf1e503b)

- 여행 후기 게시판(이미지 첨부 기능)
  
![여행 후기 게시판](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/cddb8e5f-7c1c-4f9b-93c9-f36970aa5a22)

- 게시판 부가 기능(댓글, 대댓글, 좋아요)
  
![부가기능](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/7113aaf6-c81b-445d-8743-18fc3dff8e50)

- 백오피스(회원 관리, 게시글 및 댓글 관리)
  
![백오피스](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/ac2bb0f6-4781-4fda-b228-f6a222375e22)

- 알림 기능

## 5. 기술적 의사결정  

![기술](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/d35718b2-ac29-4406-a8d4-92949af29e87)

## 6. 트러블 슈팅  

<h3>네이버 지도 API </h3>

![네이버 API](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/f18dfe13-ec5b-454d-bc9a-405e405dd027)



<h3>S3 버킷을 활용한 이미지 저장 기능 </h3>  

  ![S3](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/2d5aba3c-b487-4675-8955-dfcd265b3404)

  

<h3> 로그아웃 이후 AccessToken 관리 </h3>  

  
![AccessToken관리](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/02625165-b249-4389-924e-a565656f46fd)


<h3> https 에서의 WebSocket 연결 오류 </h3>  

  ![websocket 연결 오류](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/777e9418-0be8-440d-9360-9eccce1d8bb2)




## 7. 사용자 피드백 및 추후 개발 계획  

  ![유저피드백1](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/3b92817b-92a4-4f9d-9f7c-5e781f639778)


  

![유저피드백2](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/27926764-30cf-46a0-993a-9c2db619f8a2)  


  ![튜터 피드백](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/1a2c5670-3d94-4df7-b9b2-b9b1d22f97c0)


      
    

## 8. 팀원 소개

![역할](https://github.com/Travel-Shootings/Travel-Shooting/assets/131871197/e88fdfc5-07d6-400b-8515-e31dfd3395b2)



