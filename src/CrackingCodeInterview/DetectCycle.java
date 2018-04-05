package CrackingCodeInterview;
import java.util.*;

public class DetectCycle
{
    public static void main(String[] args)
    {


    }

    public class Node
    {
        public int data;
        public Node next;
    }

    boolean hasCycle(Node node)
    {
        Node t = node;

        int count = 0;

        if ( node == null)
            return false;

        List<Node> list = new ArrayList<Node>();

        while( t != null)
        {
            list.add(t);

            if(count > 100)
            {
                return true;
            }

            t = t.next;

            if ( list.contains(t))
            {
                return true;
            }

            count++;
        }

        return false;
    }
}
