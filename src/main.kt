fun main() {

    var user_choise = ""


    while (true)
    {
        print("\nВыберите задачу: ")
        user_choise = readLine().toString().toLowerCase()

        when(user_choise)
        {
            "b1" -> Begin1()
            "b2" -> Begin2()
            else -> print("Такой задачи нет!")
        }
        print("\n\nПродолжить?[y/n] ")
        user_choise = readLine().toString().toLowerCase()
        when(user_choise)
        {
            "y" -> print("\nПродолжаем\n")
            "n" -> {
                print("\nДо свидания!\n\n")
                break
            }
        }
    }


}

fun Begin1() {

    print("\nBegin1. Дана сторона квадрата a. Найти его периметр P = 4*a\n")
    print ("Введите сторону квадрата а: ")
    var a = readLine()!!.toDouble()
    var P = 4 * a
    print("Периметр квадрата со стороной а = $a: $P")

}
fun Begin2()
{

}