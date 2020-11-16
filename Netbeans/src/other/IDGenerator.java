/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import java.text.NumberFormat;

/**
 *
 * @author Dell
 */
public class IDGenerator {

    public static String getNextId(String s, String id) {
        if (id==null) {
            return s+"001";
        }
        String[] currentId=id.split(s);
        NumberFormat format=NumberFormat.getInstance();
        format.setMinimumIntegerDigits(3);
        format.setGroupingUsed(false);
        int newId=Integer.parseInt(currentId[1])+1;
        return s+format.format(newId);
    }
    
}
