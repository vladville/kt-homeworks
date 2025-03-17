fun main() {
    val likes = 1;
    var declension = "людям";
    var number = likes % 100;

    if (number < 11 || number > 19) {
        number %= 10;

        if (number == 1) {
            declension = "человеку";
        }

        if (number >= 2 && number <= 4) {
            declension = "людям";
        }
    }

    println("Понравилось $likes $declension");
}