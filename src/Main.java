import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<NilaiSiswa> daftarSiswa = new ArrayList<>();
        daftarSiswa.add(new NilaiSiswa("Andi"));
        daftarSiswa.add(new NilaiSiswa("Budi"));
        daftarSiswa.add(new NilaiSiswa("Caca"));
        daftarSiswa.add(new NilaiSiswa("Dedi"));

        Iterator<NilaiSiswa> iter = daftarSiswa.iterator();

        while (iter.hasNext()) {
            NilaiSiswa siswa = iter.next();
            siswa.print();

            if (siswa.getNama().equals("Budi")) {
                iter.remove();
                System.out.println(siswa.getNama() + " dihapus dari daftar");
            }
        }

        System.out.println("\nDaftar siswa sisa:");
        for (NilaiSiswa s : daftarSiswa) {
            s.print();
        }
    }
}
