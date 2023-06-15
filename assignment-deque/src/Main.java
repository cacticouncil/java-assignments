public class Main
{
    public static void main(String[] args)
    {
        SimpleDeque<String> deque = new SimpleDeque();
        String data, fmtstr, buffer;

        int maxlen = 1;
        for (String arg : args)
        {
            if (arg.length() > maxlen)
                maxlen = arg.length();
        }
        fmtstr = "%-" + (maxlen+10) + "s";

        for (int i=0; i<args.length; i+=2)
        {
            // commands:
            // pu = push
            // po = pop
            // en = enqueue
            // de = dequeue
            // ie = isEmpty
            // sz = size

            switch (args[i])
            {
                case ("pu"):
                    buffer = String.format(fmtstr, "push: " + args[i+1]);
                    System.out.print(buffer);
                    deque.push(args[i+1]);
                    break;
                case ("po"):
                    data = deque.pop();
                    buffer = String.format(fmtstr, "pop: " + data);
                    System.out.print(buffer);
                    break;
                case ("en"):
                    buffer = String.format(fmtstr, "enqueue: " + args[i+1]);
                    System.out.print(buffer);
                    deque.enqueue(args[i+1]);
                    break;
                case ("de"):
                    data = deque.dequeue();
                    buffer = String.format(fmtstr, "dequeue: " + data);
                    System.out.print(buffer);
                    break;
                case ("sz"):
                    int count = deque.size();
                    buffer = String.format(fmtstr, "size: " + count);
                    System.out.print(buffer);
                    break;
                case ("ie"):
                    boolean empty = deque.isEmpty();
                    buffer = String.format(fmtstr, "empty: " + empty);
                    System.out.print(buffer);
                    break;
                default:
                    buffer = String.format(fmtstr, args[i] + ": (ignored)");
                    System.out.print(buffer);
                    break;
            }

            System.out.println("| " + deque);
        }
    }
}
