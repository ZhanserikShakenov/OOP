import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		Scanner myjob = new Scanner(System.in);
		String good;
		while(true) {
			System.out.println("Enter your number: ");
			good = myjob.nextLine();
			if(good.equals("Q")) break;
			Data myData = new Data();
			myData.setData(Double.parseDouble(good));
		}
		System.out.println("Average = " + Data.getAverage());
		System.out.println("Max = " + Data.getMaximum());
	}

}
