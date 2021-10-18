import java.util.*
import kotlin.math.sqrt

fun main() {
    Case16()
}

fun Task_Operator() {


    Info()
    var user_answer = ""
    var run = true

    loop@ while (true) {
        print(
            "\n\nВыберите задачу из списка!\n" +
                    "Вводите Ваш запрос:"
        )
        user_answer = readLine().toString().toLowerCase()
        when (user_answer) {
            "b1" -> Begin1()
            "b4" -> Begin4()
            "b7" -> Begin7()
            "b9" -> Begin9()
            "if5" -> if5()
            "if6" -> if6()
            "if7" -> if7()
            "if8" -> if8()
            else -> print("Такой задачи в списке нет!")
        }
        run = true
        while (run) {
            print("\n\nПродолжить?[y/n]")
            user_answer = readLine().toString().toLowerCase()
            when (user_answer) {
                "y" -> {
                    print("Продолжаем")
                    for (i in 0..2) {
                        Thread.sleep(333)
                        print(".")
                    }
                    run = false
                    continue@loop
                }
                "n" -> {
                    print("До свидания")
                    for (i in 0..2) {
                        Thread.sleep(333)
                        print("!")
                    }
                    run = false
                    break@loop
                }
                else -> print("Тут всего 2 варианта ответа[y/n]")
            }
        }
    }
}

fun Info() {

    var timing = 200
    print("Бобро пожаловать в консольную версию задачника с примерами!\n")
    Thread.sleep(timing.toLong())
    print("y - кнопка отвечающая за ответ \"да\"\n")
    Thread.sleep(timing.toLong())
    print("n - кнопка отвечающая за ответ \"нет\"\n")
    Thread.sleep(timing.toLong())
    print("Код задачи определяется ее первой буквой в названии\n")
    Thread.sleep(timing.toLong())
    print("+ порядковый номер в списке.\n")
    Thread.sleep(timing.toLong())
    print("Например, Begin1 - b1.\n")
    Thread.sleep(timing.toLong())
    print("После ввода ответа нужно нажать клавишу Enter!")
    Thread.sleep(timing.toLong())
}

fun Begin1() {

    println("\n\nBegin1. Дана сторона квадрата a. Найти его периметр P = 4*a")
    print("Введите сторону квадрата a: ")
    var a = readLine()!!.toDouble()
    var P = 4 * a
    print("Периметр квадрата со стороной а = $a: $P")

}

fun Begin4() {

    println(
        "\n\nBegin4. Дан диаметр окружности d. Найти ее длину L = π·d. В качестве\n" +
                "значения π использовать 3.14."
    )
    print("Введите диамерт окружности d: ")
    var d = readLine()!!.toDouble()
    var L = 3.14 * d
    print("диаметр окружности d с длинной L = $d: $L")


}

fun Begin7() {
    println(
        "Найти длину окружности L и площадь круга S заданного радиуса R:\n" +
                "L = 2·π·R, S = π·R^2"
    )
    print("Введите радиус R:")


    val r: Double = Scanner(System.`in`).nextDouble()
    val l = 2 * 3.14 * r
    val s = 3.14 * r * r
    println("L = $l")
    println("S = $s")

}

fun Begin9() {

    println(
        "\n\nBegin9.  Даны два неотрицательных числа a и b. Найти их среднее геометрическое, то есть квадратный корень из их произведения: √\n" +
                "a·b."
    )
    print("Введите a: ")
    print("Введите b: ")
    var a = 3
    var b = 9.0
    var SQRT = sqrt(b)
    println("Корень квадратный из $b = $SQRT")

}

fun if5() {
    print(
        "If5.Даны три целых числа.\n" +
                "Найти количество положительных и количество отрицательных чисел.\n"
    )
    print("Введите первое число: ")
    var num1 = readLine()!!.toInt()
    print("Введите второе число: ")
    var num2 = readLine()!!.toInt()
    print("Введите третье число: ")
    var num3 = readLine()!!.toInt()
    var counter_positive = 0
    if (num1 > 0)
        counter_positive++ //натуральный итератор - инкремент  +1  // counter_positive-- - декремент -1
    if (num2 > 0)
        counter_positive++
    if (num3 > 0)
        counter_positive++
    print("Количество положительных чисел: $counter_positive/3") //    -5 -4 -3 -2 -1 0 +1 +2 +3 +4 +5
}

fun if6() {
}

fun if7() {
}

fun if8() {
}

