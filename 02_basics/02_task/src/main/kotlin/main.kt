fun main() {
    val likes = 10000;
    var declension = "";

    if (likes % 10 == 1 && likes % 100 != 11) declension = "человеку"; else declension = "людям";

    println("Понравилось $likes $declension");
}