
package classes;

import java.util.Scanner;

public abstract class User {
    private String id;
    private String name;
    public User(String id,String name){
        this.id=id;
        this.name=name;
    }
//用户登陆
    public static User login() throws Exception {
        Scanner scanner = new Scanner(System.in);  //?
        System.out.println("请输入用户id");
        String id = scanner.nextLine();   //nextLine?
        System.out.println("请输入用户姓名");
        String name = scanner.nextLine();
        System.out.println("请输入用户角色");
        String role = scanner.nextLine();
        User user;  //创造一个user对象
        if (role.equals("老师")) {
            user = new Teacher(id, name);
        } else if(role.equals("学生")){
            user = new Student(id, name);
        }else{
            throw new Exception("错误角色");
        }
       return user;
    }
    public abstract void menu(); //变成抽象类留给子类去实现  用抽象方法，所以上面的类也要变成抽象类


    public abstract boolean input();
}
