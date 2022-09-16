package ObjectOrientedProgamming;

class Persegi{
    int sisi;

    Persegi(int sisi){
        this.sisi = sisi;
    }

    public int luas(){
        return this.sisi*sisi;
    }

    public int keliling(){
        return this.sisi*4;
    }
}

class Segitiga{
    int alas;
    int tinggi;
    int miring;

    Segitiga(int alas, int tinggi, int miring){
        this.alas = alas;
        this.tinggi = tinggi;
        this.miring = miring;
    }

    public int luas2(){
        return this.alas*tinggi*1/2;
    }

    public int keliling2(){
        return this.alas+tinggi+miring;
    }

}

class PersegiPanjang{
    int panjang;
    int lebar;

    PersegiPanjang(int panjang,int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luas3(){
        return this.panjang*lebar;
    }

    public int keliling3(){
        return this.panjang*2 + lebar*2;
    }

}

public class Problem1 {
    public static void main(String[] args){
        Persegi persegi1 = new Persegi (4);
        System.out.println("Luas Persegi = " + persegi1.luas());
        System.out.println("Keliling Persegi = " + persegi1.keliling());

        Segitiga segitiga1 = new Segitiga(3, 4,5);
        System.out.println("\nLuas Segitiga = " + segitiga1.luas2());
        System.out.println("Keliling Segitiga = " + segitiga1.keliling2());

        PersegiPanjang persegiPanjang1 = new PersegiPanjang(8,7);
        System.out.println("\nLuas Persegi Panjang = " + persegiPanjang1.luas3());
        System.out.println("Keliling Persegi Panjang = " + persegiPanjang1.keliling3());
    }
}

