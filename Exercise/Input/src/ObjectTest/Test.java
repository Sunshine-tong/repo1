package ObjectTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Objects;

/**
 * Author:动力节点1912车万通
 * 2019-08-14
 */
public class Test {
    public static void main(String[] args) {

    }

    public static void write(){
        ObjectOutputStream oos = null;
        try {
            //指定对象需要保存的文件的绝对路径
            //注意：使用对象流时不能使用文件的追加，每个文件只能存放一个对象
            //扩展名可以任意，反正里面存的是二进制数据我们看不懂
            FileOutputStream fos = new FileOutputStream("D:/aa.txt");
            //根据文件输出流对象创建一个对象输出流
            oos = new ObjectOutputStream(fos);
            User user = new User();
            user.setName("张三");
            user.setAge(20);
            //如果需要使用对象流输出一个对象那么这个对象需要是序列化对象
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(oos != null){
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
