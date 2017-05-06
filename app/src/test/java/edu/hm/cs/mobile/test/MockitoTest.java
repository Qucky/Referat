package edu.hm.cs.mobile.test;

import android.widget.Button;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

    private static final String HELLO_WORLD = "HELLO WORLD";
    private static final String MOCK_STRING = "MOCKING";

    @Test
    public void testHelloWorld() {
        MainActivity mainActivity = Mockito.mock(MainActivity.class);
        Mockito.when(mainActivity.getHelloWorldString()).thenCallRealMethod();
        System.out.println(String.format("Hello World Test -> %s", mainActivity.getHelloWorldString()));
        Assert.assertEquals(HELLO_WORLD, mainActivity.getHelloWorldString());
    }

    @Test
    public void testHelloWorldMock() {
        MainActivity mainActivity = Mockito.mock(MainActivity.class);
        Mockito.when(mainActivity.getHelloWorldString()).thenReturn(MOCK_STRING);
        System.out.println(String.format("Mock Test -> %s", MOCK_STRING));
        Assert.assertEquals(MOCK_STRING, mainActivity.getHelloWorldString());
    }

    @Test
    public void testIncrementTestValue() {
        int tempValue = 1;
        TestActivity testActivity = Mockito.mock(TestActivity.class);
        Button incrementButton = Mockito.mock(Button.class);
        Mockito.when(testActivity.getTestValue()).thenReturn(1);
        Assert.assertEquals(tempValue, testActivity.getTestValue());
    }
}