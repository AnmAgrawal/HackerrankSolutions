/*
To find the minimum no of swaps reqd to sort array */

package Practice;

public class MinimumSwaps {
static int minSwaps(int[] ar)
{
    int swaps=0;
    for(int i=0;i<ar.length-1;i++)
    {
        for(int j=i+1;j<ar.length;j++)
        {
            if(ar[i] > ar[j])
            {
                swaps++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
    }
    return swaps;
}

    public static void main(String[] args) {
        int[] ar = new int[] {7, 1, 3 ,2,4, 5, 6};
        System.out.println("Minimum swaps = "+minSwaps(ar));
    }
}
