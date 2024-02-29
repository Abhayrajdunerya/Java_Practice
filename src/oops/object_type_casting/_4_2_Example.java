package oops.object_type_casting;

class Test_4_2 {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Number n = (Number) i;
        Object o = (Object) n;

        System.out.println(i == n);
        System.out.println(n == o);
        System.out.println(o == i);
    }
}
