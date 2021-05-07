/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionais;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Relacionais {

    
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
            int op;
            double val, qnt=0;
            System.out.println("Cardápio\n-------------------------\n1 - pastel de carne;\n2 - pastel de frango;\n3 - coca-cola;\n4 - caldo de cana;\n Digite o código do item: ");
                op = ler.nextInt();
                    if (op>=1 && op<=4) {
                        System.out.println("Informe a quantidade que deseja:");
                        qnt = ler.nextInt();}
                        switch (op){
                            case 1:
                                val = qnt * 8.5;
                                System.out.println("O custo do(s) pastél(is) de carne é R$"+val);
                                break;
                            case 2:
                                val = qnt * 8.0;
                                System.out.println("O custo do (s) pastel(is) de frango é R$"+val);
                            case 3:
                                val = qnt * 9;
                                System.out.println("O custo da(s) coca cola é R$"+val);
                                break;
                            case 4:
                                val = qnt * 5;
                                System.out.println("O custo do(s) caldo(s) de cana é R$"+val);
                                break;
                            default:
                                    System.out.println("Não existe este produto no cardápio :(");
                                
                                }
                        
    }
            
    }       

         
           