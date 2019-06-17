package vgorelko.Lesson7.TaskA1;

public abstract class EntertainmentEquipment extends Technique { //развлекательное оборудование

    private boolean forMusic;
    private boolean forGames;

    public boolean isForMusic() {
        return forMusic;
    }

    public void setForMusic(boolean forMusic) {
        this.forMusic = forMusic;
    }

    public boolean isForGames() {
        return forGames;
    }

    public void setForGames(boolean forGames) {
        this.forGames = forGames;
    }
}
