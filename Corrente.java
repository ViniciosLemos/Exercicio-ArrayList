import java.util.List;
public class Corrente extends Conta{
  private double limite;
  
	public double getLimite(){
	  return limite;
	}
	public void setLimite(double lim){
	  this.limite = lim;    
	}
  public Corrente(int id, String numero, double saldo, int numBanco, String nomeBanco, List<Conta>contas, double lmt){
    super(id,numero,saldo,numBanco,nomeBanco,contas);
    this.limite = lmt;
    
  }
	public void realizarSaque(double valor) {
    System.out.println("\nSacou da Conta Corrente R$: "+ valor);

	}
	public void realizarDeposito(double valor) {
    System.out.println("\nDepositou na Conta Corrente R$: "+ valor);

  }
	public double consultarSaldo() {
	  return getSaldo(); 
	}
  public String toString() {
    return super.toString() + "\nLimite: " + this.limite;
    
	}

  
}