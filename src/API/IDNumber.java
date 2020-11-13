package API;

public class IDNumber {
    public static String checkSex(String idNum) {
        int sexIndex = idNum.charAt(16);
        if (sexIndex % 2 == 0) {
            return "女";
        } else {
            return "男";
        }
    }

    public static String findBirthYear(String idNum) {
        String birthYear = idNum.substring(6, 10);
        return birthYear;
    }

    public static String findBirthMonth(String idNum) {
        String birthMonth = idNum.substring(10, 12);
        if (birthMonth.charAt(0) == '0') {
            return birthMonth.substring(1);
        } else {
            return birthMonth;
        }
    }

    public static String findBirthDay(String idNum) {
        String birthDay = idNum.substring(12, 14);
        if (birthDay.charAt(0) == '0') {
            return birthDay.substring(1);
        } else {
            return birthDay;
        }
    }
}

