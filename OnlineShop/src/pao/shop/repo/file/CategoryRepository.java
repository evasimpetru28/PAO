package pao.shop.repo.file;


import pao.shop.entity.catalog.Category;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {

    private static FileReader fin;
    private static FileWriter fout;
    private static CategoryRepository scs;

    private CategoryRepository() throws IOException {
        fin = new FileReader("categories_in.txt");
        fout = new FileWriter("categories_out.txt", true);

    }

    public static CategoryRepository getInstance() throws IOException {
        if (scs == null) {
            scs = new CategoryRepository();
        }
        return scs;
    }

    public static List<Category> readFromFile() throws IOException {

        BufferedReader br = new BufferedReader(fin);
        String line;
        line = br.readLine();
        List<Category> categList = new ArrayList<>();

        while (line != null) {
            String words[] = line.split(",");
            String category = "[" + words[0] + ", " + words[1] + "]";
           // System.out.println(words[0] + " " + words[1]);
            line = br.readLine();

            Category categ = new Category(words[0], Integer.valueOf(words[1]));
            categList.add(categ);

        }

        fin.close();
        return categList;
    }

    public static void writeToFile() throws IOException {

        BufferedReader br = new BufferedReader(fin);
        //   BufferedWriter bw = new BufferedWriter(fout);
        String line;
        line = br.readLine();

        while (line != null) {
            String words[] = line.split(",");
            String category = "[" + words[0] + ", " + words[1].trim() + "]";
            System.out.println(words[0] + " " + words[1].trim());
            //     bw.append(category);
            //    bw.append("\n");
            line = br.readLine();
        }

        //   bw.flush();
        fin.close();
        //   bw.close();

    }
}