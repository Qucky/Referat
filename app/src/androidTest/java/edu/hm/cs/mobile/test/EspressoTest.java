package edu.hm.cs.mobile.test;


import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;

@RunWith(AndroidJUnit4.class)
public class EspressoTest {

    @Rule
    public ActivityTestRule<TestActivity> mActivityRule = new ActivityTestRule<TestActivity>(TestActivity.class);

    @Test
    public void clickIncrementButtonTest_1() {
        int tempValue = 1;
        Espresso.onView(ViewMatchers.withId(R.id.incrementButton)).perform(click());
        //InstrumentationRegistry.getTargetContext().getString(R.string.test_string);
        Espresso.onView(ViewMatchers.withId(R.id.testValueTextView)).check(ViewAssertions.matches(ViewMatchers.withText(String.valueOf(tempValue))));
    }

    @Test
    public void clickIncrementButtonTest_10() {
        int tempValue = 20;
        for(int i = 0; i < 20; i++) {
            Espresso.onView(ViewMatchers.withId(R.id.incrementButton)).perform(click());
        }
        Espresso.onView(ViewMatchers.withId(R.id.testValueTextView)).check(ViewAssertions.matches(ViewMatchers.withText(String.valueOf(tempValue))));
    }
}
