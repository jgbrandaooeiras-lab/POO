import java.util.Scanner;
public class Jogador {
    private static final Scanner j = new Scanner(System.in);
    private String nomeJogador;
    private int numeroCamisa;
    private int gols;
    private int assistencias;
    private String posicao;
    public void cadastrar(){
        IO.println("realize seu cadastro...");
        System.out.println("Nome: ");
        this.nomeJogador = j.nextLine();
        System.out.println("Posição: ");
        this.posicao = j.nextLine();
        System.out.println("Número da camisa: ");
        this.numeroCamisa = j.nextInt();
        j.nextLine();
        System.out.println("Jogador - " + nomeJogador + " - posição: " + posicao + " - camisa: " + numeroCamisa);
    }
    public void participacoes(){
        System.out.println("Gols: ");
        gols = j.nextInt();
        System.out.println("O jogador " + nomeJogador + " balançou as redes um total de: " + gols + " gols");
        System.out.println("Assistências: ");
        assistencias = j.nextInt();
        System.out.println("O jogador " + nomeJogador + " deu: " + assistencias + " assistências");
        int total = gols + assistencias;
        System.out.println("Participações totais: " + total);
    }
}
