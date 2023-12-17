package comp1110.exam;

import java.util.Set;

/**
 * This class represents a simplified filesystem.
 * Each file has an owner, a date that it was created, a set of userids that have permission to
 * access the file and a filename.
 * Each file is uniquely identified by its filename.
 * Each user is uniquely identified by an userid.
 * Owners are also users.
 */
public class Q5FileSystem {
    /**
     * Add a new file to the filesystem. If the given file name exists, do not modify this
     * filesystem.
     *
     * @param filename    the name of the file.
     * @param owner       the userid of the owner of the file.
     * @param date        the date this file was created in the format "DD-MM-YYYY".
     * @param permissions the userids of users permitted to access the file.
     * @return true if the file was added, false if the file was not added (because a file with that
     * name already exists)
     */
    public boolean addFile(String filename, String owner, String date, Set<String> permissions) {
        return false; // FIXME complete this method
    }

    /**
     * Remove the file with the given name from the filesystem. If no file with the given name
     * exists, do not modify this filesystem.
     *
     * @param filename the name of the file to be removed.
     * @return true if removal was successful, otherwise false.
     */
    public boolean deleteFile(String filename) {
        return false; // FIXME complete this method
    }

    /**
     * @return the total number of files in this filesystem.
     */
    public int getFileCount() {
        return -1; // FIXME complete this method
    }

    /**
     * Get the names of all files that are owned by the given userid. If the given userid does not
     * own any files, return an empty set.
     *
     * @param userid the userid of an owner.
     * @return the names of all files that are owned by the given userid.
     */
    public Set<String> getFilesOwnedBy(String userid) {
        return null; // FIXME complete this method
    }

    /**
     * Get the total number of unique users across all files in this filesystem. Each user is only
     * counted once even if they have permission to access multiple files. Owners are included in
     * this count.
     *
     * @return the number of unique users across all files.
     */
    public int getNumUsers() {
        return -1; // FIXME complete this method
    }

    /**
     * Get the names of all files in which the given userid is either an owner or has permission to
     * access the file. If the given userid does not own or have access to any file, return an empty
     * set.
     *
     * @param userid the userid of a user.
     * @return the names of all files that the given userid either owns or has permission to access.
     * If this userid does not own or have permission to access any files, return the empty set.
     */
    public Set<String> getFiles(String userid) {
        return null; // FIXME complete this method
    }

    /**
     * Gets the greatest number of files that any userid either owns or has permission to access. If
     * an userid is both an owner and has permission to access the same file, that file only counts
     * once.
     *
     * @return the maximum number of files for any userid.
     */
    public int getMaxFiles() {
        return -1; // FIXME complete this method
    }

    /**
     * Get the names of all files in the filesystem that were created strictly before the given
     * date.
     *
     * @param date the date in the format "DD-MM-YYYY"
     * @return the names of all files that were created before the given date. If there are no files
     * that were created before the given date, return the empty set.
     */
    public Set<String> getFilesBeforeDate(String date) {
        return null; // FIXME complete this method
    }

    /**
     * Gets the maximum number of unique users and owners across any single date. If a user owns or
     * has permission to access multiple files that were created on the same date, this only adds
     * one towards the total number of users.
     *
     * @return the maximum number of users for any single date.
     */
    public int getMaxUsers() {
        return -1; // FIXME this method might be useful for the second part of Q5
    }

}

