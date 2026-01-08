package Expedia;

import org.testng.annotations.Test;

import ExpediaShared.Shared;

public class ExpediaTestruner extends Shared{
  @Test
  public void f() {
	  
	  HomePage expedia=new HomePage(driver);
	  expedia.Flights();
	  expedia.LeavingFromInput();
	  expedia.Goingto();
	  expedia.DepartingDate();
	  expedia.ReturningDate();

	
  }
}
