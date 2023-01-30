fun main() {
    val num = readln().toInt()

    when(num) {
        2 -> println("Yes!")
        1, 3, 4 -> println("No!")
        else -> println("Unknown number")
    }
}