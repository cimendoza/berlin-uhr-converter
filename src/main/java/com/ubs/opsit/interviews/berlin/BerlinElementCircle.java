package com.ubs.opsit.interviews.berlin;

import org.apache.commons.lang.StringUtils;

import com.ubs.opsit.interviews.enums.ColorEnum;

public class BerlinElementCircle extends BerlinElement {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5844664960334105507L;

	private final int PAIR_OFFSET = 2;

	public BerlinElementCircle(ColorEnum color, int totalLights, int lightValue) {
		this.color = color;
		this.totalLights = totalLights;
		this.lightValue = lightValue;
	}
	
	@Override
	protected String buildRow(int time) {
		String row = StringUtils.EMPTY;
		boolean isPair = ( (time + PAIR_OFFSET) % this.getLightValue() ) == 0;
		row += isPair ? this.color.getValue() : ColorEnum.OFF.getValue();
		return row;
	}

}
