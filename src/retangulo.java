import java.text.DecimalFormat;
public class retangulo {
    DecimalFormat df = new DecimalFormat("0.00");
    private double altura;
    private double largura;
    retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }
    public double getLargura(){
        return largura;
    }
    public double getAltura(){
        return altura;
    }
    public void setLargura(double novaLargura){
        if(novaLargura > 0){
            largura = novaLargura;
        }else{
            System.out.println("Largura não pode ser menor ou igual a 0!!");
        }
    }
    double area(){
        return largura*altura;
    }
    void resultado(){
        System.out.println("A area desse retangulo é de: " + df.format(area()) + " cm²");
    }
    static void main() {
        retangulo a1 = new retangulo(4, 6);
        System.out.println("A Altura é: " + a1.getAltura() + " cm²");
        System.out.println("A largura é: " + a1.getLargura() + " cm²");
        a1.resultado();
        a1.setLargura(5);
        System.out.println("Nova largura: " + a1.getLargura() + " cm²");
        System.out.println("Novo resultado: ");
        a1.resultado();
        System.out.println("---Erro---");
        a1.setLargura(0);
    }
}
