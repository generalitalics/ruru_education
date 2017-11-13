package ru.ruru.education;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import static ru.ruru.education.Lesson2Task3.*;

public class TestLesson2Task3 {
    @Test()
    public void Test01() {
        assertThat("Проверка minTwo()",minTwo(minTwo(1,2),minTwo(3,4)), equalTo(1));
    }

    @Test()
    public void Test02() {
        assertThat("Пол и потолок числовые", minTwo(minTwo(2147483646,2147483646),minTwo(2147483646,-2147483647)), equalTo(-2147483647));
    }

    @Test()
    public void Test03() {
        assertThat("Проверяем равные числа", minTwo(minTwo(100,100),minTwo(100,100)), equalTo(100));
    }

    @Test()
    public void Test04() {
        assertThat("Проверяем отрицательны",minTwo(minTwo(-12346,-12346),minTwo(-12346,-12346)), equalTo(-12346));
    }
}
