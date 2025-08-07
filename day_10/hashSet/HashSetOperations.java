/*
 3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.
 */
import java.util.*;
public class HashSetOperations {
    static Scanner sc = new Scanner(System.in);
    static HashSet<String> hashSet = new HashSet<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- HashSet Operations Menu ---");
            System.out.println("1. Append element to HashSet");
            System.out.println("2. Iterate through elements");
            System.out.println("3. Get number of elements");
            System.out.println("4. Empty the HashSet");
            System.out.println("5. Test if HashSet is empty");
            System.out.println("6. Clone HashSet");
            System.out.println("7. Convert HashSet to Array");
            System.out.println("8. Convert HashSet to TreeSet");
            System.out.println("9. Convert HashSet to ArrayList");
            System.out.println("10. Compare two HashSets");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    appendElement();
                    break;
                case 2:
                    iterateElements();
                    break;
                case 3:
                    getSize();
                    break;
                case 4:
                    emptyHashSet();
                    break;
                case 5:
                    testIsEmpty();
                    break;
                case 6:
                    cloneHashSet();
                    break;
                case 7:
                    convertToArray();
                    break;
                case 8:
                    convertToTreeSet();
                    break;
                case 9:
                    convertToArrayList();
                    break;
                case 10:
                    compareHashSets();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    public static void appendElement() {
        System.out.println("Enter The Value : ");
        System.out.println(hashSet.add(sc.nextLine()));
    }

    public static void iterateElements() {
        for(String set : hashSet){
            System.out.println(set);
        }
    }

    public static void getSize() {
        System.out.println("Size Of Set : "+hashSet.size());
    }

    public static void emptyHashSet() {
        hashSet.clear();
    }

    public static void testIsEmpty() {
        System.out.println("Is Empty Or Not : "+hashSet.isEmpty());
    }

    public static void cloneHashSet() {
        HashSet<String> cloned = (HashSet<String>) hashSet.clone();
        System.out.println("Orginal hashSet : "+hashSet);
        System.out.println("Cloned hashSet : "+cloned);
    }

    public static void convertToArray() {
        System.out.println(Arrays.toString(hashSet.toArray()));
    }

    public static void convertToTreeSet() {
        TreeSet treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }

    public static void convertToArrayList() {
        ArrayList list = new ArrayList<>(hashSet);
        System.out.println(list);
    }

    public static void compareHashSets() {
        System.out.println("Create New HashSet Size : ");
        int size = sc.nextInt();
        sc.nextLine();
        HashSet<String> hset = new HashSet<>();
        for(int i = 0;i<size;i++){
            System.out.print("Enter The Value : ");
            hset.add(sc.nextLine());
        }
        if(hset.equals(hashSet)){
            System.out.println("Equals To Object ");
        }
        else {
            System.out.println("Not Equals To Object ");
        }
    }
}
