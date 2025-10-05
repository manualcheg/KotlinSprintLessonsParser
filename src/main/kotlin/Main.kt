import org.jsoup.Jsoup
import org.jsoup.select.Elements

private const val SITE =
    "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

fun main() {
    val doc = Jsoup.connect(SITE).get()
    val elements: Elements = doc.select("article")
    for (element in elements) {
        println(element.text())
    }
}