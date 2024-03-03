package com.referencebook.lambdaexpressions;

public class LamdaDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int specialNum = 20;

        NumberTest calcAvg = (array) -> {
            if(array.length == 0) {
                throw new EmptyArrayException();
            }
            int sum = 0;
//            sum += specialNum;
            for(int el : array) sum += el;
            return (int)(sum/array.length);
        };

        specialNum = 100;

        try {
            System.out.println(calcAvg.test(arr));
            System.out.println(calcAvg.test(new int[] {}));
        }
        catch (EmptyArrayException ex) {
            System.out.println(ex);
        }
    }
}
