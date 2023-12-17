package comp1110.exam;

import java.util.Random;

/**
 * This class represents an Article, which is uniquely identified by a combination of article type,
 * title and number of authors.
 */
public class Q7Article {

    public enum ArticleType {
        WIKI, BLOG, NEWSPAPER, EPILOGUE, THESIS, BIOGRAPHY, CHAPTER, PROLOGUE, EMAIL, LETTER,
        INVOICE, JOURNAL, CALENDAR
    }

    /**
     * The type of an article may be any value from the ArticleType enum.
     */
    ArticleType type;

    /**
     * The title of an article is a String of ASCII characters.
     */
    String title;

    /**
     * The number of authors of an article is any number from 1 to 15 inclusive.
     */
    int authors;

    public Q7Article(ArticleType type, String title, int authors) {
        this.type = type;
        this.title = title;
        this.authors = authors;
    }

    /**
     * @return a hash code value for this article. In implementing this method, you may *not* use
     * the default Java implementations in Object.hashCode() or Objects.hash().
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        return new Random().nextInt(2); // FIXME complete this method
    }

    /**
     * @return true if other object is a Q7Article and their fields are equal
     * @see java.lang.Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
         return false; // FIXME complete this method
    }

    @Override
    public String toString() {
        String t = null;
        if (type != null) {
            t = type.toString();
        }
        return t + ", " + title + ", " + authors;
    }

    // DO NOT DELETE OR CALL THIS METHOD
    int passThroughHash() {
        return super.hashCode();
    }
}

