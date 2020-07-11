package Practice;  

public class BuyandSell {
    void stock(int a[])
    {
        boolean f = false; boolean x = false;
        StringBuilder s = new StringBuilder();
        int i;
        for(i=0;i<a.length-1;i++)
        {
            if(!x && a[i]<a[i+1])
            {
                s.append("("+i+",");
                x = true;
            }
            else if(x && a[i]>a[i+1])
            {
                s.append(i+")");
                System.out.println(s);
                s = new StringBuilder();
                x = false;
            }
            else
                f=true;
        }
        if(i==a.length-1 && a[i]>a[i-1])
            {
                 s.append(i+")");
                System.out.println(s);
            }
        if(s.length()==0 && f==true)
            System.out.println("no profit");
    }
    public static void main(String[] args) {
        
        int arr[] = new int[] {100,200,300,40,59,259,67,78,88,9};
        
        int arr1[] = new int[] {200,100,4,3};
        
        BuyandSell bs = new BuyandSell();
        bs.stock(arr1);
        System.out.println("");
        bs.stock(arr);
        
    }
    
}
