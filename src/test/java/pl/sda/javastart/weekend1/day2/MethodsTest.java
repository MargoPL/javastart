package pl.sda.javastart.weekend1.day2;

import org.junit.jupiter.api.Test;

public class MethodsTest {

    @Test
    public void testRectangleArea2and3resultShouldBe6() {
        assert Methods.calculateRectangeArea(2, 3) == 6; //przyklad
    }

    @Test
    public void testRectangleArea2and3ResultShouldNotBe8() {
        assert Methods.calculateRectangeArea(2, 3) != 8; //przyklad
    }


    @Test
    void sleepInTest() {
        assert Methods.sleepIn(false, false) == true;    //true
        assert Methods.sleepIn(true, false) == false;    //false
        assert Methods.sleepIn(false, true) == true;    //true
        assert Methods.sleepIn(true, true) == true;    //true
    }
}