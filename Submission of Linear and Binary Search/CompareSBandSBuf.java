public class CompareSBandSBuf {
    public static void main(String args[]) {

        int n = 1000000;
        long s1, e1, s2, e2;

        StringBuilder sb = new StringBuilder();
        s1 = System.nanoTime();
        for (int i = 0; i < n; i++)
            sb.append("hello");
        e1 = System.nanoTime();

        StringBuffer sbuf = new StringBuffer();
        s2 = System.nanoTime();
        for (int i = 0; i < n; i++)
            sbuf.append("hello");
        e2 = System.nanoTime();

        System.out.println("StringBuilder time: " + (e1 - s1));
        System.out.println("StringBuffer time: " + (e2 - s2));
    }
}
