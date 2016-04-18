package belajarscanner;

import java.util.Scanner;
public class BelajarScanner {

    public static void main(String[] args) {
    int N,i,Masukan;
    int maks = 5;
    int min = -5;
    int jml =1;
    char pil;
        Scanner inputan=new Scanner(System.in);
        N = inputan.nextInt();
        pil = inputan.next().charAt(0);
        
        if (pil == 'A'){
        for (i=0; i<N; i++){
            Masukan = inputan.nextInt();
            if (Masukan <= min){
                if (Masukan == min){
                    jml++;
                }
                min = Masukan;
                }
        }
        
         
        

    }
    System.out.println("Output : " + min);
    System.out.println("Output : " + jml);
    }
}