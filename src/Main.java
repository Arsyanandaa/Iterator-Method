import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<NilaiSiswa> daftarSiswa = new ArrayList<>();

        // Tambah data siswa
        daftarSiswa.add(new NilaiSiswa("Andi", 80));
        daftarSiswa.add(new NilaiSiswa("Budi", 85));
        daftarSiswa.add(new NilaiSiswa("Citra", 90));

        // Iterasi pake Iterator
        Iterator<NilaiSiswa> iterator = daftarSiswa.iterator();

        System.out.println("=== Daftar Nilai Siswa ===");
        while (iterator.hasNext()) {
            NilaiSiswa siswa = iterator.next();
            siswa.tampil();
        }
    }
}
