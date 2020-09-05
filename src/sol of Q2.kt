interface  verfiyInformation{

    fun personalInfo()
    fun acadmicInfo()
    fun CVInfo()

}

interface result:verfiyInformation{

    fun whenVerfiedResult()
    fun whenUnverfiedResult()
}
class Employee :result{
    override fun whenUnverfiedResult()
    {
        TODO("Not yet implemented")
    }

    override fun whenVerfiedResult() {
        TODO("Not yet implemented")
    }

    override fun CVInfo() {
        TODO("Not yet implemented")
    }

    override fun acadmicInfo() {
        TODO("Not yet implemented")
    }

    override fun personalInfo() {
        TODO("Not yet implemented")
    }


}