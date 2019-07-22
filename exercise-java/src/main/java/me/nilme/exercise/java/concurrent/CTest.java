package me.nilme.exercise.java.concurrent;

/**
 * @author weizhuang
 * Created on 2019-06-26.
 */
public class CTest {

    private static native String getSignCode(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private static native String[] getSignRequest(String str, byte[] bArr, byte[] bArr2, byte[] bArr3);

    static {
        System.load(CTest.class.getClassLoader().getResource("libsalt.so").getPath());
    }

    public static void main(String[] args) {

//        Clibrary instance = Clibrary.INSTANTCE;
//
//
        String a = "a";
        String b = "b";
        String c = "c";
//
//        String[] signRequest = instance.getSignRequest("{\"nextkey\":\"\",\"token\":\"_7oukpRM5P89ijTOJt9SPF2cazI2KIXg\",\"parent_id\":\"\"}",
//                a.getBytes(), b.getBytes(), c.getBytes());
//
//        System.out.println(signRequest);


         CTest.getSignRequest("{}", a.getBytes(), b.getBytes(), c.getBytes());


    }

}
