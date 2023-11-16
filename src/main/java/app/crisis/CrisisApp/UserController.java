package app.crisis.CrisisApp;

import app.crisis.CrisisApp.ManagementLogin.User;
import app.crisis.CrisisApp.ManagementLogin.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController

public class UserController {
    @Autowired
    UserRepository userRepository;
    JdbcTemplate jdbcTemplate;

    @GetMapping("/test")


    public int getTest() {
        return 3;
    }

    @GetMapping("/users")
    public List<User>getAll() {
        return userRepository.getAll();
    }


}







