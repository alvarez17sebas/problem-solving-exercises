class Email(private val emails: List<String>) : Notify {

    override fun notify(message: String) {
        emails.forEach{ email ->
            println("Email to: $email message -> $message")
        }
    }
}