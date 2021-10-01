open class Input(var x:Int = 10 , var y:Int = 30){

}
class Add: Input() {
    init{
        println(x+y);
    }
}
class Inheritances {
    init{
        Add();
    }
}