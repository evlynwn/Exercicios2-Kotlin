fun main() {
    //Contar de 1 a 100
    //E verificar se é multiplo de tres
    //mostre "Batata"

    for (numero in 1..100){
        print(numero)
        if (numero % 3 == 0 && numero % 5 == 0){
            print("Batata Quente")
        }else if ( numero % 5 == 0){
            print("Quente")
        }else if (numero % 3 == 0){
            print("Batata")
        }

        println()
    }
}
