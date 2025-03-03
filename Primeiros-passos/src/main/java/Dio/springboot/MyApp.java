/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Marcelo
 */
@Component
 public class MyApp implements  CommandLineRunner{
    @Autowired
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Soma: " + calculadora.somar(2, 3));
	
        

    }

}
