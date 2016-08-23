/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author walison
 */
public class GerenciadorArquivoFactory {
    
    public static final int SEPARADO = 0;
    public static final int UNICO = 1;
    
    public static GerenciadorArquivo criar(int tipo) {
        
        if (tipo == SEPARADO) {
            return new GerenciadorArquivoSeparadoFuncionario();
        } else if (tipo == UNICO) {
            return new GerenciadorArquivoUnicoFuncionario();
        } else {
            throw new IllegalArgumentException("Não existe o tipo passado como parametro");
        }
    }
    
}
