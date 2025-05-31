public class pembeli {
    String nama;
    pembeli next;

    public pembeli (String nama){
        this.nama = nama;
        this.next = null;
    }
    public String getNama(){
        return nama;
    }
    @Override
    public String toString(){
        return nama;
    }
}
