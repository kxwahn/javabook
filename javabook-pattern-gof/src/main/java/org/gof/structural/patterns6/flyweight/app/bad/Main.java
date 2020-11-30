package org.gof.structural.patterns6.flyweight.app.bad;

import org.gof.structural.patterns6.flyweight.font.Font;
import org.gof.structural.patterns6.flyweight.font.FontFactory;
import org.gof.structural.patterns6.flyweight.font.Style;

public class Main {
    public static void main(String[] args) {

        Font font1 = new Font("宋体", Style.BOLD, 12);
        Font font2 = new Font("宋体", Style.BOLD, 12);

        System.out.println(font1 == font2);
    }
}
