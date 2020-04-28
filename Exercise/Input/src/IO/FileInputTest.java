package IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Author:动力节点1912车万通
 * 2019-08-14
 */
public class FileInputTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/ABC.txt");
            byte[] bytes = new byte[1024];
            int len = 0;
            if((len = fis.read(bytes)) > 0){
                System.out.println(new String(bytes));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
