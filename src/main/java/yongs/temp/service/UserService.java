package yongs.temp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yongs.temp.db.UserMapper;
import yongs.temp.vo.User;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    UserMapper mapper;

    public List<User> findByAll() {
        return mapper.getUsers();
    }

    public List<User> findByScoreRating() {
        return mapper.getUsers().stream()
                .sorted( (a, b) -> b.getScore() > a.getScore() ? 1 : -1)
                .collect(Collectors.toList());
    }

    public List<User> findByScoreRatingExcludeZero() {
        return mapper.getUsers().stream()
                .filter(a -> !((Integer)a.getScore()).equals(0) )
                .sorted( (a, b) -> b.getScore() > a.getScore() ? 1 : -1)
                .collect(Collectors.toList());
    }
}
