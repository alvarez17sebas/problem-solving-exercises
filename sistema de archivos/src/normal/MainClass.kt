package normal

fun main(){
    var musicFolder: Folder = MusicFolder("My music")
    var favoriteMusic: Folder = MusicFolder("Favorites songs")
    var otherSongs: Folder = MusicFolder("Other songs")

    var teBoteMusic: File = File("Te bote", "Regaeton")
    var laTreceMusic: File = File("La 13", "Rap")
    var laEstrategia: File = File("La estrategia", "Pop")
    var aDondeVan: File = File("A donde van", "Pop")
    var hello: File = File("Hello", "Adele Song")

    musicFolder.addFile(hello)

    favoriteMusic.addFile(laTreceMusic)
    favoriteMusic.addFile(laEstrategia)

    otherSongs.addFile(teBoteMusic)
    otherSongs.addFile(aDondeVan)

    musicFolder.addFolder(favoriteMusic)
    musicFolder.addFolder(otherSongs)

    musicFolder.viewContent()

    println("-------Example Search------ ")

    var foundMusic: File? = favoriteMusic.searchFile("La 13")
    if(foundMusic != null){
        println(foundMusic.content)
    }

    println("-------normal.Folder copied------ ")
    var newFile: File = File("Dulce pecado", "Musica popular")
    var copyFolder: Folder = favoriteMusic.copyFolder()
    copyFolder.addFile(newFile)
    copyFolder.viewContent()

    copyFolder.deleteFile(laTreceMusic)

    copyFolder.viewContent()

    println("--------")

    favoriteMusic.viewContent()

    println("---------Search folder---------")

    musicFolder.searchFolder("Other songs")?.viewContent()
}