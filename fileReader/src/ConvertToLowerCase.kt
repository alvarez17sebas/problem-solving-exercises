class ConvertToLowerCase(file: String) : ReaderArchivo(file) {

    override fun read(): String {
        var letter: String = super.read()
        if (letter.toUpperCase() == letter) {
            letter = letter.toLowerCase()
        }
        return letter
    }
}