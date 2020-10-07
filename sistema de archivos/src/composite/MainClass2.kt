package composite

fun main(){
    var rootMusicFolder: FileManager = MusicFolder("root", 0)
    var teBoteSong: FileManager = File("Te bote.mp3", 10)
    var helloSong: FileManager = File("Hello.mp3", 20)

    rootMusicFolder.add(teBoteSong)
    rootMusicFolder.add(helloSong)

    var favoriteSongsFolder: FileManager = MusicFolder("Favorite Songs", 0)
    var unaLocuraSong: FileManager = File("una locura.mp3", 15)

    favoriteSongsFolder.add(unaLocuraSong)
    rootMusicFolder.add(favoriteSongsFolder)

    rootMusicFolder.showChildren()

    println("Peso total del root: ${rootMusicFolder.calculateTotalPrice()}")

    //var copyRootFolder: FileManager = rootFolder.clone()

    //copyRootFolder.delete(teBoteSong)

    //copyRootFolder.showChildren()

    //rootFolder.showChildren()

    var fileFound: FileManager? = rootMusicFolder.search("Te bote.mp3")

}