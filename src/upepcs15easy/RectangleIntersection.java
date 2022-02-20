package upepcs15easy;

import java.util.*;

public class RectangleIntersection {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, List<String>> data = new HashMap<Integer, List<String>>();

        Scanner keyboard = new Scanner(System.in);
        String line;
        int count = 0;

        while (keyboard.hasNextLine()) {
            line = keyboard.nextLine();
            if (line.isEmpty()) {
                break;
            }
            data.put(count, Arrays.asList(line.split(" ")));
            count++;
        }

        for (int i = 0; i < data.size(); i++) {
            for (int j = i + 1; j < data.size(); j++) {


                Double i_xc = Double.parseDouble(data.get(i).get(0));
                Double i_yc = Double.parseDouble(data.get(i).get(1));
                Double i_width = Double.parseDouble(data.get(i).get(2));
                Double i_height = Double.parseDouble(data.get(i).get(3));

                Double j_xc = Double.parseDouble(data.get(j).get(0));
                Double j_yc = Double.parseDouble(data.get(j).get(1));
                Double j_width = Double.parseDouble(data.get(j).get(2));
                Double j_height = Double.parseDouble(data.get(j).get(3));

                Double ix = i_xc - (i_width / 2);
                Double iy = i_yc - (i_height / 2);
                Double ix2 = i_xc + (i_width / 2);
                Double iy2 = i_yc + (i_height / 2);

                Double jx = j_xc - (j_width / 2);
                Double jy = j_yc - (j_height / 2);
                Double jx2 = j_xc + (j_width / 2);
                Double jy2 = j_yc + (j_height / 2);

                if (
                        ((jx >= ix && jx <= ix2) ||
                                (ix >= jx && ix <= jx2))

                                &&
                                ((jy >= iy && jy <= iy2) ||
                                        (iy >= jy && iy <= jy2))
                ) {
                    String sf1 = String.format("Rectangle %d intersects with Rectangle %d", i, j);
                    System.out.println(sf1);
                }
            }
        }
    }
}