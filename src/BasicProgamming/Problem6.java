package BasicProgamming;

public class Problem6 {
    // Mengetahui parameter panjang dan lebar kemudian print *
    // Mengubah print * menjadi x
    // Mengondisikan x y z akan tetapi gagal
    // Mengubah x diubah j dengan ditambah 1
    // Menemukan pola koordinat (123 456 789) dengan rumus ((i * tinggi) + 1 + j)
    // Menggabungkan kondisi x y z
    private static void DrawXYZ(int n) {
        int tinggi;
        tinggi = n;

        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < tinggi; j++) {
                int a = (i * tinggi) + 1;
                int b = (a + j);

                if (b % 3 == 0) {
                    System.out.print(" x ");
                    continue;
                }
                if (b % 2 != 0) {
                    System.out.print(" y ");
                    continue;
                }
                if (b % 2 == 0){
                    System.out.print(" z ");
                    continue;
                }

                //System.out.print( b + " " );
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        DrawXYZ(3);
        System.out.println("============");
        DrawXYZ(5);
    }
}
