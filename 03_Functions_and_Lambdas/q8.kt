fun String.isPalindrome(): Boolean {
    val cleaned = this.lowercase()
        .replace(Regex("[^а-яa-z]"), "")

    return cleaned == cleaned.reversed()
}

fun main() {
    print("Enter words: ")
    val input = readln()

    if (input.isPalindrome()) {
        println("Palindrome")
    } else {
        println("Not Palindrome")
    }
}

