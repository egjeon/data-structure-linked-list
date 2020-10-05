package list.linkedlist.implementation;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        //numbers.addFirst(5);
        //numbers.addLast(40);
        //System.out.println(numbers.removeLast());
        //System.out.println(numbers.size());
        //System.out.println(numbers.get(6));
        //System.out.println(numbers.indexOf(100));
        //System.out.println(numbers);

        LinkedList.ListIterator i = numbers.listIterator();
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());
//         i.add(5);
//         i.next();
//         i.add(15);
        while(i.hasNext()){
            if((int)i.next() == 20){
                i.remove();
            }
        }
         System.out.println(numbers);

//        while(i.hasNext())
//            System.out.print(i.next() + " ");

    }

}
