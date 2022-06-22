public class ObjectClass implements Cloneable {
    int age;
    String name;
    int[] array = new int[] {1,2,3,4,5};

    public ObjectClass(int age, String name) {
        this.age=age;
        this.name=name;
        this.array=array;
    }

    /*

    Naive object cloning implementation:

    public ObjectClass(ObjectClass oc) {
        this.age=oc.age;
        this.name=oc.name;
    }

    We can instead implement the 'Cloneable' interface and perform a shallow copy of
    the object which will execute much faster.

     */

    @Override

    /*
    Explicitly telling JVM (Java Virtual Machine) to override the clone method in the Object superclass
    and use our implementation of the clone method.
     */

    /*

    public Object clone() throws CloneNotSupportedException {
        return super.clone();

        // Returns the 'shallow' copy of the object
    }

     */

    /*
    Shallow copy vs Deep copy

    When we clone an object using the clone() method, we actually make a shallow copy of the object.
    Shallow copying means that all primitive data types within an object will be created for the clone object,
    but for objects inside an object, it will point to the same object's memory location in JVM instead of
    allocating new memory space for the objects in the clone object in the memory.

    What this means is that if we have an array defined in our original object and use the clone() method to copy
    the object, the cloned object's object variables will point to the original object's object variable in memory
    instead of creating a new memory for the object and truly 'copying'.

    The above mechanism of cloning/copying an object is referred to as shallow copy of an object.

    Deep copy of an object is creating a copy of the original object BUT with the exception that the cloned object's
    object variables will have new memory created for them in the memory. This basically created a pure copy
    of the object.

    The benefits of deep copying is that if we change the object variable in the cloned object, the changes are only
    reflected in the cloned object's object variable. However, if we had performed a shallow copy and changed the object
    variables in the cloned object, the changes would also reflect in the original object's object variable since
    the cloned object's variables point to the original object's object variables in the memory.
     */
    public Object clone() throws CloneNotSupportedException {
        // To make a deep copy of an object, we first make a shallow copy
        ObjectClass swastikClone = (ObjectClass) super.clone(); // Shallow copy created in JVM
        /*
        Creating deep copy of object variable by creating new memory space in memory. This is done by the 'new'
        keyword. the 'new' keyword instructs the compiler to create 'new' space in memory to store the contents of this
        object variable rather than pointing to the original object's memory for object variables.
         */
        swastikClone.array = new int[swastikClone.array.length];
        for (int i = 0; i < swastikClone.array.length; i++) {
            swastikClone.array[i] = this.array[i];
        }
        return swastikClone;
    }

}
