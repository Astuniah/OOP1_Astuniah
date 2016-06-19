package arrai1dimensipembuatansoalpg;
import java.util.Scanner;
public class Arrai1dimensipembuatansoalPG {

    public static void main(String[] args) {
        
        System.out.println("               KERJAKAN SOAL-SOAL DIBAWAH INI DENGAN BENAR");
        System.out.println("                              SOAL BIOLOGI");
        
        String hasil, JwBn = "Jawaban Anda Benar", JwSl = "Jawaban Anda Salah";
        int Benar = 1, Salah = 1, totbenar, totsalah, bnr1 = 0, bnr2 = 0, bnr3 = 0, bnr4 = 0, bnr5 = 0;
        int Slh1 =0, Slh2 = 0, Slh3 = 0, Slh4 = 0, Slh5 = 0;
        
        String[] b = new String[6];
        
         b[0] = "Dibawah ini, pernyataan yang benar mengenai sel adalah ….";
        b[1] = "sel adalah makhluk hidup";
        b[2] = "sel tidak dimiliki tumbuhan";
        b[3] = "sel merupakan bagian terkecil dari makhluk hidup maupun tak hidup";
        b[4] = "sel adalah unit terkecil dari makhluk hidup";
        b[5] = "semua jawaban salah";
        System.out.println("1. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a1 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "a":
                System.out.println(JwBn);
                bnr1 = Benar;
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "b":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "c":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "d":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "e":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1);              
                break;

        }
        System.out.println("");
        b[0] = "Urutan tingkatan organisasi kehidupan dibawah ini yang benar adalah ….";
        b[1] = "sel – jaringan – organ – sistem organ – organisme";
        b[2] = "organisme – sel – jaringan – sistem organ – organ";
        b[3] = "organ – sistem organ – organisme – sel jaringan";
        b[4] = "jaringan – sel – organ – sistem organ – organisme";
        b[5] = "sistem organ - organisme-sel jaringan-organ- sel";
        System.out.println("2. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a2 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr2 = Benar;
                 totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh2 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh2 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh2 = Salah;
                System.out.println("kunci jawaban = b");
                 totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh2 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Ilmuan yang menemukan istilah sel karena menemukan ruang-ruang kosong pada sayatan gabus Quercus suber adalah . . . .";
        b[1] = "Schleiden";
        b[2] = "Max Schultze";
        b[3] = "Hugo Von Mohl";
        b[4] = "Thomas";
        b[5] = "Robert Hooke";
        System.out.println("3. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a3 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr3 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = c");
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = c");
                totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Bagian sel yang dimiliki oleh sel tumbuhan dan sel hewan adalah...";
        b[1] = "plastida";
        b[2] = "kloroplas";
        b[3] = "membran sel";
        b[4] = "dinding sel";
        b[5] = "Semua jawaban benar";
        System.out.println("4. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a4 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "d":
                System.out.println(JwBn);
                bnr4 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = d");
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = d");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "Jaringan yang berfungsi sebagai pelindung jaringan yang ada dibawahnya dari kerusakan mekanis dan kekeringan adalah...";
        b[1] = "jaringan meristem";
        b[2] = "jaringan epidermis";
        b[3] = "jaringan penguat";
        b[4] = "jaringan parenkim";
        b[5] = "Semua jawaban benar";
        System.out.println("5. " + b[0]);
        System.out.println("a. " + b[1]);
        System.out.println("b. " + b[2]);
        System.out.println("c. " + b[3]);
        System.out.println("d. " + b[4]);
        System.out.println("e. " + b[5]);
        Scanner a5 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "e":
                System.out.println(JwBn);
                bnr5 = Benar;
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );         
                break;
            case "d":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = e");
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
    }
        System.out.println("\n");
        System.out.println("Hasil Akhir");
        totbenar = bnr1+bnr2+bnr3+bnr4+bnr5;
        System.out.println("Jawaban yang benar adalah : " + totbenar);
        totsalah = Slh1+Slh2+Slh3+Slh4+Slh5;
        System.out.println("Jawaban yang salah adalah : " + totsalah);
        System.out.println("Total nilai adalah : " + (totbenar *2));
        String nG;
        
         if (totbenar *2 >= 10){
           nG = "A";
       } else if (totbenar * 2>= 8){
           nG = "B";
       } else if (totbenar * 2>= 6){
           nG = "C";
       } else if (totbenar * 2>= 4){
           nG = "D";
       } else if (totbenar * 2>= 2){
           nG = "E";
       } else {
           nG = "input salah";
       } 
       if (nG == "input salah"){
           System.out.println(nG);
       } else {
           System.out.println("Nilai huruf :" + nG);
       }
    
    }}
