package comp1110.exam;

public class Q3Hiking {
    /**
     * Find the lowest cost path to the edge of the map for the hiker.
     *
     * The map is a square N by N grid, represented by a string of characters. Each character
     * represents a terrain type or the starting position of the hiker.
     *
     * There are 4 terrain types which are associated with different movement costs:
     *
     * '.' grassland - move cost 1
     * 't' forrest - move cost 2
     * 'r' river - move cost 4
     * 'm' mountain - impassable
     *
     * Movement cost is incurred only when moving into a location.
     *
     * The character 'x' represents the starting position of the hiker on the map (the terrain type
     * of this location is not specified, as it will not alter the solution).
     *
     * You can only move along the cardinal directions, e.g., North, East, South, West.
     *
     * E.g., consider the 16 character map ".....mmmrxttrm..", which we can visualise as the 4 by 4
     * grid:
     *
     *   . . . .
     *   . m m m
     *   r x t t
     *   r m . .
     *
     * The lowest cost path to the edge of the map is to move East (right) and then South (down),
     * incurring a cost of 3 (+2 for moving into forest, +1 for moving into grassland).
     *
     * It is not possible to move either North or South from the starting point, because mountains
     * are impassable.
     *
     * It is more expensive to move one space to the West to reach the map edge because the river
     * has a movement cost of 4.
     *
     * @param map a square N by N map encoded as a string of characters
     * @return cost of lowest cost path to map edge or -1 if no path exists
     */
    public static int movementCost(String map) {
        double a = map.length();
        int n = (int) Math.sqrt(a);
        int[][] map1 = new int[n][n];
        int f=0, s=0;
        for (int i=0;i<n;i++){
            if (map.charAt(i)=='.'){

            }
        }
        return 0;
        // FIXME implement method
    }
}
