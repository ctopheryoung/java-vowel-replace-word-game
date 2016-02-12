import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";
    }

    public static String vowelReplace(String userWord) {

      String aReplaced = userWord.replace("a", "-");
      String eReplaced = aReplaced.replace("e", "-");
      String iReplaced = eReplaced.replace("i", "-");
      String oReplaced = iReplaced.replace("o", "-");
      String uReplaced = oReplaced.replace("u", "-");

      return uReplaced;

    }
}
