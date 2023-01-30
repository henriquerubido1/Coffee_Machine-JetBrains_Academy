// write your code here
fun getLastDigit(num: Int): String {
    val result = num.toString().split("")
    return result[result.lastIndex - 1]
}
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}