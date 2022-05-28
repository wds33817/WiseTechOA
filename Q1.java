import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMaxUnits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY boxes
     *  2. LONG_INTEGER_ARRAY unitsPerBox
     *  3. LONG_INTEGER truckSize
     *
     *  1. Efficient Shipping:
     *
     *  A warehouse manager needs to create a shipment to fill a truck. All of
     *  the products in the warehouse are in boxes of the same size. Each product
     *  is packed in some number of units per box. Given the number of boxes the
     *  truck can hold, determine the maximum number of units of any mix of
     *  products that can be shipped.
     *
     *  e.g.:
     *  boxes = [1,2,3]
     *  unitsPerBox = [3,2,1]
     *  truckSize = 3
     *
     *  boxes = [3,1,6]
     *  unitsPerBox = [2,7,4]
     *  truckSize = 6
     *
     *  The maximum number of units that can be shipped is 3 + 2 + 2 = 7 units
     *
     *  Constraints:
     *  1 <= |boxes| <= 10^5;
     *  |boxes| == |unitsPerBox|
     *  1 <= boxes[i] <= 10^7;
     *  1 <= unitsPerBox[i] <= 10^5;
     *  1 <= truckSize <= 10^8;
     *
     *  The first line contains an integer, n, the size of boxes.
     *  Each of the following n lines contains a long integer describing the
     *  number of units per box for each product i, unitsPerBox[i].
     *  The last line contains a long integer, truckSize, that denotes the number
     *  of boxes the truck can carry.
     *
     *  STDIN         Function
     *  1      ->     boxes[] size n = 1
     *  1      ->     boxes = [1]
     *  1      ->     unitsPerBox[] size n = 1
     *  2      ->     unitsPerBox = [2]
     *  1      ->     truckSize = 1
     *
     *  Sample Output
     *  2
     *
     *
     *  STDIN         Function
     *  3      ->     boxes[] size n = 3
     *  1      ->     boxes = [1]
     *  2      ->     boxes = [2]
     *  3      ->     boxes = [3]
     *  3      ->     unitsPerBox[] size n = 3
     *  3      ->     unitsPerBox[3]
     *  2      ->     unitsPerBox[2]
     *  1      ->     unitsPerBox[1]
     *  3      ->     truckSize = 3
     *  Sample Output
     *  7
     *
     */
    private static long maxvalue = Long.MIN_VALUE;
    public static long getMaxUnits(List<Long> boxes, List<Long> unitsPerBox, long truckSize) {
        //please add wechat at "LeeLock518" and pay through paypal u3193382@uni.canberra.edu.au to unlock the answer.
        //email me at wds3817@gmail.com
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int boxesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> boxes = IntStream.range(0, boxesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Long::parseLong)
                .collect(toList());

        int unitsPerBoxCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> unitsPerBox = IntStream.range(0, unitsPerBoxCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Long::parseLong)
                .collect(toList());

        long truckSize = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.getMaxUnits(boxes, unitsPerBox, truckSize);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
