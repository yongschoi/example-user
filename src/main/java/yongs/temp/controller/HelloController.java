package yongs.temp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yongs.temp.service.UserService;
import yongs.temp.vo.User;

@RestController
@RequestMapping("/user")
public class HelloController {
	private Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> findByAll() throws Exception {
        logger.debug("example-hello|HelloController|findByAll()");
        return userService.findByAll();
    }

    @GetMapping("/score")
    public List<User> findByScoreRating() throws Exception {
    	logger.debug("example-hello|HelloController|findByScoreRating()");
    	// score 별로 리스팅
    	return userService.findByScoreRating();
    }

    @GetMapping("/excludezero")
    public List<User> findByScoreRatingExcludeZero() {
    	logger.debug("example-hello|HelloController|findByScoreRatingExcludeZero()");
        // score 별로 리스팅 (0점 제외)
    	return userService.findByScoreRatingExcludeZero();
    }
}
