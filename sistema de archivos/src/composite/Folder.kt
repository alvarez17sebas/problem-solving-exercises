package composite

import FolderType

abstract class Folder(name: String, price: Int) : FileManager(name, price) {

    var fileManagerList: MutableList<FileManager> = ArrayList()

    override fun add(element: FileManager) {
        fileManagerList.add(element)
    }

    override fun delete(element: FileManager) {
        fileManagerList.remove(element)
    }

    override fun search(filter: String): FileManager? {
        var fileManager: FileManager? = null
        fileManagerList.forEach {
            if (filter == it.name) fileManager = it
        }
        return fileManager
    }

    override fun calculateTotalPrice(): Int {
        var totalWeight: Int = 0

        fileManagerList.forEach {
            totalWeight += it.weight
            if(it.hasChildren() > 0){
                totalWeight += it.calculateTotalPrice()
            }
        }

        return totalWeight
    }

    override fun showChildren() {
        println("Root normal.Folder name: [${this.name}]")
        fileManagerList.forEach {
            println(it)
            if (it.hasChildren() > 0){
                it.showChildren()
            }
        }
    }

    override fun hasChildren(): Int {
        return fileManagerList.size
    }

    abstract fun getType(): FolderType

    override fun toString(): String {
        return "normal.Folder: $name"
    }
}