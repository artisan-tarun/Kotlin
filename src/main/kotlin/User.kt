enum class RoleType{
    ADMIN, EDITOR, STUDENT, TEACHER, USER
}
class User (val name:String, val role:RoleType , val status:Boolean){

}