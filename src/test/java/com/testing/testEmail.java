package com.testing;

import main.EmailValidator;
import org.junit.Assert;
import org.junit.Test;

public class testEmail {
    @Test
    public void ShouldHaveAdog() {
        Assert.assertEquals(true, EmailValidator.isValid("as-kdw@fwads.com"));
        Assert.assertEquals(false, EmailValidator.isValid("sa@dawfv@rrs"));
    }
    @Test
    public void ShouldHaveDot(){
        Assert.assertEquals(true, EmailValidator.isValid("ask-dw_@fwads.com"));

    }
    @Test
    public void ShouldHaveLetters()
    {
        Assert.assertEquals(true, EmailValidator.isValid("as-kdw@fwads.com"));

    }
    @Test
    public void ShouldHaveScore()
    {
        Assert.assertEquals(true, EmailValidator.isValid("askd-w@fwads.com"));
    }
    @Test
    public void ShouldHaveUndrescore()
    {
        Assert.assertEquals(true, EmailValidator.isValid("askd_w@fwads.com"));
    }
}
