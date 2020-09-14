fun main(args: Array<String>){
    val handlerNotify: HandlerNotify = HandlerNotify("El lunes la entrada es a las 9:00 A.M")

    val email: Notify = Email()
    val sms: Notify = Sms()
    
    handlerNotify.addApplicationsToNotify(email)
    handlerNotify.addApplicationsToNotify(sms)

    handlerNotify.executeNotify()
}