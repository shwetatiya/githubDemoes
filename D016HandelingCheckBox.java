public class D016HandelingCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		//driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		WebElement ChkBox = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		
		System.out.println("Before....");
		System.out.println("visible :- "+ ChkBox.isDisplayed());
		System.out.println("Selected :- "+ ChkBox.isSelected());
		System.out.println("Enable :- "+ ChkBox.isEnabled());
		
		
		if (ChkBox.isSelected() == false)
			ChkBox.click();
		
		//or
		
		//if(!ChkBox.isSelected())
			//ChkBox.click();
		
			
		
		System.out.println("Before....");
		System.out.println("visible :- "+ ChkBox.isDisplayed());
		System.out.println("Selected :- "+ ChkBox.isSelected());
		System.out.println("Enable :- "+ ChkBox.isEnabled());
		
		
		
		
		
	}

}
