package javaLectures4_Switch_Case;

public class SwitchCase {

	public static void main(String[] args) {
		
		// Days 1-7
		
		//  Switch is faster than if else conditin...
		int day = 5;
	
	switch (day) {
	
	case 1:
		System.out.println("MON");
		break;
	case 2:
		System.out.println("TUE");
		break;
	case 3:
		System.out.println("WED");
		break;	
	case 4:
		System.out.println("THU");
		break;
	case 5:
		System.out.println("FRI");
		break;
	case 6:
		System.out.println("SAT");
		break;
	case 7:
		System.out.println("SUN");
		break;
		
	default:
		System.out.println("No day is matched!!!");

		}
	}
	
}