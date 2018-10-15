package com.testing;

import main.PasswordValidator;
import org.junit.Assert;
import org.junit.Test;


public class testPass {
    @Test
    public void shouldReturnTrueWhenLengthBetween5and10()
    {
        new PasswordValidator();
        Assert.assertEquals(true, PasswordValidator.isValid("123456789"));
        Assert.assertEquals(false, PasswordValidator.isValid("1234"));
        Assert.assertEquals(false, PasswordValidator.isValid("1234567890a"));
        Assert.assertEquals(true,PasswordValidator.isValid("12345"));
        Assert.assertEquals(true,PasswordValidator.isValid("1234567890"));


    }

}
