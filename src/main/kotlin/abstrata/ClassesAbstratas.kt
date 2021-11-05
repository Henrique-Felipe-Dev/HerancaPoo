/* Classes Abstratas
As classes abstratas nada mais são do que classes que tem como única função, herdar
atributos e métodos para as classes filhas
 */

//Declaramos a nossa classe Maquina como abstrata, então já não podemos instanciar ela,
//apenas conseguimos fazer isso com as classes filhas
abstract class MaquinaAbstrata(var nome: String, var numPecas: Int, var numFios: Int,
                               var voltagem: Double){

    var parafusos = 0

    //Quando definimos uma função como abstrata, é o mesmo que dizermos pro nosso
    //programa que queremos que obrigatoriamente as classes filhas deem um conjunto
    //de funcionalidades pra ela
    abstract fun ligar()

    abstract fun desligar()

    fun ligarTela(){
        println("Tela ligada")
    }

}

class ComputadorAbstrato(nome: String,
                         numPecas: Int, numFios: Int, voltagem: Double,
                         var nucleos: Int):
    Maquina(nome,
        numPecas, numFios, voltagem){

    //Funções abstratas - nós precisamos sempre utilizar o override para definir
    //o conjunto de funções no método
    override fun ligar() {
        println("Ligar como um computador!")
    }

    override fun desligar() {
        println("Desligar como um computador!")
    }


}

class MaquinaFotograficaAbstrata(nome: String,
                                 numPecas: Int, numFios: Int, voltagem: Double,
                                 var lente: Boolean):
    Maquina(nome,
        numPecas, numFios, voltagem){

    //Funções abstratas - nós precisamos sempre utilizar o override para definir
    //o conjunto de funções no método
    override fun ligar() {
        println("Ligar como uma câmera digital")
    }

    override fun desligar() {
        println("Desligar como uma câmera digital!")
    }


}

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

    //Instancia da classe filha
    val computador = ComputadorAbstrato("Samsung", 50, 25,
        100.00, 10)

    computador.ligar()
    computador.desligar()
    computador.parafusos = 30

    val maquinaFotografica = MaquinaFotograficaAbstrata("Canon", 35,
        0, 50.0, true)

    maquinaFotografica.ligar()
    maquinaFotografica.desligar()


}