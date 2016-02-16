package com.company.pingpong1;

import java.util.regex.Pattern;


public class RomanConverter {

	public static int Convert(String s) {
		s = s.toUpperCase();
		
		
		if (s == null || s.length() == 0)
		{
			throw new RuntimeException("Invalid roman number");
		}
		
		Pattern pattern = Pattern.compile("([a-z\\d])\\1\\1\\1", Pattern.CASE_INSENSITIVE);
		if (pattern.matcher(s).find())
		{
			throw new RuntimeException("Invalid roman number");
		}
		
		
		s = s.replaceAll("IV", "IIII");
		s = s.replaceAll("IX", "VIIII");
		s = s.replaceAll("XL", "XXXX");
		s = s.replaceAll("XC", "LXXXX");
		s = s.replaceAll("CD", "CCCC");
		s = s.replaceAll("CM", "DCCCC");
		
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				sum +=1;
			
			}else if (s.charAt(i) == 'V') {
				sum += 5;
			
			} else if (s.charAt(i) == 'X') {
				sum += 10;
			
			} else if (s.charAt(i) == 'L') {
				sum += 50;
			}else if (s.charAt(i) == 'C') {
				sum += 100;
			}else if (s.charAt(i) == 'D') {
				sum += 500;
			}else if (s.charAt(i) == 'M') {
				sum += 1000;
			} else {
				throw new RuntimeException("Invalid number");
			}

		}
		return sum;
	}

}
