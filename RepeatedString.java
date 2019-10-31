public class RepeatedString {

    public static void main(String[] args) {
        String s = "cfimaakj";
        long result = repeatedString(s, 554045874191L);
        //System.out.println(result);
        long expectedOut = (long) 138511468548L;
        System.out.println(result == expectedOut);
    }

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int numOfA = getNumOfA(s);
        
        long x = (long) n % s.length();
        
        return numOfA * (n / s.length()) + (long) getNumOfA(s.substring(0, (int) x));
    }

    static int getNumOfA (String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                counter++;
            }
        }
        return counter;
    }
}