import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Continue_as_guest {
    public static AndroidDriver driver;


    public static void main(String[] args)throws MalformedURLException,InterruptedException
    {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("udid","9318020e");
        capabilities.setCapability("deviceName","Realme2");
        capabilities.setCapability("appPackage","com.gofrugal.ordereasy719328");
        capabilities.setCapability("appActivity","com.gofrugal.ordereasy719328.MainActivity");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);

        Thread.sleep(15000);

        List<WebElement> elements = driver.findElements(By.className("android.widget.TextView"));

        for(int i=0;i< elements.size();i++)
        {
            if(elements.get(i).getText().equals(" Sign In/Sign Up "))
            {
                elements.get(i).click();
                break;

            }
        }
        Thread.sleep(2000);


        List<WebElement> guest = driver.findElements(By.className("android.widget.TextView"));
        for(int i=0;i< guest.size();i++)
        {
            if(guest.get(i).getText().equals("Continue as a Guest"))
            {
                guest.get(i).click();
                break;
            }
        }


        List<WebElement> ALLOW = driver.findElements(By.className("android.widget.Button"));
        for(int i=0;i< ALLOW.size();i++)
        {
            if(ALLOW.get(i).getText().equals("ALLOW"))
            {
                ALLOW.get(i).click();
                break;
            }
        }
        Thread.sleep(5000);

        List<WebElement> allow = driver.findElements(By.className("android.widget.Button"));
        for(int i=0;i< allow.size();i++)
        {
            if(allow.get(i).getText().equals("ALLOW"))
            {
                allow.get(i).click();
                break;
            }
        }
        Thread.sleep(10000);
        List<WebElement> location = driver.findElements(By.className("android.widget.TextView"));
        for(int i=0;i< location .size();i++)
        {
            if(location .get(i).getText().equals("Use my current location"))
            {
                location .get(i).click();
                break;
            }
        }
        Thread.sleep(10000);

        List<WebElement> search = driver.findElements(By.className("android.widget.EditText"));
        for(int i=0;i< search .size();i++)
        {
            if(search.get(i).getText().equals("Search for an item"))
            {
                search.get(i).click();
                break;
            }
        }
        Thread.sleep(2000);


        List<WebElement> searchin = driver.findElements(By.className("android.widget.EditText"));
        for(int i=0;i< searchin.size();i++)
        {
            if(searchin.get(i).getText().equals("Search for an item"))
            {
                searchin.get(i).click();
                break;
            }
        }
        Thread.sleep(2000);
        List<WebElement> searchTxt= driver.findElements(By.className("android.widget.EditText"));
        for(int i=0;i< searchTxt.size();i++)
        {
            if(searchTxt.get(i).getText().equals("Search for an item"))
            {
                searchTxt.get(i).sendKeys("center fresh");
                break;
            }
        }
        Thread.sleep(2000);
        List<WebElement> uomItem= driver.findElements(By.className("android.widget.TextView"));
        for(int i=0;i< uomItem.size();i++)
        {
            if(uomItem.get(i).getText().equals("PIECE"))
            {
                uomItem.get(i).click();
                break;
            }
        }
        Thread.sleep(2000);
        List<WebElement> uomchangeitem= driver.findElements(By.className("android.widget.TextView"));
        for(int i=0;i< uomchangeitem.size();i++)
        {
            if(uomchangeitem.get(i).getText().equals("BUNDDLE - Rs 100.00"))
            {
                uomchangeitem.get(i).click();
                break;
            }
        }
        Thread.sleep(2000);

        List<WebElement> enterproduct= driver.findElements(By.className("android.widget.TextView"));
        for(int i=0;i<  enterproduct.size();i++)
        {
            if( enterproduct.get(i).getText().equals("CENTER FRESH"))
            {
                enterproduct.get(i).click();
                break;
            }
        }
        Thread.sleep(2000);

        List<WebElement> productenter= driver.findElements(By.className("android.widget.TextView"));
        for(int i=0;i<  productenter.size();i++)
        {
            if(productenter.get(i).getText().equals("CENTER FRESH"))
            {
                productenter.get(i).click();
                break;
            }
        }
        Thread.sleep(2000);

        List<WebElement> cartPage= driver.findElements(By.className("android.widget.TextView"));
        for(int i=0;i<  cartPage.size();i++)
        {
            if(cartPage.get(i).getText().equals(" Buy Now "))
            {
                cartPage.get(i).click();
                break;
            }
        }
        Thread.sleep(2000);
        List<WebElement> addProduct= driver.findElements(By.className("android.widget.TextView"));
        for(int i=0;i< addProduct.size();i++)
        {
            if(addProduct.get(i).getText().equals("1"))
            {
                addProduct.get(i).click();
                break;
            }
        }
        Thread.sleep(2000);
        List<WebElement> quantityEnter= driver.findElements(By.className("android.widget.EditText"));
        for(int i=0;i<  quantityEnter.size();i++)
        {
            if( quantityEnter.get(i).getText().equals("1"))
            {
                quantityEnter.get(i).sendKeys("5");
                break;
            }
        }
        Thread.sleep(2000);

        List<WebElement> quantiyenter= driver.findElements(By.className("android.widget.TextView"));
        for(int i=0;i< quantiyenter.size();i++)
        {
            if(quantiyenter.get(i).getText().equals("APPLY"))
            {
                quantiyenter.get(i).click();
                break;
            }
        }
        Thread.sleep(2000);


        List<WebElement> buyProceed= driver.findElements(By.className("android.widget.TextView"));
        for(int i=0;i<  buyProceed.size();i++)
        {
            if(buyProceed.get(i).getText().equals(" Proceed to Buy "))
            {
                buyProceed.get(i).click();
                break;
            }
        }
        Thread.sleep(2000);






        //   WebElement signIn= driver.findElement(By.xpath("//*[@text='SignIn/SignUp']"));

//			  signIn.click();
        //earchTxt.forEach(search ->search.getText().equals("Search for an item")?search.sendKeys():







        System.out.println("Hello");




    }

}
