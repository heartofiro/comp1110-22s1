package comp1110.exam;

public class Q1Outside {
    /**
     * Given an array of integers and a start and end value, return the smallest value in the array
     * that is outside the range from start to end inclusive.
     *
     * If the range is invalid, i.e. end is smaller than start, return end.
     *
     * If there is no value outside the range, return start.
     *
     * For example:
     *
     * If I have the array of ints: [10,13,5,20], start value 4 and end value 10, this will return
     * 13 because 13 is the smallest value that is outside the range 4 to 10.
     *
     * Note: start and end are values, **not** indices.
     * @param in    an array of integers.
     * @param start the start value of the range (inclusive).
     * @param end   the end value of the range (inclusive).
     * @return the smallest value outside the range from start to end, or end if the end is smaller
     * than start, or start if there is no such value outside the range.
     */
    public static int findOutside(int[] in, int start, int end) {
        if (end<start){
            return end;
        }
        int ic = start, ou = Integer.MAX_VALUE;
        Boolean c = false, dc = true;
        for (int i = 0;i<in.length;i++){
            if (in[i]>=start){
                if (in[i]<=end){
                    continue;
                }else {
                    ou = Math.min(ou,in[i]);
                    dc = false;
                }
            }else {
                ou = Math.min(ou,in[i]);
                dc = false;
            }
        }
        if (dc){
            return start;
        }
        return ou;
        // FIXME complete this method
    }
}
