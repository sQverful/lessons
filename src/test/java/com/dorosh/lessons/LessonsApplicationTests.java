package com.dorosh.lessons;

import com.dorosh.lessons.exercises.reflection.entity.User;
import com.dorosh.lessons.exercises.reflection.service.UserService;
import com.dorosh.lessons.exercises.reflection.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LessonsApplicationTests {

    @Test
    void checkLimitForUserAccountsInClass() throws NoSuchFieldException, IllegalAccessException {
        Integer ACCOUNT_LIMIT = 0;
        Class<User> userClass = User.class;
        Field accountLimit = User.class.getDeclaredField("ACCOUNT_LIMIT");
        accountLimit.setAccessible(true);
        Integer actualLimit = (Integer) accountLimit.get(ACCOUNT_LIMIT);
        assertEquals(5, actualLimit);
    }

    /*Task for self-learning:
      - mark UserService class with @Deprecated
      - write a test that asserts that UserService is deprecated
      (has @Deprecated annotation above the class)
     */
    @Test
    void checkIfUserServiceIsDeprecated() {


    }



}
