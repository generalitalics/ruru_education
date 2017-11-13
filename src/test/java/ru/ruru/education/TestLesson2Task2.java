package ru.ruru.education;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import static ru.ruru.education.Lesson2Task2.*;

public class TestLesson2Task2 {

    @Test()
    public void Test01() {
    assertThat("Проверка minTwo()", minTwo(1,2), equalTo(1));
        //Assert.assertEquals(minTwo(1,2),1);
    }

    @Test()
    public void Test02() {
        //Assert.assertEquals(minTwo(2147483647,-2147483647),-2147483647);
        assertThat("Пол и потолок числовые", minTwo(2147483647,-2147483647), equalTo(-2147483647));
    }

    @Test()
    public void Test03() {
        //Assert.assertEquals(minTwo(2147483647,-2147483647),-2147483647);
        assertThat("Проверяем равные числа", minTwo(100,100), equalTo(100));
    }

    @Test()
    public void Test04() {
        //Assert.assertEquals(minTwo(2147483647,-2147483647),-2147483647);
        assertThat("Проверяем отрицательны", minTwo(-12345,-12346), equalTo(-12346));
    }
}
