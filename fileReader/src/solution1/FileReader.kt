package solution1

import EmptyFileException

open class FileReader(var file: String) : Reader {

    var index: Int = -1

    override fun read(): String {
        if ("" == file)
            throw EmptyFileException("Archivo vacio, no se puede realizar ninguna operación.")
        index++

        if (index >= file.length) return "-1"

        return file[index].toString()
    }

    override fun close() {
        file = ""
        index = -1
    }
}