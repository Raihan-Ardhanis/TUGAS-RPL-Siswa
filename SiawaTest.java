//Driver Class
public class SiawaTest{   
    public static void main(String[] args) {
        //membuat object
        //namaClass namaObject = new
        Siswa nafis = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa anggito = new Siswa();
        Siswa rabbani = new Siswa();
        Siswa dewangga = new Siswa();

        nafis.id = 25;
        nafis.nama = "Nafis Dwi Harits Setiawan";
        nafis.ipk =85.7;

        rasyid.id = 30;
        rasyid.nama = "Rasyid Fitra Purwanto";
        rasyid.ipk = 86.5;

        anggito.id = 4;
        anggito.nama = "Anggito Abimanyu";
        anggito.ipk = 90.2;

        rabbani.id = 23;
        rabbani.nama = "Muhammad Rabbani Aryanta";
        rabbani.ipk = 92.9;

        dewangga.id = 9;
        dewangga.nama = "Dewangga Firmansyah";
        dewangga.ipk = 99.5;

        nafis.print();
        rasyid.print();
        anggito.print();
        rabbani.print();
        dewangga.print();



    }
}
