import org.jsoup.Jsoup
import org.jsoup.select.Elements

/*Задача 8* к Уроку 5
Парсер сайта. Видео гайд по парсингу: https://vk.cc/cEQsA0

Задача написать консольную программу, которая подключается к веб-странице и вытаскивает цитаты из
произведения "Автостопом по галактике" Дугласа Адамса. Программа должна выполнить HTTP-запрос,
получить HTML-контент страницы, найти цитаты и вывести их на экран.

Требования к задаче:
- Создай проект в отдельном репозитории, но с рабочей веткой, чтобы можно было отправить Pull Request
на код-ревью;
- Подключись к URL страницы с цитатами:
https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/;
- Используй библиотеку Jsoup для выполнения HTTP-запроса и парсинга HTML;
- Найди на странице тэг, в которых хранятся цитаты;
- Извлеки текст из каждого элемента (только с первой страницы) и выведи его на экран.*/

private const val SITE =
    "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

fun main() {

    val doc = Jsoup.connect(SITE).get()
    val something: Elements = doc.select(".sc-2aegk7-2.bzpNIu")
    for (i in something) {
        println(i.text())
    }
}