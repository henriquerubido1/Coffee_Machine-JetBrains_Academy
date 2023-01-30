fun main() {
    val num1: Int = readln().toInt()
    val num2: Int = readln().toInt()
    val num3: Int = readln().toInt()
    val num4: Int = readln().toInt()
    val num5: Int = readln().toInt()

    if (num5 in num1..num2 && num5 in num3..num4) {
        println("true")
    } else {
        println("false")
    }
}