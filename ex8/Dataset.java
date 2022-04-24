import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Dataset {
    private ArrayList<Double> data;


    Dataset(String filename) throws IOException {
        data = new ArrayList<Double>();
        Scanner in = new Scanner(new FileReader(filename));
        while(in.hasNext()) {
            data.add(in.nextDouble());
        }
    }

    public int size() {
        return data.size();
    }

    public double meanValue() {
        if(data.isEmpty()) {
            throw new ArithmeticException("Empty dataset");
        }
        double sum = 0;
        for(double d : data) {
            sum += d;
        }
        return sum / data.size();
    }

}
