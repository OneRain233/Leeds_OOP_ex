public class MeanValue {
    public static double meanValue(double[] data) {
        double mean = 0;
        for (int i = 0; i < data.length; i++) {
            mean += data[i];
        }
        return mean / data.length;
        
    }
  
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Usage: java MeanValue <values...>");
            System.exit(1);
        }

        double[] data = new double[args.length];
        for(int i = 0; i < args.length; i++) {
            data[i] = Double.parseDouble(args[i]);
        }
        System.out.printf("%.3f\n", meanValue(data));
    }
  }