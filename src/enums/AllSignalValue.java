package enums;
/**
 * ͨ������ö������ʵ���� values( ) �������Խ�ö�ٵ����г�Ա��������ʽ���أ�Ҳ����ͨ���÷�����ȡö�����͵ĳ�Ա
 * @author lp_jo
 *
 */
public class AllSignalValue {

	public static void main(String[] args) {
		for(int i = 0; i < Signal.values().length; i++) {
			System.out.println("ö�ٳ�Ա�� "+Signal.values()[i]);
		}
	}
}
