/*
1. Есть ли разница между $("h1 div"); и $("h1").$("div"); - может ли привести к тому что, поиск найдёт разные элементы?
   Если может - приведите пример, когда.

1. https://github.com/deni89bat/qaGuru-19-4-Selenide-1/blob/master/src/test/java/com/github/DifferentElements.java пример различий.

$("h1 div") - В этом случае будет найден элемент div внутри элементов h1,
которые есть на странице.
Выполняется поиск в один подход, что эффективнее и быстрее.

$("h1").$("div") - А в этом случае, будет найден и выбран первый h1,
 в котором будет искаться div, а его может там и не быть.
 Выполняется поочередный поиск элементов(сначала находится первый h1,
 затем в нем повторяется операция поиска div) - медленнее.

*/