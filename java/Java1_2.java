import java.util.Scanner;

public class Java1_2 {
    public String change(String str){
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i)))
                temp = temp + Character.toUpperCase(str.charAt(i));
            else
                temp = temp + Character.toLowerCase(str.charAt(i));
        }
        return temp;
    }
    public static void main(String[] args) {
        Java1_2 java2_2 = new Java1_2();
        Scanner in=new Scanner(System.in);
        String str = in.next();

        System.out.println(java2_2.change(str));
    }
}
