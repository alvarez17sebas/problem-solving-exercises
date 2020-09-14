class Email : Notify() {

    override fun notify(message: String) {
        println("Email: $message")
    }
}