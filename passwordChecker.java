class passwordChecker {
    private static final int MAX_ATTEMPTS = 3;
    private int attempts = 0;

    public void login(String password) throws maxAttemptMessage, incorrectPasswordMessage {
        if (password.equals("the right password")) {
            System.out.println("Login successful!");
            System.exit(0);
        } else {
            attempts++;

            if (attempts >= MAX_ATTEMPTS) {
                throw new maxAttemptMessage("Too many login attempts. Account is now locked!");
            } else {
                throw new incorrectPasswordMessage("Incorrect password! Please try again.");
            }
        }
    }
}