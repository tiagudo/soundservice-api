package br.com.tbi.soundservice.service;

import br.com.tbi.soundservice.model.User;
import br.com.tbi.soundservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public List<User> list() {
        return userRepository.findAll();
    }

    public User listByID(long id) {
        return userRepository.findByID(id);
    }

    public void update(Long id, User user) {
        userRepository.updateByID(id, user);
    }

    public void remove(long id) {
        userRepository.deleteByID(id);
    }
}
