import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.*;

public class NewClass extends Thread {
	static WebDriver driver;
public void run() {
		
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hi");
			}
			for(int i=0;i<5;i++) {
				System.out.println("nancy");
			}
	}
	public static void main(String[] args) throws ParseException {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com");
//		driver.findElement(By.id("email")).sendKeys("abcd");
//		driver.findElement(By.id("pass")).sendKeys("12345");
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.location.reload(true)");
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.facebook.com");
//		WebElement ee = driver.findElement(By.cssSelector("input[id*='il'"));
//		String c = ee.getCssValue("border-color");
//		String c1 = ee.getCssValue("border");
//		String c2 = ee.getCssValue("font");
//		String c3= ee.getCssValue("f");
//		js.executeScript("arguments[0].setAttribute('style','background:violet')", ee);
//		js.executeScript("arguments[0].setAttribute('style','border-color:red')", ee);
//		System.out.println(c);
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		ee.sendKeys("abcd");
//		driver.findElement(By.id("pass")).sendKeys("12345");
		
//		System.out.println("ENTER INPUT");
//		Scanner s = new Scanner(System.in);
//		String input = s.next();	
//		List<Character> l = new ArrayList();
//		List<Character> l1 = new ArrayList();
//		int n=0;
//		String[] as = new String[100];
//		for(int i=0;i<input.length();i++) {	
//			l.add(input.charAt(i));
//			l1.add(input.charAt(i));
//		}
//		for(int j=0;j<l.size();j++) {
//			String in = "";
//			String vo = String.valueOf(input.charAt(j));
//			if(vo.equals("*")) {
//				l.set(j,'0');
//				for(int k=0;k<l.size();k++) {
//					in=in+String.valueOf(l.get(k));
//				}
//				char[] c = in.toCharArray();
//			  in=String.valueOf(c).replace("*", "1");
//				 as[n++]=in;
//			}
//		}
//			for(int j1=0;j1<l.size();j1++) {
//				String in = "";
//				String vo1 = String.valueOf(input.charAt(j1));
//				if(vo1.equals("*")) {			
//					l1.set(j1,'1');
//					for(int k1=0;k1<l.size();k1++) {
//						in=in+String.valueOf(l1.get(k1));
//					}
//					char[] c = in.toCharArray();
//				  in=String.valueOf(c).replace("*", "0");
//					as[n++]=in;
//				}
//			}
//		for(String x:as) {
//			if(x==null) {
//				break;
//			}
//			System.out.println(x);			
//		}
//		String s="elangovan+";
//		String re="";
//		String re1="";
//		Map<Character,Integer> m= new LinkedHashMap();
//		for(int i=0;i<s.length();i++) {
//			int v=0;
//			for(int j=0;j<s.length();j++) {
//				if(String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(j)))) {
//					v++;
//			         re = s.replace(s.charAt(i), ' ');
//					
//				}				
//			}
//			if(!String.valueOf(s.charAt(i)).equals(" ")) {
////			System.out.println(s.charAt(i)+" = "+v);
//				m.put(s.charAt(i), v);
//				re1=re1+String.valueOf(s.charAt(i));
//			}
//			s=re;
//		}
//		Set<Entry<Character, Integer>> e = m.entrySet();
//		for(Entry<Character,Integer> x:e) {
//			System.out.println(x);
//		}
//		System.out.println(re1);
		String dd= "29/12/2019";
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		Date da = d.parse(dd);
        Format f= new SimpleDateFormat("EEEE");
	    String s = f.format(da);
		System.out.println(s);
		
//	    f= new SimpleDateFormat("mm");
//		String s1 = f.format(new Date());
//		System.out.println(s1);
//	    f= new SimpleDateFormat("ss");
//		String s2 = f.format(new Date());
//		System.out.println(s2);
//		 f= new SimpleDateFormat("H");
//		String s3 = f.format(new Date());
//		System.out.println(s3);
//		
		
		
		
		
		
		
		
	}
	
}
