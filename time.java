
public class time {
	boolean run = true;
	public void twoSeconds(){
		try {
			Thread.sleep(2000);
		} catch(InterruptedException ex){
			Thread.currentThread().interrupt();
			run = false;
		}
	}
	
	public void fiveSeconds() {
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ex){
			Thread.currentThread().interrupt();
			run = false;
		}
	}

	public void tenSeconds() {
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ex){
			Thread.currentThread().interrupt();
			run = false;
		}
	}
}
