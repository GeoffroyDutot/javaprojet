package fr.imie.bank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

	public static final DateTimeFormatter fr = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static LocalDate toDate(String date) {
		LocalDate birth = LocalDate.parse(date, fr);
		return birth;
	}

	public static String toString(LocalDate date) {
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy"); //(ex: 21 fevrier 2019)
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //(ex: 21/02/2019)
		String formattedString = date.format(formatter);
		return formattedString;
	}

}