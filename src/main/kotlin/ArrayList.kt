import java.util.Scanner;

class ArrayList {

    var users  = ArrayList<String>();
    val getInput = Scanner(System.`in`);

    init{
        println("Array List Example");
        createArrayList();
        addUser();
    }

    fun createArrayList(){
        users.add("Tarun Chauhan");
    }
    fun addUser() {
        println(
            """
            Default user's list :
        """.trimIndent()
        );

        for (i in users) {
            println("""
                ${users.indexOf(i)} : $i
            """.trimIndent());
        }
        println(
            """
            How many records you want to enter ? 
        """.trimIndent()
        );
        var limit = getInput.nextInt()!!;
        var i:Int  = users.size;

        while(i      < limit+i){
            println(
                """
            Enter new user to add to the list
            """.trimIndent()
            );
            var name = readLine()!!;
            users.add(name);
            i++;
        }


        print(
            """
            New user list is :
        """.trimIndent()
        );
        for (i in users) {
            println("""
                ${users.indexOf(i)} - $i
            """.trimIndent());
        }
        println("""Enter the index to get user name""");
        var result = getByIndex(getInput.nextInt()!!)
        println("""
            Search Results : 
            $result;
        """.trimIndent())
    }
    fun getByIndex(id:Int) : String{
        return users.get(id);
    }

}