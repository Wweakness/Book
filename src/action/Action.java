package action;
import classes.Book;
import database.Bookshelf;
import exceptions.NosuchBookException;

public class Action {
    //书的上架
    public static Book putBook(String ISBN,String title,String author,double price,int count){
        //1、如果已经有了，增加数目(当前量和总量都有增加)
        //2、如果没有新书上架
        //系统内部只能有一个书架对象
        //单例模式
        Bookshelf bookshelf=Bookshelf.getInstance();  //这样就不用每次上架时都创建一个新的书架了，可以从书架中取一个唯一对象出来
        try {
            Book book = bookshelf.search(ISBN);
            book.increaseCount(count);  //如果书存在就给书增加count本数量
        }catch ( NosuchBookException exc){ //没找到该书抛异常
            Book book=new Book(ISBN,title,author,price,count);
            bookshelf.putBook(book);
            return book;

        }
        return null;
    }
}
