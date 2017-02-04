package jp.ac.urryukyu.ie.e165725;

/**
 * Created by okuhamamasakiyo on 2017/01/25.
 */
public class Main {
    public static void main(String args[]) {//他のクラスから呼び出している
        Firstfile firstfile = new Firstfile();
        firstfile.fileRead("/Users/okuhamamasakiyo/IdeaProjects/report7/src/main/java/jp/ac/urryukyu/ie/e165725/list1.txt");
        Secondfile secondfile = new Secondfile();
        secondfile.fileRead("/Users/okuhamamasakiyo/IdeaProjects/report7/src/main/java/jp/ac/urryukyu/ie/e165725/list2.txt");
        Thirdfile thirdfile = new Thirdfile();
        thirdfile.fileRead("/Users/okuhamamasakiyo/IdeaProjects/report7/src/main/java/jp/ac/urryukyu/ie/e165725/list3.txt");
    }
}