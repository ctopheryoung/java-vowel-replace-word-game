import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

  @Test
  public void vowelReplace_oneLetterVowelOutputsOneDash_dash() {
    App testApp = new App();
    assertEquals("-", testApp.vowelReplace("a")
  }

}
