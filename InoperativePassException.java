// exception for invalid input of "password"

class InoperativePassException extends Exception {
    public InoperativePassException(String message) {
        super(message);
    }
}