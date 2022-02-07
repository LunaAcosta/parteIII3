package com.example.parteiii3

fun main(){
    val prueba1 = coleccion(n1 = 100, n2 = 100, n3 = 100)
    println("test1 pasando ${prueba1==0}")

    val prueba2 = coleccion(n1 = null, n2 = 698, n3 = 698)
    println("test2 pasando ${prueba2==-100}")

    val prueba3 = coleccion(n1 = 90, n2 = 87, n3 = 24)
    println("test3 pasando ${prueba3==-1}")

    val prueba4 = coleccion(n1 = 36, n2 = 99, n3 = 79)
    println("test4 pasando ${prueba4==-2}")

    val prueba5 = coleccion(n1 = 12, n2 = 34, n3 = 54)
    println("test5 pasando ${prueba5==100}")

    val prueba6 = coleccion(n1 = 200, n2 = 200, n3 = 200)
    println("test6 pasando ${prueba6==0}")

    val prueba7 = coleccion(n1 = 698, n2 = null, n3 = 888)
    println("test7 pasando ${prueba7==-100}")

    val prueba8 = coleccion(n1 = 23, n2 = null, n3 = 90)
    println("test8 pasando ${prueba8==-100}")

    val prueba9 = coleccion(n1 = 10, n2 = 2, n3 = 18)
    println("test9 pasando ${prueba9==30}")

    val prueba10 = coleccion(n1 = 34, n2 = 2, n3 = 6)
    println("test10 pasando ${prueba10==-1}")

}


fun coleccion(n1:Int?, n2:Int?, n3:Int?): Int {
    var valor = 0

    if(n1==n2 && n1==n2 && n2== n1 && n2==n3 && n3==n1 && n3==n2) {

        valor = 0

        return valor
    }
    else if(n1==null || n2==null || n3==null) {
        valor = -100
        return valor
    }
    else if(n1!!>n2 && n1!!> n3){
        valor=-1
        return valor
    }
    else if(n2!!>n3 && n2!!>n1){
        valor=-2
        return valor
    }
    else if(n3!!>n1 && n3!!>n2){
        valor=n1+n2+n3
    }
    return valor
}