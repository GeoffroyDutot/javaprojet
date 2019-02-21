package fr.imie.bank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

	public static final DateTimeFormatter fr = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static LocalDate toDate(String ddn) {
		LocalDate birth = LocalDate.parse(ddn, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return birth;
	}

	public static String toString(LocalDate ddn) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
		String formattedString = ddn.format(formatter);
		return formattedString;
	}

}
