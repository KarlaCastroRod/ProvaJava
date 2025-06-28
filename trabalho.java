import java.util.Scanner;

public class trabalho {

public static void main(String[] args) {
 
	 Scanner sc = new Scanner(System.in);
	
       double[] consumo = new double[12];
         String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

         System.out.println("Digite o consumo mensal (kWh):");
        
         for (int i = 0; i < 12; i++) {
             System.out.print(meses[i] + ": ");
             consumo[i] = sc.nextDouble();
        }
         
         double total = soma(consumo);
         double media = total / 12;
         int maior = achaMaior(consumo);
         int menor = achaMenor(consumo);
         String tipo = tipoConsumo(media);
         
         System.out.println("\nRESULTADOS:");
         System.out.printf("Total: %.1f kWh\n", total);
         System.out.printf("Média: %.1f kWh/mês\n", media);
         System.out.println("Maior consumo: " + meses[maior] + " (" + consumo[maior] + " kWh)");
         System.out.println("Menor consumo: " + meses[menor] + " (" + consumo[menor] + " kWh)");
         System.out.println("Classificação: " + tipo);
         
         sc.close();
     }
     
     static double soma(double[] valores) {
         double soma = 0;
         for (double valor: valores) {
             soma += valor;
         }
         return soma;
    }
    
     static int achaMaior(double[] valores) {
         int pos = 0;
         for (int i = 1; i < valores.length; i++) {
             if (valores[i] > valores[pos]) {
                pos = i;
             }
         }
         return pos;
     }
     
    static int achaMenor(double[] valores) {
         int pos = 0;
        for (int i = 1; i < valores.length; i++) {
             if (valores[i] < valores[pos]) {
                 pos = i;
             }
         }
         return pos;
     }
     
     static String tipoConsumo(double media) {
         if (media <= 150) return "Baixo";
        if (media <= 300) return "Médio";
        return "Alto";
    }
        
}
 