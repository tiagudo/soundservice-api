package br.com.tbi.soundservice.repository;

import br.com.tbi.soundservice.model.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1L, "Tiago Becker",
                "tiago@gmail.com",
                "+5551992864881",
                "Brazil",
                "Mixing and recording and live sound engineer with 30+ years experience",
                "Mixing and recording and live sound engineer with 30+ years experience",
                true, "https://drive.google.com/drive/u/1/folders/0B0hnA936XLnGSGZrQktUclNzTm8?resourcekey=0-dN_M7WsSAEFTnTlt4Hvdmg",
                LocalDateTime.now(), LocalDateTime.now()));

        users.add(new User(2L, "Thomas Sieczkowski",
                "thomas@gmail.com",
                "+5551999998888",
                "Brazil",
                "short text here",
                "longer text here",
                true, "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmiro.medium.com%2Fmax%2F3150%2F1*nYRUPdcT5SiQtXRukHqbHg.png&imgrefurl=https%3A%2F%2Fmedium.com%2F%40thomashs&tbnid=AZmyIJkGe1VQ6M&vet=12ahUKEwi4poXytez2AhUciJUCHUPIAakQMygAegQIARAu..i&docid=BKR6gvrQJvqjDM&w=1810&h=1810&itg=1&q=Thom%C3%A1s%20Sieczkowski&ved=2ahUKEwi4poXytez2AhUciJUCHUPIAakQMygAegQIARAu",
                LocalDateTime.now(), LocalDateTime.now()));
    }

    public void addUser(User user) {
            if (user != null) {
                users.add(user);
            }
    }

    public List<User> findAll() {
        return users;
    }

    public User findByID(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) return user;
        }
        return null;
    }

    public void deleteByID(Long id) {
        User userToBeDeleted = null;
        for (User user : users) {
            if (user.getId().equals(id)) {
                userToBeDeleted = user;
                break;

            }
        }

        if (userToBeDeleted != null) {
            users.remove(userToBeDeleted);
        } else {
            throw new RuntimeException("User does not exist for this ID: ");
        }

    }

    public void updateByID(Long id, User updatedUser) {
        User userToBeupdated = null;
        for (User user : users) {
            if (user.getId().equals(id)) {
                userToBeupdated = user;
                break;

            }
        }

        if (userToBeupdated != null) {
            users.remove(userToBeupdated);
            users.add(updatedUser);
        } else {
            throw new RuntimeException("User does not exist for this ID: ");
        }

    }

}
