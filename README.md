# PJT-D
## 논의사항
* commit convention에 따르기(연습!) 
  * 각 단어 첫 문자는 대문자!
  * ex. Feat: Create Login Logic
              로그인 기능 생성
* branch
  * develop
    * feature-user
      * 세부 기능은 commit명으로
    * feature-board

## 역할 분담
1. 혜민
   * User
     * 로그인, 로그아웃, 회원가입, 관리자 회원 조회(Interceptor)
     * User(dto), UserController, UserService, UserServiceImpl, UserDao, UserMapper
2. 정우
   * Board
     * Board(dto), BoardController, BoardService, BoardServiceImpl, BoardDao, BoardMapper
     * SearchCondition
3. 혁규
   * Review
      * Review(dto), ReviewController, ReviewService, ReviewServiceImpl, ReviewDao, ReviewMapper
      * DB 스키마 수정
      * 게시글 ID에 속해있는 리뷰 다 보기
      * 정렬: 오름차순(역사순으로)
