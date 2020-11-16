/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Dell
 */
public class Validation {
    public static void enableButton(JButton button, JTextField... textFields) {
        boolean empty = false;
        for (JTextField jTextField : textFields) {
            if (jTextField.getText().isEmpty()) {
                empty = true;
                break;
            }
        }
        if (empty) {
            button.setEnabled(false);
        } else {
            button.setEnabled(true);
        }
    }

    public static void validateContactNumber(JTextField textField) {
        String text = textField.getText();
        boolean checkNumber = CheckNumber(text);
        if (checkNumber) {
            if (text.length() > 9) {
                String sub1 = text.substring(0, 3);
                String sub2 = text.substring(3, 5);
                String sub3 = text.substring(5, 7);
                String sub4 = text.substring(7, 10);
                textField.setText(sub1 + " " + sub2 + " " + sub3 + " " + sub4);
            } else {

                textField.setCaretColor(Color.red);
            }
        } else {
            textField.setText("");

        }

    }

    private static boolean CheckNumber(String number) {
        boolean isNumber = false;
        try {
            Long.parseLong(number);
            isNumber = true;
        } catch (NumberFormatException e) {
            isNumber = false;
        }
        return isNumber;
    }

    private static String checkednumber(String number) {
        boolean CheckNumber = CheckNumber(number);
        if (CheckNumber) {
            return number;
        } else {
            return "";
        }
    }

    public static void ValidateForCurrency(JTextField field) {
        String s = field.getText();
        if (checkNumberForCurrency(s)) {
            field.setText(s);
        } else {
            field.setText("");
        }
    }

    public static void ClearTextField(JTextField... fields) {
        for (int i = 0; i < fields.length; i++) {
            fields[i].setText("");
        }
    }

    public static boolean validateVehicleNumber(JTextField textField) {
        String text = textField.getText();
        String formatString = null;
        String substring;
        String subString2;
        boolean isFormated = false;

        if (text.length() == 7) {
            substring = text.substring(0, 3);
            subString2 = text.substring(3, 7);
            formatString = substring + "-" + subString2;
            textField.setText(formatString);
            isFormated = true;
        } else if (text.length() == 6) {
            substring = text.substring(0, 2);
            subString2 = text.substring(2, 6);
            formatString = substring + "-" + subString2;
            textField.setText(formatString);
            isFormated = true;
        } else {
            textField.setText("");
            textField.setBackground(Color.red);
        }
        return isFormated;
    }

    public static void toUPerCase(JTextField txt) {
        String text = txt.getText().toUpperCase();
        txt.setText(text);
    }

    public static void validateTextFieldForNumber(JTextField txtContact) {
        try {
            String s = txtContact.getText();
            while (!checkNumber(s)) {
                String s1 = s.substring(0, s.length() - 1);
                txtContact.setText(s1);
                s = s1;
            }
        } catch (Exception e) {
        }
    }

    public static boolean checkNumber(String s) {
        boolean isNumber = true;
        try {
            Long.parseLong(s);
            isNumber = true;
        } catch (Exception e) {
            isNumber = false;
        }
        return isNumber;
    }

    public static boolean checkNumberForCurrency(String s) {
        boolean isNumber = true;
        try {
            Double.parseDouble(s + "0");
            isNumber = true;
        } catch (Exception e) {
            isNumber = false;
        }
        return isNumber;
    }

    public static void validateTextFieldForNumberForCurrency(JTextField txtContact) {
        try {
            String s = txtContact.getText();
            while (!checkNumberForCurrency(s)) {
                String s1 = s.substring(0, s.length() - 1);
                txtContact.setText(s1);
                s = s1;
            }
        } catch (Exception e) {
        }
    }

    

    public static void validationNIC(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]{0,9}[v]{0,1}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    public static void userValidation(JTextField textField) {
        String text = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!text.matches("^[A-Z a-z]*$")) {
            textField.setText(text.substring(0, caretPosition - 1) + text.substring(caretPosition));
            textField.setCaretPosition(caretPosition - 1);
        }
    }

    public static void userText(JTextField textField) {
        String text = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!text.matches("^[0-9.]*$")) {
            textField.setText(text.substring(0, caretPosition - 1) + text.substring(caretPosition));
            textField.setCaretPosition(caretPosition - 1);
        }
    }

    public static void validatePrice(JTextField textFild) {
        String txt = textFild.getText();
        int caretPosition = textFild.getCaretPosition();
        if (!txt.matches("^[0-9]{0,3}([.])?([0-9]){0,2}$")) {
            textFild.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            textFild.setCaretPosition(caretPosition - 1);
        }
    }

    public static void pageCount(JTextField textFild) {
        String txt = textFild.getText();
        int caretPosition = textFild.getCaretPosition();
        if (!txt.matches("^[0-9]{1,4}$")) {
            textFild.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            textFild.setCaretPosition(caretPosition - 1);
        }
    }

    public static int phoneNumber(JTextField textFild) {
        String txt = textFild.getText();
        int caretPosition = textFild.getCaretPosition();
        if (!txt.matches("^[0-9]{0,10}$")) {
            txt = txt.substring(0, caretPosition - 1) + txt.substring(caretPosition);
            textFild.setText(txt);
            textFild.setCaretPosition(caretPosition - 1);
        }
        if (txt.matches("^[0][1-9]{2}[0-9]{7}$")) {

            return 1;
        } else {

            return 0;
        }
    }

    public static void validateUserName(JTextField custNameText) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
