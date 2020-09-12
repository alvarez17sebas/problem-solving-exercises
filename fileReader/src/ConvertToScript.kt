class ConvertToScript(file: String) : ReaderArchivo(file) {

    override fun read(): String {
        var letra: String = super.read()
        if (letra == " ") {
            letra = "_"
        }
        return letra
    }
}