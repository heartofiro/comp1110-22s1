package comp1110.exam;

public class Q2ThreeFour {

    /**
     * Given a string, return -1 if it is an empty string or contains any non-digit characters,
     * return the sum of the odd-valued digits if the string represents a ThreeFour number or return
     * the sum of the even-valued digits if the string does not represent a ThreeFour number.
     *
     * A ThreeFour number is defined recursively by the following rules:
     *
     * a) is a non-negative integer (may have one or more leading zeros, e.g., 0033 is equivalent to 33),
     * b) is divisible by three or four,
     * c) after removing the first and last digits, the remaining digits are still a ThreeFour
     *    number, or an empty string,
     *
     * Examples of ThreeFour numbers: "3333", "2931", "1240", "4", "630", "1060", "0"
     *
     * As these are ThreeFour numbers this method would return 12, 13, 1, 0, 3, 1, 0 respectively
     *
     * Examples that are NOT ThreeFour numbers: "2401", "11", "1", "724"
     *
     * As these aren't ThreeFour numbers this method would return 6, 0, 0, 6 respectively
     *
     * @param number A number
     * @return -1 if it is an empty string or contains any non-digit characters, the sum of
     * the odd-valued digits if this is a ThreeFour number, the sum of the even-valued digits if it
     * is not a ThreeFour number.
     */
    public static int threeFour(String number) {
        if (number.isEmpty()){
            return -1;
        }
        for (int i = 0;i<number.length();i++){
            if (number.charAt(i)<'0'||number.charAt(i)>'9'){
                return -1;
            }
            if (number.charAt(i)=='0'&&i!=number.length()-1){
                number = number.substring(1);
                i--;
            }
        }
        int sum = 0;
        if (isTreeFore(number)){
            while (!number.isEmpty()){
                int c = number.length()-1;
                String d = number.substring(c);
                int l = Integer.parseInt(d); //在这步上超时
                if (l%2==1){
                    sum+=l;
                }
            }
        }else {
            while (!number.isEmpty()){
                int l = Integer.parseInt(number.substring(number.length()-1));
                if (l%2==0){
                    sum+=l;
                }
            }
        }
        return Integer.MIN_VALUE;
        // FIXME complete this method
    }
    public static boolean isTreeFore(String number){
        String c = number;
        boolean j = true;
        while (!c.isEmpty()){
            int cv = Integer.parseInt(c);
            if (cv%3!=0&&cv%4!=0){
                j=false;
                break;
            }else {
                c=c.substring(1,c.length()-1);
            }
        }
        return j;
    }
}