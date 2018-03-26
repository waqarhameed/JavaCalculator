package javacalculator;

import java.util.Date;
import java.text.*;

public class DateTime {

	public static void main(String[] args) {
		Date date = new Date();

		// display time and date using toString()
		System.out.println(date.toString());

		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat(
				"E yyyy.MM.dd 'at' hh:mm:ss a zzzzz");

		System.out.println("Current Date: " + ft.format(dNow));

		

	}

}
