package Practisesession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session
{
    public WebDriver driver;
    //public Session session ;
    public void sessionone()
    {
        int r,sum=0,temp;
        int n = 460;
        temp = n;
        while(n>0)
        {
            r=n%10;
            sum = (sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
            System.out.println("Hello World");
        }
    }

    public void doom()
    {
        System.out.println("HELLOONE");
    }

    public Session()
    {
        sessionone();
    }

    public static void main(String args[])
    {
        Session t = new Session();
        //Example e = new Example();
        //t.sessionone();
        //e.sort();
        t.doom();
        //t.sessionone();
        Example.sort();


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sourav.k.das\\Desktop\\" +
                "DOCM_Automation\\AutomationDecemberUpdate\\Practise\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

    }
}
