package pl.sda.javastart.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    void shouldNotShowPasswordInToStringMethod() {
        User firstUser = new User("mariusz","marand","1234567");

        String firstUserText = firstUser.toString();

        assert !firstUserText.contains("1234567");
    }

    @Test
    void shouldNotShowPasswordFieldNameInToStringMethod() {
        User firstUser = new User("mariusz","marand","pass");

        String firstUserText = firstUser.toString();

        assert !firstUserText.contains("pass");
    }

}