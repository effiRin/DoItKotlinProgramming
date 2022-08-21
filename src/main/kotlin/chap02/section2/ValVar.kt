package chap02.section2

fun main(){
    val number = 10         // int형으로 추론
    var language = "Korean"  // String형으로 추론
    val secondNumber : Int = 20   // int형으로 명시적 지정
    language = "English"        // var로 선언한 변수는 값 재할당 가능

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")
}