public class HIndexII {
    /**
     * [0, 1, 4, 5, 6]
     *
     * time : O(logn) space : O(1)
     */
    public int hIndex(int[] citations) {
        int len = citations.length;
        int start = 0, end = len - 1;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (citations[mid] == len - mid) {
                return len - mid;
            } else if (citations[mid] < len - mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return len - start;
    }
}