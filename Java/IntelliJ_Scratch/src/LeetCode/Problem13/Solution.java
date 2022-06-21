package LeetCode.Problem13;

class Solution {
    enum Numeral {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
        int weight;
        Numeral(int weight) {
            this.weight = weight;
        }
    }

    public int romanToInt(String s) {
        int value = 0;
        int i = 0;
        if (s.length()==1) {
            return Numeral.valueOf(s).weight;
        } else {
            while (i < s.length()-1) {
                int currentNumeral = Numeral.valueOf(s.substring(i,i+1)).weight;
                int nextNumeral = Numeral.valueOf(s.substring(i+1,i+2)).weight;
                if (nextNumeral>currentNumeral) {
                    value+=(nextNumeral-currentNumeral);
                    i+=2;
                } else {
                    value+=currentNumeral;
                    i++;
                }
            }
            if (i < s.length()) {
                value+=Numeral.valueOf(s.substring(i,i+1)).weight;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        for (Numeral numeral: Numeral.values()) {
            System.out.printf("The numeral %s has value %d%n", numeral, numeral.weight);
        }
        String testString = "IV";
        for (Numeral numeral: Numeral.values()) {
            if (numeral.equals(testString)){
                System.out.printf("The numeral %s has value %d%n", numeral, numeral.weight);
            } else {
                System.out.println("Numeral not found");
            }
        }
        System.out.println(Numeral.valueOf("XV").weight);
    }

}