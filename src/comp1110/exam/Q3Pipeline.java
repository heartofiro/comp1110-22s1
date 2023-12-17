package comp1110.exam;

public class Q3Pipeline {
    /**
     * Build a pipeline on the map that is able to extract the most oil.
     *
     * The map is a square N by N grid, represented by a string of characters. Each character
     * represents either an oil well, empty space or inaccessible space.
     *
     * Oil well: single non-zero digit 1-9: '1', '2', ..., '9'
     * Empty space: period character: '.'
     * Inaccessible space: lowercase x: 'x'
     *
     * A pipeline is built in a sequence of unique neighbouring grid spaces (North, East, South,
     * East, or West, *not* diagonal). Only a single pipeline can be built and its maximum length
     * (one "pipe segment" per grid space) is limited by the `pipes` parameter.
     *
     * The pipeline cannot cross the same grid space twice and the pipeline cannot have any
     * junctions / branches. It cannot be built on a space with an 'x' in it.
     *
     * The goal is to maximise the amount of "extracted oil", where the pipeline will extract the
     * digit-valued amount of oil when built in a space with an oil well. This can be at the start
     * or end of the pipeline or anywhere in the middle.
     *
     * Consider the map string "..3......x2.1x..", which we can visualise as the 4 by 4 grid:
     *
     *   . . 3 .
     *   . . . .
     *   . x 2 .
     *   1 x . .
     *
     * Consider the following "pipelines" (A-D) for the above map, where, for illustration purposes,
     * '+' represents a space with a pipe built in it:
     *
     *      A          B          C          D
     *   . . + .    + + + .    . + + .    . . + .
     *   . . + .    + . + .    + + + .    + + + .
     *   . x + .    + x + .    + x + .    + x + .
     *   1 x . .    + x . .    + x . .    + x . .
     *
     * A: if `pipes` is 3, we can build the pipeline as shown, which would extract 5 (= 3+2) oil.
     * B: if `pipes` is 8, we can build the pipeline as shown, which would extract 6 (= 3+2+1) oil.
     * C: this is an alternative path to B that achieves 6 oil with 8 `pipes`.
     * D: this is *not* a valid pipeline, as it would require the pipeline to branch which we
     *   explicitly do not allow. Therefore, for 7 `pipes` the maximum oil that can be extracted is
     *   the same as for the 3 `pipes` case: 5 oil.
     *
     * @param map a square N by N map encoded as a string of characters
     * @param pipes the number of pipe segments that can built (maximum pipeline length)
     * @return the maximum amount of oil that could be extracted from the map given the pipes limit
     */
    public static int maxExtract(String map, int pipes) {
        return 0; // FIXME implement method
    }
}
