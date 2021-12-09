CREATE TABLE example.`user` (
	id INT auto_increment NOT NULL,
	email varchar(50) NOT NULL,
	name varchar(50) NULL,
	score SMALLINT UNSIGNED NULL,
	photo varchar(100) NULL,
	CONSTRAINT user_PK PRIMARY KEY (id),
	CONSTRAINT user_UN UNIQUE KEY (email)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;
CREATE INDEX user_email_IDX USING BTREE ON example.`user` (email);


INSERT INTO `user` (`id`, `email`, `name`, `score`, `photo`) VALUES
	(7, 'jessica@kakao.com', 'Jessica Alba', 000, 'jessica@kakao.com.jpg'),
	(6, 'john@vuetifyjs.com', 'John Leider', 091, 'john@vuetifyjs.com.png'),
	(5, 'lisa@gmail.com', 'Lalisa Manobal', 089, 'lisa@gmail.com.jpg'),
	(4, 'taylor@naver.com', 'Taylor Swift', 000, 'taylor@naver.com.jpg'),
	(3, 'billie@naver.com', 'Billie Eilish', 092, 'billie@naver.com.jpg'),
	(2, 'janny@gmail.com', 'Janny', 088, 'janny@gmail.com.jpg'),
	(1, 'yongs@naver.com', 'Yongs', 095, 'yongs@naver.com.jpg');