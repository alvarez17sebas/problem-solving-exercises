package solution1

import solution1.FileReader

class ConvertToScript(file: String) : FileReader(file) {

    override fun read(): String {
        var letra: String = super.read()
        if (letra == " ") {
            letra = "_"
        }
        return letra
    }
}