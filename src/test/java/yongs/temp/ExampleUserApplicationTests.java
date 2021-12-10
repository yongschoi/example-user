package yongs.temp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import yongs.temp.service.UserService;
import yongs.temp.vo.User;

@SpringBootTest
class ExampleUserApplicationTests {
	@Autowired
	UserService userService;

	@Test
	@DisplayName("총 사용자수")
	void user_rating() throws Exception {
		int expectedSize = 7;	
		List<User> list = userService.findByScoreRating();
		assertEquals(expectedSize, list.size());	
	}
	
	@Test
	@DisplayName("0점제외 사용자수")
	void user_rating_exclude_zero() throws Exception {
		int expectedSize = 5;

		List<User> list = userService.findByScoreRatingExcludeZero();
		assertEquals(expectedSize, list.size());	
	}
}
