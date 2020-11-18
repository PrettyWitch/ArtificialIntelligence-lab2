package Fruit;

import java.util.Arrays;

/**
 * @author yuhan
 * @date 14.11.2020 - 16:39
 * @purpose
 */
public class method {

    public static void Euclidean(int[] a, int[] b){
        double result = 0;
        for (int i = 0; i <a.length; i++) {
            result += Math.pow(a[i] - b[i], 2);
        }
        System.out.printf("Euclidean distance: %.2f \n" , result);
    }

    public static void Manhattan(int[] a, int[] b){
        double result = 0;
        for (int i = 0; i <a.length; i++) {
            result += Math.abs(a[i] - b[i]);
        }

        System.out.println("Manhattan distance: " + result);
    }

    public static void Minkowski(int[] a, int[] b){
        double result = 0;
        double p =1.5;
        for (int i = 0; i <a.length; i++) {
            result += Math.pow(Math.abs(a[i] - b[i]), p );
        }
        result = Math.pow(result, 1/p);
        System.out.printf("Minkowski distance: %.2f \n" , result);
    }

    public static void Cosine(int[] a, int[] b){
        double result = 0;
        double temp1 = 1,temp2 = 1,temp3= 1;
        for (int i = 0; i <a.length; i++) {
            temp1 += a[i] * b[i];
            temp2 += Math.pow(a[i],2);
            temp3 += Math.pow(b[i],2);
        }
        result = temp1 / (Math.sqrt(temp2) * Math.sqrt(temp3));
        System.out.printf("The cosine similarity is: %.2f\n" , result);
    }


    public static int[] tra(Fruit fruit, Fruit fruit1){
        int[] a = new int[9];
        a[0] = fruit.getId();
        a[1] = fruit.getImport() ? 1 :0;
        a[2] = fruit.getWeight();
        a[3] = fruit.getPrice();
        a[4] = fruit.getDiscount();
        a[5] = fruit.getShelfLife();
        if(fruit.getSweetness().equals(fruit1.getSweetness())){
            a[6] = 1;
        }
        else{
            a[6] = 0;
        }
        if(fruit.getHardness().equals(fruit1.getHardness())){
            a[7] = 1;
        }
        else{
            a[7] = 0;
        }
        if(fruit.getFood().equals(fruit1.getFood())){
            a[8] = 1;
        }
        else{
            a[8] = 0;
        }
        System.out.println("a[]: " + Arrays.toString(a));
        return a;
    }

    public static int[] tra2(Fruit fruit){
        int[] b = new int[9];
        b[0] = fruit.getId();
        b[1] = fruit.getImport() ? 1 :0;
        b[2] = fruit.getWeight();
        b[3] = fruit.getPrice();
        b[4] = fruit.getDiscount();
        b[5] = fruit.getShelfLife();
        b[6] = 0;
        b[7] = 0;
        b[8] = 0;
        System.out.println("b[]: " +Arrays.toString(b));
        return b;
    }

    public static int[] transfer(int a){
        String str = null;
        str = Integer.toString(a);
        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            char c = str.charAt(i);
            String s = String.valueOf(c);
            int num = Integer.parseInt(s);
            arr[i] = num;
        }
//        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void disNode(int a, int b){
        int[] a1 = transfer(a);
        int[] b1 = transfer(b);
        int temp = 0;
        int affinity = 0;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == b1[i]){ temp++;} else break;
        }
        affinity = a1.length + b1.length - temp * 2 - 1;
        System.out.println("The affinity by tree is: " + affinity);
    }

    public static void getPearsonCorrelation(int[] xData, int[] yData) {
        if (xData.length != yData.length)
            throw new RuntimeException("数据不正确！");
        double xMeans;
        double yMeans;
        double numerator = 0;// 求解皮尔逊的分子
        double denominator = 0;// 求解皮尔逊系数的分母

        double result = 0;
        // 拿到两个数据的平均值
        xMeans = getMeans(xData);
        yMeans = getMeans(yData);
        // 计算皮尔逊系数的分子
        numerator = generateNumerator(xData, xMeans, yData, yMeans);
        // 计算皮尔逊系数的分母
        denominator = generateDenomiator(xData, xMeans, yData, yMeans);
        // 计算皮尔逊系数
        result = numerator / denominator;
        System.out.printf("The Pearson correlation is: %.2f\n ", result);
    }

    //分子
    private static double generateNumerator(int[] xData, double xMeans, int[] yData, double yMeans) {
        double numerator = 0.0;
        for (int i = 0; i < xData.length; i++) {
            numerator += (xData[i] - xMeans) * (yData[i] - yMeans);
        }
        return numerator;
    }

    //分母
    private static double generateDenomiator(int[] xData, double xMeans, int[] yData, double yMeans) {
        double xSum = 0.0;
        for (int i = 0; i < xData.length; i++) {
            xSum += (xData[i] - xMeans) * (xData[i] - xMeans);
        }
        double ySum = 0.0;
        for (int i = 0; i < yData.length; i++) {
            ySum += (yData[i] - yMeans) * (yData[i] - yMeans);
        }
        return Math.sqrt(xSum) * Math.sqrt(ySum);
    }

    //平均值
    private static double getMeans(int[] datas) {
        double sum = 0.0;
        for (int i = 0; i < datas.length; i++) {
            sum += datas[i];
        }
        return sum / datas.length;
    }
}
