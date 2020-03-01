package enums;

/**
 * 下面的代码创建了一个枚举类型 WeekDay，而且在该类型中添加了自定义的方法。
 * @author lp_jo
 *
 */

public enum WeekDay {
	Mon("Monday"),Tue("Tuesday"),Wed("Wedbesday"),Thu("Thursday"),Fri("Friday"),Sat("Saturday"),Sun("Sunday");
	private final String day;
	private WeekDay(String day) {
		this.day = day;
	}
	
	public static void printDay(int i) {
		switch(i) {
			case 1:
				System.out.println(WeekDay.Mon);
				break;
			case 2:
				System.out.println(WeekDay.Tue);
				break;
			case 3:
				System.out.println(WeekDay.Wed);
				break;
			case 4:
				System.out.println(WeekDay.Thu);
				break;
			case 5:
				System.out.println(WeekDay.Fri);
				break;
			case 6:
				System.out.println(WeekDay.Sat);
				break;
			case 7:
				System.out.println(WeekDay.Sun);
				break;
			default:
				System.out.println("Wrong Number!");
		}
	}
	
	public String getDay() {
		return day;
	}
}