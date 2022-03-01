fun main(){

    //floats and ints

    val numInt = 5
    println("num int is $numInt")
    val numFloat = 6f
    println("numFloat is $numFloat")

    //adding nums and floats and what works and what wont

    //kotlin works a fine line
    val sum = numFloat + numInt
    println("sum is $sum")


//    var sum2 = 0
//    sum2 = numFloat + numInt
//    println(sum2)
    // this will lead to mismatch error, if we want to fix this we have to convert

    var sum2 = 0
    sum2 = (numFloat + numInt).toInt()
    println("sum2 is = $sum2")



}