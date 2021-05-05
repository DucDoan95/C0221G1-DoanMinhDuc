package commons;



public class CustomerException extends Exception {
    public CustomerException(String message) {
        super(message);
    }

    public static void nameException(String name) throws CustomerException {
        String regex = "^[A-Z][a-z]{0,}(?: [A-Z][a-z]*){0,}$";
        if (!name.matches(regex)) {
            throw new CustomerException("Client Name must capitalize first letter of each word");
        }
    }

    public static void emailException(String email) throws CustomerException{
        String regex = "^[A-Za-z0-9_]{1,}[@][a-zA-Z0-9]{1,}[.][a-zA-Z0-9]{1,}$";
        if(!email.matches(regex)){
            throw new CustomerException("Email must be true format abc@abc.abc");
        }
    }

    public static void genderException(String gender) throws CustomerException{
        gender = gender.toLowerCase();
        if(gender.equals("male")||gender.equals("female")||gender.equals("unknow")){
            return;
        }else {
            throw new CustomerException("The gender must be Male, Female or Unknow");
        }
    }

    public static void idCardException(String idCard) throws CustomerException{
         String regexID = "^[0-9]{3}[ ][0-9]{3}[ ][0-9]{3}$";
         if(!idCard.matches(regexID)){
             throw new CustomerException("The Id Card must have 9 digits and be in the format XXX XXX XXX");
         }
    }

    public static void birthdayException(String birthday) throws CustomerException{
        String regexBirthday = "^([0][1-9]|[1][0-9]|[2][0-9]|[3][0-1])[\\/]([0][1-9]|[1][0-2])[\\/]([1][9][0][1-9]|[1][9][1-9][0-9]|[2-9][0-9][0-9][0-9])$";
        if(!birthday.matches(regexBirthday)){
            throw new CustomerException("The year of birth must be> 1900 and 18 years less than the current year, in the correct format dd/mm/yyyy");
        }
    }

}
