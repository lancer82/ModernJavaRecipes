package enums;

/**
 * 调用valueOf() 方法获取枚举的一个成员，再调用 compareTo() 方法进行比较，并输出结果。具体实现代码如下
 * @author lp_jo
 *
 */

public class SexEnumTest {

    public enum Sex {
        // 定义一个枚举
        male,female;
    }
    public static void main(String[] args) {
        compare(Sex.valueOf("female"));    // 比较
    }
    public static void compare(Sex s) {
        for(int i = 0;i < Sex.values().length;i++) {
            System.out.println(s + "与" + Sex.values()[i] + "的比较结果是：" + s.compareTo(Sex.values()[i]));
        }
    }

}
