package com.testing;

import main.UserRepository;
import main.UserRepositoryCLS;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class UserRepositoryCLSTest {
    private UserRepository userRepositoryMock = Mockito.mock(UserRepository.class);

    private String name = "test";
    private String email = "test@gmail.com";
    private String password = "qwert3!";
    private String birthday = "23 September";

    @Test
    public void shouldReturnTrueIfUserExist() {
        Mockito.when(userRepositoryMock.userIsFare("test22@gmail.com")).thenReturn(true);

        assertTrue(UserRepositoryCLS.VerifyUserIsFare(userRepositoryMock, "test22@gmail.com"));
        Mockito.verify(userRepositoryMock).userIsFare("test22@gmail.com");
    }
    @Test
    public void shouldReturnFalseWhenNewUserIsNotCreated() {
        Mockito.when(userRepositoryMock.userCreate(name, email, password, birthday)).thenReturn(false);

        assertFalse(UserRepositoryCLS.MakeUser(userRepositoryMock, name, email, password, birthday));
        Mockito.verify(userRepositoryMock).userCreate(name, email, password, birthday);
    }
    @Test
    public void shouldReturnFalseIfUserNotExist() {
        Mockito.when(userRepositoryMock.userIsFare("test@gmail.com")).thenReturn(false);

        assertFalse(UserRepositoryCLS.VerifyUserIsFare(userRepositoryMock, "test@gmail.com"));
        Mockito.verify(userRepositoryMock).userIsFare("test@gmail.com");
    }

    @Test
    public void shouldReturnTrueWhenNewUserIsCreated() {
        Mockito.when(userRepositoryMock.userCreate(name, email, password, birthday)).thenReturn(true);

        assertTrue(UserRepositoryCLS.MakeUser(userRepositoryMock, name, email, password, birthday));
        Mockito.verify(userRepositoryMock).userCreate(name, email, password, birthday);
    }



}
