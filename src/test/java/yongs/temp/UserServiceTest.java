package yongs.temp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import yongs.temp.config.DatabaseConfig;
import yongs.temp.service.UserService;
import yongs.temp.vo.User;

@Transactional
@Import(DatabaseConfig.class)
@TestExecutionListeners({
	// Bean 을 DI 받기 위해 선언해줘야 한다.
	DependencyInjectionTestExecutionListener.class
})
@SpringBootTest
class UserServiceTest {    
	@Autowired
	UserService userService;
	
	@Test
	@DisplayName("모든 사용자 테스트")
	void user_rating() {
		int expectedSize = 5;	
		List<User> list = userService.findByScoreRating();
		assertEquals(expectedSize, list.size());	
	}
	@Test
	@DisplayName("0점 사용자 제외 테스트")
	void user_rating_exclude_zero() {
		int expectedSize = 3;
		// int expectedSize = 4;

		List<User> list = userService.findByScoreRatingExcludeZero();
		assertEquals(expectedSize, list.size());	
	}
}
