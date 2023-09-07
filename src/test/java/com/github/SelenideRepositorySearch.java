package com.github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*; // все команды Selenide можно использовать без префикса Selenide.


public class SelenideRepositorySearch extends TestBase {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {

        // Открыть Github.com
        open("https://github.com/");
        // Открыть страницу Selenide в Github
        $("[placeholder='Search or jump to...']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();

        // Перейти в раздел Wiki проекта
        // нашли элемент блока результата поиска и кликнули на первый элемент в поиске
         $$("div.Box-sc-g0xbh4-0.kzrAHr span").first().click();
        // $$("div.Box-sc-g0xbh4-0.kzrAHr").first().$("a").click(); тоже верный локатор

        // Убедиться, что перешли на страницу selenide / selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide")); // "selenide\n/\nselenide"

        sleep(5000); // тоже тайм аут чтобы не сразу закрылся браузер


        // ARRANGE - подготовить (опционально)
        // ACT - действие
        // ASSERT - проверка

        // .classname, #id, []. a[href=abc].red

    }
}
