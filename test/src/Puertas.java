public class Puertas {
    public static void main(String[] args) throws Exception {
        Coche miCoche = new Coche();
        miCoche.añadirPuerta();
        System.out.println(miCoche.puertas);

    }
}

class Coche {
    public int puertas = 0;

    public void añadirPuerta() {
        puertas++;
    }
}