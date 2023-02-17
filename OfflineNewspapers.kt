import Newspapers.*

class OfflineNewspapers( var readers : Int, var circulation : Int, name: String, number: Int, date: Int) : Newspaper(name,number,date) {

    public fun OfflineInfo(){
        println("$name -  годом рождения европейской газетной периодики считается 1605 год")

    }
    public fun Readers(){
        var read = 4800000 //в среднем в месяц 4,8 млн читателей оффлайн газет
        println("Введите количество месяцев чтобы расчитать среднее кол-во читателей ")
        var mes = readLine()!!.toInt()
        var readmes = mes*read
        println("Среднее количество читателей за $mes месяцев -  $readmes млн")

    }
    override fun GetInfo(){
        println("Название газеты: $name")
        println("Год выпуска: $date")
        println("Номер газеты: $number")

    }
}