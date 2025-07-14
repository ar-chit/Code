class basic {
    public static void printName(String name, int times, int i) {
        if (i >= times) {
            return;
        }
        System.out.println(name);
        printName(name, times, i + 1);
    }
    public static void main(String[] args) {
        printName("Archit", 5, 0);
    }
}