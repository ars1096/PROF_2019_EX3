package es.upm.grise.profundizacion2019.ex3;

public class MyClass {
	
	Time timer;
	public MyClass(Time time) {
		this.timer = time;
	}
	public void nextTime(long seconds) {
		String next = timer.getFutureTime(seconds);
		System.out.println(next);
	}

}