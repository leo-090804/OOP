package Week15_DesignPattern.Sorting;

public class Main {
    public static void main(String[] args) {
        int[] arr = {30, 9, 15, 3, 6, 17, 12, 10, 1, 8, 7};

        SortingContext context = new SortingContext(new BubbleSort());
        context.Sort(arr);

        System.out.println("Bubble Sort:");
        printArray(arr);

        context.setSorting(new SelectionSort());
        context.Sort(arr);

        System.out.println("\nSelection Sort:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int index : arr) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}