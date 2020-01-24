package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

public class smokeTest {
	
	@Test
	public void test120() {
		final LocalDateTime localDateTime = LocalDateTime.of(2020,01,01,00,00,00);
		long SECONDS = 120;
		final Time timer = new Time(localDateTime);
		assertEquals("2020/01/01 00:02:00", timer.getFutureTime(SECONDS));
	}
	
}