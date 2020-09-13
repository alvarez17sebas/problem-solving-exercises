package solution2

import EmptyFileException

abstract class Reader2(var file: String) {
    var index: Int = -1

    fun read(): String{
        if ("" == file)
            throw EmptyFileException("Archivo vacio, no se puede realizar ninguna operación.")
        index++

        if (index >= file.length) return "-1"

        return filter()
    }

    fun close(){
        file = ""
        index = -1
    }

    abstract fun filter(): String
}