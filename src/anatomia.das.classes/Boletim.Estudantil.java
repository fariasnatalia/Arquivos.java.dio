
public class BoletimEstudantil {

    /**
     * @param aStrings
     */
    public static void main(String[] aStrings) {
        int mediaFinal = 5;
        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova Minerva");
        else
            System.out.println("Aprovado");

    }

}