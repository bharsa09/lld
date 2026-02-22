package tricky;

public class IntegerCache {

    public static void main(String[] args) {
        Integer a=11;
        Integer b=11;
        System.out.println(a==b); // true
        Integer c=128;
        Integer d=128;
        System.out.println(c==d); // false

        System.out.println(Integer.valueOf(127)==Integer.valueOf(127)); // true
        System.out.println(Integer.valueOf(128)==Integer.valueOf(128)); // false

        System.out.println(c.equals(d)); // true


        Integer ab=new Integer(10);
        Integer ba=new Integer(10);
        System.out.println(ab==ba); // false
        System.out.println(ab.equals(ba)); // true

    }
}
