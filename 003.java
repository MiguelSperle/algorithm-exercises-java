//  # CHALLENGE - 003
//  The challenge is basically: [ Ask for a word, show the number of vowels and what these vowels are ]

void main() {
    final Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a word: ");
    final String word = scanner.nextLine();

    scanner.close();

    int count = 0;
    final List<Character> vowelsList = new ArrayList<>();

    for (int i = 0; i < word.length(); i++) {
        final char letter = word.charAt(i);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            count++;
            vowelsList.add(letter);
        }
    }

    if (count == 0) {
        System.out.println("The word " + word + " has no vowel");
        return;
    }

    System.out.println("The word '" + word + "' has " + count + " vowel(s)");
    System.out.println("These are the vowels contained in the word " + word + " -> " + vowelsList);
}
