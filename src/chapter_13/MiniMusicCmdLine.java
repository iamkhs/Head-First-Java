package chapter_13;

import javax.sound.midi.*;
import java.util.Scanner;

import static javax.sound.midi.ShortMessage.*;

public class MiniMusicCmdLine {
    public static void main(String[] args) throws InvalidMidiDataException, MidiUnavailableException {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[2];
        arr[0] = sc.nextLine();
        arr[1] = sc.nextLine();

        if(arr.length < 2){
            System.out.println("Don't forget the instrument and note args");
        }
        else{
            int instrument = Integer.parseInt(arr[0]);
            int note = Integer.parseInt(arr[1]);
            mini.play(instrument, note);
        }
    }

    public void play(int instrument, int note){
        try{
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(PROGRAM_CHANGE, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(msg1, 1);
            track.add(changeInstrument);

            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(NOTE_ON, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(msg2, 1);
            track.add(noteOn);

            ShortMessage msg3 = new ShortMessage();
            msg3.setMessage(NOTE_OFF, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(msg3, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
