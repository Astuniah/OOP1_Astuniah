
package pratikumoop.java;


public class PratikumOopJava {
    
    public static void main(String[] args) {
       PratikumOopJava Membuat = new PratikumOopJava();
       Membuat.perkalian(2, 10);
       Membuat.pembagian(10, 2);
       
       
    }
    private void perkalian (int a, int b){
            int hasil;
            hasil = a * b;
            System.out.println(hasil);}
    private void pembagian (int a, int b){
            int hasil;
            hasil = a / b;
            System.out.println(hasil);}
}
