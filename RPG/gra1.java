import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class gra1 {
    public static void main(String args[]) {
        System.out.println("やっはろー");

        // make window frame
        JFrame jf = new JFrame();
        jf.setBounds(50, 100, 750, 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add panel on frame
        JPanel jp = new JPanel();
        jp.setBackground(Color.BLACK);
        jf.add(jp);

        // make and add rabel on parent panel
        JLabel jl = new JLabel("魔王が世界を滅ぼそうとしています。");
        Font f = new Font(Font.MONOSPACED, Font.BOLD, 40);

        jl.setFont(f);
        jl.setForeground(new Color(255, 128, 0));
        jp.add(jl);

        // add childpanel on panel
        JPanel jpChild = new JPanel();
        jpChild.setBackground(Color.RED);
        jp.add(jpChild);

        // make and add rabel on clild panel
        JLabel jlChild = new JLabel("トンヌラ Lv999 攻撃力999");
        jlChild.setFont(f);
        jlChild.setForeground(Color.WHITE);
        jpChild.add(jlChild);
    }
}