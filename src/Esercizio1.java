import java.sql.Array;
import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {

        //----------------------------1---------------------

        int num1 = 5;
        int num2 = 2;
        int prodotto = moltiplica(num1, num2);
        System.out.println("Esercizio1: Il prodotto di " + num1 + " e " + num2 + " è: " + prodotto);

        //----------------------------1---------------------

        String stringa = "ciao";
        int x = 10;
        String risultato = concatena(stringa, x);
        System.out.println("Esercizio1: Il risultato tra "+ stringa + " e " + x + "è: " + risultato);

        //----------------------------1---------------------

        String[] arrayDiStringhe = {"a","b","c","d","e"};
        String lettera = "f";
        String[] nuovoArray = inserisciInArray(arrayDiStringhe, lettera);
        System.out.println(Arrays.toString(nuovoArray));


    }

    public static int moltiplica(int num1, int num2) {
        return num1 * num2;
    }

    public static  String concatena(String stringa, int x){
        return stringa + x;
    }

    public static String[] inserisciInArray(String[] arrayDiStringhe, String lettera) {
        String[] nuovoArray = new String[6];
        System.arraycopy(arrayDiStringhe, 0, nuovoArray, 0, 3);

        nuovoArray[3] = lettera;

        System.arraycopy(arrayDiStringhe, 3, nuovoArray, 4, 2);

        return nuovoArray;
    }
}
