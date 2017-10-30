package ru.ruru.education;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.ruru.education.Lesson2Task2.*;

public class TestLesson2Task2 {

    @Test()
    public void Test01() {
        Assert.assertEquals(minTwo(1,2),1);
    }

    @Test()
    public void Test02() {
        Assert.assertEquals(minTwo(2147483647,-2147483647),-2147483647);
    }

    @Test()
    public void Test04() {
        Assert.assertEquals(minTwo(2,2147483647),-23);
    }
}
