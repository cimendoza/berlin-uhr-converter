package com.ubs.opsit.interviews.berlin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BerlinTimeRow2Test extends BerlinTimeBaseTest {
	
	@Test
	public void shouldGenerateRow2_whenTimeIsMidnight0() {
		int time = timeConverter.getTime(MIDNIGHT_0).getHour();
		String row = timeConverter.getRow2().buildRow(
				time % timeConverter.getRow1().getLightValue());
		assertEquals("OOOO", row);
	}
	
	@Test
	public void shouldGenerateRow2_whenTimeIsMidnight24() {
		int time = timeConverter.getTime(MIDNIGHT_24).getHour();
		String row = timeConverter.getRow2().buildRow(
				time % timeConverter.getRow1().getLightValue());
		assertEquals("RRRR", row);
	}
	
	@Test
	public void shouldGenerateRow2_whenTimeIsMiddleOfAfternoon() {
		int time = timeConverter.getTime(MIDDLE_OF_AFTERNOON).getHour();
		String row = timeConverter.getRow2().buildRow(
				time % timeConverter.getRow1().getLightValue());
		assertEquals("RRRO", row);
	}
	
	@Test
	public void shouldGenerateRow2_whenTimeIsJustBeforeMidnight() {
		int time = timeConverter.getTime(JUST_BEFORE_MIDNIGHT).getHour();
		String row = timeConverter.getRow2().buildRow(
				time % timeConverter.getRow1().getLightValue());
		assertEquals("RRRO", row);
	}

}
