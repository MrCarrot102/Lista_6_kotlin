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
fun <A> isSorted(aa: List<A>, order: (A, A) -> Boolean): Boolean {
    for (i in 0 until aa.size - 1) {
        if (!order(aa[i], aa[i + 1])) {
            return false
        }
    }
    return true
}
// zadanie 3
fun square(numbers: List<Number>): List<Number>{
    val result = mutableListOf<Number>()
    for(i in numbers.indices) {
        if(i%2 != 0 && numbers[i] is Double && numbers[i].toDouble() > 0 ){
            result.add(numbers[i].toDouble() * numbers[i].toDouble())
        } else if (i%2 != 0 && numbers[i] is Int && numbers[i].toInt() > 0 ) {

        result.add(numbers[i].toInt() * numbers[i].toInt())}
    }
    return result
}
// zadanie 4
fun <A> tailToHead(lst:List<A>):List<A>{
    if(lst.isEmpty()){
        throw IllegalArgumentException("Lista jest pusta")
    }
    val lastElement=lst.last()
    val modifiedList=lst.dropLast(1)
    return listOf(lastElement)+modifiedList
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
    println("\n")

    // zadanie 3 sprawdzanie
    val result = square(listOf(1,2,3.5,5,-6,1,1))
    println(result)

    // zadanie 4 sprawdzanie
    val result_2=tailToHead(listOf(1,2,3))
    println(result_2)



}
