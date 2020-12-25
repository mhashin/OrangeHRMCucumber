package hooks;

import java.util.Properties;

import com.orangehrm.factory.DriverFactory;
import com.orangehrm.util.ConfigReader;

import io.cucumber.java.Before;

public class AppHooks {
	
	private ConfigReader config;
	private DriverFactory driverFactory;
	Properties prop;
	
	@Before
	public void getProperty() {
		
		config=new ConfigReader();
		prop=config.init_prop();
	}
	
	@Before
	public void launchBrowser() {
		driverFactory=new DriverFactory();
		driverFactory.init_driver(prop.getProperty("browser"));
		
	}

}
