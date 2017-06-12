import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;


/**
 *
 * @author Henriette Beigh
 *
 */

class clsCatHelp
  {
  
//  public clsCatHelp(Frame owner) {
//    super(owner);
//    initComponents();
//  }
//
//  public clsCatHelp(Dialog owner) {
//    super(owner);
//    initComponents();
//  }

  public final String[] strHlpArr = new String[14];
  //public JTextArea txtHlp;

  public final int intCatTwin   =  0;
  public final int intCatTrip   =  1;
  public final int intCatQuad   =  2;
  public final int intCatQuin   =  3;
  public final int intCatSext   =  4;
  public final int intCatCous   =  5;
  public final int intCatSexy   =  6;
  public final int intCatSoph   =  7;
  public final int intCatCunn   =  8;
  public final int intCatSafe   =  9;
  public final int intCatBaln   = 10;
  public final int intCatRglr   = 11;
  public final int intCatBitw   = 12;
  public final int intCatArpr   = 13;

  
  public clsCatHelp()
    {
    // initialize help strings
    this.strHlpArr[intCatTwin] = "Twin Primes: \n" +
      "A pair of prime numbers in the form \n" +
      "(p, p + 2)  Example (3, 5), (11, 13)";
    this.strHlpArr[intCatTrip] = "Triplet Primes: \n" +
      "Three prime numbers in the form \n" +
      "(p, p + 2, p + 6) or (p, p + 4, p + 6)  \n" +
      "Example (3, 5, 7), (5, 7, 11), (7, 11, 13)";
    this.strHlpArr[intCatQuad] = "Quadruplet Primes: \n" +
    "A prime constellation of four successive primes \n" +
    "with minimal distance (p, p + 2, p + 6, p + 8). \n" +
    "Examples: (5,  7,   11, 13), (11, 13, 17, 19) \n" +
    "With the exception of the two examples shown above,\n" +
    "a prime quadruple must be of the form: \n" +
    "(30n+11, 30n+13, 30n+17, 30n+19).\n" +
    "A few values of n which give prime quadruples\n" +
    "are n = 0, 3, 6, 27, 49, 62, 69, 108, 115, ...";
    this.strHlpArr[intCatQuin] = "Quintuplet Primes:\n" +
      "A prime constellation of five successive primes \n" +
      "with minimal distance  (p, p + 2, p + 6, p + 8, p + 12) OR\n" +
      "\t\t\t\t\t\t" +
      "\t\t\t\t\t\t(p - 4, p, p + 2, p + 6, p + 8)\n" +
      "Examples: \n" +
      "{5, 7, 11, 13, 17}, {11, 13, 17, 19, 23},\n" +
      "{101, 103, 107, 109, 113}, {1481, 1483, 1487, 1489, 1493}";
    this.strHlpArr[intCatSext] = "Sextuplet Primes:\n" +
      "A prime constellation of five successive primes \n" +
      "with minimal distance (p - 4, p, p + 2, p + 6, p + 8, p + 12)\n" +
      "Examples: \n" +
      "{7, 11, 13, 17, 19, 23}, {97, 101, 103, 107, 109, 113},\n" +
      "{16057, 16061, 16063, 16067, 16069, 16073}";
    this.strHlpArr[intCatCous] = "Cousin Primes: \n" +
      "Pairs of primes of the form (p, p + 4) \n" +
      "Examples: \n"+
      "(3, 7), (7, 11), (13, 17), (19, 23), (37, 41), (43, 47), (67, 71), ... ";
    this.strHlpArr[intCatSexy] = "Sexy Primes:\n" +
    "Pairs of primes of the form (p, p+6),\n" +
    "so-named since \"sex\" is the Latin word for \"six.\"\n" +
    "The first few sexy prime pairs are:\n" +
    "(5, 11), (7, 13), (11, 17), (13, 19), (17, 23), (23, 29),\n" +
    "(31, 37), (37, 43), (41, 47), (47, 53), ...";
    this.strHlpArr[intCatSoph] = "Sophie Germain Primes:\n" +
    "A prime p is said to be a Sophie Germain prime if\n" + "" +
    "both p and 2p+1, the form (p, 2p+1), are prime. \n" +
    "The first few Sophie Germain primes are: \n" +
    "2, 3, 5, 11, 23, 29, 41, 53, 83, 89, 113, 131, ...\n" +
    "Example: 2, (2 * 2) + 1 = 5 are both primes\n" +
    "11 and 22 + 1 = 23 are both primes.";
    this.strHlpArr[intCatCunn] = "Cunningham Chain:\n" +
    "Prime numbers of the form (p, 2p ± 1)\n" +
    "are members of a Cunningham Chain. Oviously, the form\n" +
    "(p, 2p + 1) is identical to the Sophie Germaine primes.\n" +
    "They form a Cunningham Chain of the first kind. Primes \n" +
    "of the form (p, 2p -1) are members of a Cunningham\n" +
    "Chain of the second kind. \n" +
    "Examples of Cunningham Chain primes of the second kind:\n" +
    "2, 3, 5, 7, 19, ...";
    this.strHlpArr[intCatSafe] = "Safe Primes:\n" +
    "A safe prime of the form (p, (p - 1)/2).\n" +
    "Given a prime number, p, if (p - 1)/2 is also a prime,\n" +
    "then p is a safe prime. Examples:\n" +
    "5, (5-1)/2 = 2 is prime\n"  +
    "7, (7-1)/2 = 3 is prime\n" +
    "23, (23 - 1) = 11 is prime." ;
    this.strHlpArr[intCatBaln] = "Balanced Primes:\n" +
      "Primes which are the mean of the next prime number and the\n" +
      "previous prime number. This can be expressed as\n" +
      "p_n = {{p_{n - 1} + p_{n + 1}} \\over 2}, where {{p_n}} is the nth\n" +
      "prime number and {{p_{n - 1}}} and {{p_{n + 1}}} are the previous\n" +
      "prime number and the next prime number, respectively. 5 is the\n" +
      "first balanced prime, as 3+7/2 = 5. In theory, in order to be\n" +
      "a balanced prime, the difference between the nth prime number\n" +
      "and the n+1th prime number can be any even number, as long as it\n" +
      "is the same as the gap between the nth and the n-1th. Most of said\n" +
      "even numbers are multiples of three, as a result of the pigeonhole\n " +
      "principle. If the difference is not a multiple of three, one of the\n" +
      "three numbers n-x, n, or n+x will be a multiple of three.\n" +
      "Examples: \n" +
        "(3, 5, 7), (47, 53, 59), (151, 157, 163)\n" +
        "(167, 173, 179), (199, 211, 223)";
    this.strHlpArr[intCatRglr] = "Regular Prime Numbers:\n" +
      "Your everyday sequence of non-special Prime Numbers:\n" +
      "A Prime Number is any positive Integer greater than 1\n" +
      "that is divisable by itself and 1 only.\n" +
      "Examples:\n" +
      "2, 3, 5, 7. 11. 13. 17. 19. 23, ...";
    this.strHlpArr[intCatBitw] = "Bi-twin Chain: \n" +
      "A sequence of prime numbers in the form \n" +
      "of length k - 1 is defined as a collection \n" +
      "of natural numbers: (n − 1, n + 1, 2n − 1, 2n + 1, …) \n" +
      "such that all the numbers in the chain are prime.";
    this.strHlpArr[intCatArpr] = "";
  
    }

  boolean blnAlreadyOpen = false;
  
  
  public void OpenDlg()
    {
    if (!blnAlreadyOpen)
      {
      this.initComponents();
      this.clsCatHlp.setVisible(true);
      blnAlreadyOpen = true;
      }
    }
  
  

  
  private void okButtonActionPerformed(ActionEvent e)
    {
    this.clsCatHlp.setVisible(false);
    this.clsCatHlp.dispose();
    blnAlreadyOpen = false;
    }

  private void initComponents() {
    // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
    // Generated using JFormDesigner non-commercial license
    clsCatHlp = new JDialog();
    pnlDlgPnl = new JPanel();
    pnlContent = new JPanel();
    pnlScroll = new JScrollPane();
    txtHelpCat = new JTextArea();
    buttonBar = new JPanel();
    btnOK = new JButton();

    //======== clsCatHlp ========
    {
      clsCatHlp.setBackground(new Color(255, 255, 192));
      clsCatHlp.setFont(new Font("Lucida Grande", Font.BOLD, 13));
      clsCatHlp.setTitle("Help: Prime Number Categories");
      clsCatHlp.setAlwaysOnTop(true);
      clsCatHlp.setName("clsCatHlp");
      clsCatHlp.setMinimumSize(new Dimension(400, 375));
      clsCatHlp.setResizable(false);
      Container clsCatHlpContentPane = clsCatHlp.getContentPane();

      //======== pnlDlgPnl ========
      {
        pnlDlgPnl.setBackground(new Color(255, 255, 192));

        //======== pnlContent ========
        {
          pnlContent.setBackground(new Color(255, 255, 192));
          pnlContent.setForeground(new Color(153, 255, 255));
          pnlContent.setPreferredSize(new Dimension(405, 200));
          pnlContent.setMinimumSize(new Dimension(405, 200));

          //======== pnlScroll ========
          {
            pnlScroll.setMinimumSize(new Dimension(350, 275));
            pnlScroll.setPreferredSize(new Dimension(350, 275));
            pnlScroll.setBackground(Color.white);
            pnlScroll.setBorder(null);
          }

          //---- txtHelpCat ----
          txtHelpCat.setBackground(new Color(255, 255, 192));
          txtHelpCat.setForeground(new Color(0, 0, 102));
          txtHelpCat.setPreferredSize(new Dimension(400, 375));
          txtHelpCat.setMinimumSize(new Dimension(400, 375));
          txtHelpCat.setWrapStyleWord(true);
          txtHelpCat.setEditable(false);
          txtHelpCat.setTabSize(1);
          txtHelpCat.setAlignmentX(0.0F);
          txtHelpCat.setAlignmentY(0.0F);
          txtHelpCat.setMargin(new Insets(0, 5, 0, 5));
          txtHelpCat.setFont(new Font(".SF NS Text", Font.BOLD, 11));
          txtHelpCat.setBorder(null);

          GroupLayout pnlContentLayout = new GroupLayout(pnlContent);
          pnlContent.setLayout(pnlContentLayout);
          pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup()
              .addGroup(pnlContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHelpCat, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlScroll, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );
          pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup()
              .addGroup(pnlContentLayout.createSequentialGroup()
                .addGroup(pnlContentLayout.createParallelGroup()
                  .addComponent(pnlScroll, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(txtHelpCat, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
          );
        }

        //======== buttonBar ========
        {
          buttonBar.setBackground(new Color(255, 255, 192));
          buttonBar.setForeground(Color.black);
          buttonBar.setFont(new Font(".SF NS Text", Font.BOLD, 16));
          buttonBar.setBorder(null);
          buttonBar.setLayout(new MigLayout(
            "insets dialog,alignx right",
            // columns
            "[fill]",
            // rows
            "0[grow,fill]0"));

          //---- btnOK ----
          btnOK.setText("OK");
          btnOK.setBackground(new Color(0, 0, 153));
          btnOK.setForeground(Color.cyan);
          btnOK.setFont(new Font(".SF NS Text", btnOK.getFont().getStyle() | Font.BOLD, btnOK.getFont().getSize() + 1));
          btnOK.setMaximumSize(new Dimension(70, 35));
          btnOK.setMinimumSize(new Dimension(70, 35));
          btnOK.setPreferredSize(new Dimension(70, 35));
          btnOK.setBorder(new LineBorder(Color.black, 2, true));
          btnOK.setOpaque(true);
          btnOK.addActionListener(e -> okButtonActionPerformed(e));
          buttonBar.add(btnOK, "tag ok,cell 0 0");
        }

        GroupLayout pnlDlgPnlLayout = new GroupLayout(pnlDlgPnl);
        pnlDlgPnl.setLayout(pnlDlgPnlLayout);
        pnlDlgPnlLayout.setHorizontalGroup(
          pnlDlgPnlLayout.createParallelGroup()
            .addComponent(pnlContent, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(buttonBar, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)
        );
        pnlDlgPnlLayout.setVerticalGroup(
          pnlDlgPnlLayout.createParallelGroup()
            .addGroup(pnlDlgPnlLayout.createSequentialGroup()
              .addComponent(pnlContent, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(buttonBar, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
              .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
      }

      GroupLayout clsCatHlpContentPaneLayout = new GroupLayout(clsCatHlpContentPane);
      clsCatHlpContentPane.setLayout(clsCatHlpContentPaneLayout);
      clsCatHlpContentPaneLayout.setHorizontalGroup(
        clsCatHlpContentPaneLayout.createParallelGroup()
          .addGroup(GroupLayout.Alignment.TRAILING, clsCatHlpContentPaneLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(pnlDlgPnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      clsCatHlpContentPaneLayout.setVerticalGroup(
        clsCatHlpContentPaneLayout.createParallelGroup()
          .addGroup(clsCatHlpContentPaneLayout.createSequentialGroup()
            .addComponent(pnlDlgPnl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      clsCatHlp.pack();
      clsCatHlp.setLocationRelativeTo(null);
    }
    // JFormDesigner - End of component initialization  //GEN-END:initComponents
  }

  // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
  // Generated using JFormDesigner non-commercial license
  private JDialog clsCatHlp;
  private JPanel pnlDlgPnl;
  public JPanel pnlContent;
  private JScrollPane pnlScroll;
  public JTextArea txtHelpCat;
  private JPanel buttonBar;
  private JButton btnOK;
  // JFormDesigner - End of variables declaration  //GEN-END:variables
}
