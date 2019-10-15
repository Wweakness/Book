//书架
package database;

import classes.Book;
import exceptions.NosuchBookException;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    //保存很多的书
    //保存着书的集合
    private List<Book> bookList=new ArrayList<>();

    //静态属性放在方法区上，系统有一个类，就只有这一个静态属性，也就是单例模式，也是饿汉模式
    private static Bookshelf instance=new Bookshelf();
    public static Bookshelf getInstance() {
        return instance;
    }

    public Book search(String ISBN) throws NosuchBookException {
        for (Book book : bookList) {
            if (book.is(ISBN)) {//或者if(book.ISBN.equals(ISBN)){
                return book;
            }
        }
        throw new NosuchBookException(ISBN);//没找对应ISBN的书抛异常
    }

    public void putBook(Book book) {
        bookList.add(book);
    }
}
