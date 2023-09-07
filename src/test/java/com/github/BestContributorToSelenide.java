package com.github;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide extends TestBase {

    @Test
    void andreySolntsevShouldBeTheFirstContributor() {
        // открыть страницу
        open("https://github.com/selenide/selenide");
        // подвести мышку к первому аватару из блока Contributors
        $("div.Layout-sidebar").$(byText("Contributors")) //.closest искать вверх
                .closest(".BorderGrid-cell").$$("ul li").first().hover(); //  hover() эмулирует наведение мышкой на элемент (без клика).
        // .closest("h2").sibling(0).$$("li").first().hover(); // .sibling искать брата

        // проверка: во всплывающем окне есть текст Andrei Solntsev
        // в devtools F8 - заморозка экрана
        // $("div.Popover").shouldHave(text("Andrei Solntsev")); отличный код
        $$(".Popover").findBy(visible)
                .shouldHave(text("Andrei Solntsev")); // находим .Popover который видимый

        screenshot("Artem_Test");



    }
}
