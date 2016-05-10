package astuniah_hitungantahun;

public class tahun {
  int thn, bln, mg, hr, jam, mnt;

    public tahun() {
    } 

    tahun(int thn, int bln, int mg, int hr, int jam, int mnt) {
        this.thn = thn;
        this.bln = bln;
        this.mg = mg;
        this.hr = hr;
        this.jam = jam;
    }

    public int getThn() {
        return thn;
    }

    public void setThn(int thn) {
        this.thn = thn;
    }

    public int getBln() {
        return bln;
    }

    public void setBln(int bln) {
        this.bln = bln;
    }

    public int getMg() {
        return mg;
    }

    public void setMg(int mg) {
        this.mg = mg;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getMnt() {
        return mnt;
    }

    public void setMnt(int mnt) {
        this.mnt = mnt;
    }

  

       
    int converttahunTobualan(int tahun){
        int bulan;
        bulan = tahun * 12;
        return bulan;
        
    }
    int converttahunTominggu(int tahun){
        int minggu;
        minggu = tahun * 48;
        return minggu;
    }
    int converttahunTohari(int tahun){
        int hari;
        hari = tahun * 360;
        return hari;
    }
    
    int converttahunTojam(int tahun){
        int jam;
        jam = tahun * 8640;
        return jam;
    }
    int converttahunTomenit(int tahun){
        int menit;
        menit = tahun * 518400;
        return menit;
    }

    
}
