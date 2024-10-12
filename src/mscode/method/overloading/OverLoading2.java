package mscode.method.overloading;

public class OverLoading2 {
    private String formatNumber(int value){
        return String.format("%d",value);
    }
    private String formatNumber(double value){
        return String.format("%.3f",value);
    }

    private String formatNumber(String value){
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        OverLoading2 overLoading2 = new OverLoading2();

        System.out.println(overLoading2.formatNumber(500));
        System.out.println(overLoading2.formatNumber(89.9807));
        System.out.println(overLoading2.formatNumber("550"));
    }
}
