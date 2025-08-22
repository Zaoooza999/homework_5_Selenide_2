import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PageLoadTest {

    @BeforeAll
    static void setupEnvironment() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void PageLoadtest()
    {
        open("https://github.com/");
        $("[role=banner]").$(byText("Solutions")).hover();
        $("[href='https://github.com/enterprise']").click();
        $$("h1").findBy(id("hero-section-brand-heading")).shouldHave(text("The AI-powered developer platform"));
    }




}
