public class StringEqualsTrim {
    public static void main(String[] args) {
        System.out.println(2 == 2); //true

        String s = new String(" 2 ");
        System.out.println("2" == s); //false

        /***
         * O correto
         */
        System.out.println("2".equals(s.trim())); // true - correto \o/
    }
}
