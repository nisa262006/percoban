public class demoKelas {
    public static void main(String[] args) {
        siswa Rahma = new siswa("Rahma");

        Kelas k = new Kelas(Rahma);

        siswa endi = new siswa("Endi");
        k.tambahDiBelakang(new siswa ("Rahma"));
        k.tambahDiBelakang(new siswa("Amanda"));
        k.tambahDiBelakang(new siswa("Ainun"));
        k.tambahDiBelakang(new siswa("Mutara"));
        k.tampilkansemua(); 
    }
}