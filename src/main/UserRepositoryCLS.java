package main;


public class UserRepositoryCLS{
    public static boolean VerifyUserIsFare(UserRepository user, String Email)
    {
        return user.userIsFare(Email);
    }
    public static boolean MakeUser(UserRepository user,String name, String Email, String password, String birthday)
    {
        if(!UserUtil.UserValid(name, Email, password, birthday)) {
            return false;
        }
        return user.userCreate(name, Email, password, birthday);
    }
}
