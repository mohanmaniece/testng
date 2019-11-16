package pomtestcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	@DataProvider
	public Object[][] mydata()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="sixth";
		data[0][1]="second";
		data[1][0]="third";
		data[1][1]="fourth";
		data[2][0]="fifth";
		data[2][1]="sixth";
		return data;
	}
	
@Test(dataProvider ="mydata")
	public void startthecar(String username,String password)
	{
	System.out.println("startthecar");
	System.out.println(username);
	System.out.println(password);
	}

}
