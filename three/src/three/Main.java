package three;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

	System.out.println("\n������� ��������� ����� ");
		Time.enterTime();        
		Time.timeShow();
		int time1 = Time.getSumSec();

		System.out.println("\n"+"������� ������ �����: ");
		Time.enterTime();
		Time.timeShow();
		int time2 = Time.getSumSec();        
	        
		System.out.println("\n" + "������� � �������� = " +Time.getDifferenceTwoTime(time1, time2));
		
		//System.out.println("\n" + "���������� ����� = " +Time.getHourTime(Time.getDifferenceTwoTime(time1, time2)));
  
	}
}

