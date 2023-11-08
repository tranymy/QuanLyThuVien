package com.raven.component;

//import com.raven.event.EventMenu;
//import com.raven.event.EventMenuCallBack;
//import com.raven.event.EventMenuSelected;
//import com.raven.model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Path2D;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Menu extends javax.swing.JPanel {
//
//    public void addEventMenu(EventMenu event) {
//        this.event = event;
//    }
//
//    private int selectedIndex = -1;
//    private final Timer timer;
//    private boolean toUp;   //  For animation is go up
//    private int menuYTarget;
//    private int menuY;
//    private int speed = 2;
//    private EventMenuCallBack callBack;
//    private EventMenu event;

    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu.setOpaque(false);
//        listMenu.setOpaque(false);
//        listMenu.addEventSelectedMenu(new EventMenuSelected() {
//            @Override
//            public void menuSelected(int index, EventMenuCallBack callBack) {
//                if (index != selectedIndex) {
//                    Menu.this.callBack = callBack;
//                    toUp = selectedIndex > index;
//                    if (selectedIndex == -1) {
//                        speed = 20;
//                    } else {
//                        speed = selectedIndex - index;
//                        if (speed < 0) {
//                            speed *= -1;
//                            //  If speed valus <0 change it to <0   Ex : -1 to 1
//                        }
//                    }
//                    speed++;    //  Add 1 speed
//                    selectedIndex = index;
//                    menuYTarget = selectedIndex * 35 + listMenu.getY(); //  menuYTarget is location y
//                    if (!timer.isRunning()) {
//                        timer.start();
//                    }
//                }
//            }
//        });
//        timer = new Timer(0, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                if (toUp) {
//                    if (menuY <= menuYTarget - 5) {
//                        menuY = menuYTarget;
//                        repaint();
//                        timer.stop();
//                        callBack.call(selectedIndex);
//                        if (event != null) {
//                            event.menuIndexChange(selectedIndex);
//                        }
//                    } else {
//                        menuY -= speed;
//                        repaint();
//                    }
//                } else {
//                    if (menuY >= menuYTarget + 5) { //  Add style
//                        menuY = menuYTarget;
//                        repaint();
//                        timer.stop();
//                        callBack.call(selectedIndex);
//                        if (event != null) {
//                            event.menuIndexChange(selectedIndex);
//                        }
//                    } else {
//                        menuY += speed;
//                        repaint();
//                    }
//                }
//            }
//        });
//        initData();
    }

//    private void initData() {
//        listMenu.addItem(new Model_Menu("1", "Dashboard", Model_Menu.MenuType.MENU));
//        listMenu.addItem(new Model_Menu("2", "UI Elements", Model_Menu.MenuType.MENU));
//        listMenu.addItem(new Model_Menu("3", "Comonents", Model_Menu.MenuType.MENU));
//        listMenu.addItem(new Model_Menu("4", "Forms Stuff", Model_Menu.MenuType.MENU));
//        listMenu.addItem(new Model_Menu("5", "Date Table", Model_Menu.MenuType.MENU));
//        listMenu.addItem(new Model_Menu("6", "Icons", Model_Menu.MenuType.MENU));
//        listMenu.addItem(new Model_Menu("7", "Sample Page", Model_Menu.MenuType.MENU));
//        listMenu.addItem(new Model_Menu("8", "Extra", Model_Menu.MenuType.MENU));
//        listMenu.addItem(new Model_Menu("9", "More", Model_Menu.MenuType.MENU));
//        listMenu.addItem(new Model_Menu("10", "Message", Model_Menu.MenuType.MENU));
//        listMenu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMenu = new com.raven.swing.ListMenu<>();

        panelMoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FAHASHA");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        listMenu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#C92127"), 0, getHeight(), Color.decode("#F8BABA"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
//        if (selectedIndex >= 0) {
//            int menuX = 10;
//            int height = 35;
//            int width = getWidth();
//            g2.setColor(new Color(242, 242, 242));
//            g2.fillRoundRect(menuX, menuY, width, height, 35, 35);
//            Path2D.Float f = new Path2D.Float();
//            f.moveTo(width - 30, menuY);
//            f.curveTo(width - 10, menuY, width, menuY, width, menuY - 30);
//            f.lineTo(width, menuY + height + 30);
//            f.curveTo(width, menuY + height, width - 10, menuY + height, width - 30, menuY + height);
//
//            g2.fill(f);
//        }
       super.paintComponent(grphcs);
    }
//
//    private int x;
//    private int y;
//
//    public void initMoving(JFrame fram) {
//        panelMoving.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent me) {
//                x = me.getX() + 6;
//                y = me.getY() + 6;
//            }
//
//        });
//        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
//            @Override
//            public void mouseDragged(MouseEvent me) {
//                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.swing.ListMenu<String> listMenu;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
