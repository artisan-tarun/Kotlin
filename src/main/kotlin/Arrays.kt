import java.util.Scanner;

class Arrays {

    var roles = arrayOf<String>("Admin","Editor","Students","Interns");
    val getInput = Scanner(System.`in`);

    init{
        println("""
            This is a simple Array example.
        """.trimIndent())
        showRoles();
    }

    fun showRoles(){
        println("""
            Roles list :            
        """.trimMargin())
        for(i in roles){
            println("""
                ${roles.indexOf(i)} : $i
            """.trimIndent())
        }
        options();
    }
    fun options(){
        println("""
            Choose the operation : 
            1. Search using Index.
            2. Edit role.     
            3. Exit.
        """.trimIndent());
        val input = getInput.nextInt()!!;
        when(input){
            1-> getRole();
            2-> editRole();
            3-> return;
        }
    }
    fun getRole(){
        println("""
            Enter index of the Role to search : 
        """.trimIndent())
        val index = getInput.nextInt()!!;

        val role = roles.get(index);

        println("Role : $role");
    }
    fun editRole(){
        println("""
            Enter index of the Role to edit : 
        """.trimIndent())
        val index = getInput.nextInt()!!;
        val role = roles.get(index);
        println("""
            Edit role : $role
            Enter new name : 
        """.trimIndent());
        var newRole = readLine()!!;

        roles.set(index, newRole);
        showRoles();

    }
}