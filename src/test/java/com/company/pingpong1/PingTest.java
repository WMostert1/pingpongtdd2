package com.company.pingpong1;

import static org.junit.Assert.*;

import org.junit.Test;


public class PingTest {

	@Test
	public void testNumber1() {
		assertEquals(1, RomanConverter.Convert("I"));
	}
	
	@Test
	public void testNumber2(){
		assertEquals(2,RomanConverter.Convert("II"));
	}
	
	@Test
	public void testNumber5(){
		assertEquals(5,RomanConverter.Convert("V"));
	}
	
	@Test
	public void testTwoDifferentNumbers(){
		assertEquals(6,RomanConverter.Convert("VI"));
	}
	
	@Test
	public void testTwoDifferentNumbersLowerCase(){
		assertEquals(6,RomanConverter.Convert("vi")); 
	}
	
	@Test
	public void testOneDecrementerInFrontOfValue(){
		assertEquals(4,RomanConverter.Convert("IV")); 
	}
	
	@Test
	public void testTen(){
		assertEquals(10,RomanConverter.Convert("X")); 
	}
	
	@Test
	public void testToDecremnet(){
		assertEquals(9,RomanConverter.Convert("IX")); 
	}
	
	@Test
	public void testToThirteen(){
		assertEquals(13,RomanConverter.Convert("XIII")); 
	}
	
	@Test
	public void testToIncreasetoFifty(){
		assertEquals(50,RomanConverter.Convert("L")); 
	}
	
	@Test
	public void test100(){
		assertEquals(100,RomanConverter.Convert("c")); 
	}
	
	@Test
	public void test500(){
		assertEquals(500,RomanConverter.Convert("D")); 
	}
	
	@Test
	public void test1000(){
		assertEquals(1000,RomanConverter.Convert("M")); 
	}
	
	@Test
	public void test40(){
		assertEquals(40,RomanConverter.Convert("XL")); 
	}
	
	@Test
	public void testNumber90(){
		assertEquals(90,RomanConverter.Convert("XC")); 
	}
	
	@Test
	public void testNumber400(){
		assertEquals(400,RomanConverter.Convert("CD")); 
	}
	
	@Test
	public void testNumber999(){
		assertEquals(999,RomanConverter.Convert("CMXCIX")); 
	}
	
	
}
