package com.testing;

import main.UserUtil;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class testUserUtil {

    @Test
    public void shouldReturnTrueWhenDataAreValid() {
        assertEquals(true, UserUtil.UserValid
                ("name", "qwert123@gmail.com", "qwerty2#", "17.09.99"));
    }

    @Test
    public void shouldReturnFalseWhenNameIsEmpty() {
        assertFalse(UserUtil.UserValid
                ("", "asdeg123@dsfse.com", "qsdfy2#", "17.09.99"));
    }

    @Test
    public void shouldReturnFalseWhenBirthdayIsEmpty() {
        Assert.assertEquals(false, UserUtil.UserValid
                ("name", "safwf23@afswil.com", "qvvsdy2#", ""));
    }

    @Test
    public void shouldReturnFalseWhenEmailInvalid() {
        assertFalse(UserUtil.UserValid
                ("name", "", "123cczy2#", "17.09.99"));
    }

    @Test
    public void shouldReturnFalseWhenPasswordInvalid() {
        assertFalse(UserUtil.UserValid
                ("test", "awf113@avsail.com", "2rrgd34#rty", "17.09.99"));
    }

}
