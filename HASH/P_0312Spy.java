package HASH;

import java.util.HashMap;

public class P_0312Spy {
	/*
	 * �����̵��� ���� �ٸ� ���� �����Ͽ� �Ծ� �ڽ��� �����մϴ�.
	 * 
	 * ���� ��� �����̰� ���� ���� �Ʒ��� ���� ���� �����̰� ���׶� �Ȱ�, �� ��Ʈ, �Ķ��� Ƽ������ �Ծ��ٸ� �������� û������ �߰��� �԰ų�
	 * ���׶� �Ȱ� ��� ���� ���۶󽺸� �����ϰų� �ؾ� �մϴ�.
	 * 
	 * �����̰� ���� �ǻ���� ��� 2���� �迭 clothes�� �־��� �� ���� �ٸ� ���� ������ ���� return �ϵ��� solution �Լ���
	 * �ۼ����ּ���.
	 * 
	 * clothes�� �� ���� [�ǻ��� �̸�, �ǻ��� ����]�� �̷���� �ֽ��ϴ�. �����̰� ���� �ǻ��� ���� 1�� �̻� 30�� �����Դϴ�. ����
	 * �̸��� ���� �ǻ��� �������� �ʽ��ϴ�. clothes�� ��� ���Ҵ� ���ڿ��� �̷���� �ֽ��ϴ�. ��� ���ڿ��� ���̴� 1 �̻� 20 ������
	 * �ڿ����̰� ���ĺ� �ҹ��� �Ǵ� '_' �θ� �̷���� �ֽ��ϴ�. �����̴� �Ϸ翡 �ּ� �� ���� �ǻ��� �Խ��ϴ�.
	 */
	public static int solution(String[][] clothes) {
	    HashMap<String, Integer> map = new HashMap<>();
	    // �� ������ key�� ���ͼ� �������� 
	    
	    
        for (int i=0; i<clothes.length; i++) {
            String key = clothes[i][1];

            
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }

        
        
        int answer = 1;//�����ٲ��ϱ� 
        
        for (String key : map.keySet()) { //�� ������ŭ �����ƴϾ� 
            answer *= map.get(key) + 1;
            
        }
        

        return answer - 1;
    
	}

	public static void main(String[] args) {
		//String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				//{ "green_turban", "headgear" } };

		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"},
		 {"smoky_makeup", "face"}};

		System.out.println(solution(clothes));

	}
}
