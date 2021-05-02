package Practisesession;

public class Example extends Session
{
    //Session session;

    public static void sort()
    {

        System.out.println("YES");
        int[] arr = new int[]{2,6,8,10,5,3,1};
        for(int i= 0;i<arr.length;i++)
        {
            for (int j = i+1;j<arr.length;j++)
            {
                int temp = 0;
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }


    }
}
