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
fun square(numbers: List<Number>): List<Number> {
    val result = mutableListOf<Number>()
    for ((index, value) in numbers.withIndex()) {
        if (index % 2 != 0 && value.toDouble() > 0) {
            result.add(value.toDouble() * value.toDouble())
        }
    }
    return result
}

// zadanie 4
fun <A> tailToHead(lst:List<A>): List<A> {
    if(lst.isEmpty()){
        throw IllegalStateException("Lista jest pusta")
    }
    val tail =lst.dropLast(1)
    val head=lst.last()
    return listOf(head)+tail
}

// zadanie 5
fun <A> setHead(lst:List<A>, item: A): List<A>{
    if(lst.isEmpty()){
        throw IllegalStateException("Lista jest pusta")
    }
    return listOf(item)+lst.drop(1)
}

// zadanie 6
fun <A> dropWhile(l:List<A>, f:(A) -> Boolean):List<A>{
    val index = l.indexOfFirst{!f(it)}
    return if(index==-1){
        emptyList()
    } else {
        l.drop(index)
    }
}
fun main() {
    // zadanie 1 sprawdzenie
    println("Zadanie 1: ")
    val mojaLista=listOf(1,2,3,4,5)
    println(mojaLista.getHead()) // zwraca 1
    println(mojaLista.getTail()) // zwracanie 2,3,4,5 bez 1

    // zadanie 2 sprawdzanie
    println("Zadanie 2:")
    println(isSorted(listOf(1,2,3,4), {i:Int, j:Int ->i <j }))//true
    println(isSorted(listOf(1,1,1,1), {i:Int, j:Int->i==j }))//true
    print(isSorted(listOf("ahyyhh", "bkjn", "cnn", "duu"), {i:String, j:String->i.first()<j.first()}))// true

    // zdanie 3 sprawdzenie
    println("Zadanie 3:")
    val result = square(listOf(1,2,3.5,5,-5,1,1))
    println(result)

    // zadanie 4 sprawdzenie
    println("Zadanie 4:")
    val result_4=tailToHead(listOf(1,2,3))
    println(result_4)

    // zadanie 5 sprawdzenie
    println("Zadanie 5:")
    val result_5=setHead(listOf(1,2,3), 5 )
    println(result_5)

    // zadanie 6 sprawddznie
    println("Zadanie 6:")
    val result_6=dropWhile(listOf(1,2,3,4,4,2,1,9)) {it < 3 }
    println(result_6)
}
