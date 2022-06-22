import java.util.Arrays;

public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClass swastik = new ObjectClass(20, "Swastik");

        ObjectClass swastikClone = (ObjectClass) swastik.clone(); // Shallow copy
        System.out.println("swastikClone Object values: " + swastikClone.age + " " + swastikClone.name);
        System.out.println("swastikClone Object array values: " + Arrays.toString(swastikClone.array));

        swastikClone.array[0] = 45;

        System.out.println("swastikClone Object updated array values: " + Arrays.toString(swastikClone.array));
 //     Above line will update the 0th index of swastikClone's array value only.
        System.out.println("swastik Object array values: " +Arrays.toString(swastik.array));


    }
}
