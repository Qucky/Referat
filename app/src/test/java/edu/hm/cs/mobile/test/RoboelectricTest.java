package edu.hm.cs.mobile.test;


import android.widget.Button;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class RoboelectricTest {

    @Test
    public void incrementButton_shouldChangeTestValue_1() throws Exception {
        int tempValue = 1;
        TestActivity testActivity = Robolectric.setupActivity(TestActivity.class);

        Button incrementButton = (Button)testActivity.findViewById(R.id.incrementButton);
        incrementButton.performClick();
        Assert.assertEquals(tempValue, testActivity.getTestValue());

    }

    @Test
    public void incrementButton_shouldChangeTestValue_10() {
        int tempValue = 10;
        TestActivity testActivity = Robolectric.setupActivity(TestActivity.class);

        Button incrementButton = (Button)testActivity.findViewById(R.id.incrementButton);
        for (int i = 0; i < 10; i++) {
            incrementButton.performClick();
        }
        Assert.assertEquals(tempValue, testActivity.getTestValue());
    }
}
