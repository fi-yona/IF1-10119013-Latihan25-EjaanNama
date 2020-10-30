/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan25.ejaannama;

/**
 *
 * @author Fiona Avila
 */
import java.util.Scanner;


public class EjaanNama {
    
    static Scanner scan = new Scanner(System.in);
    
    String namaDepan;
    
    public void inputNamaDepan(){
        System.out.print("Masukkan nama depan anda untuk dieja : ");
        namaDepan = scan.next();
    }
    
    public void tampilEjaan(){
        System.out.println("Ejaan untuk " + namaDepan + "adalah : ");
        int i = 1;
        for (char ejaan : namaDepan.toCharArray()){
            System.out.println("Hurus ke-" + (i++) + "\t: " + ejaan);
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("------------------------------");
        
        EjaanNama nama = new EjaanNama();
        
        nama.inputNamaDepan();
        System.out.println();
        
        nama.tampilEjaan();
        
        System.out.println("------------------------------");
    }
    
}
