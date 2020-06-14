
import javax.sound.midi.Synthesizer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.swing.*;

public class Sound {
    private Synthesizer synth;


    public static void shortSound(){

        try{

            // Got the code from this guy: https://community.oracle.com/thread/1273219?start=0&tstart=0

            // Set frequency
            int frequency = 800;

            // Set duration
            int durationMs = 200;

            byte[] buf = new byte[ 1 ];;
            AudioFormat af = new AudioFormat( (float ) frequency, 8, 1, true, false );
            SourceDataLine sdl = AudioSystem.getSourceDataLine( af );
            sdl.open();
            sdl.start();
            for( int i = 0; i < durationMs * (float )frequency / 1000; i++ ) {
                double angle = i / ( (float )frequency / 440 ) * 2.0 * Math.PI;
                buf[ 0 ] = (byte )( Math.sin( angle ) * 100 );
                sdl.write( buf, 0, 1 );
            }
            sdl.drain();
            sdl.stop();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void longSound(){

        try{

            // Got the code from this guy: https://community.oracle.com/thread/1273219?start=0&tstart=0

            // Set frequency
            int frequency = 800;

            // Set duration
            int durationMs = 400;

            byte[] buf = new byte[ 1 ];;
            AudioFormat af = new AudioFormat( (float ) frequency, 8, 1, true, false );
            SourceDataLine sdl = AudioSystem.getSourceDataLine( af );
            sdl.open();
            sdl.start();
            for( int i = 0; i < durationMs * (float )frequency / 1000; i++ ) {
                double angle = i / ( (float )frequency / 440 ) * 2.0 * Math.PI;
                buf[ 0 ] = (byte )( Math.sin( angle ) * 100 );
                sdl.write( buf, 0, 1 );
            }
            sdl.drain();
            sdl.stop();

        }
        catch (Exception e){
            System.out.println(e);


        }
    }

    public static void noSound(){

        try{

            // Got the code from this guy: https://community.oracle.com/thread/1273219?start=0&tstart=0

            // Set frequency
            int frequency = 0;

            // Set duration
            int durationMs = 200;

            byte[] buf = new byte[ 1 ];;
            AudioFormat af = new AudioFormat( (float ) frequency, 8, 1, true, false );
            SourceDataLine sdl = AudioSystem.getSourceDataLine( af );
            sdl.open();
            sdl.start();
            for( int i = 0; i < durationMs * (float )frequency / 1000; i++ ) {
                double angle = i / ( (float )frequency / 440 ) * 2.0 * Math.PI;
                buf[ 0 ] = (byte )( Math.sin( angle ) * 100 );
                sdl.write( buf, 0, 1 );
            }
            sdl.drain();
            sdl.stop();

        }
        catch (Exception e){
            System.out.println(e);


        }
    }
}
