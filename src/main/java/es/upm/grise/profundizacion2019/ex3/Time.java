package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	private LocalDateTime timer;
	
	public Time(LocalDateTime timer) {
		this.timer = timer;
	}
	
	public String getFutureTime(long seconds) {
		return DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(timer.plusSeconds(seconds));	
	}

}