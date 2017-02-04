package jp.ac.uryukyu.ie.e165725;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by okuhamamasakiyo on 2017/02/04.
 */
public class RandomTest3 {
    /**
     * * 「ランダムが実行されている」ことを確認。
     * * @throws Exception
     */
    @Test
    public void Random3() throws Exception{
        int make_hatokura=0;
        for(int i=0;i<1;i++) {
            make_hatokura = (int) (Math.random() * 12);
            System.out.println(make_hatokura);
        }
    }
}
