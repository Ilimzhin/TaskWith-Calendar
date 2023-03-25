package org.example.first;

import java.io.*;

public class TaskOneTryTwo {

    public static void main(String[] args) {
        try {
            File file = new File("newFile2.txt");
            if (!file.exists())
                file.createNewFile();

//            FileWriter fw = new FileWriter(file);
//            fw.write("shit");
//            for (int i = 0; i < 12; i++) {
//                fw.write(i);
//            }
//            fw.close();

            PrintWriter pw = new PrintWriter(file);
            for (int i = 0; i < 3; i++) {
                pw.println(i);
            }
            int randomNumb = (int) (Math.random() * 100);
            pw.println("something");
            pw.println(randomNumb);

            if (randomNumb % 2 == 0) {
                int four = (randomNumb / 2);
                pw.println(four + " divide by 2");
            } else if (randomNumb % 3 == 0) {
                int third = (randomNumb / 3);
                pw.println(third + " divide by 3");
            } else if (randomNumb % 5 == 0) {
                int second = (randomNumb / 5);
                pw.println(second + " divide by 5");
            } else if (randomNumb % 2 != 0 || randomNumb % 3 != 0 || randomNumb % 5 != 0 ){
                pw.println("fuck you");
            }
            pw.close();

//            switch (randomNumb) {
//                case (randomNumb % 2 == 0):
//                    pw.println(randomNumb / 2);
//                    pw.println(" divided by 2");
//                    break;
//            }

            BufferedReader bf = new BufferedReader(new FileReader("newFile2.txt"));
            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
