package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author:动力节点1912车万通
 * 2019-08-14
 */
public class FileOutputTest {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:/aa.txt");
            String s = "呵呵呵\n哈哈哈\n嘿嘿嘿";
            fos.write(s.getBytes(), 0, s.getBytes().length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
