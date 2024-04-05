package StringBuilder;

public class sb {
    public static void main(String[] args)
    {   // String Builder is not thread safe but mutable
        long startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Hello");
        System.out.println(builder.capacity());
        builder.append(" World");
        System.out.println(builder);

        for(int i=0; i<10000; i++)
        {
            builder.append("Hii");
        }
        System.out.println(System.currentTimeMillis() - startTime);


    }
    
}
