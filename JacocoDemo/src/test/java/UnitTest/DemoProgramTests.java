package UnitTest;

import org.testng.annotations.Test;

import JavaStringApp.DemoProgram;

public class DemoProgramTests {

	@Test
	public void PositiveTest(){
		DemoProgram obj1 = new DemoProgram();
		obj1.containsOrNot("Selenium Automation tool");
	}
	
	@Test
	public void NegativeTest(){
		DemoProgram obj1 = new DemoProgram();
		obj1.containsOrNot("Selenium tool");
	}
}
