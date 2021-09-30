class Sets {

    var roleSet = setOf("Admin","Editor","Student","User", 2 , 3.14 , "Hello how are you");
    init{
        println("Kotlin Sets Example");
        showSet();
    }
    fun showSet(){
        println(roleSet);
    }
}