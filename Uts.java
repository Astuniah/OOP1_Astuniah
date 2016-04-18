package uts;
import java.util.Scanner;
public class Uts {

    public static double rata;
    public static double ip;
    public static int jumlahLulus = 0 ;
    public static int jumlahTidakLulus = 0;
    public static int jumlahData;
    double[] nilai = new double [100];
    
    public void JumlahRata(){
      
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah IPK: ");
        double jml = input.nextDouble();
        
        double sum = 0;
        for (int y = 1; y <= jml; y++) {
            
            
                System.out.println("Hasil Nilai IPK " + y + ": " );
                nilai[y] = input.nextDouble();
                
                sum += nilai[y];
                
            }
        
        rata = sum / jml;
        int jmls = (int) (jml);
        
        System.out.println("Total Hasil nilai: " + " " + sum);
        System.out.println("IP:" + rata);
        
        if (rata >= 2.75 && rata <= 4.00)
            System.out.println("Lulus");
        else    
            System.out.println("Tidak Ada Data");
               
    }
    
    public void TotalNilai() {
        for (int y = 1; y <=rata; y++) {
            if (rata >= 2.75 && rata <= 4.00) {
                jumlahLulus = jumlahLulus + 1;
                               
            } else {
                jumlahTidakLulus = jumlahTidakLulus + 1;
                               
            }
        }
            
        }
   public void Panggil (){
       System.out.println("Jumlah IPK Yang Lulus : " + jumlahLulus );
       System.out.println("Jumlah IPK Yang Tidak Lulus : " + jumlahTidakLulus );
   }
   
    public static void main(String[] args) {

      Uts proses = new Uts();
      proses.JumlahRata();
      proses.TotalNilai();
      proses.Panggil();
    }
    
}
