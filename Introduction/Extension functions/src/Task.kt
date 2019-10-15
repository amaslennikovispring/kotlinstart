fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(var numerator: Int, val denominator: Int)
/*
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)
fun Pair<String, String>.r(): RationalNumber3 = RationalNumber3(first, second)

data class RationalNumber(var numerator: Int, val denominator: Int)
data class RationalNumber3(val FuncName: String, val NumComment: String)

fun main() {
    var aleks = RationalNumber(7, 2)
    println(aleks.numerator)
    aleks.numerator = 14;
    println(aleks.numerator)
    aleks = Pair(3,4).r()
    println(aleks)

    aleks = 7.r()
    println(aleks)

    aleks = Pair(5,70).r()
    println(aleks)

    var aleksStr = RationalNumber3("Bob", "to Alice")
    println(aleksStr)
    println(aleksStr.NumComment)

    aleksStr = Pair("5","70").r()
    println(aleksStr)
    println(aleksStr.NumComment)
}
*/
