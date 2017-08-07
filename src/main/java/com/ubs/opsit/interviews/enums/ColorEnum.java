package com.ubs.opsit.interviews.enums;

public enum ColorEnum {
	RED     ('R'),
	YELLOW  ('Y'),
	OFF     ('O');
	
	private char value;
	
	private ColorEnum(char value) {
		this.value = value;
	}
	
	public char getValue() {
		return value;
	}
}
