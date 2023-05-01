package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        double[] idades = new double[n];
        double[] alturas = new double[n];

        for(int i=0; i<n; i++){
            System.out.printf("%nDados da %da pessoa: %n",(i+1));
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextDouble();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double somaAlt = 0;
        double menores = 0;

        for (int i = 0; i < n; i++) {
            somaAlt += alturas[i];

            if (idades[i] < 16) {
                menores++;
            }
        }

        System.out.printf("%nAltura média: %.2f%n",(somaAlt/n));
        System.out.print("Pessoas com menos de 16 anos: " + String.format("%.1f",((menores/n)*100)) + "%");
        System.out.println();

        for (int i = 0; i < n; i++) {
            if(idades[i]<16){
                System.out.println(nomes[i]);
            }
        }

        System.out.println();

            sc.close();
    }

}
