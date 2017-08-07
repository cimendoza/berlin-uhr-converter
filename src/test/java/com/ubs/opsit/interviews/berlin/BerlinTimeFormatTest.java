package com.ubs.opsit.interviews.berlin;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ubs.opsit.interviews.exception.TimeException;

public class BerlinTimeFormatTest extends BerlinTimeBaseTest {
	
	@Test
	public void shouldgetTime_whenTimeIsMidnight0() {
		assertNotNull(timeConverter.getTime(MIDNIGHT_0));
	}
	
	@Test
	public void shouldgetTime_whenTimeIsMidnight24() {
		assertNotNull(timeConverter.getTime(MIDNIGHT_24));
	}
	
	@Test
	public void shouldgetTime_whenTimeIsMiddleOfAfternoon() {
		assertNotNull(timeConverter.getTime(MIDDLE_OF_AFTERNOON));
	}
	
	@Test
	public void shouldgetTime_whenTimeIsJustBeforeMidnight() {
		assertNotNull(timeConverter.getTime(JUST_BEFORE_MIDNIGHT));
	}

	@Test(expected = TimeException.class)
	public void shouldThrowException_whenInvalidHourInTime() {
		timeConverter.getTime(INVALID_HOUR_IN_TIME);
	}
	
	@Test(expected = TimeException.class)
	public void shouldThrowException_whenInvalidHourInTime2() {
		timeConverter.getTime(INVALID_HOUR_IN_TIME2);
	}
	
	@Test(expected = TimeException.class)
	public void shouldThrowException_whenInvalidMinInTime() {
		timeConverter.getTime(INVALID_MIN_IN_TIME);
	}
	
	@Test(expected = TimeException.class)
	public void shouldThrowException_whenInvalidSecInTime() {
		timeConverter.getTime(INVALID_SEC_IN_TIME);
	}
	
	@Test(expected = TimeException.class)
	public void shouldThrowException_whenInvalidHourLengthInTime() {
		timeConverter.getTime(INVALID_HOUR_LENGTH_IN_TIME);
	}

	@Test(expected = TimeException.class)
	public void shouldThrowException_whenInvalidTime() {
		timeConverter.getTime(INVALID_TIME);
	}
	
	@Test(expected = TimeException.class)
	public void shouldThrowException_whenTimeIsNull() {
		timeConverter.getTime(TIME_NULL);
	}
}
