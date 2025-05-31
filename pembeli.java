public class pembeli {
    String nama;
    pembeli selanjutnya;

    public pembeli (String nama){
        this.nama = nama;
        this.selanjutnya = null;
    }
    public String getNama(){
        return nama;
    }
    @Override
    public String toString(){
        return nama;
    }
}
