package Herança;

public class ContaCorrente {
      private int numero;
      private double Saldo;
	private ContaCorrente(int numero, double Saldo) {
		this.numero = numero;
		this.Saldo = Saldo;
	}
   public double Depositar(double Saldo,double valor) {
	   double saldoatual = Saldo + valor;
	   return saldoatual;
	}
   public double Sacar(double Saldo,double valor) {
	   double saldoatual = Saldo - valor;
	   return saldoatual;
	  }
   public double AplicarJuros(double Saldo,int NumeroMeses) {
	   double saldoatual =Saldo*(1.005*NumeroMeses);
	   return Saldo;
	   }
   public void ImprimirSaldo() {
	   System.out.println("Saldo:" +Saldo );
   }
    public static void main(String[] args) {
		ContaCorrente conta=new ContaCorrente(138450,1000);
		conta.ImprimirSaldo();
		conta.Depositar(1000,100);
		conta.ImprimirSaldo();
		conta.Depositar(1100,400);
	}
}
   
