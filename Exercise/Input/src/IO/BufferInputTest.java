package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Author:动力节点1912车万通
 * 2019-08-14
 */
public class BufferInputTest {
    public static void main(String[] args) {
        read("D:/ABC.txt");
        read("D:/aa.txt");
    }

    public static void read(String source){
        BufferedInputStream bis = null;
        try {
            FileInputStream fis = new FileInputStream(source);
            bis = new BufferedInputStream(fis);

            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bis.read(bytes)) > 0){
                System.out.println(new String(bytes));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bis != null){
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
