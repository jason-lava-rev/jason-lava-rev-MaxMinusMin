
import java.util.List;
import java.util.ArrayList;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){

        List<Integer> list = new ArrayList<Integer>(nums);

        int max = 0;
        int min = list.get(0);

        for (int i = 0; i < list.size(); i++) {

            if (max < list.get(i)) {
                max = list.get(i);
            } 
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
    int result = (max - min);
    return result;
}
}