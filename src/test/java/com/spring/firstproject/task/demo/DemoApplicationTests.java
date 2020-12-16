package com.spring.firstproject.task.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void shouldAddUserAndReturnAddedUserInUserList() {
        // given
        UserController userController = new UserController(new UserRepository());

        // when
        userController.add("Jan", "Kowalski", 34);
        String users = userController.users();

        // then
        assertThat(users).contains("Imie: Jan, nazwisko: Kowalski, wiek: 34");
    }

}
