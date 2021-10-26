fun main() {
    val list = mutableListOf(1, 3, 5, 7)
   
    println(list.reverseAfterIndex(1))
}

// Verilen index'e kadar değiştirmeyip sonrasını ters çeviren fonksiyon
fun MutableList<Int>.reverseAfterIndex(index: Int = 0): List<Int>{
    val result = arrayListOf<Int>()
    
    // Verilen index'e kadarki kısmını aynen geçiren döngü
    for (i in 0 until index){
        val number = this[i]
        result.add(number)
    }
    // Verilen index'ten sonrasını ters çeviren döngü
    for (i in 0 until this.size - index ){
        val number = this[this.size -1 - i]
        result.add(number)
    }
    return result   
}
