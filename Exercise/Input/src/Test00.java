import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:动力节点1912车万通
 * 2019-10-18
 */
public class Test00 {
    public static void main(String[] args) {
        String add = "bjpowernode";
        char c = add.charAt(6);
        System.out.println(c);

        int i = "bjpowernode".compareTo(add);
        System.out.println(i);  //0

        int bjpowerndoe = "bjpowernode".compareToIgnoreCase("BJPOWERNDOE");
        System.out.println(bjpowerndoe); //0

        String abc = "abc";
        String ab = abc.concat("bjpowernode");
        System.out.println(ab);  //abcbjpowernode

        String a = "bjpowernode";
        boolean node = a.contains("node");
        System.out.println(node);  //true

        String b = "bjpowernode";
        boolean equals = "bjpowernode".equals(b);
        System.out.println(equals);  //true

        byte[] bytes = b.getBytes();
        System.out.println(bytes);

        String d = "bjpowernode";
        int i1 = d.indexOf('b');
        System.out.println(i1); //0

        boolean empty = d.isEmpty();
        System.out.println(empty); //false

        int no = d.lastIndexOf("no");
        System.out.println(no);

        boolean bjpowernode1 = d.matches("bjpowernode");
        System.out.println(bjpowernode1); //true

        String s = b.replaceAll("node", "BJPOWERNODE");
        System.out.println(s);

        String[] split = b.split(",");
        for (String s1 : split) {
            System.out.println(s1);
        }

        String substring = b.substring(2, 5);
        System.out.println(substring);

        char[] chars = b.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }

        String s1 = b.toUpperCase();
        System.out.println(s1);

        String s2 = s1.toLowerCase();
        System.out.println(s2);

        int abb = 9;
        Integer integer = Integer.valueOf(abb);
        System.out.println(integer);

        String bj = "1912";
        Integer integer1 = Integer.valueOf(bj, 10);
        System.out.println(integer1);

        System.out.println("=============================================");

        //StringBuffer可多次拼接字符串并不产生新的字符串
        StringBuffer sb = new StringBuffer("www.");
        StringBuffer bjpowernode = sb.append("bjpowernode");
        StringBuffer append = bjpowernode.append(".com");
        System.out.println(append);

        StringBuffer sb2 = new StringBuffer("www.bjpowernode.com");
        StringBuffer reverse = sb2.reverse();
        System.out.println(reverse);

        StringBuffer sb3 = new StringBuffer("bjpowernode");
        int capacity = sb3.capacity();
        System.out.println(capacity);

        System.out.println(new Date());

        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);

        System.out.printf("%tF%n", date);

        System.out.printf("%1$s %2$tB %2$td, %2$tY",
                "Due date:", date);


    }
}


class test46{
    public static void main(String[] args) {

        /*Integer i = 10;
        Integer j = 10;
        System.out.println(i==j);*/

        System.out.println(func(4));



        String s3 = new String("cc");
        String s4= new String("cc");
        System.out.println(s3==s4);
    }

    public static int func(int n){
        if(n <= 1){
            return 1;
        }else{
            return n*func(n-1);
        }
    }

}
