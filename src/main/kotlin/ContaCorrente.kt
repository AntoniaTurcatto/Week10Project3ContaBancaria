class ContaCorrente(saldo:Float,titular:String):ContaBancaria() {
    init {
        setSaldo(saldo)
        setTitular(titular)
    }

    override fun sacar(quantia:Float) {
        if (quantia<=getSaldo()){
            setSaldo(getSaldo()-quantia)
        } else{
            println("Saldo Insuficiente")
        }
    }
}