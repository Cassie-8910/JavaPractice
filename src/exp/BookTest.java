package exp;

public class BookTest {
    public static void main(String[] args){
        try{
            Book book = new Book("9781337245","罗佳利",45.8f,45);
        }
        catch (BookException ex){
            System.out.println(ex.getMessage());
        }

        try{
            Book book = new Book("9781337245799","",45.8f,45);
        }
        catch (BookException ex){
            System.out.println(ex.getMessage());
        }

        try{
            Book book = new Book("9781337245789","罗佳利",-45.8f,45);
        }
        catch (BookException ex){
            System.out.println(ex.getMessage());
        }
    }
}
