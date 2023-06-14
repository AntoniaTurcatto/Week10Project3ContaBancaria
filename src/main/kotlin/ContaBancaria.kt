abstract class ContaBancaria {

    private var saldo=0f
    private var titular=""

    abstract fun sacar(quantia:Float)

    fun getSaldo():Float{
        return saldo
    }

    fun setSaldo(saldo:Float){
        this.saldo=saldo
    }

    fun getTitular():String{
        return titular
    }

    fun setTitular(titular:String){
        this.titular=titular
    }

}