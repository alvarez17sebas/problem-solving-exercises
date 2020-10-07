package normal

import FolderType

abstract class Folder(var nameFolder: String = "undefined", var folderType: FolderType) {
    open var files: MutableList<File> = ArrayList()
    open var folders: MutableList<Folder> = ArrayList()

    fun addFolder(folder: Folder) {
        folders.add(folder)
    }

    fun addFile(file: File) {
        files.add(file)
    }

    fun deleteFile(file: File) {
        files.remove(file)
    }

    fun searchFolder(filter: String): Folder? {
        var folder: Folder? = null
        folders.forEach { folderItem: Folder ->
            if (filter == folderItem.nameFolder) folder = folderItem
        }
        return folder
    }

    fun searchFile(nameFile: String): File? {
        var file: File? = null
        files.forEach { fileItem: File ->
            if (nameFile == fileItem.name) file = fileItem
        }
        return file
    }

    fun viewContent() {
        folders.forEach { folder: Folder ->
            println(folder)
        }
        files.forEach {
            println(it)
        }
    }

    override fun toString(): String {
        return "normal.Folder: $nameFolder"
    }

    abstract fun copyFolder(): Folder
}
