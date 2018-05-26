package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findByNameAndPasswordTest() {
        User user = new User();
        String username = "username";
        String password = "password";
        user.setUsername(username);
        user.setUsername(password);
        entityManager.persist(user);
        entityManager.flush();
        // when
        User result = userRepository.findByUsernameAndPassword(username, password);
        // then
        assertThat(result.getUsername())
                .isEqualTo(user.getUsername());
    }
}
