package br.edu.unifbv.apresentacao;

import javax.swing.*;

import br.edu.unifbv.negocio.Fachada;

import java.beans.*;
import java.awt.*;
import java.awt.event.*;
// Class Gui
// 
public class Gui {
  // Fields
  // 
  private Fachada fachada;
  // 
  private JFrame frame;
  //
  
  private JComponent panel1,panel2,panel;
  //
  private JTextArea textA;
  // 
  private JTextArea textB;
  // 
  private JLabel labelResultado;
  private JLabel labelA,labelB;
  private JButton botaoSoma,botaoSubtracao,botaoMultiplicacao,botaoDivisao;
  // Methods
  // Constructors
  // Accessor Methods
  // Operations
  /**
   * 
   */
   
   Gui() {
   	fachada = new Fachada();
   	frame = new JFrame("Calculadora");
   	panel = new JPanel();
   	panel1 = new JPanel();
   	panel2 = new JPanel();
    labelA = new JLabel("Parametro A:");
    textA = new JTextArea(1,5);
    labelB = new JLabel("Parametro B:");
    labelResultado = new JLabel();
    textB = new JTextArea(1,5);
    botaoSoma = new JButton("Soma");
    botaoSubtracao = new JButton("Subtracao");
    botaoMultiplicacao = new JButton("Multiplicacao");
    botaoDivisao = new JButton("Divisao");
    trataEvento();
   	
   }
   
   public void trataEvento() {
   	botaoSoma.addActionListener(new ActionListener() {
   		public void actionPerformed(ActionEvent e) {
   			String command = botaoSoma.getActionCommand();
   			if ( command == "Soma" ) {
   				System.out.println(command);
   				double r;
   				r = fachada.soma(new Double(textA.getText()).doubleValue(),new Double(textB.getText()).doubleValue());
   				System.out.println(r);
   				labelResultado.setText(new Double(r).toString());
   			}
   			
   		}
   	});
   	
	botaoSubtracao.addActionListener(new ActionListener() {
   		public void actionPerformed(ActionEvent e) {
   			String command = botaoSubtracao.getActionCommand();
   			if ( command == "Subtracao" ) {
   				System.out.println(command);
   				double r;
   				r = fachada.subtracao(new Double(textA.getText()).doubleValue(),new Double(textB.getText()).doubleValue());
   				System.out.println(r);
   				labelResultado.setText(new Double(r).toString());
   			}
   			
   		}
   	});
   	
	botaoMultiplicacao.addActionListener(new ActionListener() {
   		public void actionPerformed(ActionEvent e) {
   			String command = botaoMultiplicacao.getActionCommand();
   			if ( command == "Multiplicacao" ) {
   				System.out.println(command);
   				double r;
   				r = fachada.multiplicacao(new Double(textA.getText()).doubleValue(),new Double(textB.getText()).doubleValue());
   				System.out.println(r);
   				labelResultado.setText(new Double(r).toString());
   			}
   			
   		}
   	});
	
	botaoDivisao.addActionListener(new ActionListener() {
   		public void actionPerformed(ActionEvent e) {
   			String command = botaoDivisao.getActionCommand();
   			if ( command == "Divisao" ) {
   				System.out.println(command);
   				double r;
   				r = fachada.divisao(new Double(textA.getText()).doubleValue(),new Double(textB.getText()).doubleValue());
   				System.out.println(r);
   				labelResultado.setText(new Double(r).toString());
   			}
   			
   		}
   	});
	
   }
   
  public void montaFormulario ( ) {
    
    
    panel1.add(labelA);
    panel1.add(textA);
    panel1.add(labelB);
    panel1.add(textB);
    panel1.add(labelResultado);
    panel2.add(botaoSoma);
    panel2.add(botaoSubtracao);
    panel2.add(botaoMultiplicacao);
    panel2.add(botaoDivisao);
    panel.setPreferredSize(new Dimension(400, 100));
    panel2.setPreferredSize(new Dimension(100, 250));
    
    panel.add(panel1);
    panel.add(panel2);
    frame.add(panel);
    //frame.add(panel2);
    
  }
  /**
   * 
   */
  public void mostraFormulario ( ) {
    //Display the window.
    frame.pack();
    frame.setVisible(true);
  }
  /**
   * 
   */
  public void atualizaFormulario ( ) {
    
  }
  /**
   * 
   * @param args 
   */
  public static void main ( String[] args) {
    Gui gui = new Gui();
    gui.montaFormulario();
    gui.mostraFormulario();
  }
}

