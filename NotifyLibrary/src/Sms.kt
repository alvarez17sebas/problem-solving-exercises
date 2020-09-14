class Sms(private val cellPhoneNumbers: List<String>) : Notify {

    override fun notify(message: String) {
        cellPhoneNumbers.forEach{ number ->
            println("Sms to: $number message -> $message")
        }
    }
}