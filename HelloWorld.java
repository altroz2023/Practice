package exercise01;

public class HelloWorld {

	public static void main(String[] args)throws Exception {
		System.out.println("Hello World");
		String DriverPath=System.getProperty("C:/Program Files/Google/Chrome/Application/chrome.exe");
		System.setProperty("webdriver.chrome.driver", DriverPath);
		WebDriver driver = new ChromeDriver();

	}

}
