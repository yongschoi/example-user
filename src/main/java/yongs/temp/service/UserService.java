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

    public List<User> findByAll() {
        return mapper.findAll();
    }

    public List<User> findByScoreRating() {
        return mapper.findAll().stream()
                .sorted( (a, b) -> b.getScore() > a.getScore() ? 1 : -1)
                .collect(Collectors.toList());
    }

    public List<User> findByScoreRatingExcludeZero() {
        return mapper.findAll().stream()
                .filter(a -> !((Integer)a.getScore()).equals(0) )
                .sorted( (a, b) -> b.getScore() > a.getScore() ? 1 : -1)
                .collect(Collectors.toList());
    }
 
    public User findByEmail(String email) {
        return mapper.findByEmail(email);
    }
    
    public void insertUser(User user) {
        mapper.insertUser(user);
    }
}
