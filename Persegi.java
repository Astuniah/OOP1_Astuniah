/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungbangundatar;

/**
 *
 * @author Astu
 */
public class Persegi implements HitungBangunDatar {
    private  final double sisi;
    public Persegi (double s){
        sisi = s;
       
}
  public double  getsisi(){
      return sisi;
  }

    @Override
    public double Luas() {
        return (sisi * sisi);
    }

    @Override
    public double Keliling() {
        return (4 * sisi);
    }

    @Override
    public String displayInfo() {
        return ("Persegi" 
               + "\no sisi : " +(float) getsisi()       
               + "\no Luas : " + (float) Luas()
               + "\no keliling : " + (float) Keliling());
    }
    
}
