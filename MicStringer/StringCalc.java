package dea.michel.domein;

/**
 * Created by Michel Koolwaaij on 28-09-18.
 */
public class StringCalc {
    private int first;
    private int last;
    private String calc;

    public StringCalc(String string) {
        String[] parts = string.split("[*+-]");

        if (parts.length>1){
            first = Integer.valueOf(parts[0]);
            last = Integer.valueOf(parts[1]);
        }
        if (string.contains("+")) {
            calc = ""+(first+last);
        } else if (string.contains("-")){
            calc = ""+(first-last);
        } else if (string.contains("*")){
            calc = ""+(first*last);
        }
        else calc="error";

    }

    public String getReverseResult(){
        String reverse="";
        for (int i=calc.length()-1;i>=0;i--){
            reverse=reverse+calc.charAt(i);
        }
        return reverse;
    }
}
