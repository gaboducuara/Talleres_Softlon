public class Main {
    public static void main(String[] args) {
        Instrumento[] instrumentos = new Instrumento[3];
        instrumentos[0] = new Guitarra();
        instrumentos[1] = new Piano();
        instrumentos[2] = new Violin();

        tocar(instrumentos);
    }
    private static void tocar(Instrumento[] instrumentos) {
        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}