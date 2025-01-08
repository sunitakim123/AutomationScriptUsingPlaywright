package Resource;

	import java.io.FileInputStream;
	import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

	import org.testng.annotations.*;
	import com.microsoft.playwright.Browser;
	import com.microsoft.playwright.BrowserContext;
	import com.microsoft.playwright.BrowserType;
	import com.microsoft.playwright.Page;
	import com.microsoft.playwright.Playwright;

	public class BaseTest {
		protected static Browser browser;
	    protected static BrowserContext context;
	    protected static Page page;
	    protected static Properties properties;
	    protected static Playwright playwright;
	   // protected  static Properties config = new Properties();

	    

	    @BeforeSuite
	        public void setUp() throws IOException {
	        // Load properties from config.properties
	        properties = new Properties();
	        FileInputStream fis = new FileInputStream("./src/main/java/Resource/config.properties");
	        properties.load(fis);
	        
	       
	        // Initialize Playwright and browser
	         playwright = Playwright.create();
	        String browserType = properties.getProperty("browser", "chromium"); // default to chromium

	        if (browserType.equalsIgnoreCase("firefox")) {
	            browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
	        } else if (browserType.equalsIgnoreCase("webkit")) {
	            browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
	        } else {
	            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	        }
	        
	        
	        
	        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1424, 1024));

	       // context = browser.newContext();
	        page = context.newPage();
	        int timeout = Integer.parseInt(properties.getProperty("defaultTimeout", "80000")); // default to 30 seconds
	        page.setDefaultTimeout(timeout);

	        page.navigate(properties.getProperty("rootUrl"));

	        
	    }

	   
		
		@AfterSuite
		public void quitPlaywright() {
			if (page != null) {
			playwright.close();
			}
		}
		 public  String takeScreenshot(String testcaseName)
		    {
		    	String path = System.getProperty("user.dir") + "\\reports\\" + testcaseName + ".png";
		    	page.screenshot(new Page.ScreenshotOptions()
		    			.setPath(Paths.get(path))
		    			.setFullPage(true));
		    			return path;
		    			
		    	
		    }
		}

