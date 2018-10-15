package com.testing;

import main.PasswordValidator;
import org.junit.Assert;
import org.junit.Test;

public class testSC {
    @Test
    public void shouldHaveOneSpecialCharacter()

    {
        ///?.,*='@#$!
        Assert.assertEquals(true, PasswordValidator.isValidSC("12*3E"));
        Assert.assertEquals(false, PasswordValidator.isValidSC("12345R"));
        Assert.assertEquals(true,PasswordValidator.isValidSC("123/weqr"));
        Assert.assertEquals(true,PasswordValidator.isValidSC("123!weqr"));
        Assert.assertEquals(true,PasswordValidator.isValidSC("123?weqr"));
        Assert.assertEquals(true,PasswordValidator.isValidSC("123.weqr"));
        Assert.assertEquals(true,PasswordValidator.isValidSC("123=weqr"));
        Assert.assertEquals(true,PasswordValidator.isValidSC("123@weqr"));
        Assert.assertEquals(true,PasswordValidator.isValidSC("123#weqr"));
        Assert.assertEquals(true,PasswordValidator.isValidSC("123$weqr"));
        Assert.assertEquals(true,PasswordValidator.isValidSC("123,weqr"));
        Assert.assertEquals(true,PasswordValidator.isValidSC("123'weqr"));
    }
}
