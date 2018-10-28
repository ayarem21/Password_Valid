package main;

public class EmailValidator {

    public static boolean isValid(String Email)
    {
        boolean testValid=false;
        for(int i = 0; i<Email.length(); i++) {
            if (Email.charAt(i) == '@') {
                testValid = true;
            }
        }
        if(testValid != true)
        {
            return false;
        }
        if(!Email.contains("."))
        {
            return false;
        }


        if(!Email.matches(".*[a-zA-Z]+.*"))
        {

            return false;
        }


        return true;
    }
}
