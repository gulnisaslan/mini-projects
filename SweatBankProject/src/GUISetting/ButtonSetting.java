package GUISetting;

import java.awt.Color;
import javax.swing.JButton;


public class ButtonSetting {
    private static Color originalBGColor;
    private static Color originalFgColor;
    
    public static void setBg(JButton button,Color bgColor){
        originalBGColor=button.getBackground();
        button.setBackground(bgColor);
    }
    public static void setOriginalBg(JButton button){
        button.setBackground(originalBGColor);
    }
     public static void setfg(JButton button,Color fgColor){
        originalFgColor=button.getForeground();
        button.setForeground(fgColor);
    }
         public static void setOriginalFg(JButton button){
        button.setForeground(originalFgColor);
    }
    
}
