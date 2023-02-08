//input = Ab5c7de96
//output = ed5c7bA96
package Tcs_Solutions;
import java.util.*;

public class String_and_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String with num");
        String str = sc.next();
        String rev = "";
        for(int i=str.length()-1;i>=0; i--){
            char check = str.charAt(i);
            if(check>='A' && check<='Z' || check>='a' && check<'z'){
                rev = rev+check;
            }
        }

        char res[] = str.toCharArray();
        int j=0;
        for(int i=0; i<res.length; i++){
            if(res[i]>='A' && res[i]<='Z' || res[i]>='a' && res[i]<'z'){
                res[i]=rev.charAt(j);
                j++;
            }
        }

        for(int i=0; i<res.length; i++) {
            System.out.print(res[i]);
        }
    }
}

