public class CSVGameData extends GameData{
    
    public CSVGameData(String gamedata, String savedata) {
        super();
        loadSaveData(savedata);
        loadGameData(gamedata);
    }

    @Override
    void loadSaveData(String filename) {
        // TODO Auto-generated method stub
        // populating knights
    }

    @Override
    void loadGameData(String filename) {
        // TODO Auto-generated method stub
        // populating fortunes
        // populating MOBs
    }
}
