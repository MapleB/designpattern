package command.Model.stereo;

/**
 * @author bifenglin
 * @date 2018/2/23 17:41
 */
public class Stereo {
    protected String stereoType;

    public Stereo(String stereoType) {
        this.stereoType = stereoType;
    }

    public void off(){
        System.out.println("stereo off");
    }

    public void on(){
        System.out.println("stereo on");
    }

    public void setCD(){
        System.out.println("stereo setCD");
    }

    public void setVolume(int volume){
        System.out.println("stereo setVolume"+volume);
    }
}
