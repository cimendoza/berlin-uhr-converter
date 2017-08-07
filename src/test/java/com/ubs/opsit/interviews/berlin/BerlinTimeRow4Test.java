package com.ubs.opsit.interviews.berlin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BerlinTimeRow4Test extends BerlinTimeBaseTest {
	
	@Test
	public void shouldGenerateRow4_whenTimeIsMidnight0() {
		int time = timeConverter.getTime(MIDNIGHT_0).getMinute();
		String row = timeConverter.getRow4().buildRow(
				time % timeConverter.getRow3().getLightValue());
		assertEquals("OOOO", row);
	}
	
	@Test
	public void shouldGenerateRow4_whenTimeIsMidnight24() {
		int time = timeConverter.getTime(MIDNIGHT_24).getMinute();
		String row = timeConverter.getRow4().buildRow(
				time % timeConverter.getRow3().getLightValue());
		assertEquals("OOOO", row);
	}
	
	@Test
	public void shouldGenerateRow4_whenTimeIsMiddleOfAfternoon() {
		int time = timeConverter.getTime(MIDDLE_OF_AFTERNOON).getMinute();
		String row = timeConverter.getRow4().buildRow(
				time % timeConverter.getRow3().getLightValue());
		assertEquals("YYOO", row);
	}
	
	@Test
	public void shouldGenerateRow4_whenTimeIsJustBeforeMidnight() {
		int time = timeConverter.getTime(JUST_BEFORE_MIDNIGHT).getMinute();
		String row = timeConverter.getRow4().buildRow(
				time % timeConverter.getRow3().getLightValue());
		assertEquals("YYYY", row);
	}

}
