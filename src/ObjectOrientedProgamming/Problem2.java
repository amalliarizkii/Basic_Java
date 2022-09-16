package ObjectOrientedProgamming;

class Kubus{
    int sisi;

    Kubus (int sisi){
        this.sisi = sisi;
    }

    public int volume(){
        return this.sisi*sisi*sisi;
    }
}

class Balok{
    int panjang;
    int lebar;
    int tinggi;

    Balok (int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int volume2(){
        return this.panjang*lebar*tinggi;
    }
}

class Tabung{
    int jari2;
    int tinggi;

    Tabung (int jari2, int tinggi){
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }

    public int volume3(){
        return this.jari2*jari2*tinggi*22/7;
    }
}

public class Problem2 {
    public static void main(String[] args){
        Kubus kubus1 = new Kubus (10);
        System.out.println("Volume Kubus = " + kubus1.volume());

        Balok balok1 = new Balok(3,6,10);
        System.out.println("\nVolume Balok = " + balok1.volume2());

        Tabung tabung1 = new Tabung(7,10);
        System.out.println("\nVolume Tabung = " + tabung1.volume3());

    }
}

