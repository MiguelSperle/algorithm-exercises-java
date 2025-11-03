//  # CHALLENGE - 002
//  The challenge is basically: [ Ask for a number and calculate its factorial ]

void main() {
    final Scanner scanner = new Scanner(System.in);

    int number;

    do {
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a number greater than zero.");
        }
    } while (number <= 0);

    scanner.close();
    int factorial = 1;

    for (int i = 1; i <= number; i++) {
        factorial = factorial * i;
    }

    System.out.println("Factorial of " + number + " is: " + factorial);
}
