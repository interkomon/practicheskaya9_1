package Newspapers


open class Newspaper(var name_: String)
{
    var name = name_
    var number = 0
    var date = 2023


    constructor(name_: String, date_: Int, number_: Int) : this(name_) {
        name = name_
        date = date_
        number = number_


    }


    open fun Name(){
        try {
            println("Введите название газеты: ")
            name = readLine()!!.toString().toLowerCase()

            when (name) {
                "комсомольская правда" -> println("Газета на 1 месте по популярности в России")
                "metro" -> println("Газета на 2 месте по популярности в России")
                "москва вечерняя" -> println("Газета на 3 месте по популярности в России")
                "российская газета" -> ("Газета на 4 месте по популярности в России")
                "московский комсомолец" -> println("Газета на 5 месте по популярности в России")
                "мурзилка" -> println("Газета на 6 месте по популярности в России")
                "рбк" -> println("Газета на 2 месте по популярности в России")
                else -> println("Увы..Твоя газета не популярна")
            }
        }
        catch (e: Exception)
        {
            println("Ошибка. Попробуй еще убедись, что в твоем вводе нету ошибок")
        }

    }
        open fun Price(){
            try {
                println("Введите цену за одну газету")
                var chena = readLine()!!.toDouble()
                println("Введите количетсво газет которое вы хотите купить")
                var kolichestvo = readLine()!!.toDouble()
                var pricegazet = kolichestvo * chena
                println("Цена за все газеты выйдет ${pricegazet}")

            }
            catch (e: Exception)
            {
                println("Ошибка. Попробуй еще убедись, что в твоем вводе нету ошибок")
            }
        }

        open fun NumberDate(){
            try {

                var year = 2023
                println("Введите название газеты")
                var name = readLine()!!.toString()
                println("Введите номер газеты ")
                var number = readLine()!!.toInt()
                println("Введите год выпуска")
                var date = readLine()!!.toInt()
                var data = year - date
                when (data) {
                    1 -> println("Газета $name с номером $number была выпущена $data год назад ")
                    2, 3, 4 -> println("Газета $name с номером $number была выпущена $data года назад ")
                    0, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> println("Газета $name с номером $number была выпущена $data лет назад ")
                    else -> println("Увы..Газета где-то затерялось, очень много лет прошло")

                }

            }catch (e: Exception)
            {
                println("Ошибка. Попробуй еще убедись, что в твоем вводе нету ошибок")
            }


        }

    open fun GetInfo() {
        println("Информация о газете\n Название: $name Год выпуска: $date Номер: $number ")
    }

    }





