public class Main {
    public static void main(String[] args ){
        // Membuat Object
        Person anton = new Person();
        Person riko = new Person();

        // Memanggil Anton
        anton.setNama("Anton");
        anton.setJenisKelamin("Laki-laki");
        anton.setUmur(25);
        System.out.println("Nama: " + anton.getNama());
        System.out.println("Jenis Kelamin: " + anton.getJenisKelamin());
        System.out.println("Umur: " + anton.getUmur());
        System.out.println();

        // Memanggil Riko
        riko.setNama("Riko");
        riko.setJenisKelamin("Laki-laki");
        riko.setUmur(28);
        System.out.println("Nama: " + riko.getNama());
        System.out.println("Jenis Kelamin: " + riko.getJenisKelamin());
        System.out.println("Umur: " + riko.getUmur());
    }

}
