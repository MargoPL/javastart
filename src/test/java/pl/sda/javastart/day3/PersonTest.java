package pl.sda.javastart.day3;

import org.junit.jupiter.api.Test;
import pl.sda.javastart.day4.Pensioner;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void shouldNotBeAblePopulateAgeWithZeroValueWhenUsingDefaultConstructor() {
        Person person = new Pensioner("Adam", "Nowak", 78, 800);

        assert person.getAge() == null ||  person.getAge() != 0;
    }
}