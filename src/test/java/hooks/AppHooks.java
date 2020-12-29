package hooks;

import java.util.Properties;

import com.orangehrm.factory.DriverFactory;
import com.orangehrm.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	private ConfigReader config;
	private DriverFactory driverFactory;
	Properties prop;
	
	@Before(order=0)
	public void getProperty() {
		
		config=new ConfigReader();
		prop=config.init_prop();
	}
	
	@Before(order=1)
	public void launchBrowser() {
		driverFactory=new DriverFactory();
		driverFactory.init_driver(prop.getProperty("browser"));
		
	}
	
	@After(order = 0)
	public void quitBrowser() {
		if(!(DriverFactory.getDriver()==null)) {
		DriverFactory.getDriver().quit();
		}
	}

}
