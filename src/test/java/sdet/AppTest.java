package sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testLogin1(){
        App app= new App();
        Assert.assertEquals( app.userLogin("abc","abc@123"),1);
    }

    @Test
    public void testLogin2(){
        App app= new App();
        Assert.assertEquals( app.userLogin("abc","abc@123"),1);
    }

}
