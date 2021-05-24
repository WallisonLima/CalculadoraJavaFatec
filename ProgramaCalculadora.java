import javax.swing.JOptionPane;

public class ProgramaCalculador {

	   static double valor1;
	   static double valor2;
	   static double resultado;
	 
	   static void menuPrincipal()
	   {
	         Calculadora calc = new Calculadora();
	        
	         int opcao;
	         String menu = "Programa Calculadora\n\n"+
	                                "1-Somar\n"+
	                                "2-Subtrair\n"+
	                                "3-Multiplicar\n"+
	                                "4-Dividir\n"+
	                                "5-Finalizar\n\n";
	        
	        
	         opcao=1;
	         while (opcao != 5)
	         {
	               opcao = Integer.parseInt(
	                          JOptionPane.showInputDialog(null,
	                          menu,"Programa Calculadora - 2013",
	                          JOptionPane.QUESTION_MESSAGE));
	              
	               switch (opcao)
	               {
	                     case 1:  //somar
	                          valor1 = lerValor("Digite o primeiro número:");
	                          valor2 = lerValor("Digite o segundo número:");
	                          resultado = calc.somar(valor1, valor2);
	                          mostrarResultado("Somar");
	 
	                     case 2:  //subtrair
	                    	 valor1 = lerValor("Digite o primeiro número:");
	                         valor2 = lerValor("Digite o segundo número:");
	                         resultado = calc.subtrair(valor1, valor2);
	                         mostrarResultado("Subtrair");
	                    
	                     case 3:  //multiplicar
	                    	 valor1 = lerValor("Digite o primeiro número:");
	                         valor2 = lerValor("Digite o segundo número:");
	                         resultado = calc.multiplicar(valor1, valor2);
	                         mostrarResultado("Multiplicar");
	 
	                     case 4:  //dividir
	                    	 valor1 = lerValor("Digite o primeiro número:");
	                         valor2 = lerValor("Digite o segundo número:");
	                         resultado = calc.dividir(valor1, valor2);
	                         mostrarResultado("Dividir");
	 
	               }
	         }
	                    
	   }
	  
	   static double lerValor(String mensagem)
	   {
	         double valor;
	         String strValor;
	         strValor = JOptionPane.showInputDialog(null,
	                     mensagem,"Entrada de Dados...",
	                     JOptionPane.QUESTION_MESSAGE);
	         valor = Double.parseDouble(strValor);
	         return valor;
	   }
	  
	   static void mostrarResultado(String operacao)
	   {
	         JOptionPane.showMessageDialog(null,
	                     String.format("Resultado da Operação de %s:\n"+
	                                "%.2f e %.2f resulta em %.2f",
	                                operacao,valor1,valor2,resultado),
	                                "Resultado",JOptionPane.PLAIN_MESSAGE);

	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuPrincipal();
	}

}
