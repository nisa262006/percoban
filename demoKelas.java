public class demoKelas {
    public static void main(String[] args) {
        siswa Nisa = new siswa("Rahma");

        Kelas K = new Kelas(Nisa);

        siswa Riska = new siswa("Riska");
        K.tambahDiBelakang(new siswa ("Riska"));
        K.tambahDiBelakang(new siswa("Amanda"));
        K.tambahDiBelakang(new siswa("Ainun"));
        K.tambahDiBelakang(new siswa("Tiara"));
        K.tampilkansemua(); 

        System.out.println("jumlah siswa: " + K.jumlahsiswa());
        System.out.println("urutan Riska: " + K.urutan("Riska"));
        System.out.println("siswa di index 2: " + K.ambilDi(2).nama);

        System.out.println("=====================");
        K.hapus("Amanda");
        System.out.println("setelah hapus Amanda:");
        K.tampilkansemua();

        System.out.println("=====================");
        K.tambahDiDepan(new siswa ("Azmi"));
        K.tampilkansemua();

        System.out.println("=====================");
        K.tambahSetelah ("Riska", new siswa ("Nisa"));
        K.tampilkansemua();

    }
}