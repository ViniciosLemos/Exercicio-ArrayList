import java.util.List;
import java.util.ArrayList;
class Banco{
  
  private int numero;
  private String nome;
  private List<Conta> contas = new ArrayList<Conta>();
  
  public int getNumero(int numero){
    return this.numero;
  }
  public void setNumero(int numero){
    this.numero = numero;
  }
  public String getNome(String nome){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public List<Conta> getContas() {
		return contas;
	}
  public void cadastrarConta(Conta conta){
    contas.add(conta);
    
  }
  public void removerConta(Conta conta){
    contas.remove(conta);
    
  }
  public void exibirContas(){
    for(Conta c : contas){ 
      System.out.println(c.toString());
    }
    
  }

  public Banco(int numero, String nome, List<Conta>contas){
    this.numero=numero;
    this.nome=nome;
    this.contas=contas;
  }
   
  
}