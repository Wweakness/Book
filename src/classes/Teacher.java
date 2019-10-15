package classes;

import action.Action;
import com.sun.org.apache.xml.internal.dtm.ref.DTMAxisIterNodeList;

import java.util.Scanner;

//这是User的一个子类，所以继承User
public class Teacher extends User {
    public Teacher(String id,String name){
        super(id,name);
    }

    @Override
    public void menu() {
        System.out.println("***老师请选择***");
        System.out.println("**0、退出**");
        System.out.println("**1、上架**");
        System.out.println("**2、查阅图书**");
        System.out.println("**3、查阅记录**");

    }

    @Override
    public boolean input() {
        Scanner scanner=new Scanner(System.in);
        int selected=scanner.nextInt();
        switch (selected){
            case 0:return true;           //为什么输入0直接跳到欢迎光临这一步了
            case 1:
               putBook();
               break;
            case 2:
                System.out.println("请查询图书");
                break;
            case 3:
                System.out.println("请查询借阅记录");
                break;

        }
        return false;
    }

    private void putBook() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入ISBN");
        String ISBN=scanner.nextLine();
        System.out.println("请输入书名");
        String title=scanner.nextLine();
        System.out.println("请输入作者");
        String author=scanner.nextLine();
        System.out.println("请输入价格");
        double price=scanner.nextDouble();
        System.out.println("请输入数量");
        int count=scanner.nextInt();

        Book book= Action.putBook(ISBN,title,author,price,count);
        System.out.printf("《%s》上架成功%n",book.getTitle());

    }
}
