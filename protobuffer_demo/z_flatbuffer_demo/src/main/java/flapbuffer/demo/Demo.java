package flapbuffer.demo;

public class Demo {
    public class Main {
        public static void main(String[] args) {
            FlatBufferBuilder builder = new FlatBufferBuilder();
            int greetingOffset = builder.createString("Hello, FlatBuffers!");
            Hello.startHello(builder);
            Hello.addGreeting(builder, greetingOffset);
            int helloOffset = Hello.endHello(builder);
            builder.finish(helloOffset);
            byte[] bytes = builder.sizedByteArray();
            // ...
        }
    }
}
