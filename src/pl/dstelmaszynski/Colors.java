package pl.dstelmaszynski;

public class Colors {
    public void colorPrint() {
        for (int numbOfColoredLine = 1; numbOfColoredLine < 100; numbOfColoredLine++) {
            if (numbOfColoredLine < 100) {
                System.out.println("Printing red..." + numbOfColoredLine);
            } else {
                System.out.println("that's all folks...");
                return;
            }
            if (numbOfColoredLine < 100) {
                System.out.println("Printing green..." + (++numbOfColoredLine));
            } else {
                System.out.println("that's all folks...");
                return;
            }
            if (numbOfColoredLine < 100) {
                System.out.println("Printing blue..." + (++numbOfColoredLine));
            } else {
                System.out.println("that's all folks...");
                return;
            }
            if (numbOfColoredLine < 100) {
                System.out.println("Printing black..." + (++numbOfColoredLine));
            } else {
                System.out.println("that's all folks...");
                return;
            }
            if (numbOfColoredLine < 100) {
                System.out.println("Printing yellow..." + (++numbOfColoredLine));
            } else {
                System.out.println("that's all folks...");
                return;
            }
            if (numbOfColoredLine < 100) {
                System.out.println("Printing brown..." + (++numbOfColoredLine));
            } else {
                System.out.println("that's all folks...");
                return;
            }
        }
    }
}
