package HASH;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*����Ʈ voca���� �� ���� �ܾ ����Ǿ� �ִ�.(�ߺ��� �ܾ���� �ִ�), 
 * �� �ܾ voca�� ��ŭ �ߺ��Ǿ� ����Ǿ� �ִ� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(�ݵ�� ����(Map)�� �̿��Ѵ�)
voca=['rose','candle','paper','book','song','candle',
            'berry','paper','berry','song','paper','rose',
            'song','lion','berry','rose','book','rose','rose']
���
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