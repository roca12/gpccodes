import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var c = sc.nextInt()
    var vec = ArrayList<Int>()
    while (c-- > 0) {
        var x = sc.nextInt()
        vec.add(x)
    }
    vec.sort()
    print(vec.joinToString(separator = "\n"))
}