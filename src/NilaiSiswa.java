public class NilaiSiswa {
    String nama;

    public NilaiSiswa(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void print() {
        System.out.println("Nama siswa: " + nama);
    }
}
