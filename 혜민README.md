# PJT6 - 혜민 README

## 나의 역할 : User관련 기능들
* 회원 전체 조회, ID로 조회, email로 조회, 로그인, 로그아웃, 회원가입

### DB 테이블 구조
#### grade_table
```sql
CREATE TABLE grade_table
(	id INT PRIMARY KEY,
	grade VARCHAR(45) NOT NULL
);

INSERT INTO grade_table
VALUES (0, "admin"), (1, "normal"), (2, "vip");
```

#### user
```sql
CREATE TABLE user
(	id VARCHAR(45) PRIMARY KEY,
	email VARCHAR(45) NOT NULL UNIQUE,
    password VARCHAR(45) NOT NULL,
    nickname VARCHAR(45) NOT NULL,
    regist_date TIMESTAMP DEFAULT now(),
    grade INT NOT NULL,
    FOREIGN KEY (grade) REFERENCES grade_table(id)
);

INSERT INTO user
VALUES ('dkjfeoinlkndsflleiwelknf', 'admin@ssafit.com', 'ssafy', 'admin', now(), 0), ('kjlekfnlksdhlfkh','gpals0429@naver.com', 'passowrd', 'hyenem', now(), 1);
```

* id는 UUID로 작성
* 로그인은 email과 password로 하도록 작성
* 권한 부여를 위한 grade

### JAVA 파일에서 신경 쓴 부분
#### 회원가입 기능
* controller
```java
	@PostMapping("/signup")
	public ResponseEntity<?> signup(@RequestBody User user){
		user.setId(UUID.randomUUID().toString());
		boolean result = userService.addUser(user);
		if(result) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
```
* ID를 UUID를 이용하여 세팅

#### 로그인 기능
* controller
```java
	//로그인
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user, HttpSession session){
		String id = userService.login(user);
		
		if(id==null) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		else {
			session.setAttribute("loginUser", id);
			return new ResponseEntity<String>(id, HttpStatus.OK);
		}
	}
```
* serviceImpl
``` java
	public String login(User user) {
		User check = userDao.selectByEmail(user.getEmail());
		if(check!=null && user.getEmail().equals(check.getEmail()) && user.getPassword().equals(check.getPassword())) {
			return check.getId();
		}
		return null;
	}
```

* email을 이용해서 DB에 저장된 회원의 id, email, password를 받아옴
* email과 password가 일치하는지 채크하고, 일치하면 serviceImpl에서 id를 반환
* controller에서 반환되는 id가 있으면 session에 저장

## 아쉬운 점
* grade 이용해서 interceptor 까지 하고싶었는데 시간이 부족했음,,