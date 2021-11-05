fun main(args: Array<String>) {
    /*
    Esses são conceitos de extrema importância quando falamos de POO
    Herança - Classes Pais e Fihas (Superclasses e Subclasses)
    Quando falamos de Herança não podemos extender duas classes ao mesmo tempo
    Classes Abstratas - As classes pais nós não instanciamos, apenas instanciamos as
    classes derivadas delas
    Interfaces - Semelhantes as classes abstratas, com a diferença de que ela vai
    servir como um contrato entre a classe pai e as classes filhas
    Polimorfismo - Uma mesma Instrução computacional (as nossas funções/métodos) de
    diversas maneiras diferentes (Sobrecarga de métodos e Sobrescrita de métdos)
     */

    //Instancia da classe pai
    //val maquina = Maquina("Genérica", 50, 100, 500.00)

    //maquina.ligar()
    //maquina.desligar()

}

//Poliformismo - Uma mesma Instrução computacional (as nossas funções/métodos) possa
//ser executada de diversas maneiras diferentes
//(Sobrecarga de métodos e Sobrescrita de métodos)

//Sobrecarga de Métodos - é quando nós conseguimos executar a função com diferentes
//funções - Tudo isso ocorre em tempo de compilação

//Sobrescrita de Métodos - é quando nós conseguimos exexutar a função com diferentes
//funções - Tudo isso ocorre em tempo de execução

fun soma (n1: Int, n2: Int){
    println("Somando números inteiros")
    println(n1 + n2)
}

fun soma (n1: Double, n2: Double){
    println("Somando números reais")
    println(n1 + n2)
}