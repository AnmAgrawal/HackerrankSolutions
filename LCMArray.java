/* Formula to find LCM =  a*b
                                  -------------
                                    (gcd(a,b))
*/
package Practice;


public class LCMArray {
    static int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
    
    static int findLCM(int[] ar)
    {
        int ans = ar[0];
        for(int i=1;i<ar.length;i++)
            ans = ((ar[i]*ans)/(gcd(ar[i],ans)));
        return ans;
    }
    
    public static void main(String[] args) {
        int ar[] = {2, 7, 3, 9, 4};
        System.out.println("LCM = "+findLCM(ar));
    }
}
