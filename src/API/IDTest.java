package API;

public class IDTest {
    public static boolean checkIDLastChar(String idNum) {
        if ((idNum.charAt(17) > '0' && idNum.charAt(17) < '9') || idNum.charAt(17) == 'x' || idNum.charAt(17) == 'X') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkIdIsDigit(String idNum) {
        String substr = idNum.substring(0, 17);
        for (int i = 0; i < substr.length(); i++) {
            if (substr.charAt(i) < '0' || substr.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String idNum = "4304220010405142x";
        String sex = IDNumber.checkSex(idNum);
        String birthYear = IDNumber.findBirthYear(idNum);
        String birthMonth = IDNumber.findBirthMonth(idNum);
        String birthDay = IDNumber.findBirthDay(idNum);

        try {
            if (idNum.length() != 18) {
                throw new IDException("传入的身份证号长度未满足18位");
            }
        } catch (IDException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (!checkIDLastChar(idNum)) {
                throw new IDException("身份证最后一位不能是除0-9和x或X以外的字符");
            }
        } catch (IDException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (!checkIdIsDigit(idNum)) {
                throw new IDException("传入的身份证号前17位不能包含非数字字符");
            }
        } catch (IDException e) {
            System.out.println(e.getMessage());
        }
//        System.out.println("这个人是" + sex + "性，出生日期是" + birthYear + "年" + birthMonth + "月" + birthDay + "日");
    }
}
