package initials.practice.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());// Epoc time from 1st Jan 1970
		System.out.println(date.getDay());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		System.out.println(sdf.format(date));

	}

}
