package solution2

class ConvertToLowerCase2(file: String) : Reader2(file) {

    override fun filter(): String {
        var letter: String = super.file[index].toString()
        if (letter.toUpperCase() == letter) {
            letter = letter.toLowerCase()
        }
        return letter
    }
}