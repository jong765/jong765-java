package com.pacsun.util;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;

public class RSAKeyUtil {

	public static void main(String[] args) throws NoSuchAlgorithmException,
			InvalidKeySpecException, IOException, InvalidKeyException, DecoderException {
		File file = new File(
				"C:/eclipse_workspace jk backup/UtilityPrograms/Custom/PDN/key/privatekey.pem");
		String algorithm = "RSA";
		String fl = "privatekey.pem";

		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		byte[] keyBytes = new byte[(int) file.length()];
		dis.readFully(keyBytes);
		dis.close();

		String privKeyPEM = new String(keyBytes);

		Base64 b64 = new Base64();
		byte[] decoded = b64.decode(privKeyPEM.getBytes());

		PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(decoded);
		KeyFactory kf = KeyFactory.getInstance(algorithm);
		RSAPrivateKey privateKey = (RSAPrivateKey) kf.generatePrivate(spec);
		BigInteger modulus = privateKey.getModulus();

		System.out.println("Private Key: " + fl);
		System.out.println("Algorithm: " + privateKey.getAlgorithm());
		System.out.println("Modulus: " + modulus);
		System.out.println("Key length:" + modulus.bitLength());
	}

}
