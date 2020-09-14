class HandlerNotify(var message: String) {

    private var applications: MutableList<Notify> = ArrayList()

    fun addApplicationsToNotify(notify: Notify) {
        applications.add(notify)
    }

    fun executeNotify() {
        applications.forEach { application: Notify ->
            application.notify(message)
        }
    }
}