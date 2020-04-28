/**
 * ClassName:Test02
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2020-04-24 15:18
 * @author:车万通
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 6, 3, 1, 5, 7, 9};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i + " ");
        }


        String s = "张三";
        Class<? extends String> aClass = s.getClass();
        System.out.println(aClass);

    }
}
