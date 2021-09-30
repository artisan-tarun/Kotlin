class Maps {
    val userOne = mapOf("Name" to "Tarun",
                        "Roll No" to 183,
                        "Exam" to "English",
                        "Score" to 90);
    init {
        println("Kotlin Maps Example");
        showMap();
    }
    fun showMap() {
        println(userOne.entries);
        for( (key , value ) in userOne){
            println("""
                $key -- $value
            """.trimIndent());
        }
        println("Enter the key to get information");
        var input = readLine()!!;
        var value = userOne.get(input);
        println("Result is : $value");
    }
}