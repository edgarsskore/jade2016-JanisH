package m01;

import java.util.Timer;
import java.util.TimerTask;

public class TimerSingleton {
	
	private static TimerSingleton instance = new TimerSingleton();
	private int counter = 0;
	private TimerSingleton (){
		TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                counter++;
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 1, 1000);
	}
	
	public static TimerSingleton getInstance(){
		return instance;
	}
	public int outTimerTime(){
		  
			return counter;
	    }
	}