fun String_Test() {
    println(
        "Условие задачи: Сделать анализатор строки с помощью if, выводящий какая строчка." +
                "Если меньше 10 символов - короткая." +
                "Если от 10 до 20 - средняя" +
                "Если больше 20 - большая" +
                "Ввод сделать с помощью readLine()"
    )
    print("Введите строку: ")
    var string = readLine().toString()

    if (string.length < 10) {
        print("Короткая")
    }
    if (string.length in 10..20) {
        print("Средняя")
    }
    if (string.length > 20) {
        print("Длинная")
    }
}

fun Randomize() {

    var a = (1..40).random()
    print("Нам выпало число: $a\n")
    if(a in 1..10)
    {
        print("Вы пошли на СЕВЕР")
    }
    if(a in 11..20)
    {
        print("Вы пошли на ЮГ")
    }
    if(a in 21..30)
    {
        print("Вы пошли на ВОСТОК")
    }
    if(a in 31..40)
    {
        print("Вы пошли на ЗАПАД")
    }
}

fun Sport_Game(){
    var name = arrayOf(
        "Михаил",
        "Маргарита",
        "Роман",
        "Виктор",
        "Ярослав",
        "Сергей",
        "Кирилл",
        "Никита",
    )

    var quantity = (1..30).random()


    for (i in 1..3)
    {
        quantity = (1..30).random()
        println("${name.random()} делает $quantity раз...")
    }
}


fun Case3()
{
    print("Case3. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.).\n" +
            "Вывести название соответствующего времени года («зима»,«весна», «лето», «осень»).\n")
    print("Введите число - номер месяца[1-12]: ")
    var month = readLine()!!.toInt() //от нас(пользователя) запрашивают ввод строки в консоль и ее обращают в тип данных - целое число(Integer)
    when(month)
    {
        12,in 1..2 -> print("Время года - Зима.")
        in 3..5    -> print("Время года - Весна.")
        in 6..8    -> print("Время года - Лето.")
        in 9..11   -> print("Время года - Осень.")
        else   -> print("Введите значения предусмотренные программой!")
    }
}

fun Case4()
{
    print("Case4. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.).\n" +
            "Определить количество дней в этом месяце для невисокосного года.\n")
    print("Введите число - номер месяца[1-12]: ")
    var month = readLine()!!.toInt() //от нас(пользователя) запрашивают ввод строки в консоль и ее обращают в тип данных - целое число(Integer)
    when(month)
    {
        1,3,5,7,8,10,12 -> print("В этом месяце 31 день")
        4,6,9,11 -> print("В этом месяце 30 дней")
        2 -> print("В этом месяце 28 дней - это февраль невисокосного года.")
        else   -> print("Введите значения предусмотренные программой!")
    }
}

fun Case16()
{
    print("Case16. Дано целое число в диапазоне 20–69, определяющее возраст (в годах).\n" +
            "Вывести строку-описание указанного возраста, обеспечив правильное согласование числа со словом «год», например:\n" +
            "20 — «двадцать лет», 32 — «тридцать два года», 41 — «сорок один год»\n")
print("Введите возраст: ")
    var age_string = ""

    var age = readLine()!!.toInt()
    if(age in 20..69){
        when(age/10)
        {
            2 -> age_string+="Двадцать "
            3 -> age_string+="Тридцать "
            4 -> age_string+="Сорок "
            5 -> age_string+="Пятьдесят "
            6 -> age_string+="Шестьдесят "
        }
        when(age%10)
        {
            1 -> age_string+="один "
            2 -> age_string+="два "
            3 -> age_string+="три "
            4 -> age_string+="четыре "
            5 -> age_string+="пять "
            6 -> age_string+="шесть "
            7 -> age_string+="семь "
            8 -> age_string+="восемь "
            9 -> age_string+="девять "
        }
        when(age%10)
        {
            1 -> age_string+="год"
            in 2..4 -> age_string+="года"
            in 5..9,0 -> age_string+="лет"
        }
    }
    else{
        print("Возраст не попадает в предусмотренный диапазон[20-69]")
    }
    print(age_string)








    }








    /*(age%10==0) -> {
                age /= 10
                when(age)
                {
                    2 -> age_string+= "Двадцать лет"
                    3 -> age_string+= "Тридцать лет"
                    4 -> age_string+= "Сорок лет"
                    5 -> age_string+= "Пятьдесят лет"
                    6 -> age_string+= "Шестьдесят лет"
                }
            }
            (age%10 in 1..4) -> {
                age %= 10
                when(age)
                {
                 1 -> age_string+=" один"
                 2 -> age_string+=" два"
                 3 -> age_string+=" три"
                 4 -> age_string+=" четыре"
                }
                age_string+=" год"
            }



        }*/