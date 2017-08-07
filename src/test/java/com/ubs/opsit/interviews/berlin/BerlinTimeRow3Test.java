package com.ubs.opsit.interviews.berlin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BerlinTimeRow3Test extends BerlinTimeBaseTest {
	
	@Test
	public void shouldGenerateRow3_whenTimeIsMidnight0() {
		int time = timeConverter.getTime(MIDNIGHT_0).getMinute();
		String row = timeConverter.getRow3().buildRow(time);
		assertEquals("OOOOOOOOOOO", row);
	}
	
	@Test
	public void shouldGenerateRow3_whenTimeIsMidnight24() {
		int time = timeConverter.getTime(MIDNIGHT_24).getMinute();
		String row = timeConverter.getRow3().buildRow(time);
		assertEquals("OOOOOOOOOOO", row);
	}
	
	@Test
	public void shouldGenerateRow3_whenTimeIsMiddleOfAfternoon() {
		int time = timeConverter.getTime(MIDDLE_OF_AFTERNOON).getMinute();
		String row = timeConverter.getRow3().buildRow(time);
		assertEquals("YYROOOOOOOO", row);
	}
	
	@Test
	public void shouldGenerateRow3_whenTimeIsJustBeforeMidnight() {
		int time = timeConverter.getTime(JUST_BEFORE_MIDNIGHT).getMinute();
		String row = timeConverter.getRow3().buildRow(time);
		assertEquals("YYRYYRYYRYY", row);
	}

}
