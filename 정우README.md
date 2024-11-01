# PJT6 - D 후기

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

## 느낀 점
1. SearchCondition 이해
- SearchCondition에 대한 이해가 부족했으나, 이를 보완하기 위해 Board 부분을 직접 맡아서 수행해보면서 이해도를 향상시켰습니다.
2. Commit Convention 및 branch 사용 역량 향상
- Commit Convention을 사용해보면서 최종 PJT에서 통일성 있는 Commit명을 사용할 수 있는 역량을 기를 수 있었습니다. 
3. Git 사용 역량
- 수많은 충돌을 겪고, gitignore의 중요성과 git 문제 해결 역량을 향상시킬 수 있었습니다.
- `git checkout -b`, `git fetch origin` 등 다양한 새로운 명령어를 사용하며 익힐 수 있었습니다. 