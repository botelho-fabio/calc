package br.edu.unifbv.classesbasicas;
// Class OperacaoBasica
// 
abstract public class OperacaoBasica {
  // Fields
  // 
  protected double resultado;
  // 
  protected double a;
  // 
  protected double b;
  // Methods
  // Constructors
  // Accessor Methods
  /**
   * Get the value of resultado
   * 
   * @return the value of resultado
   */
  protected double getResultado (  ) {
    return resultado;
  }
  /**
   * Set the value of resultado
   * 
   * 
   */
  protected void setResultado ( double value  ) {
    resultado = value;
  }
  /**
   * Get the value of a
   * 
   * @return the value of a
   */
  protected double getA (  ) {
    return a;
  }
  /**
   * Set the value of a
   * 
   * 
   */
  protected void setA ( double value  ) {
    a = value;
  }
  /**
   * Get the value of b
   * 
   * @return the value of b
   */
  protected double getB (  ) {
    return b;
  }
  /**
   * Set the value of b
   * 
   * 
   */
  protected void setB ( double value  ) {
    b = value;
  }
  // Operations
}

