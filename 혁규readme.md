# PJT6 - D 후기

### 프로젝트 초기 세팅의 중요성...
초기 세팅을 끝내고 pull 받았을때 무슨 이상한 코끼리 한마리가 자꾸 Package Explorer에 있었다. 확인해보니 프로젝트 초기 세팅을 MAVEN이 아닌 GROOVY로 설정해서 그런 것이었다.

그리고 gitignore 파일을 잘못 올리고 진행해서 많은 설정 파일들이 함께 올라갔었다. 이미 올라간 파일들은 어찌할 수 없기에... 다음엔 이런 실수를 하지 말자는 다짐과 함께 넘어갔다..!

### Commit Convention 설정
8시간 동안 진행하는 매우 짧은 프로젝트이지만 Commit Convention 규칙을 정하고 시작했다.
처음 해보는 형식이라 어색했지만 확실히 기준을 잡고 시작하니 볼륨이 큰 프로젝트를 진행할 때 엄청 효율적일 것 같았다.

### Review 파트 담당

게시글의 댓글 Review 파트 구현을 담당했고, 작성, 삭제, 수정을 구현했다.
사실 큰 어려움은 없었다.

## 제일 어려웠던 것
가장 어려웠고, 머리를 아프게 했던 것은 **초기 세팅** 이었다.
2시간 정도를 세팅하고, 잘못된 세팅 바로 잡고 하는데에 소비한 것 같다.
세팅에 대한 많은 시행착오와 시작단계에서의 문제들을 혜민, 정우와 함께 겪으니 원인을 같이 찾아보는 원동력을 얻게 되어 정말 좋았다....

### Review 테이블 DDL 

```
CREATE TABLE review (
    -- 댓글 번호: 기본키, 자동 증가
    id INT AUTO_INCREMENT PRIMARY KEY, 

    -- 댓글 작성자: User 테이블의 nickname 참조, NULL 불가
    writer VARCHAR(45) NOT NULL,
    FOREIGN KEY (writer) REFERENCES user(id),

    -- 댓글이 작성된 게시글 구분자: Board 테이블의 id 참조, NULL 불가
    board_id INT NOT NULL,
    FOREIGN KEY (board_id) REFERENCES board(id),

    -- 댓글 내용: VARCHAR 사용, 최대 길이 500 (적당한 길이 고려)
    content VARCHAR(500) NOT NULL,

    -- 댓글 작성 날짜: 날짜 타입
    reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,

    -- 최종 수정 날짜: 댓글이 수정되었을 경우 수정 날짜 기록
    last_modified_date DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

```