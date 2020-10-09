import java.util.*
import kotlin.collections.ArrayList
fun main(){
    loop@ while(true) {
        val read = Scanner(System.`in`)
        println("insert exercise ")
        val number = read.nextInt();
        when (number) {
            1 -> fibonacciInput()
            2 -> binarySearch()
            3 -> randomArrayNumbers()
            4 -> reverseWordInLine()
            5 -> break@loop
            else -> {
                print("no such exercise (1-4)")
                println("5 to exit")
            }
        }
        continue@loop
    }

}


fun fibonacciFold(n: Int) =
    (2 until n).fold(1 to 1) { (prev, curr), _ ->
        curr to (prev + curr)
    }.second

fun fibonacciInput(){
    val input = Scanner(System.`in`)
    println("Input your number HERE ->>>>>>>")
    val n = input.nextInt();
    println(fibonacciFold(n));
}
fun binarySearch(){
    val input = Scanner(System.`in`)
    val numbers = listOf(1, 3, 7, 10, 12)
    data class Box(val value: Int)
    println(numbers)
    println("Input your value to find ")
    val binary = input.nextInt();
    val boxes = numbers.map { Box(it) }
    println("Index of value -> " + boxes.binarySearchBy(binary) { it.value }) // 3
}
fun randomArrayNumbers(){
    val input = Scanner(System.`in`)
    println("enter array size")
    val n = input.nextInt();
    println("enter min number range")
    val min = input.nextInt();
    println("enter max number range")
    val max = input.nextInt();
    val numbers = ArrayList<Int>()
    val printSummary = { min: Int, max: Int ->
        println("min '$min' to $max points.")
        for(i in 0..n){
            val rnds = (min..max).random()
            numbers.add(rnds);
        }
        println(numbers)
    }
    printSummary(min,max)
}
fun reverseWordInLine(){
    println("Input your String HERE ->>>>>>>")
    val text = readLine()
    val textReverse = {text : String->
            println(text.reversed())
    }
    if (text != null) {
        textReverse(text)
    }
}