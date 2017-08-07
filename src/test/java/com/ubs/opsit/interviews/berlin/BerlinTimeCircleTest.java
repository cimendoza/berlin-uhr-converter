package com.ubs.opsit.interviews.berlin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BerlinTimeCircleTest extends BerlinTimeBaseTest {
	
	@Test
	public void shouldGenerateCircleOn_whenTimeIsMidnight0() {
		int time = timeConverter.getTime(MIDNIGHT_0).getSecond();
		BerlinElement circle = timeConverter.getCircle();
		String row = circle.buildRow(time);
		assertEquals("Y", row);
	}
	
	@Test
	public void shouldGenerateCircleOff_whenTimeIsJustBeforeMidnight() {
		int time = timeConverter.getTime(JUST_BEFORE_MIDNIGHT).getSecond();
		BerlinElement circle = timeConverter.getCircle();
		String row = circle.buildRow(time);
		assertEquals("O", row);
	}

}
