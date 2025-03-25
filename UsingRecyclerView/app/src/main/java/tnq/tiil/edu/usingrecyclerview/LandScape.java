package tnq.tiil.edu.usingrecyclerview;

public class LandScape {
    String landImageFileName;
    String lanCation;

    public String getLandImageFileName() {
        return landImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        this.landImageFileName = landImageFileName;
    }

    public String getLanCation() {
        return lanCation;
    }

    public void setLanCation(String lanCation) {
        this.lanCation = lanCation;
    }

    public LandScape(String landImageFileName, String lanCation) {
        this.landImageFileName = landImageFileName;
        this.lanCation = lanCation;
    }

}
