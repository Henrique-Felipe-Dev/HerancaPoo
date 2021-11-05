//Exemplos do uso de herança

//Classe pai Máquina
//Nós precisamos adicionar o open para dizer ao Kotlin que a nossa classe pode ser
//herdada
open class Maquina(var nome: String, var numPecas: Int, var numFios: Int,
                   var voltagem: Double){

    //atributos e métodos que nós temos na classe pai, serão herdados pelas
    //classes filhas

    var parafusos = 10

    //Declarar a nossa função também como open
    //Nós vamos estar falando para o nosso programa que esse método pode ser
    //sobrescrito
    open fun ligar(){
        println("Estou Ligado!")
    }

    open fun desligar(){
        println("Agora estou desligado!")
    }

}

//Essa vai ser a classe filha da classe Máquina
//Para extender a máquina, fomos obrigados a passar todos os atributos do construtor,
//da classe pai na classe filha, justamente para o programa entender que o computador
//é uma máquina
class Computador(nome: String,
                 numPecas: Int, numFios: Int, voltagem: Double,
                 var nucleos: Int):
    Maquina(nome,
        numPecas, numFios, voltagem){

    //Sobrescrevendo o método ligar
    override fun ligar() {
        println("O Computador foi ligado")
    }

    fun mostrarNucleos(){
        println("Eu tenho $nucleos nucleos")
    }
}

fun main(){

    //Instancia da classe pai
    val maquina = Maquina("Genérica", 50, 100, 500.00)

    //maquina.ligar()
    //maquina.desligar()

    //Instancia da classe filha
    val computador = Computador("Samsung", 20, 25,
        100.00, 4)

    computador.ligar()
    computador.desligar()
    computador.parafusos = 30


}