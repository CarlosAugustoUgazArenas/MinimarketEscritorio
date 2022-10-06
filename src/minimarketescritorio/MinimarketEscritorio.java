/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimarketescritorio;

import datos.CategoriaInt;
import datos.impl.CategoriaImpl;
import dominio.Categoria;

/**
 *
 * @author NOVA9
 */
public class MinimarketEscritorio {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CategoriaInt<Categoria> datos = new CategoriaImpl();
        System.out.println(datos.listar("").size());
        //git config  user.email "uarenascarlosau@crece.uss.edu.pe"
        //git config  user.name "CarlosUgaz"
        
    }
}
