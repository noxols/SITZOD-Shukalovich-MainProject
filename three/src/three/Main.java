package three;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

	System.out.println("\nВВЕДИТЕ НАЧАЛЬНОЕ ВРЕМЯ ");
		Time.enterTime();        
		Time.timeShow();
		int time1 = Time.getSumSec();

		System.out.println("\n"+"ВВЕДИТЕ ВТОРОЕ ВРЕМЯ: ");
		Time.enterTime();
		Time.timeShow();
		int time2 = Time.getSumSec();        
	        
		System.out.println("\n" + "Разница в секуднах = " +Time.getDifferenceTwoTime(time1, time2));
		
		//System.out.println("\n" + "Количество часов = " +Time.getHourTime(Time.getDifferenceTwoTime(time1, time2)));
  
	}
}

