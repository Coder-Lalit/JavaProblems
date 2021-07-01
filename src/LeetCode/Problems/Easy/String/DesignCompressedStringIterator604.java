package LeetCode.Problems.Easy.String;

public class DesignCompressedStringIterator604 {
    String compressedString;
    char ch;
    int repeat;
    int counter;
    int i=0;
    public DesignCompressedStringIterator604(String compressedString) {
        this.compressedString=compressedString;
        this.ch=compressedString.charAt(i);
        i++;
        StringBuilder num=new StringBuilder();
        while(i<compressedString.length() && Character.isDigit(compressedString.charAt(i))){
            num.append(compressedString.charAt(i));
            i++;
        }
        this.repeat=Integer.parseInt(num.toString());
        this.counter=0;
    }

    public char next() {
        if(counter<repeat){
            counter++;
            return ch;
        }else{
            if(i<compressedString.length()){
                this.ch=compressedString.charAt(i);
                i++;
                StringBuilder num2 = new StringBuilder();
                while(i<compressedString.length() && Character.isDigit(compressedString.charAt(i))){
                    num2.append(compressedString.charAt(i));
                    i++;
                }
                this.repeat=Integer.parseInt(num2.toString());
                this.counter=0;
            }else{
                return ' ';
            }
        }
        counter++;
        return ch;
    }

    public boolean hasNext() {
        return i<compressedString.length() || counter<repeat;
    }

    public static void main(String[] args) {
        DesignCompressedStringIterator604 a = new
                DesignCompressedStringIterator604("X15D18V8");

        System.out.println(a.next());
        System.out.println(a.next());
        System.out.println(a.hasNext());
        System.out.println(a.next());
        System.out.println(a.next());
        System.out.println(a.next());
        System.out.println(a.next());
        System.out.println(a.next());
        System.out.println(a.hasNext());
    }
}
