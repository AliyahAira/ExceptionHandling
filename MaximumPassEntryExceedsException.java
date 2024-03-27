// exception that will handle the maximum of 3 tries for entering the pass

class MaximumPassEntryExceedsException extends Exception {
    public MaximumPassEntryExceedsException(String message) {
        super(message);
    }
}