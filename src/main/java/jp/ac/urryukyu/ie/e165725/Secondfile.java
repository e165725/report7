package jp.ac.urryukyu.ie.e165725;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * Created by okuhamamasakiyo on 2017/01/31.
 */
public class Secondfile {
    String[] list1 = new String[28];
    public void fileRead(String filePath){
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("/Users/okuhamamasakiyo/IdeaProjects/report7/src/main/java/jp/ac/urryukyu/ie/e165725/list2.txt");
            br = new BufferedReader(fr);

            String line;
            for(int i = 0;i<=28;i++) {
                while ((line = br.readLine()) != null) {
                    list1[i]=line;
                    break;
                }
            }
            System.out.printf("###攻撃カード###\n");
            int make_hatokura=0;
            for(int i=0;i<=2;i++) {
                make_hatokura = (int) (Math.random() * 28);
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
