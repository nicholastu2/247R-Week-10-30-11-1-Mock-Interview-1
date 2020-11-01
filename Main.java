
import java.util.*;
//1.Three Sum: Given an array of integers, find three numbers such that they add up to some target.

  //Design GetRandom(): Design a data structure that supports all following operations in average O(1) time.
//insert(val): Inserts an item val to the set if not already present.
//remove(val): Removes an item val from the set if present.
//getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.

//class DataStructure{
  ///private Map<Integer, Integer> keyMap;
  //list = new ArrayList<>();

  //public int getRandom(){
    //int random = Math.random() * list.length();
    //return list.get(random);
 // //}
  
  //public boolean remove(int num){
  //  if (list.get(num) == null) {
  //    //return false;
    //}
    //else {
      //keyMap.remove(list.indexOf(num), num);
      ////list.remove(num);
     // return true;
   // }
 // }
  //public boolean insert(int num) {
    //if (list.get(num) == null) {
      //return false;
    //}
    //else {
      //list.add(num);
      //keyMap.put(list.indexOf(num), num);
      //return true;
    //}
  //}
//}
class Main {
  
  //public static int[] ThreeSum(int[] integers, int target){
    //integers = Arrays.sort(integers);
      //for(int i = 0;i< integers.length - 1;i++){
       // for (int j=i+1; j<integers.length; j++){
         // int complement = target - (i + j);
          //int k = Arrays.binarySearch(integers, complement);
          //if (k>=0){
            //int [] nums = {integers[i],integers[j],integers[k]};
             // System.out.println(integers[i]+""+integers[j]+""+integers[k]);
              //return nums;
          //}
          //}
        //}
      //return null;
  //}

public static int minBoats (int[] people, int limit){
  Arrays.sort(people);
  int i = 0;
  int j = people.length;
  int minnumBoats =0;
  while (i <=j) {
    minnumBoats  = minnumBoats+1;
    if (people[i]+ people[j] <= limit) {
      i++;
      j--;
    }
    else {
      j--;
    }
  }
  return minnumBoats;
  
}


   
  


  public static void main(String[] args) {
    System.out.println("Hello world!");

    int[] integers = {1,5,6,7,2,3,4};
    int target = 15;

    ThreeSum(integers, target);
  }
}

/*

Good coding problems:
Minimum Number of Boats: Given array of integers people[]. The i-th person has weight people[i], and each boat can carry a maximum weight of integer limit. Each boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most limit. Return the minimum number of boats to carry every given person. (Guaranteed that people[i] <=  limit)
Hint 1: Would this be easier if the array was sorted? ( Arrays.sort(int[] array) )
Hint 2: To maximize boat filling efficiency which person should be paired with the heaviest?
Hint 3: How will you keep track of which boats already have one person, remember boats cannot have more than two people.

Three Sum: Given an array of integers, find three numbers such that they add up to some target.
Hint 1: Start by sorting the array. It will help a lot.
Hint 2: You can loop through all possible first numbers (Hint 2.5: It’s just through half of the sorted array), then do a standard TwoSum (find two numbers that add up to a target) sweep through the rest of the array.
Hint 3: If you don’t know how to do TwoSum, you can just start with the brute force solution (O(n2)) and continue from there.

Design GetRandom(): Design a data structure that supports all following operations in average O(1) time.
insert(val): Inserts an item val to the set if not already present.
remove(val): Removes an item val from the set if present.
getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.
Hint 1: What data structures that Java provides have a O(1) insert and remove operation?
Hint 2: What is a data structure that has a O(1) random access operation? (Not a statically sized array)
Hint 3: How can you keep track of the indices of values in your random access data structure in your data structure with O(1) insert and remove operations?
Hint 4: Your first data structure could be a HashMap and your second could be an ArrayList. What would be the <key, value> pair in your map and what is at the indices in the ArrayList? 
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Hint 1: Consider using two node pointers. 
Hint 2: There should be one fast pointer and one slow pointer. 
Hint 3: The fast pointer should be incremented like this: fast = fast.next.next;
Hint 4: When the fast pointer and slow pointer point to the same node, you know there is a cycle. Otherwise, if either one becomes null, you know there is no cycle.
*/