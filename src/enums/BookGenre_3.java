package enums;

public enum BookGenre_3 {
    BIOGRAPHY(12),
    HORROR(15);

    private BookGenre_3(int minAgeToRead) {
        this.minAgeToRead = minAgeToRead;
    }

    private int minAgeToRead;

    public int getMinAgeToRead(int minAgeToRead) {
        return this.minAgeToRead;
    }

    public boolean isKidFriendly(int age) {
        switch (this) {
            case BIOGRAPHY: return age >= minAgeToRead;
            case HORROR: return false;
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}
