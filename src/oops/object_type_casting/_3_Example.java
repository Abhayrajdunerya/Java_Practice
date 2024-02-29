package oops.object_type_casting;


// class String extends Object
// class StringBuffer extends Object

class Test3 {
    public static void main(String[] args) {

        Object o = new String("Abhay");
        StringBuffer sb = (StringBuffer) o; // Runtime Error: ClassCastException
        
        // Rule 3 failed: String is not same or derived class of StringBuilder
        // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.StringBuffer
    }
}
