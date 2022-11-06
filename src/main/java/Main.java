public class Main {
    public static void main(String[] args) {
        Pegawai orang = new Pegawai();

        orang.setGolongan(4);
        orang.setMasakerja(9);
        orang.setKehadiran(15);
        orang.setHasil();

        System.out.println("Gaji pokok  adalah          :" + orang.getGajipokok());
        System.out.println("Tunjangan  adalah           :" + orang.getTunjangan());
        System.out.println("Bonus Kehadiran  adalah     :" + orang.getBonus());
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Gaji total adalah           :" + orang.getTotalgaji());

    }
}
