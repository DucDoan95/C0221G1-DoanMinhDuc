package commons;

import java.util.regex.Pattern;

public class RegexService {
    public static boolean regexIdVilla(String id){
        String regexIdVilla ="^[S][V][V][L][-][0-9]{4}$";
        return Pattern.matches(regexIdVilla,id);
    }
    public static boolean regexIdHouse(String id){
        String regexIdHouse ="^[S][V][H][O][-][0-9]{4}$";
        return Pattern.matches(regexIdHouse,id);
    }
    public static boolean regexIdRoom(String id){
        String regexIdRoom ="^[S][V][R][O][-][0-9]{4}$";
        return Pattern.matches(regexIdRoom,id);
    }
    public static boolean regexServiceName(String name){
        String regexServiceName = "^[A-Z][a-z]{0,}(?: [A-Z][a-z]*){0,}$";
        return Pattern.matches(regexServiceName,name);
    }
    public static boolean regexArea(String area){
        String regexAre = "";
        return Pattern.matches(regexAre,area);
    }
    public static boolean regexRentalFee(String rentalFee){
        String regexRentalFee = "^[0-9]{1,}$";
        return Pattern.matches(regexRentalFee,rentalFee);
    }
    public static boolean regexMaxPeople(String maxPeople){
        String regexMaxPeople ="^[0-9]|[1][0-9]$";
        return Pattern.matches(regexMaxPeople,maxPeople);
    }
    public static boolean regexExtraService(String extraService){
        String regexExtraService ="^massage|karaoke|food|drink|car$";
        return Pattern.matches(regexExtraService, extraService);
    }
    public static boolean regexNumberOfFloor(String floor){
        String regexNumberOfFloor ="^[0-9]{1,}$";
        return Pattern.matches(regexNumberOfFloor,floor);
    }
    public static boolean rexRentalType(String rentalType){
        String regexRentalType ="^[A-Z][a-z]{0,}(?: [A-Z][a-z]*){0,}$";
        return Pattern.matches(regexRentalType,rentalType);
    }
    public static boolean regexRoomStandard(String roomStandard){
        String regexRoomStandard ="^[A-Z][a-z]{0,}(?: [A-Z][a-z]*){0,}$";
        return Pattern.matches(regexRoomStandard,roomStandard);
    }
}
