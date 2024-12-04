// global variables
val globalVariable: String = "I am a global variable";

var globalMutableVariable: String = "I am a global mutable variable";

fun main() {

    // var is used to declare a mutable variable
    var name: String = "Mayuri";

    name = "Mayuri Samanta";

    println(name);

    // val is used to declare an immutable variable
    val age: Int = 24;

    println(age)

    println(globalVariable);
    println(globalMutableVariable);

    // nullable variable
    var nullValue: String? = null;

    println(nullValue);

    nullValue = "not null";

    if (nullValue != null) {
        println(nullValue);
    }

    nullValue = null;

    var printValue = if (nullValue != null) nullValue else "nullValue is null";

    println(printValue);
}