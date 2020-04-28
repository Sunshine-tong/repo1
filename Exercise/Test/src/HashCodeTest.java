import java.util.HashSet;

/**
 * ClassName:HashCodeTest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2020-04-22 16:46
 * @author:车万通
 */
public class HashCodeTest {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        Student student1 = new Student("张三",18);
        Student student2 = new Student("张三",20);
        Student student3 = new Student("李四",19);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);
    }
}
