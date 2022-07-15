package 자바_오후_수업;

public class java1_181 {
    public static void main(String[] arg) {
        //7번 문제 주어진 배열의 항목에서 최대값을 구해보세요. (for문 이용)
        int max = 0;
        int[] array = {1, 5, 3, 8, 2};

        for(int i=0; i<array.length; i++) {
            if(array[i] > max) {
                max=array[i];
            }
        }
        System.out.println(max);

        //향상된 for문을 사용한 풀이
        int max1 = 0;
        int []array1 = {1, 5, 3, 8, 2};
        for(int a : array) {
            if(max < a)
                max = a;
        }
        System.out.println(max);

        //8번 문제
        
    }


}
