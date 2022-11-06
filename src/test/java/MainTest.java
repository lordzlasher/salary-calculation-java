import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Tes Total Gaji")
    public void testTotal(){
        Pegawai orang = new Pegawai();
        orang.setGolongan(4);
        orang.setMasakerja(9);
        orang.setKehadiran(15);
        orang.setHasil();
        Assertions.assertEquals(8825000, orang.getTotalgaji());
    }

    @Test
    @DisplayName("Tes Golongan = 1")
    public void testGolongan1(){
        Pegawai orang = new Pegawai();
        orang.setGolongan(1);
        orang.setHasil();
        Assertions.assertEquals(1000000,orang.getGajipokok());
    }

    @Test
    @DisplayName("Tes Golongan = 2")
    public void testGolongan2(){
        Pegawai orang = new Pegawai();
        orang.setGolongan(2);
        orang.setHasil();
        Assertions.assertEquals(1000000,orang.getGajipokok());
    }

    @Test
    @DisplayName("Tes Golongan = 3")
    public void testGolongan3(){
        Pegawai orang = new Pegawai();
        orang.setGolongan(3);
        orang.setHasil();
        Assertions.assertEquals(2000000,orang.getGajipokok());
    }

    @Test
    @DisplayName("Tes Golongan = 4")
    public void testGolongan4(){
        Pegawai orang = new Pegawai();
        orang.setGolongan(4);
        orang.setHasil();
        Assertions.assertEquals(2000000,orang.getGajipokok());
    }

    @Test
    @DisplayName("Tes Tunjangan dengan Masa Kerja < 5 tahun")
    public void testTunjangan(){
        Pegawai orang = new Pegawai();
        orang.setGolongan(1);
        orang.setMasakerja(3);
        orang.setHasil();
        Assertions.assertEquals(0,orang.getTunjangan());
    }

    @Test
    @DisplayName("Tes Tunjangan dengan Golongan = 1")
    public void testTunjangan1(){
        Pegawai orang = new Pegawai();
        orang.setGolongan(1);
        orang.setMasakerja(6);
        orang.setHasil();
        Assertions.assertEquals(3000000,orang.getTunjangan());
    }

    @Test
    @DisplayName("Tes Tunjangan dengan Golongan = 2")
    public void testTunjangan2(){
        Pegawai orang = new Pegawai();
        orang.setGolongan(2);
        orang.setMasakerja(6);
        orang.setHasil();
        Assertions.assertEquals(3000000,orang.getTunjangan());
    }

    @Test
    @DisplayName("Tes Tunjangan dengan Golongan = 3")
    public void testTunjangan3(){
        Pegawai orang = new Pegawai();
        orang.setGolongan(3);
        orang.setMasakerja(6);
        orang.setHasil();
        Assertions.assertEquals(4200000,orang.getTunjangan());
    }

    @Test
    @DisplayName("Tes Tunjangan dengan Golongan = 4")
    public void testTunjangan4(){
        Pegawai orang = new Pegawai();
        orang.setGolongan(4);
        orang.setMasakerja(6);
        orang.setHasil();
        Assertions.assertEquals(4200000,orang.getTunjangan());
    }

    @Test
    @DisplayName("Tes Bonus")
    public void testBonus(){
        Pegawai orang = new Pegawai();
        orang.setKehadiran(1);
        orang.setHasil();
        Assertions.assertEquals(35000,orang.getBonus());
    }

    @Test
    @DisplayName("Tes Bonus")
    public void testBonus1(){
        Pegawai orang = new Pegawai();
        orang.setKehadiran(10);
        orang.setHasil();
        Assertions.assertEquals(350000,orang.getBonus());
    }
}