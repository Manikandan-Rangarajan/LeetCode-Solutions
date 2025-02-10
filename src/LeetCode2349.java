import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeetCode2349 {
    public static void main(String[] args) {
        NumberContainers obj = new NumberContainers();
        obj.change(1,10);
        obj.change(2,20);
        obj.change(3,10);
        System.out.println(obj.find(20));
    }
}

class NumberContainers {

    public NumberContainers() {
        numToIndex = new HashMap<>();
        indexToNumber = new HashMap<>();
    }

    public void change(int index, int number) {
        indexToNumber.put(index,number);
        numToIndex.computeIfAbsent(number, k ->new PriorityQueue<>()).add(index);
    }

    public int find(int number) {
        if(!numToIndex.containsKey(number)){
            return -1;
        }
        PriorityQueue<Integer> mheap = numToIndex.get(number);

        while(!mheap.isEmpty()){
            int index = mheap.peek();
            if(indexToNumber.get(index) == number){
                return index;
            }
            mheap.poll();
        }
        return -1;
    }
    private Map<Integer, PriorityQueue<Integer>> numToIndex;
    private Map<Integer,Integer> indexToNumber;
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */