package lab2;

/**
 * A simple Watch. A Watch keeps track of a long value in seconds.
 *  Users can change the time value of the Watch through other methods.   
 * A Watch provides a method to get and set the time value of the Watch.
 * 
 * 
 *
 */

public class Watch {
	/* To be able to complete this Class, you need to read  the API of this class
	 * 
	 * Hint: Use the WatchTest class to help you test you work  
	 * 
	 * */
	
	public Watch(long i) {
		// TODO Auto-generated constructor stub
		this.startTime = i;
	}

	public Watch() {
		// TODO Auto-generated constructor stub
	}

	private long startTime =0;

	public int getTimeinMinutes() {
		// TODO Auto-generated method stub
		return (int) (this.startTime/60);
	}

	public long getStartTime() {
		// TODO Auto-generated method stub
		return this.startTime;
	}

	public void setStartTime(long i) {
		// TODO Auto-generated method stub
		this.startTime = i;
	}

	public void incrbyHours(long i) {
		// TODO Auto-generated method stub
		this.startTime = i *3600;
	}

	public void decrbyHours(long i) {
		// TODO Auto-generated method stub
		this.startTime = this.startTime - i*3600;
	}

	public void incrbyMinutes(long i) {
		// TODO Auto-generated method stub
		this.startTime = this.startTime + i*60;
	}

	public void decrbyMinutes(long i) {
		// TODO Auto-generated method stub
		this.startTime = this.startTime - i*60;
	}

	public int getTimeinHours() {
		// TODO Auto-generated method stub
		return (int) (this.startTime/3600);
	}
	
	public String toString() {
		int hour = (int) this.startTime/3600;
		startTime = (this.startTime - hour *3600);
		int minute = (int) startTime/60;
		startTime = (startTime - minute *60);
		return "Watch Time is "+ hour +" Hours, "+ minute +" Minutes, and "+startTime+" Seconds.";
	}
	
}
