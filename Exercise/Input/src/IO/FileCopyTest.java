package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author:动力节点1912车万通
 * 2019-08-14
 */
public class FileCopyTest {
    public static void main(String[] args) {
        copy("D:/ABC.txt", "D:/bb.txt");
    }

    public static void copy(String source, String target) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(source);
            fos = new FileOutputStream(target);

            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) > 0) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
