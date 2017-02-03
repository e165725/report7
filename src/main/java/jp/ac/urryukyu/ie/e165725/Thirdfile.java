package jp.ac.urryukyu.ie.e165725;

/**
 * Created by okuhamamasakiyo on 2017/01/31.
 */

import java.io.*;
public class Thirdfile {
    public static void main(String args[]){
        String[] list3 = new String[12];
        try{
            File file = new File("/Users/okuhamamasakiyo/IdeaProjects/report7/src/main/java/jp/ac/urryukyu/ie/e165725/list3.txt");
            if (checkBeforeReadfile(file)){
                BufferedReader br = new BufferedReader(new FileReader(file));

                String str;
                for(int i = 0;i<=12;i++) {
                    while((str = br.readLine()) != null){
                        list3[i]=str;
                        System.out.printf("%s\n",list3[i]);
                    }
                }
                br.close();
            }else{
                System.out.println("ファイルが見つからないか開けません");
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    private static boolean checkBeforeReadfile(File file){
        if (file.exists()){
            if (file.isFile() && file.canRead()){
                return true;
            }
        }

        return false;
    }

}
