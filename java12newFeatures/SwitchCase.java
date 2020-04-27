// from Mkyung

package java12newFeatures;


public class SwitchCase {

    public static void main(String[] args) {

        System.out.println(getTextBefore12(1));
        System.out.println(getTextBefore12(3));
        System.out.println(getTextBefore12(6));
        System.out.println(getTextBefore12(10));

    }

    // Traditional switch statement
    private static String getTextBefore12(int number) {
        String result = "";
        switch (number) {
            case 1:
            case 2:
                result = "one or two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
            case 5:
            case 6:
                result = "four or five or six";
                break;
            default:
                result = "unknown";
        };
        return result;
    }
    
    private static String getTextMultipleLabels(int number) {
        String result = "";
        switch (number) {
            case 1, 2:
                result = "one or two";
                break;
            case 3:
                result = "three";
                break;
            case 4, 5, 6:
                result = "four or five or six";
                break;
            default:
                result = "unknown";
        };
        return result;
    }
    
    private static String getTextViaBreak(int number) {
        String result = switch (number) {
            case 1:
            case 2:
                break "one or two"; 
            case 3:
                break "three";
            case 4:
            case 5:
            case 6:
                break "four or five or six";
            default:
                break "unknown";
        };
        return result;
    }
    
    private static String getTextViaArrow(int number) {
        String result = switch (number) {
            case 1, 2 -> "one or two";
            case 3 -> "three";
            case 4, 5, 6 -> "four or five or six";
            default -> "unknown";
        };
        return result;
    }
    
    

}