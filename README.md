

# 🖥️ Semi-project

이번 세미 프로젝트는  '기업의 개발 프레임 워크를 이해하고, API를 활용한 기능구현 역량 습득' 에 초점을 두고 본 프로젝트에 앞서 팀으로써 개개인의 역량을 발휘하고 각자 업무를 담당하여 서로 협업하는 팀 프로젝트의 초석이 되는 과정이라고 할 수 있습니다.





## Team 1

- **개발기간** :  2022.06.20 - 2022.06.22

- **개발인원** :  6 명

  

  ![Untitled-1](https://user-images.githubusercontent.com/101780699/174955026-3f5c32d2-83e5-47b1-b67e-6e37cd34eeea.jpg)

| 팀장   | 팀원   | 팀원   | 팀원   | 팀원   | 팀원   |
| ------ | ------ | ------ | ------ | ------ | ------ |
| 김범우 | 이학선 | 이청우 | 우형규 | 김나현 | 임다빈 |







## 사용자별 권한 및 역할

- 관리자 : 상품 조회, 공지사항 등록/수정/삭제
- 회원  : 사진 수정, 댓글 등록/수정/삭제
- 비회원     : 회원가입, 제품 조회, 공지 조회, 댓글 조회







## 추가된 기능을 소개합니다.



### :one: 회원아이디/비밀번호 찾기 (비동기)

* <span style="color: #2D3748; background-color:#fff5b1;"> javascript 와 Jquery 를 이용하여 fetch 함수를 이용하여 비동기 처리 하였습니다.</span>

* 아이디 찾기

  *  회원의 `이름` 과 `이메일` 을 입력합니다.

    ![image-20220622183038595](https://user-images.githubusercontent.com/80139780/175011940-7bb873ba-cb7e-4dc2-9d10-217eec689e54.png)

  * <span style="color: #2D3748; background-color:#fff5b1;"> 입력 후 <u>아이디 찾기</u> 버튼을 누르면 Controller 로 비동기요청을 보내지는동시에 입력된 값을 alert 로 한번더 보여줍니다 그이후 비동기 처리 결과 를 아래와 같이 출력합니다.</span>

  ![image-20220622194539640](https://user-images.githubusercontent.com/80139780/175011672-6731e2bc-e6f0-4e49-9c34-fe9bf754c001.png)

  

  ![image-20220622183447693](https://user-images.githubusercontent.com/80139780/175012115-7c9799ab-1569-4edc-86a0-697cdb941051.png)

  * 비밀번호 찾기 기능은 동일한 방법으로 동일한 결과를 얻을수 있습니다.





<span style="color: #2D3748; background-color:#fff5b1;">
 
***





### :two:  로그인된 유저만 이미지를 변경 할수있습니다.

![image-20220622173105181](https://user-images.githubusercontent.com/80139780/175012272-50eaaec3-595c-48ae-b1f6-e7833c94db98.png)

![image-20220622174901252](https://user-images.githubusercontent.com/80139780/175012398-38bb461c-a774-4324-93bc-1274010b2205.png)



* <span style="color: #2D3748; background-color:#fff5b1;"> **유저**는 community -> Mypage에서 사진을 `수정`할 수 있습니다.</span>
* 로그인 된 회원이 아니라면 로그인페이지로 이동 됩니다.

  
***


### :three:  관리자 페이지 상품목록-> 상품조회 기능

![image-20220622172940986](https://user-images.githubusercontent.com/80139780/175012564-35a19567-66ee-4a2f-8ac9-41c15912722b.png)



* <span style="color: #2D3748; background-color:#fff5b1;"> **관리자**만이 개별 상품을 `조회`할 수 있습니다.</span>



***
  

### :four: 제품별  리뷰 등록 / 수정 / 삭제  



* <span style="color: #2D3748; background-color:#fff5b1;"> **회원** 은 리뷰를 `등록` 할수 있습니다.</span>

![image-20220622181820788](https://user-images.githubusercontent.com/80139780/175012673-5f7362b6-5b54-4e80-9493-0f577d37936e.png)



* <span style="color: #2D3748; background-color:#fff5b1;"> **비회원** 이 등록버튼을 누르면 로그인 화면으로 이동됩니다.</span>

  ![image-20220622182108112](https://user-images.githubusercontent.com/80139780/175012812-e9c60571-96c3-4d51-827c-4e19f1088128.png)



* <span style="color: #2D3748; background-color:#fff5b1;"> 자신의 글은 `수정` 과 `삭제` 를 할수있지만 **다른회원** 댓글은 수정 하거나 삭제 할수 없게 제한합니다.</span>

​	![image-20220622182014941](https://user-images.githubusercontent.com/80139780/175012919-9d7f34ad-0cae-44dd-bc72-9a461eab0fc0.png)


***
  

###  :five: 공지사항 페이지    

![image-20220622172820624](https://user-images.githubusercontent.com/80139780/175013058-597a44fa-6f78-4cd3-928c-8e7f6749bae0.png)



* <span style="color: #2D3748; background-color:#fff5b1;">**비회원** 과 **회원** 은 공지사항 목록과 해당 글을 `읽기` 기능까지만 허용됩니다.</span>

![image-20220622190903296](https://user-images.githubusercontent.com/80139780/175013147-814b995f-84db-4e83-9de3-6dec75ad88c4.png)

* <span style="color: #2D3748; background-color:#fff5b1;"> **관리자** 는  공지사항을  `등록`/`수정`/`삭제` 모두 가능합니다.</span>

![image-20220622190834833](https://user-images.githubusercontent.com/80139780/175013200-50665c3f-d453-4d3e-b66e-f7fce142f9f3.png)

### :six: 제품 을 장바구니에 추가하기

*  **`cart테이블`** 을 새로 생성하여 장바구니 정보를 저장합니다.

1) detail 페이지에서 장바구니 이미지를 클릭하면 제품의 주문 정보를  장바구니페이지로 **`비동기처리`** 합니다.

2) 정상적으로 <u>비동기처리가 완료</u> 가 되면 **`alert 창을 통해 확인`** 할수 있습니다.

   ![image-20220622192233370](https://user-images.githubusercontent.com/80139780/175013243-d3a093d4-323d-43ae-8958-f37c648a26bf.png)

   ***

   ![image-20220622192437526](https://user-images.githubusercontent.com/80139780/175013267-8769616f-cb74-4a20-b9ae-7bd72b27b810.png)

3) cart.jsp 에서는 비동기처리로 전달받은 정보를 바탕으로 화면에 출력해줍니다.

   

 ![image-20220622192659255](https://user-images.githubusercontent.com/80139780/175013296-e452e249-7cfb-4afa-b2b8-3176ce01f439.png)

   

4) 회원이 장바구니를 추가 하지않고 cart 를 클릭했을시 아래화면 처럼 출력합니다.

![image-20220622193056095](https://user-images.githubusercontent.com/80139780/175013337-e02a2bf0-b744-4282-81ef-8f24387ff7bb.png)












## Contributor

- KBW :https://github.com/dakdlzhf/shopping
- LHS  : [@gmail.com](mailto:@gmail.com)
- LCW : [@naver.com](mailto:@naver.com)
- KNH : [@gmail.com](mailto:@gmail.com)
- WHK : [@naver.com](mailto:@naver.com)
- LDB : [@naver.com](mailto:@naver.com)
