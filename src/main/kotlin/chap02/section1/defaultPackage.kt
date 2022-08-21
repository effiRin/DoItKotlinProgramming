package chap02.section1

import java.lang.Math.PI
import java.lang.Math.abs

fun main() {
    val intro: String = "안녕하세요!"
    val num: Int = 20

    println(PI)     // 기본 패키지에 포함되지 않은 상수(PI)와 함수(절댓값)
    println(abs(-12.6))

    println("intro : $intro, num : $num")
}
