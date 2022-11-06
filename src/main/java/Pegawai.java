public class Pegawai {
    private int golongan;
    private int masakerja;
    private int kehadiran;
    private int gajipokok;
    private int tunjangan;
    private int bonus;
    private int totalgaji;

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public int getMasakerja() {
        return masakerja;
    }

    public void setMasakerja(int masakerja) {
        this.masakerja = masakerja;
    }

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok() {
        if(golongan == 1 || golongan == 2) {
            this.gajipokok = 1000000;
        }else if(golongan == 3 || golongan == 4){
            this.gajipokok = 2000000;
        }
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan() {
        if(masakerja < 5){
            this.tunjangan = 0;
        }else{
            if(golongan == 1 || golongan == 2){
                this.tunjangan = masakerja * 500000;
            }else if(golongan == 3 || golongan == 4){
                this.tunjangan = masakerja * 700000;
            }
        }
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus() {
        this.bonus = kehadiran * 35000;
    }

    public int getTotalgaji() {
        return totalgaji;
    }

    public void setTotalgaji() {
        this.totalgaji = gajipokok + tunjangan + bonus;
    }

    public void setHasil(){
        setGajipokok();
        setTunjangan();
        setBonus();
        setTotalgaji();
    }
}
