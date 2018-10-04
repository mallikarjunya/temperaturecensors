import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TemparatureSensor {
	
	public ArrayList read() {
		ArrayList result = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<count;i++) {
			String s = sc.nextLine();//1,10000,40
			ArrayList temp = new ArrayList(Arrays.asList(s.split(",")));
			result.add(temp);
		}
		System.out.println(result);
		return result;
	}
	public static void printMap(Map mp) {
	    Iterator it = mp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + ": " + pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}
	public int sumOfArrayListValues(ArrayList m) {
		int i;
		int sum = 0;
		for(i = 0; i < m.size(); i++)
		    sum += Integer.parseInt(m.get(i).toString());
		return sum;
	}
	public  ArrayList calculateAvgTemparature(Map mp) {
		ArrayList a = new ArrayList();
		//System.out.println("calculateAvgTemparature--------"+mp);
		ArrayList temp = new ArrayList<>();
	    Iterator it = mp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.print(pair.getKey() + ":  ");
	        int result = sumOfArrayListValues( (ArrayList)pair.getValue());
	        int size= ((ArrayList)pair.getValue()).size();
	        float f= (float)result/size;
	        System.out.printf("%.2f", f);
	        a.add(pair.getKey()+": "+f);
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	    return a;
	}
	public HashMap getRangeOfImputs(ArrayList input) {
		ArrayList temp = new ArrayList();
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		HashMap<String, ArrayList> result = new HashMap<String, ArrayList>();
		for(int i=0;i<input.size();i++) {
			temp = (ArrayList) input.get(i);
			switch ( (Integer.parseInt(temp.get(1).toString())/1000))
			{
				case 10:
					if(result.containsKey("10000-10999")) {
						temp2 = new ArrayList(result.get("10000-10999"));
						//temp2.add(result.get("10000-10999"));
						temp2.add( Integer.parseInt(temp.get(2).toString()));
						result.put("10000-10999",temp2);
						
					}
					else {
						temp2 = new ArrayList();
						temp2.add(Integer.parseInt(temp.get(2).toString()) );
						result.put("10000-10999",temp2);
					}
					break;
				case 11:
					if(result.containsKey("11000-11999")) {
						temp2 = new ArrayList(result.get("11000-11999"));
						//temp2.add(result.get("10000-10999"));
						temp2.add( Integer.parseInt(temp.get(2).toString()));
						result.put("11000-11999",temp2);
						
					}
					else {
						temp2 = new ArrayList();
						temp2.add(Integer.parseInt(temp.get(2).toString()) );
						result.put("11000-11999",temp2);
					}
					break;
				case 12:
					if(result.containsKey("12000-12999")) {
						temp2 = new ArrayList(result.get("12000-12999"));
						//temp2.add(result.get("10000-10999"));
						temp2.add( Integer.parseInt(temp.get(2).toString()));
						result.put("12000-12999",temp2);
						
					}
					else {
						temp2 = new ArrayList();
						temp2.add(Integer.parseInt(temp.get(2).toString()) );
						result.put("12000-12999",temp2);
					}
					break;
				case 13:
					if(result.containsKey("13000-13999")) {
						temp2 = new ArrayList(result.get("13000-13999"));
						//temp2.add(result.get("10000-10999"));
						temp2.add( Integer.parseInt(temp.get(2).toString()));
						result.put("13000-13999",temp2);
						
					}
					else {
						temp2 = new ArrayList();
						temp2.add(Integer.parseInt(temp.get(2).toString()) );
						result.put("13000-13999",temp2);
					}
					break;
				case 14:
					if(result.containsKey("14000-14999")) {
						temp2 = new ArrayList(result.get("14000-14999"));
						//temp2.add(result.get("10000-10999"));
						temp2.add( Integer.parseInt(temp.get(2).toString()));
						result.put("14000-14999",temp2);
						
					}
					else {
						temp2 = new ArrayList();
						temp2.add(Integer.parseInt(temp.get(2).toString()) );
						result.put("14000-14999",temp2);
					}
					break;
				case 15:
					if(result.containsKey("15000-15999")) {
						temp2 = new ArrayList(result.get("15000-15999"));
						//temp2.add(result.get("10000-10999"));
						temp2.add( Integer.parseInt(temp.get(2).toString()));
						result.put("15000-15999",temp2);
						
					}
					else {
						temp2 = new ArrayList();
						temp2.add(Integer.parseInt(temp.get(2).toString()) );
						result.put("15000-15999",temp2);
					}
					break;
				case 16:
					if(result.containsKey("16000-16999")) {
						temp2 = new ArrayList(result.get("16000-16999"));
						//temp2.add(result.get("10000-10999"));
						temp2.add( Integer.parseInt(temp.get(2).toString()));
						result.put("16000-16999",temp2);
						
					}
					else {
						temp2 = new ArrayList();
						temp2.add(Integer.parseInt(temp.get(2).toString()) );
						result.put("16000-16999",temp2);
					}
					break;
				case 17:
					if(result.containsKey("17000-17999")) {
						temp2 = new ArrayList(result.get("17000-17999"));
						//temp2.add(result.get("10000-10999"));
						temp2.add( Integer.parseInt(temp.get(2).toString()));
						result.put("17000-17999",temp2);
						
					}
					else {
						temp2 = new ArrayList();
						temp2.add(Integer.parseInt(temp.get(2).toString()) );
						result.put("17000-17999",temp2);
					}
					break;
				case 18:
					if(result.containsKey("18000-18999")) {
						temp2 = new ArrayList(result.get("18000-18999"));
						//temp2.add(result.get("10000-10999"));
						temp2.add( Integer.parseInt(temp.get(2).toString()));
						result.put("18000-18999",temp2);
						
					}
					else {
						temp2 = new ArrayList();
						temp2.add(Integer.parseInt(temp.get(2).toString()) );
						result.put("18000-18999",temp2);
					}
					break;
				case 19:
					if(result.containsKey("19000-19999")) {
						temp2 = new ArrayList(result.get("19000-19999"));
						//temp2.add(result.get("10000-10999"));
						temp2.add( Integer.parseInt(temp.get(2).toString()));
						result.put("19000-19999",temp2);
						
					}
					else {
						temp2 = new ArrayList();
						temp2.add(Integer.parseInt(temp.get(2).toString()) );
						result.put("19000-19999",temp2);
					}
					break;
				default:
					System.out.println("Please enter 1,10000,40 formate");
					break;
			}
			//System.out.println(result);
		}
		return result;
	}
	public static void main(String args[]) {
		ArrayList input = new ArrayList();
		ArrayList temp = new ArrayList();
		TemparatureSensor t =new TemparatureSensor();
		input=t.read();
		HashMap<String, ArrayList> range= t.getRangeOfImputs(input);
		//System.out.println(range);
		//t.printMap(range);
		//System.out.println(range);
		temp = t.calculateAvgTemparature(range);
	}

}
