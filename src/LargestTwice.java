import java.util.Scanner;
public class LargestTwice {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                }
                int maxi = Integer.MIN_VALUE;
                int idx = -1;
                for(int i=0;i<n;i++){
                        if(arr[i]>maxi){
                                maxi=arr[i];
                                idx=i;
                        }
                }
                for(int i=0;i<n;i++){
                        if(maxi<arr[2]*i){
                                idx=-1;
                                break;
                        }
                }
                System.out.println(idx);
        }
    
}
