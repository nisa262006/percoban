public class demoKelas {
    public static void main(String[] args) {
        siswa Rahma = new siswa("Rahma");

        Kelas k = new Kelas(Rahma);

        siswa Riska = new siswa("Riska");
        k.tambahDiBelakang(new siswa ("Riska"));
        k.tambahDiBelakang(new siswa("Amanda"));
        k.tambahDiBelakang(new siswa("Ainun"));
        k.tambahDiBelakang(new siswa("Mutara"));
        k.tampilkansemua(); 
    }
}