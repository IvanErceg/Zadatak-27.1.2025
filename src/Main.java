//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int broj1=0;

    public static void main(String[] args) {


        //ZADATAK 1
        System.out.println("ZADATAK 1 ");
        Scanner scann=new Scanner(System.in);
        System.out.println("Unesi broj:");
        int broj=scann.nextInt();

        // int broj = 351;
        int start = 0;
        int zbroj=0;

        String string = String.valueOf(broj);

        while(start<string.length()){
            int charInt;
            char slovo=string.charAt(start);
            start++;
            charInt = Character.getNumericValue(slovo);
            zbroj+=charInt;
        }
        System.out.printf("zbroj je:%d%n%n ",zbroj);


        //ZADATAK 2
        System.out.println("ZADATAK 2 ");

        int i=1;
        int suma=0;

        do {

            i++;
            if(i%7==0){
                broj1++;
                suma+=i;
                //System.out.println(broj1+".suma: "+suma);
            }

        } while (i <= 1000);
        System.out.println("suma je: "+suma);


    }
}