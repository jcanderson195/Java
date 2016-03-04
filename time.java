
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

}
