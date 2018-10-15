package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator
{
    private final static int MIN_PASS_LENGTH = 5;
    private final static int MAX_PASS_LENGTH = 10;
        public static Boolean isValid(String password)
        {
            return password.length()>=MIN_PASS_LENGTH && password.length()<=MAX_PASS_LENGTH;
        }

        public static Boolean isValidSC(String password)
        {
            Pattern pattern = Pattern.compile(".*[/?.,*='@#$!].*");
            Matcher matcher = pattern.matcher(password);
            boolean SC = matcher.matches();
            return SC;

        }
        public static Boolean isValidOD(String password)
        {
            Boolean OD=false;
            for(int i = 0; i < password.length(); i++)
            {
                if(password.matches(".*[a-zA-Z]+.*") && password.matches(".*[0-9].*"))
                {
                    OD = true;
                }
            }
            return OD;
        }

        public static Boolean isValidSpace(String password)
        {
            boolean space = false;
            if(password!=null)
            {
                for(int i = 0; i < password.length(); i++)
                {
                    if(password.charAt(i) == ' ')
                        space = true;
                }
            }
            return space;
        }

}
