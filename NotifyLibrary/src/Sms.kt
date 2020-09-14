class Sms : Notify() {

    override fun notify(message: String) {
        println("Sms: $message")
    }

}