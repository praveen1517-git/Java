class LinearSearch {
    
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50};
        int serachValue = 30;
        
        LinearSearch ls = new LinearSearch();
        int index = ls.linearSearch(arr, serachValue);
        System.out.println(index);
    }
    
    public int linearSearch(int[] arr, int searchvalue)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == searchvalue)
            {
                return i;
            }
        }
        return -1;
    }
}