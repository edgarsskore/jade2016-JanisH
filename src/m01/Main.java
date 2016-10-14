package m01;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		TimerSingleton.getInstance().outTimerTime();
		while(true){
			Scanner in = new Scanner(System.in);
			String s = in.next();
			if(s.equals("asd")){
				System.out.println("Running for: "+ TimerSingleton.getInstance().outTimerTime() + " seconds!");
			}
		}
	}

}
