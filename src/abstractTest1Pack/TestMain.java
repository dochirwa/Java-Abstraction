package abstractTest1Pack;
import java.util.Scanner;
public class TestMain
{
	public static void main(String[] args)
	{
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("Enter greeting: ");
		String greenInput = myScan.next();		
		
		System.out.print("\n");
		
		//String greenInput = scanner.next();
		XYZ xyz = new XYZ();
		xyz.FOO();
		//xyz.DAY(greenInput);	
		System.out.println("" + xyz.DAY(greenInput));
		
		myScan.close();
	}
}
