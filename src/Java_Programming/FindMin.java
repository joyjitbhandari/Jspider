package Java_Programming;
public class FindMin {
    public static void main(String[] args) {
        int[] array = {4,5,3,1,2};
        int min = array[0];
        for(int i=1; i<=array.length-1 ; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println(min+" is minimum");
    }
}
