package astuniah_hitungantahun;

public class Astuniah_Hitungantahun {

    public static void main(String[] args) {
        tahun bulan = new tahun();
        tahun bulan1 = new tahun(1, 12, 48, 360, 8640, 518400);

        System.out.println("HITUNGAN DALAM 1 TAHUN");
        System.out.println("1 tahun = " + bulan.converttahunTobualan(1) + " bulan");
        System.out.println("1 tahun = " + bulan.converttahunTominggu(1) + " minggu");
        System.out.println("1 tahun = " + bulan.converttahunTohari(1) + " hari");
        System.out.println("1 tahun = " + bulan.converttahunTojam(1) + " jam");
        System.out.println("1 tahun = " + bulan.converttahunTomenit(1) + " menit");

    }

}
