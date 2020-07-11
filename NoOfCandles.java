package Practice;

public class NoOfCandles {
    static int noc(int[] a)
    {
        int nocd=0;
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
                max=a[i];
        }
        System.out.println(max);
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==max)
                nocd++;
        }
        return nocd;
    }
    public static void main(String[] args) {
        int[] ar = new int[] {3,2,1,2,3};
        int res=noc(ar);
        System.out.println("noc= "+res);
    }
}
