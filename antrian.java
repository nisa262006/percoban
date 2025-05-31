public class antrian{
    pembeli depan;
    pembeli terakhir;


    public antrian(){
        this.depan = null;
        this.terakhir = null;
    }

    public void tambahPengantri (pembeli p){
        if (habiskah()){
            depan = p;
            terakhir = p;
        }else{
            terakhir.next = p;
            terakhir =p;
        }
        System.out.println(p.getNama()+ "di tambahkan");
    }

    public pembeli layani(){
        if (habiskah()){
            System.out.println("antrian kosong, tidak ada pembeli");
            return null;
        }
        pembeli pembeliDilayani = depan;
        depan = depan.next;

        if (depan == null){
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