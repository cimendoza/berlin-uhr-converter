	package com.ubs.opsit.interviews.berlin;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.enums.ColorEnum;
import com.ubs.opsit.interviews.exception.TimeException;

import lombok.Data;

@Data
public class BerlinTimeConverter implements TimeConverter {
	
	private static Logger logger = LoggerFactory.getLogger(BerlinTimeConverter.class);
	
	private BerlinElement circle;
	private BerlinElement row1;
	private BerlinElement row2;
	private BerlinElement row3;
	private BerlinElement row4;
	private Pattern pattern;
	
	private final String TIME_PATTERN = "^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9]$";
	private final String TIME_SEPARATOR = ":";
	private final String LINE_SEPARATOR = System.lineSeparator();
	
	
	public BerlinTimeConverter() {
		circle = new BerlinElementCircle(ColorEnum.YELLOW, 1, 2);
		row1 = new BerlinElement(ColorEnum.RED, 4, 5);
		row2 = new BerlinElement(ColorEnum.RED, 4, 1);
		row3 = new BerlinElementRow3(ColorEnum.YELLOW, 11, 5);
		row4 = new BerlinElement(ColorEnum.YELLOW, 4, 1);
		pattern = Pattern.compile(TIME_PATTERN);
	}
	
	
	@Override
	public String convertTime(String aTime) {
		logger.info(String.format("starting time conversion of: %s", aTime));
		Time time = getTime(aTime);
		logger.info(String.format("Time obtained from %s to %s", aTime, time));
		String berlinTime = generateBerlinRows(time);
		logger.info(String.format("BerlinTime obtained from %s to %s", aTime, berlinTime));
		return berlinTime;
	}
	
	protected Time getTime(String aTime) {
		if(aTime == null || !pattern.matcher(aTime).matches()) {
			throw new TimeException(String.format(
					"The time provided does not match with the excpected pattern: %s", aTime));
		}
		int hour = Integer.parseInt(StringUtils.substringBefore(aTime, TIME_SEPARATOR));
		int minute = Integer.parseInt(StringUtils.substringBetween(aTime, TIME_SEPARATOR));
		int second = Integer.parseInt(StringUtils.substringAfterLast(aTime, TIME_SEPARATOR));
		if( hour == 24 && (minute > 0 || second > 0) ) {
			throw new TimeException(String.format(
					"The time provided is invalid: %s", aTime));
		}
		return new Time(hour, minute, second);
	}
	
	protected String generateBerlinRows(Time time) {
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		
		StringBuilder sbTime = new StringBuilder();
		sbTime.append(circle.buildRow(sec))
			.append(LINE_SEPARATOR)
			.append(row1.buildRow(hour))
			.append(LINE_SEPARATOR)
			.append(row2.buildRow(hour % row1.getLightValue()))
			.append(LINE_SEPARATOR)
			.append(row3.buildRow(min))
			.append(LINE_SEPARATOR)
			.append(row4.buildRow(min % row3.getLightValue()));
		return sbTime.toString();
	}


}
