package one.digitalinnovation.collection

class Repositorio<t> {
    private val map = mutableMapOf<String,t>()

    fun created(id:String ,value:t){
        map[id] = value

    }
    fun findById(id: String) = map[id]

    fun remove(id:String) = map.remove(id)

    fun findAll() = map.values

}