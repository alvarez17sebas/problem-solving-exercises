package normal

import FolderType

class MusicFolder(nameFolder: String) : Folder(nameFolder, FolderType.MUSIC) {
    override fun copyFolder(): Folder {
        var folder: Folder = MusicFolder(nameFolder)
        var folders: MutableList<Folder> = ArrayList()
        var files: MutableList<File> = ArrayList()
        this.folders.forEach {
            folders.add(it)
        }
        this.files.forEach {
            files.add(it)
        }

        folder.folders = folders
        folder.files = files

        return folder
    }
}