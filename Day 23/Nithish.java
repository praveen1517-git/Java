class Nithish
{
    public static void main(String[] args)
    {
        int arr[] = {10, 12, 14, 20, 50};
        int left = 0;
        int right = arr.length - 1;
        int search = 14;

        Nithish ni = new Nithish();
        int index = ni.binary(arr, left, right, search);

        System.out.println(index);
    }

    public int binary(int arr[], int left, int right, int search)
    {
        if (left <= right)
        {
            int mid = (left + right) / 2;

            if (search == arr[mid])
            {
                return mid;
            }
            else if (search > arr[mid])
            {
                return binary(arr, mid + 1, right, search);
            }
            else
            {
                return binary(arr, left, mid - 1, search);
            }
        }
        return -1;
    }
}
