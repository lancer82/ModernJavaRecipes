package enums;

import java.util.*;

/**
 * This program demonstrates enumerated types.
 * @version 1.0
 * @author lp_jo
 *
 */

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a size:(SMALL,MEDIUM.LARCE,eXTRA_LARCE)");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class,input);
		System.out.println("size= "+ size);
		System.out.println("abbreviation ="+size.getAbbreviation());
		if(size == Size.EXTRA_LARCE)
			System.out.println("Good job--you paid attention to the _.");
	}

}
