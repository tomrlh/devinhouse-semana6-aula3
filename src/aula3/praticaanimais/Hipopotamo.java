package aula3.praticaanimais;

public class Hipopotamo implements Mamifero {
    @Override
    public void seAlimentar() {
        System.out.println("comer folhas de bananeira");
    }

    @Override
    public void caminhar() {
        System.out.println("hipopótamo caminhando alegremente");
    }

    public void dormir() {
        System.out.println("hipopótamo dormindo");
    }

    public static void main(String[] args) {
        new Coruja().seAlimentar(); // Animal se alimentando
    }
}
