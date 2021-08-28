import kotlin.math.*;

fun main(args: Array<String>) {
    val age:Int = 30;
    var averageAge:Double = 20.00;
    averageAge = (averageAge+age)/2;

    println("My Age = " +age);
    println("Average Age = "+averageAge);

    printMyName("Tarun Chauhan");

    squareRootOf(36.00);

    greaterNumber(3,8);

    withDefaultValue(20);

    val mul:Int = returnSingleValue(2,4);

    println("Single return value is = " +mul);

    println("Multiple return values are =" + returnMultipleValues(3,1));

    println(abc(3,9));

    println(increaseByOne(4));

    println("Overloading function(with INT) ="+funOverloading(78));
    println("Overloading function(with STRING) = "+funOverloading("Tarun Chauhan"));

    var function = ::funAsVariable;

    println("Function as a variable -> " +function(2,7));

    sqFunctionVariable(function(2,7));

    println(isEven(4));
    println(isEven(1));
}


fun printMyName(name:String){
    println("Hello my name is "+name);
}

fun squareRootOf(num: Double){
    println("Square root of "+ num + " is = "+ sqrt(num));
}

fun greaterNumber(a:Int,b:Int){
    println("Greater number between "+a+ " and " +b+ " is " + max(a,b));
}

fun withDefaultValue(x:Int = 10,y:Int = 10){
    println("Value of x = "+ x + " value of Y = "+ y);
}

fun returnSingleValue(a:Int, b:Int ):Int {
    return a*b;
}

fun returnMultipleValues(a:Int, b:Int ):Pair<Int,Int>{
    return Pair(a+b,a-b);
}

fun abc(x:Int, y:Int) = x*y;

fun increaseByOne(i:Int):Int{
    //i++; //Can't change the value of 'i' since it is declared as 'val' by default in function parameter declaration.
    var j = i+1;
    return j;
}

//FUNCTION OVERLOADING EXAMPLE

fun funOverloading(a:Int):Int{
    return a*a;
}
fun funOverloading(a:String):String{
    return a;
}

fun funAsVariable(a:Int, b:Int):Int{
    return a+b;
}

fun sqFunctionVariable(a:Int){
    println("Square of function variable is = "+a*a);
}

fun isEven(a:Int):Boolean{
    return a%2 === 0 ;
}
