package enums;

public enum BookGenre_2 {
    BIOGRAPHY(12),
    HORROR(15);

    private BookGenre_2(int minAgeToRead) {
        this.minAgeToRead = minAgeToRead;
    }

    private int minAgeToRead;

    public int getMinAgeToRead() {
        return minAgeToRead;
    }

    public static void main(String[] args) {
        for (BookGenre_2 bookGenre : BookGenre_2.values()) {
            System.out.print("\nName: " + bookGenre.name());
            System.out.print(", name(): " + bookGenre.name());
            System.out.print(", ordinal(): " + bookGenre.ordinal());
            System.out.print(", getDeclaringClass(): " + bookGenre.getDeclaringClass());
            System.out.print(", compareTo(BookGenre.HORROR): " + bookGenre.compareTo(BookGenre_2.HORROR));
            System.out.print(", compareTo(BookGenre.HORROR): " + bookGenre.equals(HORROR));
            System.out.print(", minAgeToRead: " + bookGenre.getMinAgeToRead());
            System.out.println();
        }
    }
}
