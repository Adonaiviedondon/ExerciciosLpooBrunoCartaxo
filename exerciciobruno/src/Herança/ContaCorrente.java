package Herança;

public class ContaCorrente {
      private int numero;
      private double Saldo;
private ContaCorrente(int numero, double Saldo) {
		this.numero = numero;
		this.Saldo = Saldo;
		
	}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public double getSaldo() {
	return Saldo;
}

public void setSaldo(double saldo) {
	Saldo = saldo;
}
public void Depositar(double valor) {
	   if (valor<0) {
		System.out.println("valor invalido");
	}
	   else {
		   Saldo+=valor;
	   }
	}
   public void Sacar(double valor) {
	   Saldo-=valor;
	  
	  }
   public double AplicarJuros(double Saldo,int NumeroMeses) {
	   double saldoatual =Saldo*(1.005*NumeroMeses);
	   return Saldo;
	   }
   public void ImprimirSaldo() {
	   System.out.println("Saldo:" +Saldo );
   }
    public static void main(String[] args) {
		
	}
}
   
