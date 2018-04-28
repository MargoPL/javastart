package pl.sda.javastart.weekend2.day3;

import org.junit.jupiter.api.Test;

class PersonTest {
    @Test
    void shouldNotBeAbleToPopulateAgeWith0Value() {
        Person person = new Person("Andrzej");

        assert person.getAge() == null || person.getAge() != 0;
    }
}