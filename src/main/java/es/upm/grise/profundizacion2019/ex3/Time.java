package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Time {
	
	public static String getFutureTime(LocalDateTime timer, long seconds) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		
		return formatter.format(methodCaculate(timer,seconds));	
	}
	
	public static LocalDateTime methodCaculate(LocalDateTime timer, long seconds) {
		return timer.plusSeconds(seconds);
	}

}
