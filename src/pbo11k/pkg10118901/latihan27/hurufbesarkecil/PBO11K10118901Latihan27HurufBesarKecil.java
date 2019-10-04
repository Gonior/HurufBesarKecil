package pbo11k.pkg10118901.latihan27.hurufbesarkecil;
import java.util.*;
/**
 *
 * @author ACER
 * Nama     : Dedi cahya
 * Kelas    : IF 11-K
 * Nim      : 10118901
 * Tentang Program : Program ini berisi program untuk mengganti kalimat ke ukuran besar dan kecil
 */
public class PBO11K10118901Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan Kalimat : ");
        Scanner input = new Scanner(System.in);
        
        String str = input.nextLine(); 
        String strU = str.toUpperCase();
        String strL = str.toLowerCase();
        
        System.out.println("====== Hasil Formating ======");
        System.out.println("Hasil Huruf Besar : " + strU);
        System.out.println("Hasil Huruf Kecil : " + strL);
    }
    
}