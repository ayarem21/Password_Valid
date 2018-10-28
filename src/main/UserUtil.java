package main;

public class UserUtil {
    public static boolean UserValid(String name,String Email,String password,String birthday)
    {
        if(name == "")
        {
            return false;
        }
        if(birthday == "")
        {
            return false;
        }
        if(!EmailValidator.isValid(Email))
        {
            return false;
        }
        if(!PasswordValidator.isValid(password))
        {
            return false;
        }

        return true;
    }

}


