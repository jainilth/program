import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

class Intervals{
    int start;
    int end;
    public Intervals(int start,int end){
        this.start=start;
        this.end=end;
    }
}
public class Overlapping {
    static void mergeIntervals(Intervals arr[]){
        if(arr.length==0){
            System.out.println("array is empty");
            return;
        }
        Stack<Intervals> s1=new Stack<>();
        Arrays.sort(arr, new Comparator<Intervals>() {
            public int compare(Intervals i1, Intervals i2)
            {
                return i1.start - i2.start;
            }
        });
        s1.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            Intervals top=s1.peek();
            if(top.end<arr[i].start){
                s1.push(arr[i]);
            }
            else{
                top.end=arr[i].end;
                s1.pop();
                s1.push(top);
            }
        }
        System.out.println();
        while (!s1.isEmpty()) {
            Intervals t = s1.pop();
            System.out.print("[" + t.start + "," + t.end
                             + "] ");
        }
    }
    public static void main(String[] args) {
        Intervals arr[]=new Intervals[4];
        arr[0] = new Intervals(1,3);
        arr[1] = new Intervals(2,4);
        arr[2] = new Intervals(6,8);
        arr[3] = new Intervals(9,10);
        mergeIntervals(arr);
    }
}
