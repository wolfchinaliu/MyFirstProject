package demo;

/**
 * Created by wolf on 2016/11/29.
 * @author wolf
 * @version 1.0
 * 二分查找法
 */
public class BinarySearch {
    /**
     *
     * @param key 要查找的值
     * @param a 查询的数组
     * @return  如果存在则返回查询到的值在该数组的下标，如果不存在则返回-1
     */
    public static int rank(int key,int[] a){
        //用二分查找的数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo<=hi){
            //被查找的key要不不存在，要不肯定在a[0,hi]之中
            int mid = lo + (hi-lo)/2;
            if(key<a[mid]) hi = mid-1;
            else if(key>a[mid]) lo = mid+1;
            else    return mid;
        }
        //如果没在则返回-1
        return  -1;
    }
    public static void main(String[] args) {
        //测试二分查找法
        /*int[] arr = new int[]{12,13,15,31,21,45,64,313,454,746,213,8745,13165,1341354,4513};
        Arrays.sort(arr);
        int rank = BinarySearch.rank(313, arr);
        System.out.println(rank);*/
        int[] arr = new int[1000000];
        for(int i=0;i<1000000;i++){
            arr[i] = i;
        }
        System.out.println(arr[BinarySearch.rank(500000,arr)]);
    }
}
