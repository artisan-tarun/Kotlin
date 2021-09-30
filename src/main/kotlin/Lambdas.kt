class Lambdas {
    var msg: () -> Unit =  { println("Kotlin Lambda Expression Example") };
    val sum = { a:Int , b:Int -> a+b};
    val mul:(Int, Int) -> Int = {a, b -> a*b};
    val num = arrayOf(1, 2, -3 ,5, 10, -10);

    init{
        msg();
        println(sum(3,7));
        println(mul(45,89));
        println(num.filter{it >  0});
        println(num.filter{i -> i < 0});
    }

}