package com.zhang.server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class SpringsecurityApplicationTests {

    @Test
    void contextLoads() {
        PasswordEncoder pe = new BCryptPasswordEncoder();
        String encode = pe.encode("123");
        System.out.println(encode);
        boolean matches = pe.matches("123", "$2a$10$Y.2q/P6qKG9q0idvag4ZBucqKFDC4jFUHqGBrFy4ITOBeIRSNkMcm");
        System.out.println(matches);
    }

}