package composite

abstract class FileManager(var name: String, var weight: Int) {

    abstract fun add(element: FileManager)

    abstract fun delete(element: FileManager)

    abstract fun search(filter: String): FileManager?

    abstract fun calculateTotalPrice(): Int

    abstract fun showChildren()

    abstract fun hasChildren(): Int

    abstract fun clone(): FileManager
}