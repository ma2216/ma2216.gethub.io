package lesson1;

public class Maximum {
    public static int maxima(int [] array)
    {
        int m = 0;
        int i=1;
        while ( i < array.length)
        {
            if (array[i] > array[m])
            {
                m = i;
            }
            i++;
        }
        return m;
    }
    public static int minima(int [] array)
    {
        int m = 0;
        int i=1;
        while ( i < array.length)
        {
            if (array[i] < array[m])
            {
                m = i;
            }
            i++;
        }
        return m;
    }
    public static int minimum(int [] array)
    {
        int teminimum = array[0];
        int i = 1;
        while(i < array.length)
        {
            if (array[i] < teminimum)
                teminimum = array[i];
            i++;
        }
        return teminimum;
    }
    public static int maximum(int [] array)
    {
        int temmaximum = array[0];
        int i=1;
        while ( i < array.length)
        {
            if (array[i] > temmaximum)
                temmaximum = array[i];
            i++;
        }

        return temmaximum;
    }
    // test driver
    public static void main(String[] args)
    {
        int [] arr = new int[]{342,34,233,456};
        System.out.println(maximum(arr));
        System.out.println(maxima(arr));
        System.out.println(minimum(arr));
        System.out.println(minima(arr));
    }
}
