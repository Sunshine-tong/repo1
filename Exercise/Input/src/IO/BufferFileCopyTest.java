package IO;

import java.io.*;

/**
 * Author:动力节点1912车万通
 * 2019-08-14
 */
public class BufferFileCopyTest {
    public static void main(String[] args) {
        BufferCopy("D:/ABC.txt", "D:/dd.txt");
    }

    public static void BufferCopy(String source,String target){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(target);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bis.read(bytes)) > 0){
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
