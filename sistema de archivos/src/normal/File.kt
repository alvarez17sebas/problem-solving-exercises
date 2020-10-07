package normal

class File(
    var name: String= "undefined",
    var content: String = ""
) {
    fun copyFile(): File {
        return File(name, content)
    }

    override fun toString(): String {
        return "normal.File: $name"
    }
}