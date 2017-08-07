package com.ubs.opsit.interviews.berlin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Time {

	private int hour;
	private int minute;
	private int second;
}
