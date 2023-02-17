import Newspapers.*

class OnlineNewspapers( var readers : Int, var circulation : Int, name: String, number: Int, date: Int) : Newspaper(name,number,date) {

        public fun OnlineInfo() {

            println("$name 86% людей в России пользуются онлайн-газетами ")
        }
        public fun DateOnline(){
                println("$name -  в России ежедневная интернет-газета, запустилась именно в марте 1999 года")
        }
        override fun GetInfo(){
                println("Название газеты: $name")
                println("Год выпуска: $date")
                println("Номер газеты: $number")

        }


}