package main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator
{
    private final static int MIN_LENGTH = 5;
    private final static int MAX_LENGTH = 10;
    private final static Pattern pattern = Pattern.compile(".*[/?.,*='@#$!].*");
    public static boolean isValid(String password) {

        if (password.contains(" ")) {
            return false;
        }

        if (!password.matches(".*[a-zA-Z]+.*") && !password.matches(".*[0-9].*")) {
            return false;
        }

        Matcher m = pattern.matcher(password);
        if (!m.matches()) {
            return false;
        }


        return password.length() >= MIN_LENGTH && password.length() <= MAX_LENGTH;
    }

    public static void main(String[] args) {
        PasswordValidator pass = new PasswordValidator();
        Scanner in = new Scanner(System.in);
        String password;
        password = in.nextLine();
        System.out.println(pass.isValid(password));
    }
}
