package Questions;

public class Braille {
    private static String voice;
    static int steps = 30;
    static int paperLine = 250;
    int stepperDelay = 500;
    int servodelay = 500;
    static int n = 6; //number char per line

    public static void main(String[] args) {
        voice="This is testing";
        coreLogic(voice);
    }

    static void coreLogic(String voice){
        if (voice.length() > 0) {
            System.out.println(voice);
            //Serial.println(voice.length());
            for (int v = 0; v < voice.length();) {
                int tempSize = 0;
                if (voice.length() > (v + n)) {
                    tempSize = n;
                }
                else {
                    tempSize = voice.length() - v;
                }
                //Serial.println(tempSize);
                System.out.println(tempSize);
                System.out.println(voice.substring(v,v+tempSize));
                String[] chars = new String[tempSize];
                for (int i = 0; i < n && v < voice.length(); i++) {
                    chars[i] = getBraille(voice.charAt(v++));
                }

                int x = 0;
                for (int i = 0; i < 3; i++) { // print 3 row
                    for (int r = 0; r < tempSize; r++) {
                        for (int a = 0; a < 2; a++) {
                            moveForward(steps);
                            System.out.print(chars[r].charAt(x + a));
                            if (chars[r].charAt(x + a) == '1') {
                                //System.out.println("inside if");
                                moveHead();
                            }
                        }
                    }
                    x += 2;
                    movePaper(paperLine);
                    moveBackward(steps * (2 * tempSize));
                }
                movePaper(paperLine);
                movePaper(paperLine);
            }
        }
    }
    static void moveBackward(int steps){
        //System.out.println("Moving to -ve Position by "+steps);
        System.out.println("");
    }
    static void moveForward(int steps){
        //System.out.println("Moving to +ve Position by"+steps);
        System.out.print(" ");
    }
    static void movePaper(int delay){
        //System.out.println("Moving paper by"+ delay);
        System.out.println("");
    }
    static void moveHead(){
        //System.out.println("Printing Dot" );
    }
    static String getBraille(char ch) {
        //System.out.println("inside getBraille");
        String myBraille = "000000";
        switch (ch) {
            case 'A':
            case 'a':
                myBraille = "100000";
                break;
            case 'B':
            case 'b':
                myBraille = "101000";
                break;
            case 'C':
            case 'c':
                myBraille = "110000";
                break;
            case 'D':
            case 'd':
                myBraille = "110100";
                break;
            case 'E':
            case 'e':
                myBraille = "100100";
                break;
            case 'F':
            case 'f':
                myBraille = "111000";
                break;
            case 'G':
            case 'g':
                myBraille = "111100";
                break;
            case 'H':
            case 'h':
                myBraille = "101100";
                break;
            case 'I':
            case 'i':
                    myBraille = "011000";
                break;
            case 'J':
            case 'j':
                myBraille = "011100";
                break;
            case 'K':
            case 'k':
                myBraille = "100010";
                break;
            case 'L':
            case 'l':
                myBraille = "101010";
                break;
            case 'M':
            case 'm':
                myBraille = "110010";
                break;
            case 'N':
            case 'n':
                myBraille = "110110";
                break;
            case 'O':
            case 'o':
                myBraille = "100110";
                break;
            case 'P':
            case 'p':
                myBraille = "111010";
                break;
            case 'Q':
            case 'q':
                myBraille = "111110";
                break;
            case 'R':
            case 'r':
                myBraille = "101110";
                break;
            case 'S':
            case 's':
                myBraille = "011010";
                break;
            case 'T':
            case 't':
                myBraille = "011110";
                break;
            case 'U':
            case 'u':
                myBraille = "100011";
                break;
            case 'V':
            case 'v':
                myBraille = "101011";
                break;
            case 'W':
            case 'w':
                myBraille = "011101";
                break;
            case 'X':
            case 'x':
                myBraille = "110011";
                break;
            case 'Y':
            case 'y':
                myBraille = "110111";
                break;
            case 'Z':
            case 'z':
                myBraille = "100111";
                break;
            default:
                myBraille = "000000";
                break;
        }
        //return mirrior(myBraille);
        return myBraille;
    }

}
