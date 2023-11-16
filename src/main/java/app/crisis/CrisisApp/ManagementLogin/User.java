package app.crisis.CrisisApp.ManagementLogin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.Jar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Entity
@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private int id;
    private String firstName;
    private String lastName;
    private String nickName;
    private String password;
    private String eMail;


}





