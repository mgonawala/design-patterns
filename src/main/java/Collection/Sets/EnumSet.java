package Collection.Sets;

/**
 *
 * Enumset is set implementation using ENum types.
 *
 * It can have values from single Enum Type only.
 *
 *
 */
public class EnumSet {

    public static void main(String[] args) {
        java.util.EnumSet<Types> set1, set2, set3;

        set1 = java.util.EnumSet.of(Types.CODE, Types.CONTRIBUTE, Types.LEARN);
        System.out.println(set1);

        set3 = java.util.EnumSet.complementOf(set1);
        System.out.println(set3);
    }
}

enum Types{
    LEARN, CODE, CONTRIBUTE, CHECK
}

