package core.strings;

@SuppressWarnings({"StringBufferReplaceableByString", "StringBufferMayBeStringBuilder"})
/*
 * In Java, String objects are immutable - once created, they cannot be changed.
 * So if you’re building or modifying strings in a loop, this creates a lot of temporary objects → slow + memory heavy.
 * StringBuilder/Buffers let you modify strings efficiently (append, insert, delete, etc.) without creating new objects each time.
 *
 * StringBuilder
 * - fastest
 * - thread unsafe (not synchronized)
 * - good for single threaded applications
 *
 * StringBuffer
 *  - slower
 *  - thread safe
 *  - good for multithreaded environment
 *
 *  Also look at String Pooling/Interning -> intern()
 * */

public class MutableStrings {
    public static void main(String[] args) {
        // StringBuilder – fast, not thread-safe
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!")
                .append(1)
                .append('c')
                .append(234.5);
        System.out.println("Builder: " + sb);

        // StringBuffer – thread-safe
        StringBuffer sbf = new StringBuffer("Count: ");
        sbf.append(1)
                .append(2)
                .append(3);
        System.out.println("Buffer: " + sbf);
    }
}
