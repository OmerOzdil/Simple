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
		
		WebElement text = driver.findElement(By.xpath("//*[@adem = 'Yildiz']")); 
		
		String actualText = text.getText(); // "2005"
		
		WebElement nextText = driver.findElement(By.xpath("//*[@adem = 'Yildiz1']"));
		
		String actualNextText = text.getText(); // "2006"
		
		nextText should be one more then text...
		
		int actualTextInt = Integer.parseInt(actualText); // 2005
		
		int actualnextTextInt = Integer.parseInt(actualNextText); // 2006
		
		// "2005"=="2005"
	
		if(actualTextInt == actualnextTextInt-1) {
			System.out.println("Passed");
			
		}else {
			System.out.println("Failed");
			
		}
		
		System.out.println("This is the last Job I did");
		
		
	
		
		
		
		

	}

}
