package commons;

import java.util.regex.Pattern;

public class RegexCustomer {
    public static boolean regexNameCustomer(String name){
        String regexName = "^[A-Z][a-z]{0,}(?: [A-Z][a-z]*){0,}$";
        return Pattern.matches(regexName,name);
    }
    public static boolean regexIDCustomer(String id){
        String regexID = "^[0-9]{3}[ ][0-9]{3}[ ][0-9]{3}$";
        return Pattern.matches(regexID,id);
    }
    public static boolean regexEmailCustomer(String email){
        String regexEmail = "^[A-Za-z0-9_]{1,}[@][a-zA-Z0-9]{1,}[.][a-zA-Z0-9]{1,}$";
        return Pattern.matches(regexEmail,email);
    }
    public static boolean regexBirthdayCustomer(String birthday){
        String regexBirthday = "^([0][1-9]|[1][0-9]|[2][0-9]|[3][0-1])[\\/]([0][1-9]|[1][0-2])[\\/]([1][9][0][1-9]|[1][9][1-9][0-9]|[2-9][0-9][0-9][0-9])$";
        return Pattern.matches(regexBirthday,birthday);
    }
}
