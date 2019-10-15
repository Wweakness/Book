import classes.User;
public class Main {
    public static void main(String[] args) throws Exception {
        //输出提示
        //用scanner读用户输入
        //id/name/角色
        //生成用户对象
        User currentUser=User.login();  //创建当前用户=用户登陆
        boolean isQuit;  //定义退出
        do {
                currentUser.menu();  //显示当前用户可操作的菜单
                isQuit=currentUser.input();  //用户输入

            }while(!isQuit);
            System.out.println("欢迎下次光临");
        }

    }

