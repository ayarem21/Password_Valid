package main;

public interface UserRepository{
    boolean userIsFare(String Email);
    boolean userCreate(String name, String Email, String password, String Birthday);

}
