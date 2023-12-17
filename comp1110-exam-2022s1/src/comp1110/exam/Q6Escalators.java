package comp1110.exam;

/**
 * This class is a data structure that resembles the behaviour of a pair of escalators; one going
 * "up" the other going "down".
 *
 * Both escalators have N steps each, where each step can either be empty or hold a single "person"
 * (an item our data structure is storing).
 *
 * The escalators can be moved in tandem. Each step (and item it is carrying) on the upward
 * escalator moves up one position, and each step on the downward escalator moves down one position.
 *
 * When moved the top-most step is returned to the bottom of the upward escalator and vice-versa for
 * the downward escalator. For these steps if they were carrying any people (items) those items
 * leave the escalator.
 *
 * As the escalators move, new people (items) can be added to the bottom of the upward escalator
 * and top of the downward escalator.
 *
 * @param <T> type of item to store
 */
public class Q6Escalators<T> {
    public static class Pair<T> {
        public T offTop; // item leaving the top of the upward escalator or null if none
        public T offBottom; // item leaving to bottom of the downward escalator or null if none
    }


    /**
     * Create a new escalators data structure.
     *
     * @param steps the number of steps the upward and downward escalators have each
     */
    public Q6Escalators(int steps) {
        // FIXME complete this constructor
    }

    /**
     * Move the escalators in tandem one step, adding new items to start and removing items from
     * end of each escalator.
     *
     * @param onBottom item to add to bottom of upward escalator or null if nothing to add
     * @param onTop item to add to top of the downward escalator or null if nothing to add
     * @return the pair of items leaving the escalator, where one or both may be null to indicate
     * the respective step was empty
     */
    public Pair<T> move(T onBottom, T onTop) {
        return null; // FIXME complete this method
    }

    /**
     * Move escalators without adding any items.
     *
     * @return the pair of items leaving the escalator, where one or both may be null to indicate
     * the respective step was empty
     */
    public Pair<T> move() {
        // Already implemented, go onto next method.
        return move(null, null);
    }

    /**
     * Check if either escalator contains the provided value.
     *
     * Specifically, return true if a non-null item x is on either escalator where x.equals(value).
     *
     * @param value to find
     * @return true if value is contained in either escalator
     */
    public boolean contains(T value) {
        return false; // FIXME complete this method
    }

    /**
     * Move the escalators, circulating items at the top and bottom.
     *
     * The same as moving one step but where any item leaving the top of the upward escalator is
     * automatically added to the top of the downward escalator as part of the same movement, and
     * vice-versa for the bottom.
     */
    public void circulate() {
        // FIXME complete this method
    }

    /**
     * Move the escalators independently of each other repeatedly until their end steps are not
     * empty.
     *
     * The upward escalator should be moved the minimum number of times (possibly zero) until its
     * top-most step is not-empty. Similar for the downward escalator but for its bottom-most
     * step.
     *
     * Note that if an escalator's steps are all empty, then it is not moved.
     */
    public void align() {
        // FIXME complete this method
    }

    /**
     * Represent the data structure as a string.
     *
     * The contents are presented as pairs of steps, starting from the bottom of the two escalators
     * and pairing off the bottom-most upward escalator step with the bottom-most downward escalator
     * step and continuing up. The string value of each item is obtained with the
     * `String.valueOf(Object)` method, and empty steps are represented by an empty string. These
     * paired values (even if empty) are separated by a comma and surrounded by parentheses. All
     * pairs (for each step) are surrounded by square brackets.
     *
     * E.g., if the number of steps is 3 and T = String:
     *
     * - upward bottom step is empty, downward bottom step is "a"
     * - upward middle step is empty, downward middle step is empty
     * - upward top step is "y", downward top step is "z"
     *
     * Would be represented by the string "[(,a)(,)(y,z)]".
     *
     * @return
     */
    @Override
    public String toString() {
        return null; // FIXME complete this method
    }
}
