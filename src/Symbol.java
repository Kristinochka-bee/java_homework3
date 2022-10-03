public class Symbol {
    public static void main(String[] args) {
        String one = "I study Basic Java";
        int length = one.length();
        char element = one.charAt(length-1);
        System.out.println(element);

        String one_replace =  one.replace('a', '*');
        System.out.println(one_replace);
    }
}
