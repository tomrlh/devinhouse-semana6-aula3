package aula3.praticaanimais;

public class Leao implements Mamifero {

    @Override
    public void seAlimentar() {
        System.out.println("comendo a zebrinha");
    }

    @Override
    public void caminhar() {
        System.out.println("leão passeando na selva");
    }

    public void cacar() {
        System.out.println("caçar zebra");
    }

    public void brincar() {
        System.out.printf("brincando com os filhotinhos");
    }
}
