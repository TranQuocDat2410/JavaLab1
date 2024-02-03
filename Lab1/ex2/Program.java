import vn.edu.tdtu.ArrayOutput;
import vn.edu.tdtu.ArrayHandler;
public class Program {
    public static void main (String[] args){
        int a[] = {12, 2, 34, 5, 6};
        int b[] = {24, 30, 8, 21, 15};
        int c[] = ArrayHandler.merge(a,b);

        ArrayOutput.print(a);
        ArrayOutput.print(b);
        ArrayOutput.print(c);
        ArrayHandler.sort(c);
        ArrayOutput.print((c));
        ArrayOutput.write(c,"output.txt");

    }
}
