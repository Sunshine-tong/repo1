package ObjectTest;

import java.io.Serializable;

/**
 * Serializable可序列化接口，这个接口中没有任何的方法和属性它仅仅起到了一个标记的作用，用于通知JVM这个类可以被序列化
 *
 * 如果一个类需要使用IO流进行读写，或在网络间进行传输，那么这个类就必须要实现可序列化接口
 *
 * Author:动力节点1912车万通
 * 2019-08-14
 */
public class User implements Serializable {
    /*
        serialVersionUID表示可序列化id，每次对类进行编辑的时候都会自动生成一个可序列化ID值（随机）
        作用：当使用对象流的时候，当磁盘中序列化的对象与本地应用程序中的对象结构不一样的时候，JVM就会通过这个可序列化ID来判断是否是同一个类，如果ID相同那么就是同一个类开始进行类型的转换。
        只有两个类的路径及类名完全一致的时候JVM才会根据可序列化ID进行判断
        推荐如果一个类实现了可序列化接口建议添加一个可序列化ID即使这个值只是1
        例如：
            private static final long serialVersionUID = 1L;
     */
    private static final long serialVersionUID = -644651616516152166L;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
