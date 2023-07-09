public class Steps {
    public static void main(String[] args) {
        System.out.println((numberOfSteps(142)));
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);

    }

    static int helper(int num, int count) {
        if (num == 0){
            return count;
        }
        if (num % 2 == 0){
            return helper(num/10, count + 1);
        }

        return helper(num/2, count + 1);
    }
}

