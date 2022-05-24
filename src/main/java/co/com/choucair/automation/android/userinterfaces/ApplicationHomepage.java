package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class ApplicationHomepage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.id("org.wordpress.android:id/continue_with_wpcom_button"));
}
