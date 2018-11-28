package RyanMcGovern;

public class FaceDrawing {
    private String[][] faceFeatures;

    public FaceDrawing(String[][] faceFeatures){
        this.faceFeatures = faceFeatures;
    }
    public void edit(String replace, int row, int column){
        faceFeatures[row][column] = replace;
    }

    public void fill(String str){
        for (int i=0;i<faceFeatures.length; i++){
            for (int j=0; j<faceFeatures[i].length; j++){
                faceFeatures[i][j] = str;
            }
        }
    }

    public String toString(){
        String output = "";
        for (int i=0; i<faceFeatures.length; i++){
            for (int j=0; j<faceFeatures[i].length; j++) {
                output += faceFeatures[i][j];
            }
            output+= "\n";
        }
        return output;
    }
}
