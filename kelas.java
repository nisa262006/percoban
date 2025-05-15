public class Kelas {
    siswa pertama;

    public Kelas(siswa x) {
        pertama= x;
    }

    public siswa ambilDi(Integer index){
        return null;
    }

    public Integer urutan(String nama){
        return null;
    }

    public Integer jumlahsiswa(){
        return null;
    }

    public void tambahSetelah(String nama, siswa s){

    }

    public void hapus(String nama){

    }

    public void tambahDiBelakang(siswa s){
        siswa terakhir = cariTerakhir();
        terakhir.berikutnya = s;
    }
    
    public void tampilkansemua() {
        Integer urutan = 0;
        System.out.println("sekarang urutan ke :"+urutan);

        siswa sekarang = pertama; //Rahma
        System.out.println("siswa sekarang :"+sekarang.nama);

        while(sekarang.berikutnya != null) {
            urutan++;
            System.out.println("sekarang urutan :"+urutan);
            // pindah ke recodr berikutnya
            sekarang = sekarang.berikutnya;
            System.out.println("siswa sekarang :"+sekarang.nama);

        }

    }
    private siswa cariTerakhir(){
        siswa sekarang = pertama;
        while(sekarang.berikutnya != null){
            sekarang = sekarang.berikutnya;
        }
        return sekarang;
    }

}
