package classes;

public class Book {
    private  String ISBN;   //书的编号
    private  String title;   //书名
    private  String author;   //作者
    private double price;    //价格
    private int currentCount;   //当前数量
    private int totalCount;    //总量
    private int borrowedCount;  //借阅次数

    public Book(String ISBN, String title, String author, double price, int count) {
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
        this.price=price;
        this.currentCount=count;  //?
        this.totalCount=count;  //?
        this.borrowedCount=0;  //新上架的书一次都没借过

    }

    public boolean is(String ISBN) {
        return this.ISBN.equals(ISBN);

    }

    public void increaseCount(int count) {
          currentCount+=count;
          totalCount+=count;
    }

    public String getTitle() {
        return title;

    }
}
