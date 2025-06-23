package provaPratica;

import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {
        String[] cidades = {"Blumenau", "Indaial", "Penha", "Rondonópolis"};
        String[] diasSemana = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira",
                               "Quinta-Feira", "Sexta-Feira", "Sábado", "Domingo"};

        double[][] temp = new double[cidades.length][diasSemana.length];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < cidades.length; i++) {
            for (int j = 0; j < diasSemana.length; j++) {
                System.out.printf("Digite a temperatura em %s na %s: ", 
                                  cidades[i], diasSemana[j]);
                temp[i][j] = sc.nextDouble();
            }
        }
        sc.close();


        System.out.println("\nMédias das temperaturas por cidade durante a semana:");
        for (int i = 0; i < cidades.length; i++) {
            double soma = 0;
            for (int j = 0; j < diasSemana.length; j++) {
                soma += temp[i][j];
            }
            double media = soma / diasSemana.length;
            System.out.printf("%s: %.2f°C%n", cidades[i], media);
        }

        
        System.out.println("\nCidades com temperaturas abaixo de 15°C");
        for (int i = 0; i < cidades.length; i++) {
            boolean abaixoDe15 = false;
            for (int j = 0; j < diasSemana.length; j++) {
                if (temp[i][j] < 15) {
                    abaixoDe15 = true;
                    break;
                }
            }
            if (abaixoDe15) {
                System.out.println(cidades[i]);
            }
        }

   
        double maiorTemp = temp[0][0];
        String cidadeMaiorTemp = cidades[0];
        for (int i = 0; i < cidades.length; i++) {
            for (int j = 0; j < diasSemana.length; j++) {
                if (temp[i][j] > maiorTemp) {
                    maiorTemp = temp[i][j];
                    cidadeMaiorTemp = cidades[i];
                }
            }
        }
        System.out.printf("\nCidade com a maior temperatura: %s (%.1f°C)%n", cidadeMaiorTemp, maiorTemp);

        
        double menorTemp = temp[0][0];
        String cidadeMenorTemp = cidades[0];
        for (int i = 0; i < cidades.length; i++) {
            for (int j = 0; j < diasSemana.length; j++) {
                if (temp[i][j] < menorTemp) {
                    menorTemp = temp[i][j];
                    cidadeMenorTemp = cidades[i];
                }
            }
        }
        System.out.printf("Cidade com a menor temperatura: %s (%.1f°C)%n", cidadeMenorTemp, menorTemp);
    }
}