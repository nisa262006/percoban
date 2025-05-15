public class kelas {
    siswa pertama;

    public class(siswa x){
        pertama = x;
    }

    public void tambahDiBelakang(siswa s){
        siswa terakhir = cariTerakhr();
        terakhir.berikutnya = s;
    }
    public void tampilkanSemua(){
        siswa terakhir = cariTerakhir();
        terakhir.berikutnya = s;
    }
    
    public void tampilkanSemua(){
        integer urutan = 0;
        system.out.println("sekarang urutan ke :" +urutan);

        siswa sekarang = prtama; //Rahma
        system.out.println("siswa sekarang :" +sekarang.nama);

        while(sekarang.berikutanya != null) {
            urutaan++;
            System.out.println("sekarang urutan ke :" +urutan);

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