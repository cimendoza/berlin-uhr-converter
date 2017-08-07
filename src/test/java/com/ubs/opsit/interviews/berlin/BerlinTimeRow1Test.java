package com.ubs.opsit.interviews.berlin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BerlinTimeRow1Test extends BerlinTimeBaseTest {
	
	@Test
	public void shouldGenerateRow1_whenTimeIsMidnight0() {
		int time = timeConverter.getTime(MIDNIGHT_0).getHour();
		String row = timeConverter.getRow1().buildRow(time);
		assertEquals("OOOO", row);
	}
	
	@Test
	public void shouldGenerateRow1_whenTimeIsMidnight24() {
		int time = timeConverter.getTime(MIDNIGHT_24).getHour();
		String row = timeConverter.getRow1().buildRow(time);
		assertEquals("RRRR", row);
	}
	
	@Test
	public void shouldGenerateRow1_whenTimeIsMiddleOfAfternoon() {
		int time = timeConverter.getTime(MIDDLE_OF_AFTERNOON).getHour();
		String row = timeConverter.getRow1().buildRow(time);
		assertEquals("RROO", row);
	}

}
