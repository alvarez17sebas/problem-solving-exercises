package composite

class File(name: String, weight: Int) : FileManager(name, weight) {

    override fun add(element: FileManager) {
        //Not implemented
    }

    override fun delete(element: FileManager) {
        //Not implemented
    }

    override fun search(filter: String): FileManager? {
        //Not implemented
        return null!!
    }

    override fun calculateTotalPrice(): Int {
        return weight
    }

    override fun showChildren() {
        println("Files hasn't children")
    }

    override fun hasChildren(): Int {
        return 0
    }

    override fun clone(): FileManager {
        return File(this.name, weight)
    }

    override fun toString(): String {
        return "normal.File: $name price: $weight"
    }
}