import java.util.Scanner;

fun main(args: Array<String>){
    println("""
        Kotlin Basics Application
        Designed & Developed by Tarun Chauhan
    """.trimIndent());
    println("""
        Select from the following options : 
        1. Simple Calculator.
        2. Algorithms.
        3. Simple Games.
    """.trimIndent())

    var getInput = Scanner(System.`in`);

    val option:Int = getInput.nextInt()!!;

    when(option){
        1-> Calculator();
    }
}

/*
import kotlin.math.*;

import java.util.Scanner;

fun main(args: Array<String>) {
    val age:Int = 30;
    var averageAge:Double = 20.00;

    var noName: String?;

    noName = null;



    val subList:List<String> = listOf("abc","xyz","pqr");
    val latestList = mutableListOf<String>("a","b","c","d");

    //getInputScanner(); //GET USER INPUT FUNCTION

    //getInputLine() //GET USER INPUT WITHOUT SCANNER

    //getNum();
    //swapNum();
    //getInput();

    //averageAge = (averageAge+age)/2;

    //println("My Age = " +age);
    //println("Average Age = "+averageAge);

    //printMyName("Tarun Chauhan");

    //squareRootOf(36.00);

    //greaterNumber(3,8);

    //withDefaultValue(20);

    //val mul:Int = returnSingleValue(2,4);

    //println("Single return value is = " +mul);

    //println("Multiple return values are =" + returnMultipleValues(3,1));

    //println(abc(3,9));

    //println(increaseByOne(4));

    //println("Overloading function(with INT) ="+funOverloading(78));
    //println("Overloading function(with STRING) = "+funOverloading("Tarun Chauhan"));

    //var abc = ::funAsVariable;

    //println("Function as a variable -> " +abc(2,7));

    //sqFunctionVariable(abc(2,7));

    //println(isEven(4));
    //println(isEven(1));

    //println(isPrime(34));

    //println("Value -> "+noName);


    /*for(score in scoreArray){
        println(score);
    }*/

    /*for(name in nameArray){
        println(name);
    }*/

    arrayEx();







}

//FUNCTIONS STARTS


//ARRAY STARTS

fun arrayEx(){
    val scoreArray = intArrayOf(32,45,12,54,23,89);
    for(i in 0..scoreArray.size-1){
        println(scoreArray[i]);
    }
    println("Data at index 2 is "+ scoreArray[2] +" ---- " + scoreArray.get(2));
    scoreArray[2] = 120;
    scoreArray.set(2 ,120);
    println("Updated data at index 2 is "+scoreArray[2]);
    val nameArray:Array<String> = arrayOf("Tarun","Arun","Karun","Varun");
    for(i in 0..nameArray.size-1){
        println(nameArray[i]);
    }
}


//ARRAY ENDS

//PRINTING USER INPUT USING SCANNER STARTS

fun getInputScanner(){
    var input = Scanner(System.`in`); //Initialize scanner
    println("Enter a number");
    var num:Int = input.nextInt(); //Get input
    println("You have entered ="+num); //Print input
}

//PRINTING USER INPUT USING SCANNER  ENDS

//PRINTING USER INPUT WITHOUT SCANNER STARTS

fun getInputLine(){
    println("Enter a number");
    var input = readLine()!!; //reading from screen and !! ensures not empty input
    var num = input.toInt(); // converting input to int type and store in num
    println("You have entered = $num"); // print input

}

//PRINTING USER INPUT WITHOUT SCANNER ENDS

//ARITHMETIC OPERATIONS ON USER INPUTS STARTS
fun getNum(){
    val scan = Scanner(System.`in`);
    println("Enter first number");
    val a = (scan.nextInt()).toDouble();
    println("Enter seconds number");
    val b = (scan.nextInt()).toDouble();
    println("Choose from the following:");
    println("1.Addition");
    println("2.Subtraction");
    println("3.Multiplication");
    println("4.Division");
    val option = (scan.nextInt()).toInt();
    if(option == 1){
        println("Sum is = "+(a+b));
    }else if(option == 2){
        println("Difference is ="+(a-b));
    }else if(option == 3){
        println("Product is ="+(a*b));
    }else if(option == 4){
        println("Division is ="+(a/b));
    }else {
        println("Please enter the correct value");
    }
}

//ARITHMETIC OPERATIONS ON USER INPUTS ENDS

//SWAPPING TWO NUMBERS
fun swapNum(){
    val scan = Scanner(System.`in`);
    var a = (scan.nextInt()).toInt();
    var b = (scan.nextInt()).toInt();
    println("Numbers before swapping is a = $a and b = $b");

    val temp = a;
    a = b;
    b = temp;

    println("Numbers after swapping is a = $a and b = $b ");
}

//END SWAPPING TWO NUMBERS

//EVEN/ODD NUMBER

fun scanInput():Int{
    val scan = Scanner(System.`in`);
    val input =  scan.nextInt();
    return input;
}
fun getInput(){
    var a = scanInput();
    if(evenOdd(a)){
        println("Number is EVEN");
    }else{
        println("Number is ODD");
    }
}
fun evenOdd(a:Int):Boolean{
    return a % 2 == 0;
}
//END EVEN/ODD NUMBER

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

fun isPrime(num:Int): Boolean{
    if(num < 0){
        return false;
    }
    if(num <=3 ){
        return true;
    }
    val doubleNum = num.toDouble();
    val rootNum = (sqrt(doubleNum)).toInt();
    for(i in 2..rootNum){
        return num % i == 0;
    }
    return true;
}

//FUNCTIONS ENDS
*/
