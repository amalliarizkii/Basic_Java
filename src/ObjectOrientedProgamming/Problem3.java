package ObjectOrientedProgamming;

class Kalkulator{
    int a;
    int b;

    Kalkulator(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int penjumlahan(){
        return this.a+b;
    }

    public int pengurangan(){
        return this.a-b;
    }

    public int perkalian(){
        return this.a*b;
    }

    public int pembagian(){
        return this.a/b;
    }
}

public class Problem3 {
    public static void main(String[] args){
        Kalkulator operasi1 = new Kalkulator(3,4);
        System.out.println("Penjumlahan = " + operasi1.penjumlahan());

        Kalkulator operasi2 = new Kalkulator(15,4);
        System.out.println("\nPengurangan = " + operasi2.pengurangan());

        Kalkulator operasi3 = new Kalkulator(10,10);
        System.out.println("\nPerkalian = " + operasi3.perkalian());

        Kalkulator operasi4 = new Kalkulator(12,3);
        System.out.println("\nPembagian = " + operasi4.pembagian());

    }
}
