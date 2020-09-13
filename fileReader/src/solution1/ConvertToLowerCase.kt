package solution1

class ConvertToLowerCase(file: String) : FileReader(file) {

    override fun read(): String {
        var letter: String = super.read()
        if (letter.toUpperCase() == letter) {
            letter = letter.toLowerCase()
        }
        return letter
    }
}