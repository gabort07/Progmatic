//public class BinarYSearch {
//
//    public class BinarySearcher {
//
//        public static void main(String[] args) {
//
//
//        }
//
//        public static int findIndex(int[] array, int valueToFind) {
//
//            int left = 0, right = array.length - 1;
//            while (left <= right) {
//                int middle = (left + right) / 2;
//                if (array[middle] < valueToFind) {
//                    left = middle + 1;
//                } else if (array[middle] > valueToFind) {
//                    right = middle - 1;
//                } else {
//                    return middle;
//
//                }
//            }
//            return -1;
//        }
//    }
//
//}