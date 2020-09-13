package solution2

import EmptyFileException

fun main(args: Array<String>){
    try {
        val fileReader: Reader2 = ConvertToScript2("Hola mundo!")
        var letter =  fileReader.read()
        while (letter != "-1"){
            print(letter)
            letter = fileReader.read()
        }
    }catch (emptyFileException: EmptyFileException){
        println("Result: ${emptyFileException.message}")
    }
}
