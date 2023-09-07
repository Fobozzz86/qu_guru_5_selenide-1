package com.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SoftAssertions extends TestBase {
    @Test
    void  shouldFindSelenideRepositorySoftAssertions() {
        /*
        2. Разработайте следующий автотест:
            - Откройте страницу Selenide в Github
            - Перейдите в раздел Wiki проекта
            - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
            - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
         */
        open("https://github.com/selenide/selenide/wiki");
        $(".markdown-body").shouldHave(text("Soft assertions"));
        $(byText("Soft assertions")).click(); // byText ищет элемент по тексту
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));



    }
}
