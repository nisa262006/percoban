public class demoKelas {
    public static void main(String[] args) {
        siswa Rahma = new siswa("Rahma");

        Kelas K = new Kelas(Rahma);

        siswa Riska = new siswa("Riska");
        K.tambahDiBelakang(new siswa ("Riska"));
        K.tambahDiBelakang(new siswa("Amanda"));
        K.tambahDiBelakang(new siswa("Ainun"));
        K.tambahDiBelakang(new siswa("Tiara"));
        K.tampilkansemua(); 

        System.out.println("jumlah siswa: " + K.jumlahsiswa());
        System.out.println("urutan Riska: " + K.urutan("Riska"));
        System.out.println("siswa di index 2: " + K.ambilDi(2).nama);

        K.hapus("Riska");
        System.out.println("setelah hapus Riska:");
        K.tampilkansemua();

        K.tambahDiDepan(new siswa ("Azmi"));
        K.tampilkansemua();

        K.tambahSetelah ("Riska", new siswa ("Nisa"));
        K.tampilkansemua();

    }
}