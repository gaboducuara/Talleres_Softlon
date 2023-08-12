
//Crea un programa que genere una contraseña aleatoria de 8 caracteres
// que contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar
//la clase Math para generar números aleatorios
// y la clase String para manipular la contraseña.
public class Ejercicio18 {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generatePassword(int length) {
        StringBuilder scanner = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            scanner.append(ALPHABET.charAt((int) (Math.random() * ALPHABET.length())));
        }
        return scanner.toString();
    }

    public static void main(String[] args) {
        System.out.println(generatePassword(8));
    }

}
