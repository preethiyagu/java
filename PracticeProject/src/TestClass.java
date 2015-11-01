import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;;

public class TestClass {
	//find duplicates in an array
	public static void  findDuplicateInArray(String animal[]){
		Map<String,Integer> animalMap = new HashMap<String,Integer> ();
		for(String animalValue :animal){
			if( animalMap.containsKey(animalValue)){
				animalMap.put(animalValue, animalMap.get(animalValue)+1);
			}else{
				animalMap.put(animalValue, 1);
			}
		}
		Iterator i  = (Iterator) animalMap.entrySet().iterator();
		
		while(i.hasNext()){
			Map.Entry<String, Integer> entry  = (Entry<String, Integer>) i.next();
			if(entry.getValue() != null && entry.getValue()>1)
			System.out.println("Animal"+entry.getKey()+"count"+entry.getValue());
			
		}
	
	}
	//find duplicates characters
	public static void  findDuplicateCharacters(String input){ 
		Map<Character,Integer> animalMap = new HashMap<Character,Integer> ();
		
		for(int i =0;i<input.length();i++){
			if(animalMap.containsKey(input.charAt(i))){
				animalMap.put(input.charAt(i), animalMap.get(input.charAt(i))+1);
			}else{
				animalMap.put(input.charAt(i), 1);
			}
		}
		
		for(int i =0;i<input.length();i++){
			if(animalMap.get(input.charAt(i))==1){
				System.out.println("Character"+input.charAt(i));
			break;
			}
		}
		
	}
	
	//find number of words in a string
	public void findNumberOfWordsInString(String inputString){
		StringTokenizer in = new StringTokenizer(inputString," ");
		int count = in.countTokens();
		System.out.println("Number of Words"+count);
		
	}
	//string reverse
	
	public static void stringReverse(String input){
		String output = "";
		for(int i=input.length()-1;i>=0;i--){
			output+=input.charAt(i);
			}
		System.out.println("Reversed String"+output);
	}
	
	//maximum repeated words
	public static void  findMaxiumRepeatedWords(String inputString){
		Map<String,Integer> animalMap = new HashMap<String,Integer> ();
		StringTokenizer in = new StringTokenizer(inputString," ");
		while(in.hasMoreTokens()){
			String animalValue =  in.nextToken();
			if( animalMap.containsKey(animalValue)){
				animalMap.put(animalValue, animalMap.get(animalValue)+1);
			}else{
				animalMap.put(animalValue, 1);
			}
		}
		
		Set<Map.Entry<String, Integer>> animalSet = animalMap.entrySet();
		List<Map.Entry<String, Integer>> animalList  = new ArrayList<Map.Entry<String,Integer>>(animalSet);
		Collections.sort(animalList, new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
				//return 0;
			}
			
			
		});
		for(Map.Entry<String, Integer> animalListFinal :animalList){
	System.out.println("Sorted list "+animalListFinal.getKey()+ " count "+animalListFinal.getValue());
		}
	}
	//swap function
	
	public static void swap(Integer i ,Integer j){
		
		Integer temp = new Integer(i);
		i=j;
		j=temp;
				
	}
public static void swap1(int i ,int j){
		
		int temp = i;
		i=j;
		j=temp;
		System.out.println("AfterSwap i****"+i+" j*****"+j);
				
	}

