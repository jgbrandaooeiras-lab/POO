public class pet {
    private int fome;
    public pet(int fomeInicial) {
        this.fome = Math.max(0, Math.min(100, fomeInicial));
    }
    public void alimentar() {
        this.fome = Math.max(0, this.fome - 10);
        System.out.println("O seu pet foi alimentado!! Fome atual: " + this.fome);
    }
    public int getFome() {
        return this.fome;
    }
    public static void main(String[] args) {
        // Instanciando o pet com fome baixa
        pet meuPet = new pet(5);
        System.out.println("Fome inicial: " + meuPet.getFome());
        meuPet.alimentar();
    }
}