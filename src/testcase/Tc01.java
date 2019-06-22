package testcase;
import org.testng.annotations.Test;
import base.Configuration;
import locators.ExpediaSearch;
import locvalue.Value;

public class Tc01 extends Configuration {
	ExpediaSearch loc=new ExpediaSearch();
	Value val= new Value();
	@Test
	public void signup(){
		applicationLog.info("Expedia sign up starts");
		typeByid(loc.Idlocator);
		clickByid(loc.AccIdlocator);
		 typeByfirstname (loc.FirstNamelocator, val.firstNameValue);	
		 typeBylastname(loc.LastNamelocator, val.lastNameValue);
		 typeByemail (loc.emaillocator, val.emailValue);
		 typeByPassword(loc.Passwordlocator, val.passwordValue);
		 //typeBysubmit(loc.exSubmit);
		 /*typeByflight(loc.flightlocator);
		 typeByflightType(loc.flightTypelocator);
		 typeByoriginAirport(loc.originAirportlocator, val.originAirportValue);*/
		 applicationLog.info("sign up successfully");
	}

}


