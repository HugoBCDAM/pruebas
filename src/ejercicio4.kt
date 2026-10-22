fun main() {
    println("\n=== MÚLTIPLOS DE 8 ===\n");
    print("1");

    for (i in 2..500) {
        if (i % 8 == 0) {
            print(" - $i");
        }
    }

    println("\n\n=== MÚLTIPLOS DE 8 ===\n");
}