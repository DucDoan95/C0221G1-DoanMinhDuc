package commons;

import java.security.PublicKey;
import java.util.regex.Pattern;

public class RegexServices {
    public static boolean isValidIDVilla(String id){
        String regex ="^SVVL-[0-9]{4}$";
        return Pattern.matches(regex,id);
    }
    public static boolean isValidIDHouse(String id){
        String regex ="^SVHO-[0-9]{4}$";
        return Pattern.matches(regex,id);
    }
    public static boolean isValidIDVRoom(String id){
        String regex ="^SVRO-[0-9]{4}$";
        return Pattern.matches(regex,id);
    }
    public static boolean isValidServiceName(String serviceName){
        String regex = "^[A-Z][a-z]{0,}(?: [A-Z][a-z]*){0,}$";
        return Pattern.matches(regex,serviceName);
    }
    public static boolean isValidArea(String area){
        String regex ="^([3-9][0-9].{0,1}[0-9])|([3-9][0-9])|([1-9][0-9][0-9]{1,})|([1-9][0-9][0-9]{1,}.{0,1}[0-9])$";
        return Pattern.matches(regex,area);
    }
    public static boolean isValidRentalFee(String rentalFee){
        String regex = "^[0-9]{1,}$";
        return Pattern.matches(regex,rentalFee);
    }
    public static boolean isValidNumberPeople(String numberPeople){
        String regex ="^[0-9]|([1][0-9])$";
        return Pattern.matches(regex,numberPeople);
    }
    public static boolean isValidExtraService(String extraService){
        String regex ="^massage|massage|food|drink|car$";
        return Pattern.matches(regex,extraService);
    }
    public static boolean isValidNumberFloor(String numberFloor){
        String regex = "^[0-9]+$";
        return Pattern.matches(regex,numberFloor);
    }
}
