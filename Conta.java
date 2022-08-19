import java.util.List;
  
abstract class Conta extends Banco implements IOperacao{
  private int id;
  private String numero;
  private double saldo;

  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id = id;
  }
  public String getNumero(){
    return numero;
  }
  public void setNumero(String num){
    this.numero = num;
  }
  public double getSaldo(){
    return saldo;
  }
  public void setSaldo(double saldo){
    this.saldo = saldo;
  }
  public Conta(int id, String numero, double saldo, int numBanco, String nomeBanco, List<Conta>contas){
    
    super(numBanco,nomeBanco, contas);
    this.id=id;
    this.numero=numero;
    this.saldo=saldo;
    
  }
  public double consultaSaldo(){
    return this.saldo;
  }
  public void realizarSaque(double Valor){
    
  }
  public void realizarDeposito(double Valor){
    
  }
  public String toString() {
    
		return "\nId: "+this.id+"\nNumero: "+this.numero+"\nSaldo: "+this.saldo;
    
  }
}