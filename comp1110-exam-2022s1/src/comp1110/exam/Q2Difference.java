package comp1110.exam;

public class Q2Difference {
    /**
     * Given a string, return -1 if it is an empty string or contains non-digit characters, return
     * the sum of the even digits if the string represents a Difference number, or return the sum
     * of the odd digits if the string does not represent a Difference number.
     *
     * A Difference number is defined recursively by the following rules:
     *
     * a) is a non-negative integer (may have one or more leading zeros, e.g., 0002 is OK),
     * b) the difference between the first and last digits is even,
     * c) after removing the first and last digits, the remaining digits are still a Difference
     *    number, or an empty string,
     * e) a single digit number is a Difference number if it is even.
     *
     * Examples of Difference numbers: "3465", "72821", "6", "95", "1919", "0"
     *
     * As these are Difference numbers this method would return 10, 12, 6, 0, 0, 0 respectively
     *
     * Examples that are NOT Difference numbers: "3", "453", "29", "3477", "7", "96382"
     *
     * As these aren't Difference numbers this method would return 3, 8, 9, 17, 7, 12 respectively
     *
     * @param number A number
     * @return return -1 if it is an empty string or contains non-digit characters, return
     * the sum of the even digits if the string represents a Difference number, or return the sum
     * of the odd digits if the string does not represent a Difference number.
     */
    public static int difference(String number) {
        if (number.isEmpty()){
            return -1;
        }
        for (int i=0;i<number.length();i++){
            if (number.charAt(i)<'0'||number.charAt(i)>'9'){
                return -1;
            }
        }
        for (int i=0;i<number.length()-1;i++){
            if (number.charAt(i)=='0'){
                number = number.substring(1);
                i--;
            }else {
                break;
            }
        }
        if (number.length()==1){
//            if (Integer.parseInt(number)%2==0){
                return Integer.parseInt(number);
//            }
//            return 0;
        }
        boolean iDff = isDiff(number);
        int sol = 0;
        for (int i = 0; i < number.length(); i++) {
            int c = Integer.parseInt(number.substring(i,i+1));
            if (iDff) {
                if (c%2 == 0) {
                    sol += c;
                }
            }else {
                if (c%2 == 1){
                    sol +=c;
                }
            }
        }
        return sol;
        // FIXME complete this method
    }

    public static Boolean isDiff(String number){
        String num = number;
        boolean c = true;
        while (!num.isEmpty()){
            int f = Integer.parseInt(num.substring(0,1)),
                l = Integer.parseInt(num.substring(num.length()-1));
            if ((f-l)%2!=0){
                c = false;
                break;
            }
            if (num.length()==1){
                if (f%2==0){
                    break;
                }else {
                    c = false;
                    break;
                }
            }
            num = num.substring(1,num.length()-1);
        }
        return c;
    }
}
