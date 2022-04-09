import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // 0 0 0 0 0 0
        int n = arr.length;
        // 求所有的子集
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                // 判断i的第j位是否为1
                // 如果为1，则将该元素添加到list中
                // 如果为0，则不添加
                if ((i & (1 << j)) != 0) {
                    list.add(arr[j]);
                }
            }
            result.add(list);
        }
        writeToFile(result);

    }

    public static void writeToFile(List<List<Integer>> res) {
        try {
            FileWriter writer = new FileWriter("set.txt");
            writer.write("------------------\nn=6" + ", " + "A={1,2,3,4,5,6}\n------------------\n");
            for (List<Integer> list : res) {
                if (list.size() == 0) {
                    writer.write("{}\n");
                    continue;
                }
                writer.write("{");
                for (int i : list) {
                    if (list.indexOf(i) == list.size() - 1) {
                        writer.write(i + "}");
                    } else {
                        writer.write(i + ",");
                    }

                }
                writer.write("\n");
            }
            writer.write("------------------\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
