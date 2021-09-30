import java.util.Scanner;

class Lists() {
    var user = listOf("Tarun",1, 20023 , "ABC");
    var mutableUser = mutableListOf("Varun",2 , 2309890 , "AN Orchardist who codes");
    val getInput = Scanner(System.`in`);
    init {
        println("Kotlin List Example");
        showUser();
        showMutableUser();
        option();
    }
    fun showUser(){
        println("""
            User Information(Immutable) : 
        """.trimIndent())
        for(i in user){
            println(i);
        }
    }
    fun showMutableUser(){
        println("""
            User Information(Mutable)
        """.trimIndent());
        for(i in mutableUser) {
            println(i);
        }
    }
    fun option(){
        println("""
            Selection option : 
            1. View Index.
            2. Edit.
            3. Exit.
        """.trimIndent());
        val input = getInput.nextInt()!!;

        when(input){
            1-> viewIndex();
            2-> edit();
            3-> return;
        }
    }
    fun viewIndex(){
        println("Enter value to know index of : ");
        var x = readLine()!!;
        println("""
            ${mutableUser.indexOf(x)}
        """.trimIndent());
    }
    fun edit(){

    }


}