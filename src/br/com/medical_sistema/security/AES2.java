package br.com.medical_sistema.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AES2 {

	public static String criptografar(String input, String tipoAlgoritmo) throws NoSuchAlgorithmException {
	    MessageDigest mDigest = MessageDigest.getInstance(tipoAlgoritmo);
	    byte[] result = mDigest.digest(input.getBytes());
	    StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < result.length; i++) {
	        sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
	    }

	    return sb.toString();
	}
 
}