-- --------------------------------------------------------
-- 호스트:                          localhost
-- 서버 버전:                        10.5.6-MariaDB-1:10.5.6+maria~focal - mariadb.org binary distribution
-- 서버 OS:                        debian-linux-gnu
-- HeidiSQL 버전:                  9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 테이블 temp.example_user 구조 내보내기
CREATE TABLE IF NOT EXISTS `example_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `score` int(3) unsigned zerofill DEFAULT NULL,
  `photoName` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`email`),
  UNIQUE KEY `email` (`email`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- 테이블 데이터 temp.example_user:~7 rows (대략적) 내보내기
/*!40000 ALTER TABLE `example_user` DISABLE KEYS */;
INSERT INTO `example_user` (`id`, `email`, `name`, `score`, `photoName`) VALUES
	(3, 'billie@naver.com', 'Billie Eilish', 092, 'billie@naver.com.jpg'),
	(2, 'janny@gmail.com', 'Janny', 088, 'janny@gmail.com.jpg'),
	(7, 'jessica@kakao.com', 'Jessica Alba', 000, 'jessica@kakao.com.jpg'),
	(6, 'john@vuetifyjs.com', 'John Leider', 091, 'john@vuetifyjs.com.png'),
	(5, 'lisa@gmail.com', 'Lalisa Manobal', 089, 'lisa@gmail.com.jpg'),
	(4, 'taylor@naver.com', 'Taylor Swift', 000, 'taylor@naver.com.jpg'),
	(1, 'yongs@naver.com', 'Yongs', 095, 'yongs@naver.com.jpg');
/*!40000 ALTER TABLE `example_user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
