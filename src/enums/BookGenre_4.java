package enums;

public enum BookGenre_4 {
    BIOGRAPHY(12) {
        @Override
        boolean isKidFriendly(int age) {
            return age >= minAgeToRead;
        }
    },
    HORROR(15) {
        @Override
        boolean isKidFriendly(int age) {
            return false;
        }
    };

    abstract boolean isKidFriendly(int age);

    private BookGenre_4(int minAgeToRead) {
        this.minAgeToRead = minAgeToRead;
    }

    protected int minAgeToRead;

    public int getMinAgeToRead() {
        return this.minAgeToRead;
    }

    public static void main(String[] args) {
        for (BookGenre_4 bookGenre : BookGenre_4.values()) {
            System.out.print("\nName: " + bookGenre); //toString
            System.out.print(", name(): " + bookGenre.name());
            System.out.print(", Ordinal: " + bookGenre.ordinal());
            System.out.print(", Declaring Class: " + bookGenre.getDeclaringClass());	
            System.out.print(", compareTo(HORROR): " + bookGenre.compareTo(HORROR));
            System.out.print(", equals(HORROR): " + bookGenre.equals(BookGenre_4.HORROR));
            System.out.print(", minAgeToRead: " + bookGenre.getMinAgeToRead());
            System.out.print(", isKidFriendly: " + bookGenre.isKidFriendly(25));
            System.out.println();
         }
    }
}
