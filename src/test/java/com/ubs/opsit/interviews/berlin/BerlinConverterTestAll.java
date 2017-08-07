package com.ubs.opsit.interviews.berlin;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BerlinTimeFormatTest.class, BerlinTimeCircleTest.class, BerlinTimeRow1Test.class,
	BerlinTimeRow2Test.class, BerlinTimeRow3Test.class, BerlinTimeRow4Test.class, BerlinTimeConverterTest.class})
public class BerlinConverterTestAll {

}
