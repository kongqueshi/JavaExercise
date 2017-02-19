import java.util.*;
public class Array {
    private static void printArray(String message, int array[]){
        System.out.println(message+":[length: "+array.length+"]");
        for (int i = 0; i < array.length; i++) {
            if(i != 0)
                System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.println();
    }
    private static void sortAndSearch()throws Exception{
        int[] array = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array);
        printArray("数组排序：", array);
        int index = Arrays.binarySearch(array, 2);
        System.out.println("元素2在第"+index+"位置");
        printArray("数组排序：", array);
        array = insertElement(array, 10, 3);
        printArray("数组排序：", array);
    }
    private static int[] insertElement(int[] original, int element, int index){
        int length = original.length;
        int[] destination = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, index);
        destination[index] = element;
        System.arraycopy(original, index, destination, index + 1, length - index);
        return destination;
    }
    private static void reverseArray(){
        ArrayList arrayList=new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("反转前："+arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后："+arrayList);
    }
    private static void minMaxofArray(){
        LinkedList list = new LinkedList();
        list.add(new Integer(-6));
        list.add(new Integer(0));
        list.add(new Integer(-8));
        list.add(new Integer(7));
        System.out.println("max is " + Collections.max(list));
        System.out.println("min is "+Collections.min(list));
    }
    private static void mergeArray(){
        String[] a = {"A", "B", "C"};
        String[] b = {"C", "D"};
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        System.out.println(list.toString());
    }
    private static void fillArray(){
        int[] array = new int[6];
        Arrays.fill(array, 100);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    private static void removeElement(){
        ArrayList objArray = new ArrayList();
        objArray.clear();
        String fourth = new String("第4个元素");
        objArray.add(0, new String("第0个元素"));
        objArray.add(1, new String("第1个元素"));
        objArray.add(2, new String("第2个元素"));
        objArray.add(fourth);
        System.out.println(objArray);
        objArray.remove(1);
        System.out.println(objArray);
        objArray.remove(fourth);
        System.out.println(objArray);
    }
    private static void diffArray(){
        ArrayList aList1 = new ArrayList();
        ArrayList aList2 = new ArrayList();
        for (int i = 0; i < 3; i++) {
            aList1.add(i, "aList: "+i);
            aList2.add(i, "aList: "+i);
        }
        for (int i = 3; i < 5; i++)
            aList2.add(i, "aList: "+i);
        System.out.println(aList1);
        System.out.println(aList2);
        aList2.removeAll(aList1);
        System.out.println(aList2);
    }
    private static void interArray(){
        ArrayList aList1 = new ArrayList();
        ArrayList aList2 = new ArrayList();
        for (int i = 0; i < 3; i++) {
            aList1.add(i, "aList: "+i);
            aList2.add(i, "aList: "+i);
        }
        for (int i = 3; i < 5; i++)
            aList2.add(i, "aList: "+i);
        System.out.println(aList1);
        System.out.println(aList2);
        aList2.retainAll(aList1);
        System.out.println(aList2);
    }
    public static void unionArray(){
        String[] arr1 = {"1", "2", "3"};
        String[] arr2 = {"2", "4", "5"};
        Set<String>  set = new HashSet<String>();
        for(String str:arr1)
            set.add(str);
        for(String str:arr2)
            set.add(str);
        System.out.println("arr1: "+Arrays.asList(arr1));
        System.out.println("arr2: "+Arrays.asList(arr2));
        System.out.println("union: "+set);
    }
    public static void isContain(){
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++)
            arrayList.add(new Integer(i));
        System.out.println(arrayList);
        for(int i = 0; i < 5; i++)
            System.out.println("Contains "+i+": "+arrayList.contains(i));//值比较
    }
    public static void isEqual(){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("==: "+ (arr1==arr2));
        //基本的数据类型的数组的equals方法没有重载Object的equals方法
        System.out.println("equals: " + (arr1.equals(arr2)));
        System.out.println("Arrays.equals: "+Arrays.equals(arr1, arr2));
    }
}
