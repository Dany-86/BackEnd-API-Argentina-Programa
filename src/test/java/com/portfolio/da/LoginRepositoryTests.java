package com.portfolio.da;

import com.portfolio.da.model.UserLogin;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;
import com.portfolio.da.repository.LoginRepository;

//ESTE TEST SE USO PARA CREAR EL USUARIO Y LA CONTRASEÑA ENCRIPTADA
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Rollback(false)
public class LoginRepositoryTests {
    
    /*
    @Autowired
    LoginRepository loginRep;
    
    @Test
    public void testCreateUser() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "contraseña elegida";
        String encodePassword = passwordEncoder.encode(rawPassword);
        UserLogin newUser = new UserLogin("mail elegido", encodePassword);
        UserLogin savedUser = loginRep.save(newUser);
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isGreaterThan(0);
    }
*/
}
