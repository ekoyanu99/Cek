package cobaexception;
import java.util.Scanner;
/**
 *
 * @author FILFIMO YULFIZ AHSANUL HULQI
 * 19102143
 * IF 07 N
 */

public class CobaException {
    public static void main(String[] args) {
        //Deklarasii fields array
        int[] array = {1,3,5,7,9};
        
        Scanner Input = new Scanner(System.in);
        System.out.println("Nilai array ke : ");
        int index = Input.nextInt();
        
        //Exeption (Try-Catch)
        try{
            System.out.printf("Index ke-%d, adalah %d\n", index, array[index]);
        } catch(Exception a){
            System.out.println("Error : Index yang diinputkan tidak sesuai "
                    + "dengan panjang sejumlah array");
        }
   }
    
}
