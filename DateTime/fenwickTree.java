import java.util.Scanner;
class FenwickTree
{
    int tree[];
    int BIT[];
    int n;

    public FenwickTree(int nums[])
    {
        n=nums.length;
        tree=nums;
        BIT =new int[n+1];

        for(int i=0;i<n;i++)
        {
            init(i,nums[i]);
        }
    }

    public void init(int i,int val)
    {
        i++;
        while(i<=n)
        {
            BIT[i]+=val;
            i+=(i&-i);
        }
    }

    public void update(int i,int val)
    {
        int diff=val-tree[i];
        tree[i]=val;
        init(i,diff);
    }


public int getSum(int i)
{
    i++;
    int sum=0;
    while(i>0)
    {
        sum+=BIT[i];
        i-=(i&-i);
    }
    return sum;
}

public int RangeSum(int i,int j)
{
    return getSum(j)-getSum(i-1);
}




    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        FenwickTree fw=new FenwickTree(arr);

        while(q-->0)
        {
            int op=sc.nextInt();

            if(op==1)
            {
                int s1 = sc.nextInt();
                int s2 = sc.nextInt();
                System.out.println(fw.RangeSum(s1,s2));
            }
            else
            {
               int idx=sc.nextInt();
               int val=sc.nextInt();
               fw.update(idx,val);

            }
        }
    }
}