package com.Sample;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestDate {

	public static void main(String[] args) {
		String date = LocalDateTime.now().toString();
		//String date="19092024005737";
		LocalDateTime dateTime;

		if (date != null && !date.isEmpty()&& !date.equals(LocalDateTime.now().toString()) ) {
			DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			dateTime = LocalDateTime.parse(date, inputFormat);
		} else {
			dateTime = LocalDateTime.now();
		}
   
		// Get day and suffix
		int day = dateTime.getDayOfMonth();
		String suffix = getDaySuffix(day);

		// Format output
		DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("MMM, yyyy | HH:mm");
		String formatted = String.format("%d%s %s", day, suffix, dateTime.format(outputFormat));

		System.out.println(formatted); // Example: 19th Sep, 2024 | 00:57
	}

	private static String getDaySuffix(int day) {
		if (day >= 11 && day <= 13)
			return "th";
		switch (day % 10) {
		case 1:
			return "st";
		case 2:
			return "nd";
		case 3:
			return "rd";
		default:
			return "th";
		}
	}

}
