package comp1110.exam;

import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

@Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
public class Q5GetMaxPeopleTest {
    // FIXME add one or more JUnit tests for the getMaxPeople() method of the Q5Forum class

    String[] pagenames = new String[]{
            "gitlab",
            "comp2300",
            "IT Services",
            "comp1110-labs",
            "wattle",
            "calendar",
            "timetable",
            "FAQ",
            "comp1110-ass2",
            "comp1110-ass1",
    };

    String[] admins = new String[]{
            "Alice",
            "Charles",
            "Bob",
            "Cindy",
            "Steve",
            "Paul",
            "Penny",
            "Steve",
            "Paul",
            "Paul",
    };

    String[][] moderators = new String[][]{
            new String[]{"Ray", "Bob", "Cindy", "Alice"},
            new String[]{"Bob", "Paul", "Steve", "Clara", "Ray"},
            new String[]{"Clara", "Penny", "Dianne", "Alice"},
            new String[]{"Paul", "Ray", "Clara", "Cindy", "Bob"},
            new String[]{"Steve", "Edd"},
            new String[]{"Paul", "Dianne", "Clara", "Ray", "Alice", "Penny", "Bob", "Cindy"},
            new String[]{"Dianne", "Sarah", "Cindy", "Nicky", "Ben"},
            new String[]{"Steve", "Paul", "Alice"},
            new String[]{"Penny", "Bob", "Alice"},
            new String[]{"Bob", "Alice", "Paul", "Steve", "Ray", "Penny"}
    };

    String[] dates = new String[]{
            "2022-01-15",
            "2021-01-15",
            "2022-02-10",
            "2022-04-01",
            "2022-05-27",
            "2022-06-20",
            "2021-05-02",
            "2022-03-13",
            "2022-03-12",
            "2021-02-10",
            "2021-01-10",
    };
}
