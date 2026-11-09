public class Times {
    private String nomeTime;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int[] jogadores = new int[22];
   public Times(){
       this.nomeTime = nomeTime;
       this.vitorias = 0;
       this.empates = 0;
       this.derrotas = 0;
   }
    public void vitorias(){
       this.vitorias++;
    }
    public void derrotas(){
       this.derrotas++;
    }
    public void Empates(){
       this.empates++;
    }
    public void Pontos(){
        int pontos = (vitorias*3)+(empates);
        System.out.println("Time - " +  + "- pontos: " + pontos);
    }
}
