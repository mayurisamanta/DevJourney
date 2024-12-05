
fun getGreeting(): String {
    return "Hello, Kotlin!"
}

fun sayHello(): Unit { // we can remove the return type and colon
    println(getGreeting())
}

fun sayHello(value: String) { // function overloading
    println("Hello, $value!")
}

fun welcome() = "Welcome to Kotlin!" // single expression function

fun main() {
//    println(getGreeting())
//    sayHello()
//    println(welcome())
    sayHello("World");
}