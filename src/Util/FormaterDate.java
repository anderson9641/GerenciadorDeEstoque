/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ander
 */
public class FormaterDate {
    
    public String FormataData(Date data) {
        SimpleDateFormat formatado = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormat = formatado.format(data);
        return dataFormat;
    }
    
}
