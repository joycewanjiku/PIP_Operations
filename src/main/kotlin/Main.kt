fun main() {
    (subraction(53,12))
    addation(673,12,54)
    multiplication(65,8,12)
    division(44,32,82)
    modle(12,32)
    school("Akirachix")

}


//
//I started with understanding performing operations in functions.
//The operations I learned are.
//-Addition;
//-Subtraction;
//-Division;
//-Multiplication;
//-Module;
//Which  includes addition we use (+) sign  to add numbers then we use println  which will print out the output
//I also used subtraction in subtraction we use (-)sign to subtract two or more numbers
//I used multiplications in multiplications we use(%) sing to multiply two or more numbers
//I used division to divide numbers it can be two numbers or more here we use (/) sign
//I  used module to find a remaining number we use(%) sing to get the remaining numbers


fun subraction(num1:Int,num2:Int): Int{
   println("subtarctin of two numbers is ${num1 - num2}")
    return num1 - num2
}
fun addation(num1:Int ,num2: Int,num3:Int){
    var add =num1 + num2 + num3
    println("addation of three numbers $add")

}
fun multiplication(num1: Int,num2: Int,num3: Int){
    var mult =num1*num2
    println("multiplication of three numbers $mult")

}
fun division(num1: Int,num2: Int,num3: Int){
    var div =num1/num2
    println("division of three numbers " +div)
}
fun modle(model1:Int,model2: Int){
    var mod =model1%model2
    println( "modle of two numbers $mod")

}
fun school(name:String){
    println("my school name $name")

}

fun opperators(args: Array<String>) {
    var number = 12

    number *= 25   // number = number*5
    println("number  = $number")
}
//How to  index access operator
fun Index (args: Array<String>){
    val a= intArrayOf(1,2,3,4,-1)
    println(a[1])
    a[1]=2
    println(a[1])


}
//Valiable and data types
//diffrence between valaible and varaible is=(val=is Mutabale) (var=is imutabale)
//mutable are variables that can change while imutable are variables that canot change

fun data(){
    var languages="English"
    val score=54
//    val languages(String)
//    val score(Int)

}
fun float(){
    val examplestrings="joy"

}

//Data types are divided into diffrent groups
//Numbers are divide into two groups=>integer types store whole numbers positive or negative
//(such as 123 or -456)without decimals valid types are [Byte,Short ,Int and longr]
//Float they are numbers that contain more than one  or more decimal they are two types floating and double
//Characters
//Booleans
//Strings
//Arrays

//BYTE

