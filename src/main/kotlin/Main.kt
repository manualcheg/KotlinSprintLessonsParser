import org.jsoup.Jsoup
import org.jsoup.select.Elements

private const val SITE =
    "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

fun main() {

    val doc = Jsoup.connect(SITE).get()
    val something: Elements = doc.select(".sc-2aegk7-2.bzpNIu")
    for (i in something) {
        println(i.text())
    }
}