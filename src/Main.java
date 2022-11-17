import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<List<Integer>> lists = div (numbers,5);
        System.out.println(lists);


    }
    public static List<List<Integer>> div (List<Integer> numbers, int count){
        List<List<Integer>> divided = new ArrayList<>();
        int sizeOfEachList = numbers.size()/count;
        int index = 0;
        for (int i=0; i<count; i++){
            List<Integer> list = new ArrayList<>();
            for (int j=0; j<sizeOfEachList;j++){
                list.add(numbers.get(index));
                index++;

            }
            divided.add(list);
        }
        if(numbers.size() % count !=0){
            List<Integer> lastList = new ArrayList<>();
            divided.add(lastList);
            for (int i=index; i>numbers.size();i++){
                lastList.add(numbers.get(i));
            }
        }
        return divided;
    }



}