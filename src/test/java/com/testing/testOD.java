package com.testing;

import main.PasswordValidator;
import org.junit.Assert;
import org.junit.Test;

public class testOD {
    @Test
    public void shouldHaveOneDigitAndOneSymbol()
    {
        Assert.assertEquals(true, PasswordValidator.isValidOD("1234erW-"));
        Assert.assertEquals(false,PasswordValidator.isValidOD("1232452"));
        Assert.assertEquals(false, PasswordValidator.isValidOD("asdqsf-/*"));

    }
}
