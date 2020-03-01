package enums;

public class WeekDayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(WeekDay day : WeekDay.values()) {
			System.out.println(day + " ===> "+ day.getDay());
		}
		WeekDay.printDay(5);
	}

}
