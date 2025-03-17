fun main() {
    val likes = 57;
    var declension = "";
    if ( (likes%10) > 10 && (likes%10) < 20 || likes == 1 ) declension = "человеку" else declension = "людям";
    println("Понравилось $likes $declension");
}