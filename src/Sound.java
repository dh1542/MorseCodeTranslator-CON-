
import javax.sound.midi.Synthesizer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.swing.*;

public class Sound {



    public static void makeSound(char c){

        try{
            int durationMs = 0;
            int frequency = 0;

            // set duration and frequency

            if(c == '.'){
                durationMs = 200;
                frequency = 800;
            }
            else if(c == '-'){
                durationMs = 400;
                frequency = 800;


            }
            else if(c == ' '){
                durationMs = 200;
                frequency = 0;
            }
            else{
                System.out.println("invalid char input");
                durationMs = 0;
                frequency = 0;
            }

            // Got the code from this guy: https://community.oracle.com/thread/1273219?start=0&tstart=0


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
