import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
/*
 * Created by JFormDesigner on Mon May 08 06:03:04 PDT 2017
 */


/**
 * @author Henriette Beigh
 */
class clsFindPrimeNumbers
  {
  private final clsCatHelp dlgHlp = new clsCatHelp();

  private int intPrmCat = -1;
  private boolean blnIsRadSel = false;
  
  // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
  // Generated using JFormDesigner non-commercial license
  private JDialog dlgPrimeNumbers;
  private JPanel dialogPane;
  private JPanel panel1;
  private JPanel pnlPrimes;
  private JLabel lblCatgry;
  public JSpinner spnCount;
  private JButton btnHlpTwin;
  private JRadioButton radTwin;
  private JButton btnHlpSphy;
  private JRadioButton radSophie;
  private JButton btnHlpTrplt;
  private JRadioButton radTriplet;
  private JButton btnHlpCunn;
  private JRadioButton radCunningham;
  private JButton btnHlpQuad;
  private JRadioButton radQuad;
  private JButton btnHlpSafe;
  private JRadioButton radSafe;
  private JButton btnHlpQuint;
  private JRadioButton radQuint;
  private JButton btnHlpBaln;
  private JRadioButton radBalanced;
  private JButton btnHlpSext;
  private JRadioButton radSext;
  private JButton btnHlpReglr;
  private JRadioButton radRegular;
  private JButton btnHlpCousin;
  private JRadioButton radCousin;
  private JButton btnHlpArProg;
  private JRadioButton radArithProg;
  private JButton btnHlpSxy;
  private JRadioButton radSexy;
  private JButton btnHlpBiTwin;
  private JRadioButton radBiTwin;
  private JPanel btnBar4Primes;
  private JButton btnOK;
  private JButton btnCanx;
  // JFormDesigner - End of variables declaration  //GEN-END:variables
  
  
  private void SetHlpText(int intIndx)
    {
    dlgHlp.txtHelpCat.setText(dlgHlp.strHlpArr[intIndx]);
    }
  
  private void SetSpnMargins()
    {
    // Get the text field
    JFormattedTextField txtField = ((JSpinner.DefaultEditor) spnCount.getEditor()).getTextField();

    // Set the margin (add two spaces to the left and right side of the value)
    int top = 0;
    int left = 2;
    int bottom = 0;
    int right = 2;
    Insets insets = new Insets(top, left, bottom, right);
    txtField.setMargin(insets);
    }
  
  public void OpenDlg()
    {
    this.dlgPrimeNumbers.setVisible(true);
    this.SetSpnMargins();
    }
  
  private void CloseDlg()
    {
    this.dlgPrimeNumbers.setVisible(false);
    this.dlgPrimeNumbers.dispose();
    }
  
  private void btnCanxActionPerformed(ActionEvent e)
    {
    CloseDlg();
    }
  
  private void btnOKActionPerformed(ActionEvent e)
    {
    if (blnIsRadSel)
      {
      int intCount = (Integer) spnCount.getValue();
      final int intCat = intPrmCat;
      //clsMath MyMath = new clsMath();
      clsMath.doCalc(intCount, intCat);
      }
    }
  
  //
  // ----------------------  Radio Buttons  ----------------------
  //
  
  private void radTwinStateChanged(ChangeEvent e)
    {
    if (this.radTwin.isSelected())
      {
      intPrmCat = 0;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  private void radTripletStateChanged(ChangeEvent e)
    {
    if (this.radTriplet.isSelected())
      {
      intPrmCat = 1;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  private void radQuadStateChanged(ChangeEvent e)
    {
    if (this.radQuad.isSelected())
      {
      intPrmCat = 2;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  
  private void radQuintActionPerformed(ActionEvent e)
    {
    if (this.radQuint.isSelected())
      {
      intPrmCat = 3;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  private void radSextActionPerformed(ActionEvent e)
    {
    if (this.radSext.isSelected())
      {
      intPrmCat = 4;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  
  private void radCousinStateChanged(ChangeEvent e)
    {
    if (this.radCousin.isSelected())
      {
      intPrmCat = 5;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  private void radSexyStateChanged(ChangeEvent e)
    {
    if (this.radSexy.isSelected())
      {
      intPrmCat = 6;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  private void radSophieStateChanged(ChangeEvent e)
    {
    if (this.radSophie.isSelected())
      {
      intPrmCat = 7;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  private void radCunninghamStateChanged(ChangeEvent e)
    {
    if (this.radCunningham.isSelected())
      {
      intPrmCat = 8;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  private void radSafeStateChanged(ChangeEvent e)
    {
     if (this.radSafe.isSelected())
      {
      intPrmCat = 9;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  
  private void radBalancedStateChanged(ChangeEvent e)
    {
     if (this.radBalanced.isSelected())
      {
      intPrmCat = 10;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  private void radRegularStateChanged(ChangeEvent e)
    {
    if (this.radRegular.isSelected())
      {
      intPrmCat = 11;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  private void radArithProgStateChanged(ChangeEvent e)
    {
    if (this.radArithProg.isSelected())
      {
      intPrmCat = 12;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  private void radBiTwinStateChanged(ChangeEvent e)
    {
    if (this.radBiTwin.isSelected())
      {
      intPrmCat = 13;
      blnIsRadSel = true;
      }
    else
      {
      intPrmCat = -1;
      }
    }
  
  
  //
  // ----------------------  Help Buttons  ----------------------
  //
  
  private void btnHlpTwinActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(dlgHlp.intCatTwin);
      }
    }
  
  private void btnHlpTrpltActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(dlgHlp.intCatTrip);
      }
    }
  
  private void btnHlpQuadActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(dlgHlp.intCatQuad);
      }
    }
  
  private void btnHlpQuintActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(dlgHlp.intCatQuin);
      }
    }
  
  private void btnHlpSextActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(dlgHlp.intCatSext);
      }
    }
  
  private void btnHlpCousinActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(dlgHlp.intCatCous);
      }
    }
  
  private void btnHlpSxyActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(dlgHlp.intCatSexy);
      }
    }
  
  private void btnHlpSphyActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(dlgHlp.intCatSoph);
      }
    }
  
  private void btnHlpCunnActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(dlgHlp.intCatCunn);
      }
    }
  
  private void btnHlpSafeActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(dlgHlp.intCatTwin);
      }
    }
  
  
  private void btnHlpBalnActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(10);
      }
    }
  
  private void btnHlpReglrActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(11);
      }
    }
  
  private void btnHlpArProgActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(12);
      }
    }
  
  private void btnHlpBiTwinActionPerformed(ActionEvent e)
    {
    if (!dlgHlp.blnAlreadyOpen)
      {
      dlgHlp.OpenDlg();
      SetHlpText(13);
      }
    }
  
  public void initComponents()
    {
    // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
    // Generated using JFormDesigner non-commercial license
    dlgPrimeNumbers = new JDialog();
    dialogPane = new JPanel();
    panel1 = new JPanel();
    pnlPrimes = new JPanel();
    lblCatgry = new JLabel();
    spnCount = new JSpinner();
    btnHlpTwin = new JButton();
    radTwin = new JRadioButton();
    btnHlpSphy = new JButton();
    radSophie = new JRadioButton();
    btnHlpTrplt = new JButton();
    radTriplet = new JRadioButton();
    btnHlpCunn = new JButton();
    radCunningham = new JRadioButton();
    btnHlpQuad = new JButton();
    radQuad = new JRadioButton();
    btnHlpSafe = new JButton();
    radSafe = new JRadioButton();
    btnHlpQuint = new JButton();
    radQuint = new JRadioButton();
    btnHlpBaln = new JButton();
    radBalanced = new JRadioButton();
    btnHlpSext = new JButton();
    radSext = new JRadioButton();
    btnHlpReglr = new JButton();
    radRegular = new JRadioButton();
    btnHlpCousin = new JButton();
    radCousin = new JRadioButton();
    btnHlpArProg = new JButton();
    radArithProg = new JRadioButton();
    btnHlpSxy = new JButton();
    radSexy = new JRadioButton();
    btnHlpBiTwin = new JButton();
    radBiTwin = new JRadioButton();
    btnBar4Primes = new JPanel();
    btnOK = new JButton();
    btnCanx = new JButton();

    //======== dlgPrimeNumbers ========
    {
      dlgPrimeNumbers.setBackground(new Color(0, 0, 102));
      dlgPrimeNumbers.setForeground(new Color(153, 255, 255));
      dlgPrimeNumbers.setFont(new Font("Lucida Grande", Font.BOLD, 13));
      dlgPrimeNumbers.setTitle("Build a List of Prime Numbers?");
      dlgPrimeNumbers.setName("dlgPrimeNumbers");
      dlgPrimeNumbers.setAlwaysOnTop(true);
      Container dlgPrimeNumbersContentPane = dlgPrimeNumbers.getContentPane();
      dlgPrimeNumbersContentPane.setLayout(new BorderLayout());

      //======== dialogPane ========
      {
        dialogPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
          panel1.setLayout(new BorderLayout());

          //======== pnlPrimes ========
          {
            pnlPrimes.setBackground(new Color(0, 0, 102));
            pnlPrimes.setForeground(new Color(153, 255, 255));
            pnlPrimes.setMaximumSize(new Dimension(750, 400));
            pnlPrimes.setMinimumSize(new Dimension(750, 400));
            pnlPrimes.setPreferredSize(new Dimension(750, 400));
            pnlPrimes.setBorder(new LineBorder(Color.cyan, 1, true));
            pnlPrimes.setFont(new Font("sansserif", Font.PLAIN, 14));
            pnlPrimes.setLayout(new MigLayout(
              "insets dialog,hidemode 3,alignx center",
              // columns
              "[fill]" +
              "[fill]" +
              "[300!,fill]" +
              "[fill]" +
              "[300!,fill]",
              // rows
              "[40!]" +
              "[]" +
              "[30:40:30]" +
              "[30!]" +
              "[30!]" +
              "[30!]" +
              "[30!]" +
              "[30!]" +
              "[30!]" +
              "[]"));

            //---- lblCatgry ----
            lblCatgry.setText("Select the category of Prime number you wish to find:   ");
            lblCatgry.setBackground(new Color(0, 0, 102));
            lblCatgry.setFont(new Font("SansSerif", Font.BOLD, 14));
            lblCatgry.setForeground(new Color(153, 255, 255));
            lblCatgry.setHorizontalAlignment(SwingConstants.LEFT);
            lblCatgry.setMaximumSize(new Dimension(400, 25));
            lblCatgry.setMinimumSize(new Dimension(400, 25));
            lblCatgry.setPreferredSize(new Dimension(400, 25));
            lblCatgry.setIconTextGap(6);
            pnlPrimes.add(lblCatgry, "cell 1 0 4 1");

            //---- spnCount ----
            spnCount.setBackground(new Color(0, 0, 102));
            spnCount.setForeground(new Color(153, 255, 255));
            spnCount.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            spnCount.setMinimumSize(new Dimension(90, 40));
            spnCount.setMaximumSize(new Dimension(90, 40));
            spnCount.setBorder(new LineBorder(Color.orange, 1, true));
            spnCount.setPreferredSize(new Dimension(90, 40));
            spnCount.setModel(new SpinnerNumberModel(2, 2, null, 1));
            pnlPrimes.add(spnCount, "pad 0,cell 1 0 4 1");

            //---- btnHlpTwin ----
            btnHlpTwin.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpTwin.setBackground(new Color(0, 0, 102));
            btnHlpTwin.setMaximumSize(new Dimension(14, 14));
            btnHlpTwin.setMinimumSize(new Dimension(14, 14));
            btnHlpTwin.setPreferredSize(new Dimension(14, 14));
            btnHlpTwin.setBorder(null);
            btnHlpTwin.setFont(new Font("sansserif", Font.PLAIN, 14));
            btnHlpTwin.addActionListener(e -> btnHlpTwinActionPerformed(e));
            pnlPrimes.add(btnHlpTwin, "cell 1 2");

            //---- radTwin ----
            radTwin.setText("Twin");
            radTwin.setBackground(new Color(0, 0, 102));
            radTwin.setFont(new Font("sansserif", Font.PLAIN, 14));
            radTwin.setForeground(new Color(153, 255, 255));
            radTwin.setHorizontalAlignment(SwingConstants.LEFT);
            radTwin.setIconTextGap(8);
            radTwin.setMaximumSize(new Dimension(175, 30));
            radTwin.setMinimumSize(new Dimension(175, 30));
            radTwin.setPreferredSize(new Dimension(175, 30));
            radTwin.setBorder(UIManager.getBorder("RadioButton.border"));
            radTwin.addChangeListener(e -> radTwinStateChanged(e));
            pnlPrimes.add(radTwin, "cell 2 2,alignx left,growx 0");

            //---- btnHlpSphy ----
            btnHlpSphy.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpSphy.setBackground(new Color(0, 0, 102));
            btnHlpSphy.setMaximumSize(new Dimension(14, 14));
            btnHlpSphy.setMinimumSize(new Dimension(14, 14));
            btnHlpSphy.setPreferredSize(new Dimension(14, 14));
            btnHlpSphy.setBorder(null);
            btnHlpSphy.setFont(new Font("sansserif", Font.PLAIN, 14));
            btnHlpSphy.addActionListener(e -> btnHlpSphyActionPerformed(e));
            pnlPrimes.add(btnHlpSphy, "cell 3 2");

            //---- radSophie ----
            radSophie.setText("Sophie Germain");
            radSophie.setBackground(new Color(0, 0, 102));
            radSophie.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            radSophie.setForeground(new Color(153, 255, 255));
            radSophie.setHorizontalAlignment(SwingConstants.LEFT);
            radSophie.setIconTextGap(8);
            radSophie.setMaximumSize(new Dimension(275, 30));
            radSophie.setMinimumSize(new Dimension(275, 30));
            radSophie.setPreferredSize(new Dimension(275, 30));
            radSophie.addChangeListener(e -> radSophieStateChanged(e));
            pnlPrimes.add(radSophie, "cell 4 2,growx");

            //---- btnHlpTrplt ----
            btnHlpTrplt.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpTrplt.setBackground(new Color(0, 0, 102));
            btnHlpTrplt.setMaximumSize(new Dimension(14, 14));
            btnHlpTrplt.setMinimumSize(new Dimension(14, 14));
            btnHlpTrplt.setPreferredSize(new Dimension(14, 14));
            btnHlpTrplt.setBorder(null);
            btnHlpTrplt.addActionListener(e -> btnHlpTrpltActionPerformed(e));
            pnlPrimes.add(btnHlpTrplt, "cell 1 3");

            //---- radTriplet ----
            radTriplet.setText("Triplet");
            radTriplet.setBackground(new Color(0, 0, 102));
            radTriplet.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            radTriplet.setForeground(new Color(153, 255, 255));
            radTriplet.setHorizontalAlignment(SwingConstants.LEFT);
            radTriplet.setIconTextGap(8);
            radTriplet.setMaximumSize(new Dimension(175, 30));
            radTriplet.setMinimumSize(new Dimension(175, 30));
            radTriplet.setPreferredSize(new Dimension(175, 30));
            radTriplet.addChangeListener(e -> radTripletStateChanged(e));
            pnlPrimes.add(radTriplet, "cell 2 3,alignx left,growx 0");

            //---- btnHlpCunn ----
            btnHlpCunn.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpCunn.setBackground(new Color(0, 0, 102));
            btnHlpCunn.setMaximumSize(new Dimension(14, 14));
            btnHlpCunn.setMinimumSize(new Dimension(14, 14));
            btnHlpCunn.setPreferredSize(new Dimension(14, 14));
            btnHlpCunn.setBorder(null);
            btnHlpCunn.addActionListener(e -> btnHlpCunnActionPerformed(e));
            pnlPrimes.add(btnHlpCunn, "cell 3 3");

            //---- radCunningham ----
            radCunningham.setText("Cunningham Chain");
            radCunningham.setBackground(new Color(0, 0, 102));
            radCunningham.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            radCunningham.setForeground(new Color(153, 255, 255));
            radCunningham.setHorizontalAlignment(SwingConstants.LEFT);
            radCunningham.setIconTextGap(8);
            radCunningham.setMaximumSize(new Dimension(275, 30));
            radCunningham.setMinimumSize(new Dimension(275, 30));
            radCunningham.setPreferredSize(new Dimension(275, 30));
            radCunningham.setActionCommand("Cunningham Chain");
            radCunningham.addChangeListener(e -> radCunninghamStateChanged(e));
            pnlPrimes.add(radCunningham, "cell 4 3,growx");

            //---- btnHlpQuad ----
            btnHlpQuad.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpQuad.setBackground(new Color(0, 0, 102));
            btnHlpQuad.setMaximumSize(new Dimension(14, 14));
            btnHlpQuad.setMinimumSize(new Dimension(14, 14));
            btnHlpQuad.setPreferredSize(new Dimension(14, 14));
            btnHlpQuad.setBorder(null);
            btnHlpQuad.addActionListener(e -> btnHlpQuadActionPerformed(e));
            pnlPrimes.add(btnHlpQuad, "cell 1 4");

            //---- radQuad ----
            radQuad.setText("Quadruplet");
            radQuad.setBackground(new Color(0, 0, 102));
            radQuad.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            radQuad.setForeground(new Color(153, 255, 255));
            radQuad.setHorizontalAlignment(SwingConstants.LEFT);
            radQuad.setIconTextGap(8);
            radQuad.setMaximumSize(new Dimension(175, 30));
            radQuad.setMinimumSize(new Dimension(175, 30));
            radQuad.setPreferredSize(new Dimension(175, 30));
            radQuad.addChangeListener(e -> radQuadStateChanged(e));
            pnlPrimes.add(radQuad, "cell 2 4,alignx left,growx 0");

            //---- btnHlpSafe ----
            btnHlpSafe.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpSafe.setBackground(new Color(0, 0, 102));
            btnHlpSafe.setMaximumSize(new Dimension(14, 14));
            btnHlpSafe.setMinimumSize(new Dimension(14, 14));
            btnHlpSafe.setPreferredSize(new Dimension(14, 14));
            btnHlpSafe.setBorder(null);
            btnHlpSafe.addActionListener(e -> btnHlpSafeActionPerformed(e));
            pnlPrimes.add(btnHlpSafe, "cell 3 4");

            //---- radSafe ----
            radSafe.setText("Safe");
            radSafe.setBackground(new Color(0, 0, 102));
            radSafe.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            radSafe.setForeground(new Color(153, 255, 255));
            radSafe.setHorizontalAlignment(SwingConstants.LEFT);
            radSafe.setIconTextGap(8);
            radSafe.setMaximumSize(new Dimension(275, 30));
            radSafe.setMinimumSize(new Dimension(275, 30));
            radSafe.setPreferredSize(new Dimension(275, 30));
            radSafe.setActionCommand("Safe");
            radSafe.addChangeListener(e -> radSafeStateChanged(e));
            pnlPrimes.add(radSafe, "cell 4 4,growx");

            //---- btnHlpQuint ----
            btnHlpQuint.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpQuint.setBackground(new Color(0, 0, 102));
            btnHlpQuint.setMaximumSize(new Dimension(14, 14));
            btnHlpQuint.setMinimumSize(new Dimension(14, 14));
            btnHlpQuint.setPreferredSize(new Dimension(14, 14));
            btnHlpQuint.setBorder(null);
            btnHlpQuint.addActionListener(e -> btnHlpQuintActionPerformed(e));
            pnlPrimes.add(btnHlpQuint, "cell 1 5");

            //---- radQuint ----
            radQuint.setText("Quintuplet");
            radQuint.setBackground(new Color(0, 0, 102));
            radQuint.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            radQuint.setForeground(new Color(153, 255, 255));
            radQuint.setHorizontalAlignment(SwingConstants.LEFT);
            radQuint.setIconTextGap(8);
            radQuint.setMaximumSize(new Dimension(175, 30));
            radQuint.setMinimumSize(new Dimension(175, 30));
            radQuint.setPreferredSize(new Dimension(175, 30));
            radQuint.addActionListener(e -> radQuintActionPerformed(e));
            pnlPrimes.add(radQuint, "cell 2 5,alignx left,growx 0");

            //---- btnHlpBaln ----
            btnHlpBaln.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpBaln.setBackground(new Color(0, 0, 102));
            btnHlpBaln.setMaximumSize(new Dimension(14, 14));
            btnHlpBaln.setMinimumSize(new Dimension(14, 14));
            btnHlpBaln.setPreferredSize(new Dimension(14, 14));
            btnHlpBaln.setBorder(null);
            btnHlpBaln.addActionListener(e -> btnHlpBalnActionPerformed(e));
            pnlPrimes.add(btnHlpBaln, "cell 3 5");

            //---- radBalanced ----
            radBalanced.setText("Balanced");
            radBalanced.setBackground(new Color(0, 0, 102));
            radBalanced.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            radBalanced.setForeground(new Color(153, 255, 255));
            radBalanced.setHorizontalAlignment(SwingConstants.LEFT);
            radBalanced.setIconTextGap(8);
            radBalanced.setMaximumSize(new Dimension(275, 30));
            radBalanced.setMinimumSize(new Dimension(275, 30));
            radBalanced.setPreferredSize(new Dimension(275, 30));
            radBalanced.setActionCommand("Balanced");
            radBalanced.addChangeListener(e -> radBalancedStateChanged(e));
            pnlPrimes.add(radBalanced, "cell 4 5,growx");

            //---- btnHlpSext ----
            btnHlpSext.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpSext.setBackground(new Color(0, 0, 102));
            btnHlpSext.setMaximumSize(new Dimension(14, 14));
            btnHlpSext.setMinimumSize(new Dimension(14, 14));
            btnHlpSext.setPreferredSize(new Dimension(14, 14));
            btnHlpSext.setBorder(null);
            btnHlpSext.addActionListener(e -> btnHlpSextActionPerformed(e));
            pnlPrimes.add(btnHlpSext, "cell 1 6");

            //---- radSext ----
            radSext.setText("Sextuplet");
            radSext.setBackground(new Color(0, 0, 102));
            radSext.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            radSext.setForeground(new Color(153, 255, 255));
            radSext.setHorizontalAlignment(SwingConstants.LEFT);
            radSext.setIconTextGap(8);
            radSext.setMaximumSize(new Dimension(175, 30));
            radSext.setMinimumSize(new Dimension(175, 30));
            radSext.setPreferredSize(new Dimension(175, 30));
            radSext.addActionListener(e -> radSextActionPerformed(e));
            pnlPrimes.add(radSext, "cell 2 6,alignx left,growx 0");

            //---- btnHlpReglr ----
            btnHlpReglr.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpReglr.setBackground(new Color(0, 0, 102));
            btnHlpReglr.setMaximumSize(new Dimension(14, 14));
            btnHlpReglr.setMinimumSize(new Dimension(14, 14));
            btnHlpReglr.setPreferredSize(new Dimension(14, 14));
            btnHlpReglr.setBorder(null);
            btnHlpReglr.addActionListener(e -> btnHlpReglrActionPerformed(e));
            pnlPrimes.add(btnHlpReglr, "cell 3 6");

            //---- radRegular ----
            radRegular.setText("Just some plain old Prime numbers");
            radRegular.setBackground(new Color(0, 0, 102));
            radRegular.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            radRegular.setForeground(new Color(153, 255, 255));
            radRegular.setHorizontalAlignment(SwingConstants.LEFT);
            radRegular.setActionCommand("Prime Numbers");
            radRegular.setMaximumSize(new Dimension(325, 30));
            radRegular.setMinimumSize(new Dimension(325, 30));
            radRegular.setPreferredSize(new Dimension(326, 30));
            radRegular.setIconTextGap(8);
            radRegular.addChangeListener(e -> radRegularStateChanged(e));
            pnlPrimes.add(radRegular, "cell 4 6,growx");

            //---- btnHlpCousin ----
            btnHlpCousin.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpCousin.setBackground(new Color(0, 0, 102));
            btnHlpCousin.setMaximumSize(new Dimension(14, 14));
            btnHlpCousin.setMinimumSize(new Dimension(14, 14));
            btnHlpCousin.setPreferredSize(new Dimension(14, 14));
            btnHlpCousin.setBorder(null);
            btnHlpCousin.addActionListener(e -> btnHlpCousinActionPerformed(e));
            pnlPrimes.add(btnHlpCousin, "cell 1 7");

            //---- radCousin ----
            radCousin.setText("Cousin");
            radCousin.setBackground(new Color(0, 0, 102));
            radCousin.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            radCousin.setForeground(new Color(153, 255, 255));
            radCousin.setHorizontalAlignment(SwingConstants.LEFT);
            radCousin.setIconTextGap(8);
            radCousin.setMaximumSize(new Dimension(175, 30));
            radCousin.setMinimumSize(new Dimension(175, 30));
            radCousin.setPreferredSize(new Dimension(175, 30));
            radCousin.addChangeListener(e -> radCousinStateChanged(e));
            pnlPrimes.add(radCousin, "cell 2 7,alignx left,growx 0");

            //---- btnHlpArProg ----
            btnHlpArProg.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpArProg.setBackground(new Color(204, 204, 204));
            btnHlpArProg.setMaximumSize(new Dimension(14, 14));
            btnHlpArProg.setMinimumSize(new Dimension(14, 14));
            btnHlpArProg.setPreferredSize(new Dimension(14, 14));
            btnHlpArProg.setBorder(null);
            btnHlpArProg.setForeground(new Color(102, 102, 102));
            btnHlpArProg.setEnabled(false);
            pnlPrimes.add(btnHlpArProg, "cell 3 7");

            //---- radArithProg ----
            radArithProg.setText("Arithmetic Progression");
            radArithProg.setBackground(new Color(204, 204, 204));
            radArithProg.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            radArithProg.setForeground(new Color(102, 102, 102));
            radArithProg.setHorizontalAlignment(SwingConstants.LEFT);
            radArithProg.setIconTextGap(8);
            radArithProg.setMaximumSize(new Dimension(275, 30));
            radArithProg.setMinimumSize(new Dimension(275, 30));
            radArithProg.setPreferredSize(new Dimension(275, 30));
            radArithProg.setActionCommand("Arithmetic Progression");
            radArithProg.setEnabled(false);
            pnlPrimes.add(radArithProg, "cell 4 7,growx");

            //---- btnHlpSxy ----
            btnHlpSxy.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpSxy.setBackground(new Color(0, 0, 102));
            btnHlpSxy.setMaximumSize(new Dimension(14, 14));
            btnHlpSxy.setMinimumSize(new Dimension(14, 14));
            btnHlpSxy.setPreferredSize(new Dimension(14, 14));
            btnHlpSxy.setBorder(null);
            btnHlpSxy.addActionListener(e -> btnHlpSxyActionPerformed(e));
            pnlPrimes.add(btnHlpSxy, "cell 1 8");

            //---- radSexy ----
            radSexy.setText("Sexy");
            radSexy.setBackground(new Color(0, 0, 102));
            radSexy.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            radSexy.setForeground(new Color(153, 255, 255));
            radSexy.setHorizontalAlignment(SwingConstants.LEFT);
            radSexy.setIconTextGap(8);
            radSexy.setMaximumSize(new Dimension(175, 30));
            radSexy.setMinimumSize(new Dimension(175, 30));
            radSexy.setPreferredSize(new Dimension(175, 30));
            radSexy.addChangeListener(e -> radSexyStateChanged(e));
            pnlPrimes.add(radSexy, "cell 2 8,alignx left,growx 0");

            //---- btnHlpBiTwin ----
            btnHlpBiTwin.setIcon(new ImageIcon("/Users/ritapdx/Pictures/Icons/HelpIcon_12by12.jpg"));
            btnHlpBiTwin.setBackground(new Color(204, 204, 204));
            btnHlpBiTwin.setMaximumSize(new Dimension(14, 14));
            btnHlpBiTwin.setMinimumSize(new Dimension(14, 14));
            btnHlpBiTwin.setPreferredSize(new Dimension(14, 14));
            btnHlpBiTwin.setBorder(null);
            btnHlpBiTwin.setForeground(new Color(102, 102, 102));
            btnHlpBiTwin.setEnabled(false);
            pnlPrimes.add(btnHlpBiTwin, "cell 3 8");

            //---- radBiTwin ----
            radBiTwin.setText("Bi-Twin Chain");
            radBiTwin.setBackground(new Color(204, 204, 204));
            radBiTwin.setFont(new Font(".SF NS Text", Font.BOLD, 14));
            radBiTwin.setForeground(new Color(102, 102, 102));
            radBiTwin.setHorizontalAlignment(SwingConstants.LEFT);
            radBiTwin.setIconTextGap(8);
            radBiTwin.setMaximumSize(new Dimension(200, 30));
            radBiTwin.setMinimumSize(new Dimension(200, 30));
            radBiTwin.setPreferredSize(new Dimension(200, 30));
            radBiTwin.setEnabled(false);
            pnlPrimes.add(radBiTwin, "cell 4 8,growx");
          }
          panel1.add(pnlPrimes, BorderLayout.NORTH);
        }
        dialogPane.add(panel1, BorderLayout.CENTER);

        //======== btnBar4Primes ========
        {
          btnBar4Primes.setBackground(new Color(0, 0, 102));
          btnBar4Primes.setForeground(new Color(153, 255, 255));
          btnBar4Primes.setMaximumSize(new Dimension(750, 475));
          btnBar4Primes.setMinimumSize(new Dimension(750, 475));
          btnBar4Primes.setPreferredSize(new Dimension(750, 75));
          btnBar4Primes.setBorder(new LineBorder(Color.cyan, 1, true));
          btnBar4Primes.setLayout(new MigLayout(
            "insets dialog,alignx right",
            // columns
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]"));

          //---- btnOK ----
          btnOK.setText("OK");
          btnOK.setBackground(new Color(0, 0, 102));
          btnOK.setForeground(new Color(153, 255, 255));
          btnOK.setFont(new Font(".SF NS Text", Font.BOLD, 16));
          btnOK.setMaximumSize(new Dimension(90, 45));
          btnOK.setMinimumSize(new Dimension(90, 45));
          btnOK.setPreferredSize(new Dimension(90, 45));
          btnOK.setBorder(new LineBorder(Color.cyan, 1, true));
          btnOK.setAlignmentY(0.0F);
          btnOK.setMargin(new Insets(0, 0, 0, 0));
          btnOK.setHorizontalTextPosition(SwingConstants.CENTER);
          btnOK.setIconTextGap(0);
          btnOK.addActionListener(e -> btnOKActionPerformed(e));
          btnBar4Primes.add(btnOK, "cell 0 0");

          //---- btnCanx ----
          btnCanx.setText("Exit App");
          btnCanx.setBackground(new Color(0, 0, 102));
          btnCanx.setForeground(new Color(153, 255, 255));
          btnCanx.setFont(new Font(".SF NS Text", Font.BOLD, 16));
          btnCanx.setMaximumSize(new Dimension(90, 45));
          btnCanx.setMinimumSize(new Dimension(90, 45));
          btnCanx.setPreferredSize(new Dimension(90, 45));
          btnCanx.setBorder(new LineBorder(Color.cyan, 1, true));
          btnCanx.setAlignmentY(0.0F);
          btnCanx.setMargin(new Insets(0, 0, 0, 0));
          btnCanx.setHorizontalTextPosition(SwingConstants.CENTER);
          btnCanx.addActionListener(e -> btnCanxActionPerformed(e));
          btnBar4Primes.add(btnCanx, "cell 1 0");
        }
        dialogPane.add(btnBar4Primes, BorderLayout.SOUTH);
      }
      dlgPrimeNumbersContentPane.add(dialogPane, BorderLayout.CENTER);
      dlgPrimeNumbers.pack();
      dlgPrimeNumbers.setLocationRelativeTo(dlgPrimeNumbers.getOwner());
    }

    //---- grpBtnPrimes ----
    ButtonGroup grpBtnPrimes = new ButtonGroup();
    grpBtnPrimes.add(radTwin);
    grpBtnPrimes.add(radSophie);
    grpBtnPrimes.add(radTriplet);
    grpBtnPrimes.add(radCunningham);
    grpBtnPrimes.add(radQuad);
    grpBtnPrimes.add(radSafe);
    grpBtnPrimes.add(radQuint);
    grpBtnPrimes.add(radBalanced);
    grpBtnPrimes.add(radSext);
    grpBtnPrimes.add(radRegular);
    grpBtnPrimes.add(radCousin);
    grpBtnPrimes.add(radArithProg);
    grpBtnPrimes.add(radSexy);
    grpBtnPrimes.add(radBiTwin);
    // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
  }
