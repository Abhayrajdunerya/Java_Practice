package oops.object_type_casting;

class Test1 {
    public static void main(String[] args) {
        String s = new String("Abhay");
        // StringBuffer sb = (StringBuffer) s; // CompileTime Error

        // Rule 1 failed: String & StringBuffer has no relationship
    }
}
