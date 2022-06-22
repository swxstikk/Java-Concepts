public class StringMemory {
    public static void main(String[] args) {
        String a = "Swastik";
        String b = "Swastik";
        /*
        '==' compares if both the variables 'a' and 'b' refer to the same object in heap memory.
        Since, they refer to the same object, this will return true.
         */
        System.out.println(a==b);
        String c = new String("Swastik");
        String d = new String("Swastik");
        /*
        If we look at this case, we are explicitly telling the JVM to make a new object to store the same values
        for both variables 'c' and 'd'.
        Hence, the hash value of both objects 'c' and 'd' will be different and hence this will return false.
         */
        System.out.println(c==d);
    }
}
