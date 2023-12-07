package Week15_DesignPattern.Sorting;

public class SortingContext {
    private Sorting sorting;

    public SortingContext(Sorting sorting) {
        this.sorting = sorting;
    }

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    public void Sort(int[] arr) {
        sorting.sortingAlgorithm(arr);
    }
}

