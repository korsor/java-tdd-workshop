public class MyRange {
    public String of(String input) {
        MyRange range = new MyRange();
        String output = "";
        int first = range.getFirstNumber(input);
        int last = range.getLastNumber(input);
        for (int i = first;i<=last;i++){
            output+=i;
        }
        return output;
    }

    public int getLastNumber(String input) {
        MyRange range = new MyRange();
        if(range.isก้ามปูปิด(input))
            return input.charAt(3)-48;
        return input.charAt(3)-49;
    }

    public boolean isก้ามปูปิด(String input) {
        if (input.endsWith("]"))
            return true;
        return false;
    }

    public int getFirstNumber(String input) {
        MyRange range = new MyRange();
        if(range.isก้ามปูเปิด(input)){
            return input.charAt(1)-48;
        }
        return input.charAt(1)-47;
    }

    public boolean isก้ามปูเปิด(String input) {
        if (input.startsWith("["))
            return true;
        return false;
    }
}
