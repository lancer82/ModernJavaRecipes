package enums;

/**
 * ����valueOf() ������ȡö�ٵ�һ����Ա���ٵ��� compareTo() �������бȽϣ���������������ʵ�ִ�������
 * @author lp_jo
 *
 */

public class SexEnumTest {

    public enum Sex {
        // ����һ��ö��
        male,female;
    }
    public static void main(String[] args) {
        compare(Sex.valueOf("female"));    // �Ƚ�
    }
    public static void compare(Sex s) {
        for(int i = 0;i < Sex.values().length;i++) {
            System.out.println(s + "��" + Sex.values()[i] + "�ıȽϽ���ǣ�" + s.compareTo(Sex.values()[i]));
        }
    }

}
