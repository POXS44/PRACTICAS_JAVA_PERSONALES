package pluralsight.ForArrays;

public class ArraysFor {

    public static void main (String[] args){
        //Code
        double[] original = new double[4];

        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = original;

        for (int i = 0; i<opCodes.length; i++){
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                default:
                    System.out.println("Invalid opCode" + opCodes[i]);
                    break;
            }
            System.out.println(original[i]);
        }
    }
}
