package algorithmsettings;

import static algorithmsettings.BinarySearch.lists;

public class Main {
    public static void main(String[] args) {
        System.out.println(BinarySearch.binarySearch(lists,2));
        System.out.println(BinarySearch.binarySearch(lists,11));
        System.out.println(BinarySearch.binarySearch(lists,79));
        System.out.println(BinarySearch.binarySearch(lists,1));
        System.out.println(BinarySearch.binarySearch(lists,5));
        System.out.println(BinarySearch.binarySearch(lists,80));
    }
}
