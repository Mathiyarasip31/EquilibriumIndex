import java.util.Scanner;

public class EquilibriumIndex {
    static int Sum(int[] arr, int n) {
        int sum[] = new int[n];
        sum[0]=arr[0];
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }
        for(int i=1;i<sum.length;i++)
        {
            if (sum[i-1]==sum[sum.length-1]-sum[i]) {
                count++;
                if (min > i) {
                    min = i;
                }
            }
        }
        if(count==0)
        {
            return -1;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int val=Sum(arr,n);
        System.out.print("Count: "+val);

    }
}