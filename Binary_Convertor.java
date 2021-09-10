import java.util.Scanner;



public class Binary_Convertor {

        public static String toBinary (int num){
            String binary="";
        while(num > 0) {
            binary = (num%2)+binary;
            num /= 2;
            }
            return binary;
        }
    
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER ");
        int x = sc.nextInt();
        System.out.print(toBinary(x));
    }

}
