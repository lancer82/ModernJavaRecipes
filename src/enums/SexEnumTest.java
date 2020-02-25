package enums;

public class SexEnumTest {

    public enum Sex {
        // 定义一个枚举
        male,female;
    }
    public static void main(String[] args) {
        compare(Sex.valueOf("male"));    // 比较
    }
    public static void compare(Sex s) {
        for(int i = 0;i < Sex.values().length;i++) {
            System.out.println(s + "与" + Sex.values()[i] + "的比较结果是：" + s.compareTo(Sex.values()[i]));
        }
    }

}
