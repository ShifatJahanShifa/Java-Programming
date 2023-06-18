import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort3 {
    public static void main(String[] args) {
        List<Time2> list = new ArrayList<Time2>();

        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 5, 34));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 24, 22));

        System.out.printf("Unsorted array elements:\n");
        for(Time2 time:list)
        {
            System.out.printf("%d:%2d:%2d %s ",time.getHour()==0 || time.getHour()==12 ?12 : time.getHour()%12,time.getMinute(),time.getSecond(),time.getHour()<12 ? "AM":"PM" );
        }
        System.out.println("");

        Collections.sort(list,new TimeComparator());

        System.out.printf("Sorted array elements:\n");
        for(Time2 time:list)
        {
            System.out.printf("%d:%02d:%02d %s ",time.getHour()==0 || time.getHour()==12 ?12 : time.getHour()%12,time.getMinute(),time.getSecond(),time.getHour()<12 ? "AM":"PM" );
        }
    }
}
