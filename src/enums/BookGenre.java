package enums;

public enum BookGenre {
    BIOGRAPHY,
    HORROR;

    public static void main(String[] args) {
        for (BookGenre bookGenre : BookGenre.values()) {
            System.out.print("\nName: " + bookGenre); // toString()
            System.out.print(", name(): " + bookGenre.name());
            System.out.print(", Ordinal(): " + bookGenre.ordinal());
            System.out.print(", getDeclaringClass(): " + bookGenre.getDeclaringClass());
            System.out.print(", compareTo(HORROR): " + bookGenre.compareTo(BookGenre.HORROR));
            System.out.print(", compareTo(HORROR): " + bookGenre.equals(HORROR));
            System.out.print(", bookGenre.BIOGRAPHY: " + bookGenre.BIOGRAPHY);
            System.out.print(", bookGenre.HORROR: " + bookGenre.HORROR);
            System.out.println();
        }
    }
}
