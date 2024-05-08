fun main() {
    println("Hello, World!")
    vidu02()
    vidu03()
    vidu04("Hello", "Hallo", "Salut", "Hola", "你好")

    var a: String = "initial vi du 5"  // 1
    println(a)
    val b: Int = 1             // 2
    val c = 3                  // 3

    val d: Int  // 1

    if (someCondition()) {
        d = 1   // 2
    } else {
        d = 2   // 2
    }

    println(d) // 3

    val str1: String? = "Hello"
    val str2: String? = null

    println(vidu07(str1)) // Output: String of length 5
    println(vidu07(str2)) // Output: Empty or null string

    // Creating an instance of MutableStack with elements of type Int
    val stack = vidu08(1, 2, 3, 4, 5)
    println("Stack: $stack")

    // Pushing more elements onto the stack
    stack.push(6)
    println("Stack after push: $stack")

    // Popping an element from the stack
    val poppedElement = stack.pop()
    println("Popped element: $poppedElement")
    println("Stack after pop: $stack")

    // Peeking at the top element of the stack
    val topElement = stack.peek()
    println("Top element: $topElement")
}

// Definition of the MutableStack class
class vidu08<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

// Definition of other functions and classes used in the code
fun vidu07(maybeString: String?): String {
    return maybeString?.let {
        if (it.isNotEmpty()) {
            "String of length ${it.length}"
        } else {
            "Empty or null string"
        }
    } ?: "Empty or null string"
}

fun someCondition(): Boolean {
    // Implement your condition here
    return true // or false based on your logic
}

fun printMessage(message: String) {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun vidu02() {
    printMessage("Hello Ví Dụ 02")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}

fun vidu03() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }
}

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println(prefix + m)
}

fun vidu04(vararg entries: String) {
    printAll(*entries)
}
