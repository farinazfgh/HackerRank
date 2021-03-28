package problemsolving.basic;

import java.util.Arrays;
import java.util.Collections;

public class MarcCakewalk {
    static long marcsCakewalk(Integer[] calorie) {
        long sum = 0;
        Arrays.sort(calorie, Collections.reverseOrder());
        for (int i = 0; i < calorie.length; i++) {
            sum += Math.pow(2, i) * calorie[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] array1 = {819, 701, 578, 403, 50, 400, 983, 665, 510, 523, 696, 532, 51, 449, 333, 234, 958, 460, 277, 347, 950, 53, 123, 227, 646, 190, 938, 61, 409, 110, 61, 178, 659, 989, 625, 237, 944, 550, 954, 439};
        Integer[] array2 = {801, 234, 536, 747, 172, 590, 833, 847, 509, 429, 666, 411, 609, 894, 348, 254, 814, 767, 647, 965, 711, 801, 852, 781, 972, 390, 218, 290, 508, 174, 55, 714, 442, 284, 745, 872, 46, 131, 833, 315};
        System.out.println(marcsCakewalk(array1));
        System.out.println(marcsCakewalk(array2));

    }
}
