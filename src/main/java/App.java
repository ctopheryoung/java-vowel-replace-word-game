import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
      staticFileLocation("/public");
      String layout = "templates/layout.vtl";

      get("/", (request, response) -> {
        HashMap<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/home.vtl");
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

      get("/results", (request, response) -> {
        HashMap<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/results.vtl");

        String word = request.queryParams("word");
        String convertedWord = vowelReplace(word);
        model.put("convertedWord", convertedWord);

        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

    }

    public static String vowelReplace(String word) {

      return word.replace("a", "-")
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
