class koperasi {
    String npm,nama, tanggal;
    int pinjam ;
    
    koperasi(String npm,String nama,String tanggal) {
        this.npm=npm;
        this.nama=nama;
        this.tanggal=tanggal;
    }
    koperasi(int pinjam) {
        this.pinjam=pinjam;
    }
    
    
    void tampil1 () {
        System.out.println("NPM Mhs : "+this.npm);
        System.out.println("Nama Mhs : "+this.nama);
          System.out.println("Tanggal : "+this.tanggal);
    }void tampil2 () {
        System.out.println("Pinjaman : "+this.pinjam);
     
    }
}

public class Nilai{
    public static void main(String[]args){
        koperasi mahasiswa=new koperasi("584","Fajar","19-10-2022");
        koperasi mahasiswa2=new koperasi(2000);
        mahasiswa.tampil1();
        mahasiswa2.tampil2();
    }
 }