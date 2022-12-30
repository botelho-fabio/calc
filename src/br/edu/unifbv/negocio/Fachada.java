package br.edu.unifbv.negocio;
import br.edu.unifbv.classesbasicas.Divisao;
import br.edu.unifbv.classesbasicas.Multiplicacao;
import br.edu.unifbv.classesbasicas.Soma;
import br.edu.unifbv.classesbasicas.Subtracao;

// Class Fachada
// 
public class Fachada {
  // Fields
  // 
  //private Soma soma;
  // 
  //private Subtracao subtracao;
  // 
  //private Multiplicacao multiplicacao;
  // 
  //private Divisao divisao;
  // Methods
  // Constructors
  // Accessor Methods
  /**
   * Get the value of soma
   * 
   * @return the value of soma
   */
  
  // Operations
  /**
   * 
   * @param a 
   * @param b 
   */
  public double soma ( double a, double b) {
	Soma soma = new Soma();
	return soma.operacao(a,b);    
  }
  /**
   * 
   * @param a 
   * @param b 
   */
  public double subtracao ( double a, double b) {
    Subtracao subtracao = new Subtracao();
	return subtracao.operacao(a,b);
  }
  /**
   * 
   * @param a 
   * @param b 
   */
  public double multiplicacao ( double a, double b) {
    Multiplicacao multiplicacao = new Multiplicacao();
	return multiplicacao.operacao(a,b);
  }
  /**
   * 
   * @param a 
   * @param b 
   */
  public double divisao ( double a, double b) {
    Divisao divisao = new Divisao();
	return divisao.operacao(a,b);
  }
}

