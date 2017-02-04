package jp.ac.urryukyu.ie.e165725;

/**
 * Created by okuhamamasakiyo on 2017/02/03.
 */

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Firstfile {

    String[] list1 = new String[71];//リストの用意
    public void fileRead(String filePath){
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("/Users/okuhamamasakiyo/IdeaProjects/report7/src/main/java/jp/ac/urryukyu/ie/e165725/list1.txt");
            br = new BufferedReader(fr);
            String line;
            for(int i = 0;i<=71;i++) {
                while ((line = br.readLine()) != null) {
                    list1[i]=line;
                    break;
                }
            }
            System.out.printf("###行動カード###\n");
            int make_hatokura=0;
            for(int i=0;i<=3;i++) {
                make_hatokura = (int) (Math.random() * 71);
                System.out.println(list1[make_hatokura]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
