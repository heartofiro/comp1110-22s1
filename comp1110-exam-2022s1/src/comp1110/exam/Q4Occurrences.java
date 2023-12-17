package comp1110.exam;

public class Q4Occurrences {
    /**
     * Outputs first occurrences of "tagged" text.
     *
     * A tag consists of a pair of characters, a ':' followed by a character identifying the tag
     * (in these examples this second character is always a single digit).
     *
     * A tag "tags" the text immediately following it, up until either the start of the next tag
     * or the end of the file, whichever comes first. E.g., ":2blue:3green:2red", has three tagged
     * sections of text "blue", "green" and "red" which have the tags '2', '3' and '2' respectively.
     *
     * This method outputs the text that matches the provided `tag`, ensuring that each output
     * tagged section of text is unique. I.e. a tagged section of text will only be output the first
     * time it appears.
     *
     * For example:
     *
     * input ":2blue:3green:2red" and tag character '3'
     * output "green"
     *
     * input ":2blue:3green:2red" and tag character '2'
     * output "bluered"
     *
     * input ":3why:4this:3bed:3is:9my:3bed" and tag character '3'
     * output "whybedis"
     *
     * Noting in this last example bed only appears once in the output, the first time it occurred
     * in the input file.
     *
     * @param inFile input filename
     * @param outFile output filename
     * @param tag second character of tag to consider
     */
    public static void occurrences(String inFile, String outFile, char tag) {
        // FIXME complete this method
    }
}