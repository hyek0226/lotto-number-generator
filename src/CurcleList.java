import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CurcleList {
	List<Curcle> list;
	List<Boolean> list2;
	List<Integer> resultList;
	List<Integer> selectList;
	List<Integer> equalList;
	boolean oneTwo = false;
	int count = 0;
	public CurcleList(Set<Integer> num, Set<Integer> num2) {
		list = new ArrayList<>();
		list2 = new ArrayList<>();
		resultList = new ArrayList<>();
		selectList = new ArrayList<>();
		equalList = new ArrayList<>();
		
		Iterator<Integer> iterator = num.iterator();
		while (iterator.hasNext()) {
			resultList.add(iterator.next());
		}
		System.out.println(resultList + "r");
		Iterator<Integer> iterator2 = num2.iterator();
		while (iterator2.hasNext()) {
			selectList.add(iterator2.next());
		}
		System.out.println(selectList + "s");
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				if (resultList.get(i) == selectList.get(j)) {
					equalList.add(selectList.get(j));
					System.out.println("같은 거" + equalList + equalList.size());
				}
				if (equalList.size() == 6 && selectList.get(5) == resultList.get(6)) {
					System.out.println("같은 거 갯수" + equalList.size());
					oneTwo = true;
				} 
			}
		}
		
		
		
		for (int i = 0; i < 6; i++) {
			list2.add(false);
			for (int j = 0; j < equalList.size(); j++) {
				if (selectList.get(i) == equalList.get(j)) {
					list2.set(i, true);
					count++;
				}
			}
		}
		
		System.out.println(list2);
		
	}
	
	public List<Curcle> getList() {
		return list;
	}
	public void setList(List<Curcle> list) {
		this.list = list;
	}
	
	public List<Curcle> getResultList() {
		for (int i = 0; i < 7; i++) {
			list.add(new Curcle(resultList.get(i), true));
		}
		return list;
	}
	
	public List<Curcle> getSelectList() {
		for (int i = 0; i < 6; i++) {
			list.add(new Curcle(selectList.get(i), list2.get(i)));
		}
		return list;
	}

	public List<Boolean> getList2() {
		return list2;
	}

	public boolean isOneTwo() {
		return oneTwo;
	}

	public int getCount() {
		return count;
	}
	
	
	
}
