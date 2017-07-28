//package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//import static com.company.TicTacToe.buttons;

public class TicTacToe extends JFrame {

    JPanel panel;
    JFrame frame;
    //JButton button;
    public static JButton[][] buttons;
    static boolean box1;
    private BorderLayout layout;
    private int count = 0;
    private static byte value = 0;
    private static int id = 1;
    public boolean X = true;

    public TicTacToe() {


        //set button and frame properties
        frame = new JFrame("Tic Tac Toe");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout(3, 3));
        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(3, 3));

        buttons = new JButton[3][3];        //get a two dimensional array of buttons


        // adding actionlistner to the buttons to capture the user actions
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {

                buttons[j][i] = new JButton("");
                buttons[j][i].addActionListener(new myEvent(id));
                id++;
                panel.add(buttons[j][i]);
            }
        }


    }


    public static void main(String args[]) {

        new TicTacToe();


    }

    // method to capture what button the user is clicked
    class myEvent implements ActionListener {
        int eventId;
        int iD;

        public myEvent(int eventId) {
            this.eventId = eventId;
        }

        public void actionPerformed(ActionEvent e) {



            if (X  && !((JButton)e.getSource()).getText().equals("X") && !((JButton)e.getSource()).getText().equals("O")) {

                ((JButton) e.getSource()).setText("X");     // give X to the first button the user click

                getWinner();        //after every button the user click,check for if there's a win or not

                X = false;
                iD = eventId;

                // after user clicked a button, automatically checks for empty buttons and give letter "O" to it.
                loop:
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 3; i++) {

                        if (buttons[j][i].getText().equals("") ) {

                            buttons[j][i].setText("O");
                            getWinner();

                            X=true;
                            break loop;
                        }
                    }
                }


            }


            if (!((JButton) e.getSource()).getText().equals("X") && !((JButton) e.getSource()).getText().equals("O") && (X == false)) {
                //   ((JButton) e.getSource()).setText("O");


                //  getWinner();
                //X = true;
            }
            else {
            }

            // System.out.println(X);
        }

        // getWinner method to find the winner
        void getWinner() {
            if ((buttons[0][0].getText().equals("X")) && (buttons[0][1].getText().equals("X")) && (buttons[0][2].getText().equals("X"))
                    || (buttons[0][0].getText().equals("O")) && (buttons[0][1].getText().equals("O")) && (buttons[0][2].getText().equals("O"))) {
                System.out.println("Winner");
                JOptionPane.showMessageDialog(null, "WINNER !!!");
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 3; i++) {

                        buttons[j][i].setText("");      //if the user or computer winds,reset the game field
                    }
                }


            }
            else if ((buttons[1][0].getText().equals("X")) && (buttons[1][1].getText().equals("X")) && (buttons[1][2].getText().equals("X")) ||
                    (buttons[0][0].getText().equals("O")) && (buttons[0][1].getText().equals("O")) && (buttons[0][2].getText().equals("O"))) {
                System.out.println("Winner");
                JOptionPane.showMessageDialog(null, "WINNER !!!");
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 3; i++) {

                        buttons[j][i].setText("");
                    }
                }
            }
            else if ((buttons[2][0].getText().equals("X")) && (buttons[2][1].getText().equals("X")) && (buttons[2][2].getText().equals("X")) ||
                    (buttons[0][0].getText().equals("O")) && (buttons[0][1].getText().equals("O")) && (buttons[0][2].getText().equals("O"))) {
                System.out.println("Winner");
                JOptionPane.showMessageDialog(null, "WINNER !!!");


                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 3; i++) {

                        buttons[j][i].setText("");
                    }
                }

            }
            else if ((buttons[0][0].getText().equals("X")) && (buttons[1][0].getText().equals("X")) && (buttons[2][0].getText().equals("X")) ||
                    (buttons[0][0].getText().equals("O")) && (buttons[1][0].getText().equals("O")) && (buttons[2][0].getText().equals("O"))) {
                System.out.println("Winner");
                JOptionPane.showMessageDialog(null, "WINNER !!! ");
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 3; i++) {

                        buttons[j][i].setText("");
                    }
                }
            }
            else if ((buttons[0][1].getText().equals("X")) && (buttons[1][1].getText().equals("X")) && (buttons[2][1].getText().equals("X")) ||
                    (buttons[0][1].getText().equals("O")) && (buttons[1][1].getText().equals("O")) && (buttons[2][1].getText().equals("O"))) {
                System.out.println("Winner");
                JOptionPane.showMessageDialog(null, "WINNER !!!");

                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 3; i++) {

                        buttons[j][i].setText("");
                    }
                }
            }
            else if ((buttons[0][2].getText().equals("X")) && (buttons[1][2].getText().equals("X")) && (buttons[2][2].getText().equals("X")) ||
                    (buttons[0][2].getText().equals("O")) && (buttons[1][2].getText().equals("O")) && (buttons[2][2].getText().equals("O"))) {
                System.out.println("Winner");
                JOptionPane.showMessageDialog(null, "WINNER !!!");

                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 3; i++) {

                        buttons[j][i].setText("");
                    }
                }
            }
            else if ((buttons[0][0].getText().equals("X")) && (buttons[1][1].getText().equals("X")) && (buttons[2][2].getText().equals("X")) ||
                    (buttons[0][0].getText().equals("O")) && (buttons[1][1].getText().equals("O")) && (buttons[2][2].getText().equals("O"))) {
                System.out.println("Winner");
                JOptionPane.showMessageDialog(null, "WINNER !!!");

                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 3; i++) {

                        buttons[j][i].setText("");
                    }
                }
            }
            else if ((buttons[0][2].getText().equals("X")) && (buttons[1][1].getText().equals("X")) && (buttons[2][0].getText().equals("X")) ||
                    (buttons[0][2].getText().equals("O")) && (buttons[1][1].getText().equals("O")) && (buttons[2][0].getText().equals("O"))) {
                System.out.println("Winner");
                JOptionPane.showMessageDialog(null, "WINNER !!!");

                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 3; i++) {

                        buttons[j][i].setText("");
                    }
                }
            }
        }


    }

}