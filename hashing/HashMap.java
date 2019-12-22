
public class HashMap {
		static	int[] index;
		static int[] value;

			public HashMap() {
					index = new int[50];
					value 	= new int[100];
			}

			public static void put(int key, int val) {
					int hashCode = hash(key);
					if (index[hashCode] == 0) {
							index[hashCode] = key;
							value[key] = val;
					}
					else {
							while (hashCode < index.length && index[hashCode] != 0) hashCode++;
							index[hashCode] = key;
							value[key] = val;
					}	
			}

			public static void printMap() {
					for (int i : index) 
							if (i != 0) 	System.out.println(i +" -> "+ value[i]);
			}


			public static int get(int key) {
					int hashCode = hash(key);
					while (hashCode < index.length && !equals(index[hashCode], key)) hashCode++;
					return value[key];
			}

			public static int hash(int key) {
					return key % 50;
			}

			public static boolean equals (int key1, int key2) {
					return key1 == key2;  
			}

			public static void main(String[] args) {
					HashMap map = new HashMap();
					map.put(5, 10);
					map.put(25, 100);
					map.put(4, 140);
					map.put(99, 190);
					printMap();
					System.out.println(map.get(25));
					System.out.println(map.get(99));
			}
}
