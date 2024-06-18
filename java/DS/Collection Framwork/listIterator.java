import java.util.*;
public class listIterator {
    public static void main(String[] args) {
        List<String> lis= new ArrayList<>();
        lis.add("ads");
        lis.add("fgfd");
        lis.add("dee");
        lis.add("wtte");
        lis.add("gdn");
        for(String fr:lis){
            System.out.print(fr+" ");
        }
        System.out.println("");
        Iterator<String> fru=lis.iterator();
        while(fru.hasNext()){
            System.out.print(fru.next()+" ");
        }
    }
}