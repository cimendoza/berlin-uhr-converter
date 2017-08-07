package com.ubs.opsit.interviews.berlin;

public class BerlinTimeBaseTest {
	
	protected BerlinTimeConverter timeConverter = new BerlinTimeConverter();
	
	protected final String MIDNIGHT_0 = "00:00:00";
	protected final String MIDNIGHT_24 = "24:00:00";
	protected final String MIDDLE_OF_AFTERNOON = "13:17:01";
	protected final String JUST_BEFORE_MIDNIGHT = "23:59:59";
	
	protected final String INVALID_HOUR_IN_TIME = "25:30:15";
	protected final String INVALID_HOUR_IN_TIME2 = "24:00:01";
	protected final String INVALID_MIN_IN_TIME = "18:60:15";
	protected final String INVALID_SEC_IN_TIME = "12:09:60";
	protected final String INVALID_HOUR_LENGTH_IN_TIME = "1:20:30";
	protected final String INVALID_TIME = "18:6A:15";
	protected final String TIME_NULL = null;

}
