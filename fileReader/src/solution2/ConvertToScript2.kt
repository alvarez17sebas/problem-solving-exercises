package solution2

class ConvertToScript2(file: String) : Reader2(file) {

    override fun filter(): String {
        var letra: String = super.file[index].toString()
        if (letra == " ") {
            letra = "_"
        }
        return letra
    }
}