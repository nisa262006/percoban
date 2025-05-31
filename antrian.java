public class antrian{
    pembeli pertama;
    pembeli terakhir;


    public antrian(){
        this.pertama = null;
        this.terakhir = null;
    }

    public void tambahPengantri (pembeli p){
        if (habiskah()){
            pertama = p;
            terakhir = p;
        }else{
            terakhir.selanjutnya = p;
            terakhir =p;
        }
        System.out.println(p.getNama()+ "di tambahkan");
    }

    public pembeli layani(){
        if (habiskah()){
            System.out.println("antrian kosong, tidak ada pembeli");
            return null;
        }
        pembeli pembeliDilayani = pertama;
        pertama = pertama.selanjutnya;

        if (pertama == null){
            terakhir = null;
        }
        System.out.println( pembeliDilayani.getNama()+ "telah di layani");
        return pembeliDilayani;
    }

    public pembeli terdepan(){
        return null;
    }

    public Boolean habiskah(){
        return false;
    }

}