package com.restapi.empresa.Utils;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {
	    
	    public static String gerarBCrypt(String senha) {
	        if (senha == null) {
	        return senha;
	        }
	        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
	        return bCryptEncoder.encode(senha);
	        }
	        /**
	        * Verifica se a senha é válida.
	        *
	        * @param senha
	        * @param senhaEncoded
	        * @return boolean
	        */
	        public static boolean senhaValida(String senha, String senhaEncoded) {
	        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
	        return bCryptEncoder.matches(senha, senhaEncoded);
	        }
//	        
	        String senhaEncoded = SenhaUtils.gerarBCrypt("1234");
	        boolean senhaValida = SenhaUtils.senhaValida("1234", senhaEncoded);
	      	
	        
//	        public static void main(String[] args) {
//	        	System.out.println(SenhaUtils.gerarBCrypt("1234"));
//			}
	        
}

			