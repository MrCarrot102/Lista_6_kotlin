// zadanie 1
// zwracanie pierwszego elementu listy
fun <T> List<T>.getHead(): T {
    if (isEmpty()){
        throw NoSuchElementException("Lista jest pusta")
    }
    return get(0)
}
// zwracanie wszystkiego bez 1 elementu
fun <T> List<T>.getTail(): List<T> {
    if(isEmpty()){
        throw NoSuchElementException("Lista jest pusta")
    }
    return subList(1,size)
}
// zadanie 2
fun <A> isSorted(aa:List<A>, order:(A,A) -> Boolean) : Boolean {
    for (i in 0 util aa.size-1){
        if(!order(aa[i], aa[i+1])){
            return false
        }
    }
    return true
}

fun main() {
    // zadanie 1 sprawdzenie
    val mojaLista=listOf(1,2,3,4,5)
    println(mojaLista.getHead()) // zwraca 1
    println(mojaLista.getTail()) // zwracanie 2,3,4,5 bez 1

    // zadanie 2 sprawdzanie
    println(isSorted(listOf(1,2,3,4), {i:Int, j:Int ->i <j }))//true
    println(isSorted(listOf(1,1,1,1), {i:Int, j:Int->i==j }))//true
    print(isSorted(listOf("ahyyhh", "bkjn", "cnn", "duu"), {i:String, j:String->i.first()<j.first()}))// true
}
