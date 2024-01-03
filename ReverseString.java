import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        ReverseString rev = new ReverseString();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Reverse of a string is:"+ rev.reverse(str));
        sc.close();
    }
    static String reverse(String s) {
        String rev = "";
        for (int i = s.length(); i>0; i--) {
            rev=rev+(s.charAt(i-1));
        }
        return rev;
    }
}
