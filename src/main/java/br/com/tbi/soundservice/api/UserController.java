package br.com.tbi.soundservice.api;

import br.com.tbi.soundservice.model.User;
import br.com.tbi.soundservice.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/users")
    public ResponseEntity addUser(@RequestBody User user) {
        userService.addUser(user);
        URI location = URI.create(String.format("/users/%s", user.getId()));
        return ResponseEntity.created(location).build();
    }

    @GetMapping(value = "/users")
//    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> listar() {
//        return Arrays.asList(new User(1L, "Tiago Becker", "tiago@gmail.com",
//                "+5551992864881", "Brazil", "Mixing and recording and live sound engineer with 30+ years experience",
//                "Mixing and recording and live sound engineer with 30+ years experience",
//                true, "https://drive.google.com/drive/u/1/folders/0B0hnA936XLnGSGZrQktUclNzTm8?resourcekey=0-dN_M7WsSAEFTnTlt4Hvdmg",
//                LocalDateTime.now(), LocalDateTime.now()));
        return userService.list();
    }

    @GetMapping(value = "/users/{user_id}")
    public User listByID(@PathVariable("user_id") Long user_id) {
        return userService.listByID(user_id);
    }

    public void update(Long id, User user) {
        userService.update(id, user);
    }

    public void remove(Long id) {
        userService.remove(id);
    }

}
