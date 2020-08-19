package _07_cow_timer;

public class CowTimerRunner {
	public static void main(String[] args) throws InterruptedException {
		/* Make a CowTimer, set its time and start it.
		 
		 * Use a short delay (seconds) when testing, then try with longer delays */
CowTimer time = new CowTimer();
time.start();
for(int i = 30; i>-1;i--) {
	time.setTime(i);
	Thread.sleep(500);
}
time.endTimer();
	}

}
