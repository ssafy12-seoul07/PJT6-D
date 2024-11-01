CREATE TABLE grade_table
(	id INT PRIMARY KEY,
	grade VARCHAR(45) NOT NULL
);

INSERT INTO grade_table
VALUES (0, "admin"), (1, "normal"), (2, "vip");

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
