
public class TesteFuncao01 {
    public static void main(String[] args) {
            Caneta c1 = new Caneta();
            c1.cor = "Azul";
            c1.ponta = 0.5f;
            c1.carga = 90;
            c1.modelo = "Bic Cristal";
            c1.destampar();
            c1.status();
            c1.rabiscar();
        System.out.println("--------------------");
            Caneta c2 = new Caneta();
            c2.cor = "Preta";
            c2.ponta = 1f;
            c2.modelo = "Hostnet";
            c2.carga = 50;
            c2.tampar();
            c2.status();
            c2.rabiscar();
        System.out.println("--------------------");
        Lampada l1 = new Lampada();
        l1.preço = 30;
        l1.Fluorescentes = 5;
        l1.status();
        l1.setDisponível();
        }
    }

