class InsertArray 
{
    public static void main(String[] args) 
	{

        int[] a = {10, 20, 30, 40, 50};
        int n = 5, pos = 3, ele = 25;

        for (int i = n; i >= pos; i--) 
		{
            a[i] = a[i - 1];
        }

        a[pos - 1] = ele;

        for (int i = 0; i <= n; i++) 
		{
            System.out.print(a[i] + " ");
        }
    }
}