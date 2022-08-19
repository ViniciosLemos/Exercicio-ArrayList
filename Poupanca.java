import java.util.List;
public class Poupanca extends Conta{
  private double taxaJuros;
  
	public double getTaxaJuros(){
	  return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros){
	  this.taxaJuros = taxaJuros;    
	}
  
  public Poupanca(int id, String numero, double saldo, int numBanco, String nomeBanco, List<Conta>contas, double txJ){
    super(id,numero,saldo,numBanco,nomeBanco,contas);
    this.taxaJuros = txJ;
    
  }
  public void realizarSaque(double valor) {
    System.out.println("\nSacou da poupança R$: "+ valor);

  }	
  public void realizarDeposito(double valor) {
    System.out.println("\nDepositou na poupança R$: "+ valor);
  }
	public double consultarSaldo() {
	  return getSaldo(); 
  }
  public String toString() {
    
		return super.toString() + "\nTaxaJuros: " + this.taxaJuros;
    
	}
  
}