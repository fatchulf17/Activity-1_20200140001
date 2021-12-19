/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.b.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author lenovo
 */
@Controller
public class exeController {
    
    @RequestMapping("/dataktp")
    public String getTable (Model tiki) 
    {
        ArrayList<List<String>> data = new ArrayList ();
        
        data.add(Arrays.asList(" 1.","KH. Ahmad Dahlan", "12345678910","Anjatan"));
        data.add(Arrays.asList(" 2.","Siti Walidah", "23456789101","Arahan"));
        data.add(Arrays.asList(" 3.","Ir. Soekarno", "34567891012","Balongan"));
        data.add(Arrays.asList(" 4.","Fatmawati Soekarno", "45678910123","Bangodua"));
        data.add(Arrays.asList(" 5.","Jenderal Soedirman", "56789101234","Bongas"));
        data.add(Arrays.asList(" 6.","KH. Mas Mansur", "67891012345","Cantigi"));
        data.add(Arrays.asList(" 7.","Ir. Juanda", "78910123456","Cikedung"));
        data.add(Arrays.asList(" 8.","Buya Hamka", "89101234567","Gabuswetan"));
        data.add(Arrays.asList(" 9.","KH. Fakhruddin", "91012345678","Gantar"));
        data.add(Arrays.asList(" 10.","Gatot Mangkupraja", "10123456789","Haurgeulis"));
        data.add(Arrays.asList(" 11.","Ki Bagus Hadikusumo", "98765432110","Indramayu"));
        data.add(Arrays.asList(" 12.","A.R. Baswedan", "64537189210","Jatibarang"));
        data.add(Arrays.asList(" 13.","Kasman Singodimedjo", "78691524301","Kandanghaur"));
        data.add(Arrays.asList(" 14.","Nani Wartabona", "19734826550","Karangampel"));
        data.add(Arrays.asList(" 15.","Abdul Kahar Muzakkir", "14722458930","Kedokan Bunder"));
        data.add(Arrays.asList(" 16.","Rasyid Ridha", "74859624123","Kertasemaya"));
        data.add(Arrays.asList(" 17.","Muhammad Abduh", "78965412530","Krangkeng"));
        data.add(Arrays.asList(" 18.","Jamaludin al-Afgani", "14785236901","Kroya"));
        data.add(Arrays.asList(" 19.","Ibnu Taimiyah", "98653214704","Lelea"));
        data.add(Arrays.asList(" 20.","Fatchul Fajri", "78451296301","Juntinyuat"));
        
        tiki.addAttribute("table", data );
        return "table";
    }
}