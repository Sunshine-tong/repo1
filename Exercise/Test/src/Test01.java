import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName:Test01
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2020-04-04 16:10
 * @author:车万通
 */
public class Test01 {

    private boolean sex;

    //boolean类型获取值方法名为isXXX
    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.println(Arrays.toString(arr));

        new Person().setName("张三");

        Random r = new Random();
        int i = r.nextInt();
        System.out.println(i);

        /*System.out.println("输出0-N之间的随机数字");
        System.out.print("请输入N的值：");
        int i1 = new Scanner(System.in).nextInt();
        int i2 = new Random().nextInt(i1 + 1);
        System.out.println(i2);*/

        System.out.println("==========================");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("张三");
        strings.add("lisi");
        strings.add("王五");
        System.out.println(strings);
        System.out.println("ArrayList集合长度：" + strings.size());
        System.out.println(strings.get(1));
        strings.remove(2);
        System.out.println(strings);

        strings.add("王五");
        strings.add("赵六");
        strings.add("陈七");
        for (String string : strings) {
            System.out.print(string + " ,");
        }

        for (int i1 = 0; i1 < strings.size(); i1++) {
            System.out.print(strings.get(i1));
        }

        System.out.println("====================================");
        System.out.println("添加6个1-33之间的随机整数，添加到集合，并遍历集合");

        ArrayList<Integer> integers = new ArrayList<>();
        Random r1 = new Random();
        for (int i1 = 0; i1 < 6; i1++) {
            int nextInt = r1.nextInt(33) + 1;
            integers.add(nextInt);
        }

        for (int i1 = 0; i1 < integers.size(); i1++) {
            System.out.println(integers.get(i1));
        }

        System.out.println("==========equals==============");
        String a = "abc";
        System.out.println("ABC".equalsIgnoreCase(a)); //忽略大小写进行内容比较，结果为true
        System.out.println(a.length()); //返回字符串长度
        System.out.println(a.concat("ABC")); //concat：把原字符串与参数字符串拼接为新的字符串并返回
        System.out.println(a.charAt(1)); //获取指定索引位置的字符
        System.out.println(a.indexOf("c")); //返回参数字符在字符串中第一次出现的索引位置
        System.out.println(a.indexOf("d")); //返回参数字符在字符串中第一次出现的索引位置，不存在则返回-1

        System.out.println("===============字符串截取===================");
        String b = "abcdefghijklmn";
        System.out.println(b.substring(2, 5));
        System.out.println(b.substring(3));
        System.out.println("====================拆分=========================");
        String c = "abcdefghijklmn";
        char[] chars = c.toCharArray();//将字符串拆分为字符数组
        System.out.println(chars.length);
        System.out.println(chars[1]);
        System.out.println(c.replace("a", "A")); //替换
        System.out.println("============转换为字节数组==============");
        byte[] bytes = c.getBytes();
        for (int i1 = 0; i1 < bytes.length; i1++) {
            System.out.println(bytes[i1]);
        }

        System.out.println("========分割=============");
        String d = "aaa,bbb,ccc,ddd";
        String[] split = d.split(",");
        for (int i1 = 0; i1 < split.length; i1++) {
            System.out.println(split[i1]);
        }

        System.out.println("===================================================");
        System.out.println("===================================================");
        System.out.println("===================================================");

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        //会调用线程池中的线程交替执行以下任务
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());

        //关闭线程池
        executorService.shutdown();

        //executorService.submit(new RunnableImpl()); //无法执行，原因：线程池已销毁

        System.out.println("===================");

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "创建了");
        }).start();


        makeCook(() ->{
            System.out.println("lambda表达式简化匿名内部类");
        });



    }

    public static void makeCook(Cook cook){
        cook.makeCook();
    }
}

interface Cook{
    void makeCook();
}

class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class Person {

    String name;

    public void setName(String name) {
        this.name = name;
    }
}
