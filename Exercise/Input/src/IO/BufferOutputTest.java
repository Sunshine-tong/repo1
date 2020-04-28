package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author:动力节点1912车万通
 * 2019-08-14
 */
public class BufferOutputTest {
    public static void main(String[] args) {
        out("李元茂是个佩奇！！！！","D:/cc.txt");
    }

    public static void out(String ss,String target){
        BufferedOutputStream bos = null;
        try {
            FileOutputStream fos = new FileOutputStream(target);
            bos = new BufferedOutputStream(fos);

            String s = ss;
            bos.write(s.getBytes(), 0, s.getBytes().length);
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bos != null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
