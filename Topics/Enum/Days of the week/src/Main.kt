enum class DaysOfTheWeek(val day: String) {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");
}

fun main() {
    for (day in DaysOfTheWeek.values()) {
        println(day)
    }
}