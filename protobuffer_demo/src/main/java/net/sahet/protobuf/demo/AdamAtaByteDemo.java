package net.sahet.protobuf.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.protobuf.ByteString;
import myProtobufNS.AdamAtaOuterClass;
import myProtobufNS.AdamAtaOuterClass.AdamAta;


class AdamAtaWriter {
    public static void main(String[] args) throws IOException {

        String email = "dsdj@sdsd.com";
        int id = new Random().nextInt();
        String name = "Adam Ata";


        /**
         * ByteString
         *
         * Immutable sequence of bytes. Provides conversions to and from byte[],
         * String, ByteBuffer, InputStream, OutputStream. Also provides a conversion to CodedInputStream.
         */


        List<ByteString> myByteList = new ArrayList<>();
        ByteString b1 = ByteString.copyFrom("myBytes".getBytes());
        byte[] arr = "IA Howly".getBytes();
        ByteString b2 = ByteString.copyFrom(arr);
        /**
         static final Charset US_ASCII = Charset.forName("US-ASCII");
         static final Charset UTF_8 = Charset.forName("UTF-8");
         static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
         */
        ByteString b3 = ByteString.copyFrom("Ymarat", "UTF-8");

        myByteList.add(b1);
        myByteList.add(b2);
        myByteList.add(b3);
        myByteList.add(ByteString.fromHex("A8EB"));


        ByteString myBytes = ByteString.copyFromUtf8("myBytes");

        AdamAta ata = AdamAta.newBuilder().setName("Adam")
                .setId(1212)
                .setMyBytes(myBytes)
                .addAllMyByteList(myByteList)
                .setAvailable(true).build();

        String filename = "adam_bytes";
        System.out.println("Saving information to file: " + filename);

        try (FileOutputStream output = new FileOutputStream(filename)) {
            ata.writeTo(output);
        }

        //default values are not printed here, if not provided? , not printed, you can try removing setAvailable(true)
        System.out.println("Saved information with following data to disk: \n" + ata);
    }
}


class AdamAtaReader {
    public static void main(String[] args) throws IOException {
        AdamAta.Builder builder = AdamAta.newBuilder();

        String filename = "adam_bytes";
        System.out.println("Reading from file " + filename);

        try (FileInputStream input = new FileInputStream(filename)) {
            AdamAta ata = builder.mergeFrom(input).build();
            System.out.println(
                    "Name:" + ata.getName() + "\n" +
                            "Email:" + ata.getEmail() + "\n" +
                            "Email ByteString:" + ata.getEmailBytes() + "\n" +
                            "Bytes:" + ata.getMyBytes() + "\n" +
                            "ByteList:" + ata.getMyByteListList() + "\n" +
                            "ByteList count:" + ata.getMyByteListCount() + "\n"+
                            "IsAvailable: "+ata.getAvailable()

            );

            //Map<FieldDescriptor, Object> f = theater.getAllFields();
            //default  values are PRINTED, even not provided, you can try
            System.out.println("List of fields explicitly specified: " + ata.getAllFields());
        }
    }
}
