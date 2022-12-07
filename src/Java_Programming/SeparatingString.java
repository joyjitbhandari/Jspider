package Java_Programming;

public class SeparatingString {
//    public static void main(String[] args) {
//        String input =  "J#a##v##a";
//        char[] arr = input.toCharArray();
//        String str1="",str2 = "";
//        for(int i =0; i<arr.length;i++){
//            if(arr[i]=='#'){
//                str1=str1+arr[i];
//            }else{
//                str2 = str2+arr[i];
//            }
//        }
//        System.out.println(str1+str2);
//    }
    public static void main(String[] args) {
        String input =  "J#a##v##a";
        String str1="",str2 = "";
        for(int i =0; i<input.length();i++){
            if(input.charAt(i)=='#'){
                str1=str1+input.charAt(i);
            }else{
                str2=str2+input.charAt(i);
            }
        }
        System.out.println(str1+str2);
    }
}
