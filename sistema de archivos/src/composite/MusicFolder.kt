package composite

import FolderType

class MusicFolder(name: String, weight: Int) : Folder(name, weight) {
    override fun getType(): FolderType {
        return FolderType.MUSIC
    }

    override fun clone(): FileManager {
        var copyFolder: Folder = MusicFolder(this.name, weight)
        var copyFileManageList: MutableList<FileManager> = ArrayList()

        this.fileManagerList.forEach {
            copyFileManageList.add(it)
        }

        copyFolder.fileManagerList = copyFileManageList

        return  copyFolder
    }
}