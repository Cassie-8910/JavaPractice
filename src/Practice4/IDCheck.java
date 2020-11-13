package Practice4;

public class IDCheck {
    public static String checkBirthPlaceAndSex(String idNum) {
        String str = idNum.substring(0,6);
        int sexIndex = idNum.charAt(16);
        if (str.equals("610112") && (sexIndex % 2 != 0)) {
            return "该居民是陕西省西安市未央区的一名男性";
        }
        else{
            return "该居民不是陕西省西安市未央区的一名男性";
        }
    }
}

