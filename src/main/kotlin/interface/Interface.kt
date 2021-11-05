package `interface`

/*
Para declarar uma interface precisamos colocar a palavra interface na frente da classe
 */

//Quando falamos de interface, ela não manipula os estados da classe (ou seja, os valores
//dos atributos, é por esse motivo que uma interface não recebe um construtor

interface Funcionarios{
    var nome: String
    var sobrenome: String
    var salario: Double

    //A função dentro da interface já é reconhecida como abstrata
    fun calcularSalario()

    //Dentro das interfaces nós também podemos declarar função não abstratas
    fun mostrarSalario(){
        println("Salário R$$salario")
    }

}

//Interface criada para demonstrar que uma classe pode receber mais de uma interface
interface Pessoa{
    fun andar()
}

open class Tecnico(override var nome: String,
              override var sobrenome: String, var bonus: Double) :
    Funcionarios, Pessoa{

    override var salario: Double = 1200.0

    override fun calcularSalario() {
        println(bonus + salario)
    }

    override fun andar() {

    }
}

fun main(){

    val rogerio = Tecnico("Rogério", "da Silva", 600.0)

    rogerio.calcularSalario()
    rogerio.mostrarSalario()

}