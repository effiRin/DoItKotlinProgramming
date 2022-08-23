package chap02.section3

fun main() {

    // 1. null값 허용한 변수 검사하기
//    var str1: String = "Hello Kotlin"
//    str1 = null                 // null값 할당될 수 없다는 에러 발생
//    println("str1: $str1")

    var str1: String? = "Hello Kotlin"
    str1 = null                 // null값 할당됨. -> String과 String? 은 서로 다른 자료형
    println("str1: $str1")


    // 2. 세이프 콜 활용하여 null 허용 변수 사용하기
    // println("str1: $str1 length: ${str1.length}")    // null을 허용하면 length가 실행될 수 없다.
    println("str1: $str1 length: ${str1?.length}")   // str1을 세이프 콜로 안전하게 호출


    // 3. non-null 단정 기호
//     println("str1: $str1 length: ${str1!!.length}")     // 프로그램 실행 시 NPE 발생... -> 코딩 때도 나타나는디?

    // 4. 조건문으로 null 허용 변수 검사
    val len = if(str1 != null) str1.length else -1      // str1 변수에 할당된 값이 null 아닌 경우만 str1.length 사용
    println("str1: $str1 length: ${len}")             // null 이므로 -1 출력됨
}