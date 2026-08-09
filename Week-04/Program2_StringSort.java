class StringSort
{
    public static void main(String args[])
    {
        String str[] = {"Mango", "Apple", "Orange", "Banana", "Grapes"};
        String temp;

        for(int i = 0; i < 4; i++)
        {
            for(int j = i + 1; j < 5; j++)
            {
                if(str[i].compareTo(str[j]) > 0)
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println("Sorted Strings:");
        for(int i = 0; i < 5; i++)
        {
            System.out.println(str[i]);
        }
    }
}
