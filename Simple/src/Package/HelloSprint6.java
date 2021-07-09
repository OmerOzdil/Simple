package Package;

public class HelloSprint6 {

	public static void main(String[] args) {
		System.out.println("This branch comes from Sprint 6 work");
		System.out.println("Extra work has been added");
		System.out.println("This line has been added from Remote");
		
		
		String year="2,005 ";
		
		// can u parse this year to int?
		
		int yearInInt= Integer.parseInt(year.replace(",", "").trim());
		
		System.out.println(yearInInt);
		System.out.println(yearInInt+1);
		
		System.out.println(year+1);
		
		
		if(year.equals("2,005 ")) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAILED");
			
		}
		

	}

}
