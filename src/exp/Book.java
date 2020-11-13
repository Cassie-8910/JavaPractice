package exp;

public class Book {
    private String isbn;
    private String publisher;
    private String author;
    private float price;
    private int page;

//    判断 isbn 是否合法
    public void setIsbn(String isbn) throws BookException{
        if(isbn.length()!=13){
            throw new BookException("ISBN长度不满足长度为13");
        }
        else{
            if(!isbnIsAllNumber(isbn)){
                throw new BookException("ISBN存在非数字字符");
            }
            else{
                this.isbn = isbn;
            }
        }
    }

    public  String getIsbn() {
        return isbn;
    }
    public boolean isbnIsAllNumber(String isbn){
        boolean flag = true;
        for(int i=0;i<isbn.length();i++){
            char ch = isbn.charAt(i);
            if(ch<'0' || ch>'9'){
                flag = false;
                break;
            }
        }
        return  flag;
    }

//   判断 页码是否合法
    public void setPage(int page) throws BookException{
        if(page< 0){
            throw new BookException("页码数必须是大于等于0的");
        }
        else {
            this.page = page;
        }
    }

    public int getPage(){
        return page;
    }

// 判断作者名字是否合法
    public  void setAuthor(String author) throws BookException{
        if(author.equals("") || author == null){
            throw new BookException("名字不能为空");
        }
        else {
            author = author.trim();
            if (author.length() > 25) {
                throw new BookException("名字长度不能大于25个汉字");
            } else {
                this.author = author;
            }
        }
    }
    public String getAuthor(){
        return  author;
    }

//    判断价格是否合法
    public  void setPrice(float price) throws BookException{
        if(price<0){
            throw new BookException("价格必须是一个大于0的数");
        }
    }
    public float getPrice(){
        return price;
    }

    public Book(String isbn,String author,float price,int page) throws BookException{
        setIsbn(isbn);
        setPage(page);
        setAuthor(author);
        setPrice(price);
    }
}
