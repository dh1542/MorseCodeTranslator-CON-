import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.swing.*;

public class Sound {
    private Synthesizer synth;


    public static void shortSound(){

        try{
            // Create Synthesizer Object
            Synthesizer sync = MidiSystem.getSynthesizer();
            sync.open();

            // Array of MidiChannels
            final MidiChannel[] mc = sync.getChannels();

            // Instruments are used to choose what instrument the sound is played with.
            Instrument[] instr = sync.getDefaultSoundbank().getInstruments();

            sync.loadInstrument(instr[90]);

            mc[15].noteOn(540,600);

        }
        catch (Exception e){
            System.out.println(e);


        }











    }
}
