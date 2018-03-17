/**
 * PHANTOMHUNTER
 **/
public class SortNumb {
    public static void SortNumb(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= tmp;
                }
            }
        }
        System.out.println("Сортированный массив");
        for (int x:arr) {
            System.out.print(x + " ");
        }
    }
}
