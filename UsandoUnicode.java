import java.util.Scanner;

public class UsandoUnicode{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String nome = entrada.nextLine();
        int tamanhoNome = nome.length();
        System.out.println("Tamanho: " + tamanhoNome);
        //Saida
        System.out.print("╔");
        int aux = 0;
        while(aux < tamanhoNome+20){
            System.out.print("═");
            aux++;
        }
        System.out.print("╗ \n");
        System.out.println("║ " + "Nome do Usuário" + " : " + nome + " ║ ");
        System.out.print("╚");
        aux = 0;
        while(aux < tamanhoNome+20){
            System.out.print("═");
            aux++;
        }
        System.out.println("╝");
    }
}