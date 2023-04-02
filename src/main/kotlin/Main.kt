import kotlin.math.pow

fun main(args: Array<String>) {
   println(convertDecimalToBinary(50)) //by power of 2
    println(convertDecimalToBinary2(50)) //by dividing to 2


}

fun convertDecimalToBinary2(decimal: Int): Int {
    var d = decimal
    val list = mutableListOf<Int>()
    while (d>0){
        val remainder = d%2
        if (remainder==0){
            list.add(0)
        } else {
            list.add(1)
        }
        d /= 2
    }
    println("list: ${list.reversed()}")
    return 1
}

fun convertDecimalToBinary(decimal: Int) {
    //decimal= 50
    var mutableList = mutableListOf<Int>()
    var max = findMax(decimal)

    repeat(max+1){
        mutableList.add(0)
    }


    var d = decimal
    while (d>=2){
        println("d: $d")
       val a = getMax(d)
        println("getMax = $a")
        val c = findMax(a)
        println("index: $c")
        mutableList[c] = 1
        println("numbers: $mutableList")
        println("d = $d")
        d -= a
    }

    println(mutableList.asReversed())

}


fun findMax(n: Int): Int {
    var counter = 1
    var two = 2
    while (two<=n){
        two *= 2
        counter++
    }
    return counter-1
}


fun getMax(n: Int): Int {
    var counter = 1
    var two = 2

    while (two<=n){
        two *= 2
        counter++
    }
    println("C: ${counter-1}")

    return 2.0.pow(counter-1).toInt()
}

