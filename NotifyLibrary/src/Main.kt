fun main(args: Array<String>) {
    val handlerNotify: HandlerNotify = HandlerNotify("El lunes la entrada es a las 9:00 A.M")

    val emails: MutableList<String> = ArrayList()
    emails.add("rodrigo@gmail.com")
    emails.add("alvarez17.sebastian@gmail.com")
    emails.add("contactenoos@gmail.com")

    val cellPhoneNumbers: MutableList<String> = ArrayList()
    cellPhoneNumbers.add("3148800556")
    cellPhoneNumbers.add("3116691431")

    val email: Notify = Email(emails)
    val sms: Notify = Sms(cellPhoneNumbers)

    handlerNotify.addApplicationsToNotify(email)
    handlerNotify.addApplicationsToNotify(sms)

    handlerNotify.executeNotify()
}