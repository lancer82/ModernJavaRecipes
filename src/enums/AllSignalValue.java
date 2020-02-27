package enums;
/**
 * 通过调用枚举类型实例的 values( ) 方法可以将枚举的所有成员以数组形式返回，也可以通过该方法获取枚举类型的成员
 * @author lp_jo
 *
 */
public class AllSignalValue {

	public static void main(String[] args) {
		for(int i = 0; i < Signal.values().length; i++) {
			System.out.println("枚举成员： "+Signal.values()[i]);
		}
	}
}
