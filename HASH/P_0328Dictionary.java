package HASH;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * �Ʒ��� ���� studnent ����(map)�� �̸��� ������ ����Ǿ� �ִ�.
 * (�̸��� "Ű"�̹Ƿ� ���� �̸��� ���ٰ� �����Ѵ�)
 *  Ű���� �Է� : Enter Name : kim
 * 	Out : park : 87, jong :95 , Lee : 90, bbb: 85, hong :88
 * * 
 */

//

public class P_0328Dictionary {
	static Map <String, Integer> student = new HashMap<String, Integer>();
	public static void main(String[] args) {
		
		student.put("park", 87); student.put("jong", 95);
		student.put("kim", 79); student.put("Scott", 78);
		student.put("Lee", 90); student.put("bbb", 85);
		student.put("Hong", 88); student.put("bbb", 79);

	      Scanner scn=new Scanner(System.in);
	      System.out.println("Ű�����Է� : ");
	      String na=scn.next();
	      int age=0;
	      if(student.containsKey(na)) {
	         age=student.get(na);
	      }
	      
	      Set<String> set = student.keySet();
	      Iterator iter =set.iterator();
	      while(iter.hasNext()) {
	         String key =(String)iter.next();
	         if(student.get(key)>age)
	            System.out.println(key + ":" + student.get(key));
	      }
	   }

	}
				
				
				

