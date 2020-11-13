package Practice4;

public class IDCheckTest {
    public static void main(String args[]){
        String idNum1 = "610112199402248339";
        String idNum2 = "430424199402248329";
        String result1 = IDCheck.checkBirthPlaceAndSex(idNum1);
        String result2 = IDCheck.checkBirthPlaceAndSex(idNum2);
        System.out.println(result1);
        System.out.println(result2);
    }
}
