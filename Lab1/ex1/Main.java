//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        if (args.length != 3 ){
            System.out.println("Invalid expression!");
            return;
        }

        double val1, val2, result;
        result = 0;
        val1 = Double.valueOf(args[0]);
        val2 = Double.valueOf(args[2]);
        switch (args[1]){
            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "x":
                result = val1 * val2;
                break;
            case "/":
                result = val1 / val2;
                break;
            case "^":
                result = Math.pow(val1,val2);
        }
        System.out.println(result);

    }
}