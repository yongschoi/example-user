CREATE TABLE example.`user` (
	id INT auto_increment NOT NULL,
	email varchar(50) NOT NULL,
	name varchar(50) NULL,
	score SMALLINT UNSIGNED NULL,
	CONSTRAINT user_PK PRIMARY KEY (id),
	CONSTRAINT user_UN UNIQUE KEY (email)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;
CREATE INDEX user_email_IDX USING BTREE ON example.`user` (email);

INSERT INTO example.`user` (email,name,score) VALUES
	 ('yongs@naver.com','Yongs',99),
	 ('janny@gmail.com','Janny',70),
	 ('billie@naver.com','Billie Eilish',90),
	 ('taylor@naver.com','Taylor Swift',88),
	 ('lisa@gmail.com','Lalisa Manobal',91),
	 ('john@vuetifyjs.com','John Leider',95),
	 ('jessica@kakao.com','Jessica Alba',85),
	 ('ariana@gmail.com','Ariana Grande',0),
	 ('jordan@naver.com','Michael Jordan',87),
	 ('han@naver.com','한예슬',81),
	 ('hong@naver.com','홍길동',91),
	 ('son@kakao.com','손흥민',83),
	 ('kang@naver.com','강다현',80),
	 ('kim@gmail.com','김연아',77),
	 ('jun@naver.com','전도연',79),
	 ('neymar@gmail.com','Neymar',70),
	 ('song@kakao.com','송혜교',83);
