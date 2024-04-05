public class stri {

    public static void main(String args[])
    {
        // Using String literal
        String str1 = "Aishwarya";
        System.out.println(str1);

        // Using String object

        String str2 = new String("from kanpur leaving spacepe ");
        System.out.println(str2);

        //Concatenating String Literal and String Object
        String str3 = str1 + " " +str2;
        System.out.println(str3); 
        System.out.println(str3.length());
        System.out.println(str3.charAt(0));
        System.out.println(str3.concat(str2));
        System.out.println(str3.substring(0,5));
        System.out.println(str1.equals(str2));
        System.out.println(str3.contains("Hello"));
        System.out.println(str2.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str2.trim());
    }


    
}
