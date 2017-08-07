package com.ubs.opsit.interviews.berlin;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import com.ubs.opsit.interviews.enums.ColorEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BerlinElement implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 334118214705897177L;
	
	protected ColorEnum color;
	protected int totalLights;
	protected int lightValue;
	
	
	protected String buildRow(int time) {
		int numLightsOn = getNumLightsOn(time);
		String row = StringUtils.EMPTY;
		for(int pos = 1; pos <= numLightsOn; pos++) {
			row += getColor(pos).getValue();
		}
		return fillRow(row, totalLights);
	}
	
	protected int getNumLightsOn(int time) {
		return (time / lightValue);
	}
	
	protected ColorEnum getColor(int position) {
		return color;
	}
	
	protected String fillRow(String row, int totalLights) {
		int lightsOff = totalLights - row.length();
		for (int i = 0; i < lightsOff; i++) {
			row += ColorEnum.OFF.getValue();
		}
		return row;
	}
	
}
