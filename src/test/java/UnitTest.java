import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

  @Test
  public void vowelReplace_oneSOutputsOneDash_dash() {
    App testApp = new App();
    assertEquals("-", testApp.vowelReplace("a"));
  }

  @Test
  public void vowelReplace_oneEOutputsOneDash_dash() {
    App testApp = new App();
    assertEquals("-", testApp.vowelReplace("e"));
  }

  @Test
  public void vowelReplace_oneIOutputsOneDash_dash() {
    App testApp = new App();
    assertEquals("-", testApp.vowelReplace("i"));
  }

  @Test
  public void vowelReplace_oneOOutputsOneDash_dash() {
    App testApp = new App();
    assertEquals("-", testApp.vowelReplace("o"));
  }

  @Test
  public void vowelReplace_oneUOutputsOneDash_dash() {
    App testApp = new App();
    assertEquals("-", testApp.vowelReplace("u"));
  }

  @Test
  public void vowelReplace_multipleLetterWord_dashppldash() {
    App testApp = new App();
    assertEquals("-ppl-", testApp.vowelReplace("apple"));
  }

  @Test
  public void vowelReplace_stringsWithCasesHaveVowelsReplaced_true() {
    App testApp = new App();
    assertEquals("D- -r d- n-t, th-r- -s n- try. -br-h-m L-nc-ln.", testApp.vowelReplace("Do or do not, there is no try. Abraham Lincoln."));
  }

}
