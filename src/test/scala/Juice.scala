import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedCondition, WebDriverWait}
import org.scalatest._
import org.scalatest.selenium.Chrome

class JuiceSpec extends FlatSpec with Matchers with Chrome{

  val driver: WebDriver = new ChromeDriver
  driver.get("http://localhost:3000/")
  val myDynamicElement = new WebDriverWait(driver, 10).until(
    new ExpectedCondition[WebElement] {
      override def apply(d: WebDriver) = d.findElement(By.id())
    })

  //スクリーンショットのパスを指定
  setCaptureDir("./capture")
  go to "http://localhost:3000/"

  "title" should "OWASP Juice Shop" in {
    pageTitle should be ("OWASP Juice Shop")
    //スクリーンショットを撮る
    capture to "Assertions Page.png"
  }

  "スコアボード" should "みれる" in {
    click on xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row[1]/button[5]")
    capture to "ScoreBord.png"
    goBack()
  }

  "ログイン" should "できる" in {

    click on xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row[2]/button[1]")

  }
}
