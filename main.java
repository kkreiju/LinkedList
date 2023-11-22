 
public class main {
    public static void main(String[] args){
        linkedlist l = new linkedlist();
        l.head = new sections("Aurelio");
        sections second = new sections("Selwyn");
        sections third = new sections("Vic");
        sections fourth = new sections("Blaise");
        sections fifth = new sections("Lliam");
        sections sixth = new sections("Erwin");
        sections seventh = new sections("Red");

        l.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;

        for(int i = 0 ; i < 7; i++){
            System.out.println(l.head.names);
            l.head = l.head.next;
        }
    }
}
