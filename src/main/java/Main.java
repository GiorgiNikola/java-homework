public class Main {
    public static void main(String[] args) {
        int a = add(300, 45);
        int a1 = add(128328, 253);
        int a2 = add(7376, 23424);
        int a3 = add(2352, 4564);
        int s = subtract(523846, 12523);
        int s1 = subtract(12415, 8567465);
        int s2 = subtract(234645, 934536);
        int s3 = subtract(5214, 3352);

        int[] additionResults = new int[]{a, a1, a2, a3};
        int[] subtractionResults = new int[]{s, s1, s2, s3};
        System.out.println("Addition results with for loop: ");
        for (int i = 0; i < additionResults.length; i++){
            if (additionResults[i] % 2 == 0) {
                System.out.println("even " + additionResults[i]);
            }else{
                System.out.println("odd " + additionResults[i]);
            }
        }
        System.out.println("Subtraction results with for loop: ");
        for (int i = 0; i < subtractionResults.length; i++){
            if (subtractionResults[i] % 2 == 0) {
                System.out.println("even " + subtractionResults[i]);
            }else{
                System.out.println("odd " + subtractionResults[i]);
            }
        }

        int i = 0;
        System.out.println("Addition results with while loop: ");
        while (i < additionResults.length){
            if (additionResults[i] % 2 == 0) {
                System.out.print("even " + additionResults[i] + " ");
            }else{
                System.out.print("odd " + additionResults[i] + " ");
            }
            i++;
        }
        System.out.println("\nSubtraction results with while loop: ");
        i = 0;
        while (i < subtractionResults.length){
            if (subtractionResults[i] % 2 == 0) {
                System.out.print("even " + subtractionResults[i] + " ");
            }else{
                System.out.print("odd " + subtractionResults[i] + " ");
            }
            i++;
        }
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }


}
