fun main(){
    println("Digite 2 númeors e descubra a área do retangulo ")
    var rB = readln().toInt()
    var rA  = readln().toInt()

    println("A área do retangulo é: ${rB * rA} ")
    quadrado()
}
fun quadrado(){
    println("calcule a área do quadrado ")
    var l1 = readln().toInt()
    var l2  = readln().toInt()
    println("A área do quadrado é: ${l1 * l2} ")
    losango()
}
fun losango(){
    println("calcule a área do quadrado ")
    var dMA = readln().toInt()
    var dME  = readln().toInt()
    println("A área do quadrado é: ${dME * dMA / 2} ")
    trapezio()
}
fun trapezio(){
    println("Agora calcule a área do Trapézio")
    var tBMA = readln().toInt()
    var tBME = readln().toInt()
    var h = readln().toInt()
    paralelograma()

    println("O valor da área do trapézio ${tBME + tBMA * h / 2}")
}
fun paralelograma(){
    println(" Agora vamos calcular a área do paralelograma ")
    println("Digite o valor da base do paralelograma: ")
    var pB = readln().toInt()

    println("Agora digite o valor da área do paralelograma: ")
    var pA = readln().toInt()

    println("O valor da área do paralelograma é ${pB * pA}")

    triangulo()
}
fun triangulo(){
    println(" Agora calcule a área do triangulo ")
    println("Digite o valor da base: ")
    var tB = readln().toInt()

    println("Digite o valor da área: ")
    var tA = readln().toInt()
    println("O valor da área do triângulo é ${tB * tA / 2}" )

    circulo()
}
fun circulo(){
    println(" Agora vamos calcular o valor da área do círculo ")
    println("Digite o valor da raio do círculo: ")
    var r = readln().toInt()

    println("O valor da área do círculo é de ${ 3.14 * r * r}")
}