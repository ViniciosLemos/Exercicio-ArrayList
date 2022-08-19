import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    List<Conta> contas = new ArrayList<Conta>();
    Conta corrente1 = new Corrente(996,"3000-01",401,00,"Nu Bank",contas,500);
    Conta corrente2 = new Corrente(997,"3000-02",1000,50,"C6 Bank",contas, 140);
    Conta poupanca1 = new Poupanca(998,"3000-03",97,32,"Nu Bank",contas,1200);
    Conta poupanca2 = new Poupanca(999,"3000-04",520,05,"C6 Bank",contas,350);
    
    System.out.println("Conta corrente Nu Bank");
    corrente1.realizarSaque(25);
    corrente1.realizarDeposito(80);
    corrente1.cadastrarConta(corrente1);
    
    System.out.println("Conta corrente C6 Bank");
    corrente2.realizarSaque(60);
    corrente2.realizarDeposito(145); 
    corrente2.cadastrarConta(corrente2);
    
    System.out.println("Conta poupança Nu Bank");
    poupanca1.realizarSaque(40);
    poupanca1.realizarDeposito(155);
    poupanca1.cadastrarConta(poupanca1);

    System.out.println("Conta Poupança C6 Bank");
    poupanca2.realizarSaque(85);
    poupanca2.realizarDeposito(255);
    poupanca2.cadastrarConta(poupanca2);

    poupanca1.exibirContas();
    poupanca2.exibirContas();
    corrente1.exibirContas();
    corrente2.exibirContas();

    corrente1.removerConta(corrente2);
    
    
  }

  
}