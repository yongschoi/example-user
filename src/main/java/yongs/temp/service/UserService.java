package yongs.temp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yongs.temp.db.UserMapper;
import yongs.temp.vo.User;
@Service
public class UserService {
	@Autowired
	UserMapper mapper;
	@Autowired
	MinioService minio;

	public List<User> findByAll() throws Exception {
		List<User> users = mapper.findAll();
		for (User user : users) {
			user.setPhotoUrl(minio.getObjectUrl("example-user", user.getPhotoName()));
		}
		return users;
	}

	public List<User> findByScoreRating() throws Exception {
		return findByAll().stream().sorted((a, b) -> b.getScore() > a.getScore() ? 1 : -1).collect(Collectors.toList());
	}

	public List<User> findByScoreRatingExcludeZero() throws Exception {
		return findByAll().stream().filter(a -> !((Integer) a.getScore()).equals(0))
				.sorted((a, b) -> b.getScore() > a.getScore() ? 1 : -1).collect(Collectors.toList());
	}

	public User findByEmail(String email) throws Exception {
		User user = mapper.findByEmail(email);
		user.setPhotoUrl(minio.getObjectUrl("example-user", user.getPhotoName()));		
		return user;
    }
}
