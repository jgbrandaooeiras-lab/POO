import java.text.DecimalFormat;
public class produto {
    DecimalFormat df = new DecimalFormat("0.00");
    String nome;
    double preco;
    produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    void exibirInfo(){
        System.out.println("Produto: " + this.nome + " R$" + df.format(this.preco));
    }
    void adicionarDesconto(double percentual){
        double desconto = this.preco*(percentual/100);
        this.preco = this.preco - desconto;
        System.out.println("Preço atual com desconto do " + this.nome + " é: " + df.format(this.preco));
    }
    public static void main(String[] args){
        produto arroz = new produto("Arroz", 7.00);
        arroz.exibirInfo();
        arroz.adicionarDesconto(10);
        arroz.exibirInfo();
        produto feijao = new produto("Feijão", 7.50);
        feijao.exibirInfo();
        feijao.adicionarDesconto(15);
        feijao.exibirInfo();
    }
}