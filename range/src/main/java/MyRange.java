public class MyRange {
    public String of(String input) {
        return null;
    }

    public int getLastNumber(String input) {
        return 0;
    }

    public boolean isก้ามปูปิด(String input) {
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
