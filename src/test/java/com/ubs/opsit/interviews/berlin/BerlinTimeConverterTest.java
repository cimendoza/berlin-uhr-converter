package com.ubs.opsit.interviews.berlin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BerlinTimeConverterTest extends BerlinTimeBaseTest {
	
	@Test
	public void shouldGenerateTime_whenTimeIsMidnight0() {
		String time = timeConverter.convertTime(MIDNIGHT_0);
		assertEquals("Y\n" + 
				"OOOO\n" + 
				"OOOO\n" + 
				"OOOOOOOOOOO\n" + 
				"OOOO", time);
	}
	
	@Test
	public void shouldGenerateTime_whenTimeIsMiddleAfternoon() {
		String time = timeConverter.convertTime(MIDDLE_OF_AFTERNOON);
		assertEquals("O\n" + 
				"RROO\n" + 
				"RRRO\n" + 
				"YYROOOOOOOO\n" + 
				"YYOO", time);
	}
	
	@Test
	public void shouldGenerateTime_whenTimeIsJustBeforeMidnight() {
		String time = timeConverter.convertTime(JUST_BEFORE_MIDNIGHT);
		assertEquals("O\n" + 
				"RRRR\n" + 
				"RRRO\n" + 
				"YYRYYRYYRYY\n" + 
				"YYYY", time);
	}
	
	@Test
	public void shouldGenerateTime_whenTimeIsMidnight24() {
		String time = timeConverter.convertTime(MIDNIGHT_24);
		assertEquals("Y\n" + 
				"RRRR\n" + 
				"RRRR\n" + 
				"OOOOOOOOOOO\n" + 
				"OOOO", time);
	}
	

}

