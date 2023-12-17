package comp1110.exam;

/**
 * This class is a data structure that will only release items back to the user after a minimum
 * number of time "steps" have passed.
 *
 * It is constructed with a fixed number of slots for storing items. A method `tick` is used to step
 * time forward.
 *
 * @param <T> type of item to store
 */
public class Q6DelayedRelease<T> {
    public interface Update {
        int updateDelay(int delay);
    }


    /**
     * Construct a new Q6DelayedRelease data structure.
     *
     * @param slots the number of available slots to store items in the data structure
     */
    Q6DelayedRelease(int slots) {
        // FIXME complete this constructor
    }

    /**
     * Add an item `value` with a time delay `delay`. The item will remain "locked" in the data
     * structure for `delay` increments of time, i.e. until `delay` calls to the `tick()` method.
     * After this point the item is "released" and may be taken out of the data structure.
     *
     * If the `delay` is negative, the item should not be added and false should be returned.
     *
     * If the data structure has run out of free slots (all of them are filled with other items)
     * then the item should not be added and false should be returned. Note that both "locked" items
     * and items that are "released" but not yet taken out of the data structure take up a slot.
     *
     * Otherwise return true if the item is successfully added.
     *
     * @param delay an integer indicating how long the item is locked in data structure
     * @param value the item to store
     * @return true if item was added, otherwise false if not more free slots or if `delay` < 0
     */
    public boolean add(int delay, T value) {
        return false; // FIXME complete this method
    }

    /**
     * The number of time steps (calls to `tick()`) required before the next item(s) will be
     * released. If there is an item already available for release, returns 0. If there are no
     * items stored, return -1;
     *
     * E.g., if two items are added with a delay of 3 and 5 respectively, then this will return 3.
     * After calling `tick()` a single time this method would then return 2.
     *
     * @return the number of time steps before the next release, or -1 if no items stored.
     */
    public int nextRelease() {
        return -2; // FIXME complete this method
    }

    /**
     * Increment time. This has the impact of making it so that all stored items will be one time
     * step closer to being released. If items are already in a state of being released,
     * incrementing time has no impact on them.
     */
    public void tick() {
        // FIXME complete this method
    }

    /**
     * Take a single item out of the data structure that has been "released".
     *
     * If there are multiple released items, return one, keeping the rest in the data structure.
     * Can be called multiple times in a row to extract all the released items. The order they are
     * returned in is not defined (it doesn't matter).
     *
     * Returns null if there are no released items.
     *
     * @return a released item or null if none available
     */
    public T take() {
        return null; // FIXME complete this method
    }

    /**
     * Updates the time delay for every stored item.
     *
     * For each item, the lambda expression takes the current time delay and returns an updated one.
     *
     * E.g., consider the following sequence:
     *
     * - an item is added with a delay of 3
     * - `tick()` is called once (the delay until release is now 2 for the above item)
     * - `updateDelays()` is called with a lambda expression `x -> 2 * x`
     *
     * The delay will now be 4 for the above item (the lambda expression doubles it)
     *
     * @param update lambda expression to use for updating the item delays
     * @throws IllegalArgumentException if a call to the lambda expression returns a negative value
     */
    public void updateDelays(Update update) {
        // FIXME complete this method
    }
}
