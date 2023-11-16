package app.crisis.CrisisApp.ManagementLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    void addUser(User user);

    User listUser();

    User findById(int id);

    User findByNickName(String nickName);

    User findByEMail(String eMail);

    User deleteById();


}