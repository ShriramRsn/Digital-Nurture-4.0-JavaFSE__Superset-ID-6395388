public class BinarySearch {
    public int binarySearch(Book[] books, String title){
        int left = 0;
        int right = books.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int cmp = title.compareTo(books[mid].getTitle());
            if (cmp == 0) {
                return mid;
            } else if (cmp > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
