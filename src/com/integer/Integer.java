package com.integer;

/*
	NAMA = Ivan Faathirza
	KELAS = IF1
	NIM = 10119003
	Deskripsi program = program ini untuk menampilkan 
	bilangan berbentuk angka dan jenis-jenis tipe data bilangan bulat
 */
public class Integer {

    public static void main(String[] args) {
	    byte b;
	    short s;
	    int i;
	    long l;
	    b = 120;
	    s = 32767;
	    i = 1_000_000_000;
	    l = 90000000000L;

	    System.out.println("byte : "+b);
	    System.out.println("short : "+s);
	    System.out.println("int : "+i);
	    System.out.println("long : "+l);
    }
}
