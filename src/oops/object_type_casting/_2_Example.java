package oops.object_type_casting;

class Test2 {
    public static void main(String[] args) {
        Object o = new String("Abhay");
        // StringBuffer sb = (String)o; // CompileTime Error

        // Rule 2 failed: StringBuffer is not same or parent of String
    }
}
