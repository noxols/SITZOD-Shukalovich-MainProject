package three;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {
	static int hh;
	static int mm;
	static int ss;

	static void timeShow() {
		System.out.println("Введенное время: " );
        System.out.print(hh+":"+mm+":"+ss+"\n");
    }

	static int getSumSec(){
		int sum = hh*3600+mm*60+ss;
		System.out.print("\nКоличество секунд:\n"+ sum + "\n");
		return sum;
	}
	
    static void timeSet(int h, int m, int s) {
        hh=h;
        mm=m;
        ss=s;
    }

static void enterTime() throws IOException {
    try {
        System.out.println("Введите часы: ");
        BufferedReader textrd = new BufferedReader(new InputStreamReader(System.in));
        String h = textrd.readLine();
        int hh = Integer.parseInt(h);    

        System.out.println("Введите минуты: ");
        String m = textrd.readLine();
        int mm = Integer.parseInt(m);
        
        System.out.println("Введите секунды: ");
        String s = textrd.readLine();
        int ss = Integer.parseInt(s);
        timeSet(hh,mm,ss);
    }
    catch (NumberFormatException e){
        System.out.println("Введедо неверное время");
        System.exit(0);
    }
}

public Time(int hh, int mm, int ss) {
    Time.hh = hh;
    Time.mm = mm;
    Time.ss =ss;
}

public Time() {
	Time.hh = 0;
    Time.mm = 0;
    Time.ss = 0;
}
/*
static int getDifference() {
    return 86400-(Time.hh*3600+Time.mm*60+Time.ss);
}
*/

static int getDifferenceTwoTime(int time1, int time2) {
	int result =time1-time2;
	
	   if(result<0) 
		  result= result*(-1);
   
	return result;
}

/*
static int getHourTime(int day){
	int resultday= (int) (day*0.000277778);
	return resultday;
}
*/
}
