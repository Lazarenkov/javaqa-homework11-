public class PosterItem {

    private int posterId;
    private String posterName;

    public PosterItem(int posterId, String posterName){
        this.posterId=posterId;
        this.posterName=posterName;
    }

    public int getPosterId(){
        return posterId;
    }

    public String getPosterName(){
        return posterName;
    }
}
