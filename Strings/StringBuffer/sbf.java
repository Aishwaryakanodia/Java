package StringBuffer;

public class sbf {
    public static void main(String[] args)
    {   // String Buffer is thread safe and mutable
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println(buffer.capacity());
        buffer.append(" World");
        System.out.println(buffer);

        for(int i=0; i<10000; i++)
        {
            buffer.append("Hii");
        }
        System.out.println(System.currentTimeMillis()- startTime);


    }
    
}
