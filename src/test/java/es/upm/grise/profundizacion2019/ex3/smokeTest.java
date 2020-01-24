package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.junit.Before;
import org.junit.Test;

public class smokeTest {
	MyClass my;
	Time test;
	
	@Before
	public void setUp() {
		my = new MyClass();
		test = new Time();
	}

	@Test
	public void smoleTest() {
		long SECONDS = 60;
		LocalDateTime timer = LocalDateTime.now();
		my.nextTime(timer,SECONDS);
	}
	
	@Test
	public void test1() {
		long SECONDS = 120;
		LocalDateTime timer = LocalDateTime.of(2020,Month.JANUARY,01,00,00,00,00);
		String savevalue = Time.getFutureTime(timer,SECONDS);
		assertEquals("2020/01/01 00:02:00",savevalue);
	}
}
