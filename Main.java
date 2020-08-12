import java.util.*;
import java.util.concurrent.TimeUnit;
import java.time.*;
public class Main
{
	static String[] words={"Elephant","Aaron","Exercise","Sunlight","Country","Roads","John","Denver","Camel","Apple"};
	public static void main(String args[])throws InterruptedException
	{
    Scanner sc=new Scanner(System.in);
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		
		Random rand=new Random();
		for (int i=0;i<5;i++)
		{
		System.out.print(words[rand.nextInt(9)]+" ");
		
		}
		System.out.println();
		double start= LocalTime.now().toNanoOfDay();
    String type=sc.nextLine();

    double end=LocalTime.now().toNanoOfDay();

    double elapsedtime=end-start;
    double seconds=elapsedtime/1000000000.0;
    int numchar=type.length();
    int wpm=(int)((((double)numchar/5)/seconds)*60);
    System.out.println("Your Words per minute is: "+wpm+"!");		
	}

}
