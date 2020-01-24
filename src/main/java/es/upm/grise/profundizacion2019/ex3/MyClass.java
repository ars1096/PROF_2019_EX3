package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MyClass {
	
	public void nextTime(LocalDateTime timer, long seconds) {
		String next = Time.getFutureTime(timer,seconds);
		System.out.println(next);
	}

}
