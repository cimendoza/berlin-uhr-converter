package com.ubs.opsit.interviews.berlin;

import com.ubs.opsit.interviews.enums.ColorEnum;

public class BerlinElementRow3 extends BerlinElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6847280115340783648L;
	
	private final int MINUTE_QUARTER_POS_OFFSET = 3;
	private final ColorEnum COLOR_QUARTER = ColorEnum.RED;
	
	public BerlinElementRow3(ColorEnum color, int totalLights, int lightValue) {
		this.color = color;
		this.totalLights = totalLights;
		this.lightValue = lightValue;
	}
	
	@Override
	protected ColorEnum getColor(int position) {
		int res = position % MINUTE_QUARTER_POS_OFFSET;
		if(res == 0) {
			return COLOR_QUARTER;
		} else {
			return this.color;
		}
	}

}
