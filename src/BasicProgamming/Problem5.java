package BasicProgamming;

public class Problem5 {
    private static boolean palindrome2 (String input) {
        String temp = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            temp = temp + input.charAt(i);
        }
        boolean cek = temp == input;

        if (temp.equals(input)){
            return true;
        }

        return false;

    }

    public static void main(String[] args){
        System.out.println(palindrome2("civic"));
        System.out.println(palindrome2("katak"));
        System.out.println(palindrome2("kasur rusak"));
        System.out.println(palindrome2("kupu-kupu"));
        System.out.println(palindrome2("lion"));
    }
}
