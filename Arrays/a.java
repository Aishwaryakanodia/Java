public class a 
{
    public static void main(String args[])
    {
        // Declaring and initializing an array
        int[] marks = {10, 20, 30, 40, 50};

        // Accessing elements using a for loop
        for(int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("********************");

        // Accessing elements using an enhanced for loop
        for(int value : marks)
        {
            System.out.println(value);
        }
    }
}
