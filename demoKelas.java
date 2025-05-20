public class demoKelas {
    public static void main(String[] args) {
        siswa Rahma = new siswa("Rahma");

        Kelas k = new Kelas(Rahma);

        siswa Riska = new siswa("Riska");
        k.tambahDiBelakang(new siswa ("Riska"));
        k.tambahDiBelakang(new siswa("Amanda"));
        k.tambahDiBelakang(new siswa("Ainun"));
        k.tambahDiBelakang(new siswa("Tiara"));
        k.hapus("Riska");
        k.tampilkansemua(); 

        System.out.println("jumlah siswa: " + k.jumlahsiswa());
        System.out.println("urutan Riska: " + k.urutan("Riska"));
        System.out.println("siswa di index 2: " + k.ambilDi(2).nama);

        k.hapus("Riska");
        System.out.println("setelah hapus Riska:");
        k.tampilkansemua();
    }
}