import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

class PersonagemInfo {
    String personagem;
    String situacao;

    public PersonagemInfo(String personagem, String situacao) {
        this.personagem = personagem;
        this.situacao = situacao;
    }
}

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://rickandmortyapi.com/api/character");

            WebElement body = driver.findElement(By.tagName("pre"));
            String jsonText = body.getText();  // JSON puro

            List<PersonagemInfo> personagens = new ArrayList<>();

            JsonObject jsonObject = JsonParser.parseString(jsonText).getAsJsonObject();
            JsonArray results = jsonObject.getAsJsonArray("results");

            for (int i = 0; i < results.size(); i++) {
                JsonObject personagem = results.get(i).getAsJsonObject();
                String nome = personagem.get("name").getAsString();
                String status = personagem.get("status").getAsString();
                personagens.add(new PersonagemInfo(nome, status));
            }

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(personagens);

            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
