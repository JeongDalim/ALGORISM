package HASH;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*리스트 voca에는 몇 개의 단어가 저장되어 있다.(중복된 단어들이 있다), 
 * 각 단어가 voca에 얼만큼 중복되어 저장되어 있는 지를 출력하는 프로그램을 작성하시오.(반드시 사전(Map)을 이용한다)
voca=['rose','candle','paper','book','song','candle',
            'berry','paper','berry','song','paper','rose',
            'song','lion','berry','rose','book','rose','rose']
출력
candel : 2 times
rose : 5 times
song : 3 times
*/
public class P_0310SearchVoca {
   public static int main(String[] args) {
      List<String> voca = new ArrayList<String>();
      voca.add("rose");
      voca.add("candle");
      voca.add("paper");
      voca.add("book");
      voca.add("song");
      voca.add("candle");
      voca.add("berry");
      voca.add("paper");
      voca.add("berry");
      voca.add("song");
      voca.add("paper");
      voca.add("rose");
      voca.add("song");
      voca.add("lion");
      voca.add("berry");
      voca.add("rose");
      voca.add("book");
      voca.add("rose");

      int cnt=0;
      Map<String,Integer> map = new HashMap<String, Integer>();
      for(int i=0; i<voca.size();i++) {
         for(int j=0; j<voca.size();j++) {
         if(voca.get(i).equals(voca.get(j))) {
            cnt++;
            map.put(voca.get(i),cnt);
         }
      }
         cnt=0;
      }
      
      Set<Entry<String, Integer>> set =map.entrySet();
      Iterator<Entry<String, Integer>> iter = set.iterator();
      while(iter.hasNext()) {
    	  System.out.println(iter.next()+"times");
    	  
   }
  
      return 0;
}
  
}