//HashMap
public static void sortHashMap(){
	Map<String,Integer> sortMapByValue = new HashMap<String,Integer>();
	sortMapByValue.put("Java", 50);
	sortMapByValue.put("C++", 100);
	sortMapByValue.put("JQuery", 78);
	sortMapByValue.put("Spring", 89);
	sortMapByValue.put("Hibernate", 45);
	Set<Map.Entry<String, Integer>> moviesSet= sortMapByValue.entrySet();
	List<Map.Entry<String, Integer>> movieList = new ArrayList<Map.Entry<String,Integer>>(moviesSet);
	Collections.sort(movieList, new Comparator<Map.Entry<String, Integer>>(){

		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			// TODO Auto-generated method stub
			return o1.getValue().compareTo(o2.getValue());
		}
		
	});
	for(Entry<String, Integer> sortedList:movieList){
		System.out.println("SortedList by value****  Key"+sortedList.getKey()+" Value****"+sortedList.getValue());
	}
	
}
//common elements between 2 arrays
	public static void commonElementsBetween2Arrays(){
		int [] a1 = {1,3,5,7};
		int [] a2 = {1,3,5,7,8,9};
		for(int array1:a1){
			int i=0;
		for(int array2:a2){
			int j=0;
			if(array1 == array2){
				System.out.println("Duplicate Elements"+array1);
			}
			j++;
			}
		i++;
		}
	
	}
	// find distinct  elements between 2 arrays
		public static void distinctElementsBetween2Arrays(){
			int [] a1 = {1,3,5,7,10,11};
			int [] a2 = {1,3,5,7,8,9};
			boolean isDistinct = true;
			for(int i=0;i<a1.length;i++){
				isDistinct = true;
				for(int j=0;j<a2.length;j++){
					if( a1[i] == a2[j]){
						isDistinct = false;
						break;
					}
				}
				if(isDistinct)
					System.out.println("Disticnt elements between 2 arrays"+a1[i]);
			}
			
			for(int i=0;i<a2.length;i++){
				isDistinct = true;
				for(int j=0;j<a1.length;j++){
					if( a2[i] == a1[j]){
						isDistinct = false;
						break;
					}
				}
				if(isDistinct)
					System.out.println("Disticnt elements between 2 arrays"+a2[i]);
			}
			
		}
	
	//find distinct elements in an array
	public static void distinctElementsinArray(){
		int [] a1 = {1,3,5,7,8,9,3,5,11,23,9};
		 boolean isDistinct = true;
		
		for(int i =0;i<a1.length;i++){
			isDistinct = true;
			for(int j =0;j<a1.length;j++){
				//isDistinct = true;
			if(i!=j && a1[i]==a1[j]){
				isDistinct= false;
				break;
			}
			}
			
			if(isDistinct)
			System.out.println("Distinct Elements"+a1[i]);
			
		}
	}
	//fibbonanci series
	public static void fibbonanciSeries(){
		int [] fibbonanciArray = new int[20];
		fibbonanciArray[0]=0;
		fibbonanciArray[1]=1;
		for(int i=2;i<fibbonanciArray.length;i++){
			fibbonanciArray[i]=fibbonanciArray[i-1]+fibbonanciArray[i-2];
		}
		for(int fibbNumbers:fibbonanciArray){
			System.out.println(fibbNumbers);
		}
	}
	
	//prime number check
	public static boolean primeNumberCheck(int number){
		
		for(int i=2;i<=number/2;i++){
			System.out.println("Number/2 "+number/2+"number%i "+number%i);
			if(number%i==0)
				return false;
		}	
		return true;
		}
	

	
	public static void main(String args []){
		
		String animal[] = new String[]{"cat","dog","mouse","cat","dog"};
		findDuplicateInArray(animal);
		System.out.println("Please enter String...");
		//Scanner sc = new Scanner(System.in);
		//String name = sc.nextLine();		
		String name = "eettio";
		findDuplicateCharacters(name);
		String input = "My name is Preethi and My husband name is Thiyagu";
		TestClass classA = new TestClass();
		classA.findNumberOfWordsInString(input);
		stringReverse(name);
		findMaxiumRepeatedWords(input);
		int sortNumericArray[]= {5,6,1,3,10,19};
		Arrays.sort(sortNumericArray);
		System.out.println("SortedArray in ascending order"+Arrays.toString(sortNumericArray));
		for(int sortedArray:sortNumericArray){
			System.out.println("SortedArray in ascending order"+sortedArray);
		}
		for(int i=sortNumericArray.length-1;i>=0;i--){
			System.out.println("SortedArray in descending order"+sortNumericArray[i]);
		}
		  int a=0;
		  System.out.println(a++);
		  System.out.println(++a);
		  Integer i = new Integer(10);
		  Integer j = new Integer(20);
		  swap(i,j);
		  int k = 10;
		  int l=20;
		  swap1(k,l);
		  System.out.println("i****"+i+" j****"+j);
		  System.out.println("k****"+k+" l****"+l);
		  //sorting array in reverse order
		Integer numericArray[] =  new Integer [5];
		numericArray[0] = 5;
		numericArray[1]= 6;
		numericArray[2] = 89;
		numericArray[3]=99;
		numericArray[4]=100;
		Arrays.sort(numericArray, Collections.reverseOrder());
		System.out.println("Sorted array in descending order"+Arrays.toString(numericArray));
		//ArrayList sorting
		ArrayList<String> movieTitles = new ArrayList<>();
		movieTitles.add("Maya");
		movieTitles.add("Run");
		movieTitles.add("Three");
		movieTitles.add("Mass");
		movieTitles.add("Villain");
		Collections.sort(movieTitles, Collections.reverseOrder());
		
		System.out.println("Sorted Collections descending****"+movieTitles);
		sortHashMap();
		commonElementsBetween2Arrays();
		fibbonanciSeries();
		System.out.println("Check prime number"+primeNumberCheck(9));
		distinctElementsinArray();
		distinctElementsBetween2Arrays();
		String name1 = "Preethi";
		String name2 = "I Live in Sunnyvale";
		
		System.out.println("Substring****"+name1.substring(1));
		System.out.println("Substring****"+name1.substring(1, 4));
		
		System.out.println("Substring****"+name2.substring(1));
		System.out.println("Substring****"+name2.substring(1, 7));
		
		//Vectors
		Vector<String> v = new Vector<String>();
		Vector<String> v1 = new Vector<String>();
		//String [] copyArray = new String[v.size()+1];
		v.add("Java");
		v.add("J2EE");
		v.add("C++");
		v.add("C#");
		v.add(1, "Spring");
		List<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		v1 = (Vector<String>) v.clone();
		v.addAll(list);
		System.out.println(v.containsAll(list));
		//v.copyInto(copyArray);
		//System.out.println("CopyArray"+copyArray);
		Enumeration e =v.elements();
		while(e.hasMoreElements()){
			String ename =(String) e.nextElement();
			System.out.println(ename);
		}
		
		v.remove("Java");
		System.out.println("VSize"+v.size());
		System.out.println("VSize"+v1.size());
		
		//ArrayList
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("India");
		arrayList.add("US");
		arrayList.add("China");
		arrayList.add("Australia");
		arrayList.add("Germany");
		Collections.sort(arrayList);
		Iterator iterator =arrayList.iterator();
		
		while(iterator.hasNext()){
			System.out.println("arrayListElements"+iterator.next());
		}
		
		
				
	}
	
	

}
