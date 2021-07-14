package one.digitalinnovetion.collections

fun main(){
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) ->
        println("Chave: $k - Valor: $v")
    }


    println("--------------------------------")
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
        )

    map2.forEach { (k, v) ->
        println("Chave: $k - Valor: $v")
    }


    val idades = intArrayOf(10, 20, 21, 22, 30, 31, 40, 43, 50)
    val result = idades.any{it>31}
    print(result)
}