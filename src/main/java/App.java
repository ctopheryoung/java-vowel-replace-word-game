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

      return userWord.replace("a", "-")
                     .replace("A", "-")
                     .replace("e", "-")
                     .replace("E", "-")
                     .replace("i", "-")
                     .replace("I", "-")
                     .replace("o", "-")
                     .replace("O", "-")
                     .replace("u", "-")
                     .replace("U", "-");
    }
}
