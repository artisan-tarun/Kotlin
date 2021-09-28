import java.util.Scanner;

class Calculator{
    init{
        println("""
            Basic Calculator
        """.trimIndent());
        var getInput = Scanner(System.`in`);

        println("""
            Enter two numbers to perform action :
        """.trimIndent());

        var a:Int = (getInput.nextInt()!!).toInt();
        var b:Int = (getInput.nextInt()!!).toInt();

        println("""
            Selection from the following actions : 
            1. Addition (+).
            2. Subtraction (-).
            3. Multiplication (x).
            4. Division (/).
            5. Even or Odd.
        """.trimIndent());

        var input:Int = getInput.nextInt()!!;

        when(input){
            1 -> addition(a,b);
            2 -> subtraction(a,b);
            3 -> multiplication(a,b);
            4 -> division(a,b);
            5 -> evenOdd(a,b);
            else -> println("Enter from the above options");
        }
    }
    private fun addition(a:Int, b:Int){
        println("Sum is "+ (a+b));
    }
    private fun subtraction(a:Int, b:Int){
        println("Difference is "+ (a-b));
    }
    private fun division(a:Int,b:Int){
        var a:Double = a.toDouble();
        var b:Double = b.toDouble();
        println("Division is "+(a/b));
    }
    private fun multiplication(a:Int,b:Int){
        println("Product is "+(a*b));
    }
    private fun evenOdd(a:Int, b:Int){
        check(a);
        check(b);
    }
    private fun check(x:Int){
        if(x% 2 == 0){
            println("Number $x is Even");
        }else{
            println("Number $x is Odd");
        }
    }
}