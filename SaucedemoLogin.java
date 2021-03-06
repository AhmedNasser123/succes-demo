package io.testproject.generated.tests.saucedemo;

import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * This class was automatically generated by TestProject
 * Project: saucedemo
 * Test: saucedemo login
 * Generated by: Ahmed Nasser (qc.ahmednasser@gmail.com)
 * Generated on Thu May 12 23:47:12 GMT 2022.
 */
@DisplayName("saucedemo login")
public class SaucedemoLogin implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("VIrLZYKRSXpUVO_RxmwQo2dSWNIDfqgwaOW782YrrVs", new ChromeOptions(), "Ahmed Nasser");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("saucedemo login")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Navigate to '{{ApplicationURL}}'
    //    Navigates the specified URL (Auto-generated)
    GeneratedUtils.sleep(500);
    driver.navigate().to(ApplicationURL);

    // 2. Click 'user-name'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#user-name");
    driver.findElement(by).click();

    // 3. Type 'standard_user' in 'user-name'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#user-name");
    driver.findElement(by).sendKeys("standard_user");

    // 4. Click 'password'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#password");
    driver.findElement(by).click();

    // 5. Type 'secret_sauce' in 'password'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#password");
    driver.findElement(by).sendKeys("secret_sauce");

    // 6. Click 'login-button'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#login-button");
    driver.findElement(by).click();

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of("https://saucedemo.com"));
  }
}
