fun main() {

    var day: Int? = 9;

    when(day) {
        1 -> println("Monday");
        2 -> println("Tuesday");
        3 -> println("Wednesday");
        4 -> println("Thursday");
        5 -> println("Friday");
        6 -> println("Saturday");
        7 -> println("Sunday");
        null -> println("Invalid day: null");
        else -> println("Invalid day");
    }

    day = 3;

    var printValue = when(day) {
        1 -> "Monday";
        2 -> "Tuesday";
        3 -> "Wednesday";
        4 -> "Thursday";
        5 -> "Friday";
        6 -> "Saturday";
        7 -> "Sunday";
        null -> "Invalid day: null";
        else -> "Invalid day";
    }

    println(printValue);
}