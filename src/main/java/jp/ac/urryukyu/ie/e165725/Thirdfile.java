package jp.ac.urryukyu.ie.e165725;

/**
 * Created by okuhamamasakiyo on 2017/02/03.
 */
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Thirdfile {
    String[] list1 = new String[12];
    public void fileRead(String filePath){
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("/Users/okuhamamasakiyo/IdeaProjects/report7/src/main/java/jp/ac/urryukyu/ie/e165725/list3.txt");
            br = new BufferedReader(fr);

            String line;
            for(int i = 0;i<=12;i++) {
                while ((line = br.readLine()) != null) {
                    //System.out.println(line);
                    list1[i]=line;
                    //System.out.printf("%s\n",list1[i]);
                    break;
                }
            }
            System.out.printf("###呪い、継承点、領地###\n");
            int make_hatokura=0;
            for(int i=0;i<1;i++) {
                make_hatokura = (int) (Math.random() * 12);
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
