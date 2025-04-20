package tnq.tiil.edu.usingrecyclerview;

public class LandScape {
    String landscapeName;
    String landscapeImage;
    String landscapeDescription; // Thêm thuộc tính mô tả

    public LandScape(String landscapeName, String landscapeImage, String landscapeDescription) {
        this.landscapeName = landscapeName;
        this.landscapeImage = landscapeImage;
        this.landscapeDescription = landscapeDescription;
    }

    public String getLandscapeName() {
        return landscapeName;
    }

    public void setLandscapeName(String landscapeName) {
        this.landscapeName = landscapeName;
    }

    public String getLandscapeImage() {
        return landscapeImage;
    }

    public void setLandscapeImage(String landscapeImage) {
        this.landscapeImage = landscapeImage;
    }

    public String getLandscapeDescription() {
        return landscapeDescription;
    }

    public void setLandscapeDescription(String landscapeDescription) {
        this.landscapeDescription = landscapeDescription;
    }
}