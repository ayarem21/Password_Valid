package com.testing;


import main.PasswordValidator;
import org.junit.Assert;
import org.junit.Test;


public class testSpace {
    @Test
    public void shouldReturnWhenPassHaveSpace()
    {
        Assert.assertEquals(true, PasswordValidator.isValidSpace("123 321"));
        Assert.assertEquals(false, PasswordValidator.isValidSpace("23143521"));
    }
}
