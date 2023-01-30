// write your code here
fun isRightEquation(num1: Int, num2: Int, num3: Int) : Boolean {
    if (num1 * num2 == num3) {
        return true
    }
    return false
}
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(isRightEquation(a, b, c))
}