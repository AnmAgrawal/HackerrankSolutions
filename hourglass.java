
package Practice;

public class hourglass {
    public static void main(String[] args) {
        
        int ar[][] = new int[][] {{1,0,0,2,3},
                                            {3,6,7,0,1},
                                            {1,5,4,2,5},
                                            {0,0,2,1,4},
                                            {1,3,2,7,0}};
        
        int max_sum = Integer.MIN_VALUE;
        
        System.out.println(max_sum);
        
        for(int i=0;i<ar.length-2;i++)
        {
            for(int j=0;j<ar[i].length-2;j++)
            {
                int sum = (ar[i][j]+ar[i][j+1]+ar[i][j+2]+ar[i+1][j+1]+ar[i+2][j]+ar[i+2][j+1]+ar[i+2][j+2]);
                
                max_sum = Math.max(sum, max_sum);
            }
        }
        
        System.out.println("MAx sum = "+max_sum);
    }
}
