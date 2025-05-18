public class NilaiSiswa {
    public String nama;
    public int nilai;

    public NilaiSiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public void tampil() {
        System.out.println("Nama: " + nama + ", Nilai: " + nilai);
    }
}
