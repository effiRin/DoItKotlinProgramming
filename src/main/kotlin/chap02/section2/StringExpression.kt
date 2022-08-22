package chap02.section2

fun main() {
    var a = 1
    val str1 = "a = $a"     // 1
    val str2 = "a = ${a+2}"     // 3

    println("str1: \"$str1\", str2: \"$str2\"")
}