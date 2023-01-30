// write your function here
fun isGreater(num1: Int, num2: Int, num3: Int, num4: Int): Boolean {
    if (num1 + num2 > num3 + num4) {
        return true
    }
    return false
}

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}