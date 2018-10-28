package com.testing;

import main.PasswordValidator;
import org.junit.Assert;
import org.junit.Test;


public class testPass {
    @Test
    public void shouldReturnTrueWhenLengthBetween5and10() {
        Assert.assertEquals(true, PasswordValidator.isValid("1234567Q@"));
        Assert.assertEquals(false, PasswordValidator.isValid("12@W"));
        Assert.assertEquals(false, PasswordValidator.isValid("123456789@E"));
        Assert.assertEquals(true, PasswordValidator.isValid("123*U"));
        Assert.assertEquals(true, PasswordValidator.isValid("12345678K*"));
    }

    @Test
    public void shouldNotContainsSpaces(){
        Assert.assertEquals(false, PasswordValidator.isValid("1234 5O*"));
    }

    @Test
    public void shouldHaveAtLeastOneSymbolAndOneDigit(){
                ///?.,*='@#$!
        Assert.assertEquals(true, PasswordValidator.isValid("12*3E"));
        Assert.assertEquals(false, PasswordValidator.isValid("12345R"));
        Assert.assertEquals(true,PasswordValidator.isValid("123/weqr"));
        Assert.assertEquals(true,PasswordValidator.isValid("123!weqr"));
        Assert.assertEquals(true,PasswordValidator.isValid("123?weqr"));
        Assert.assertEquals(true,PasswordValidator.isValid("123.weqr"));
        Assert.assertEquals(true,PasswordValidator.isValid("123=weqr"));
        Assert.assertEquals(true,PasswordValidator.isValid("123@weqr"));
        Assert.assertEquals(true,PasswordValidator.isValid("123#weqr"));
        Assert.assertEquals(true,PasswordValidator.isValid("123$weqr"));
        Assert.assertEquals(true,PasswordValidator.isValid("123,weqr"));
        Assert.assertEquals(true,PasswordValidator.isValid("123'weqr"));
    }

    @Test
    public void shouldHaveAtLeastOneSpecialCharacter() {
        Assert.assertEquals(false, PasswordValidator.isValid("12345W"));
        Assert.assertEquals(true, PasswordValidator.isValid("123*45M"));
    }
}
